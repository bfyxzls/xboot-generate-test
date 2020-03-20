package cn.exrick.xboot.your.controller;

import cn.exrick.xboot.core.common.constant.CommonConstant;
import cn.exrick.xboot.core.common.utils.PageUtil;
import cn.exrick.xboot.core.common.utils.ResultUtil;
import cn.exrick.xboot.core.common.vo.PageVo;
import cn.exrick.xboot.core.common.vo.Result;
import cn.exrick.xboot.core.dao.mapper.PermissionMapper;
import cn.exrick.xboot.core.dao.mapper.RolePermissionMapper;
import cn.exrick.xboot.core.dao.mapper.UserRoleMapper;
import cn.exrick.xboot.core.entity.Permission;
import cn.exrick.xboot.core.entity.Role;
import cn.exrick.xboot.core.entity.RolePermission;
import cn.exrick.xboot.core.entity.UserRole;
import cn.exrick.xboot.your.entity.Student;
import cn.exrick.xboot.your.service.IStudentService;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Exrick
 */
@Slf4j
@RestController
@Api(description = "测试管理接口")
@RequestMapping("/xboot/student")
@Transactional
public class StudentController {

  @Autowired
  RolePermissionMapper rolePermissionMapper;
  @Autowired
  PermissionMapper permissionMapper;
  @Autowired
  UserRoleMapper userRoleMapper;
  @Autowired
  private IStudentService iStudentService;

  @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
  @ApiOperation(value = "通过id获取")
  public Result<Student> get(@PathVariable String id) {

    Student student = iStudentService.getById(id);
    return new ResultUtil<Student>().setData(student);
  }

  @RequestMapping(value = "/getAll", method = RequestMethod.GET)
  @ApiOperation(value = "获取全部数据")
  public Result<List<Student>> getAll() {

    List<Student> list = iStudentService.list();
    return new ResultUtil<List<Student>>().setData(list);
  }

  @RequestMapping(value = "/getByPage", method = RequestMethod.GET)
  @ApiOperation(value = "分页获取")
  public Result<IPage<Student>> getByPage(PageVo page) {

    IPage<Student> data = iStudentService.page(PageUtil.initMpPage(page));
    return new ResultUtil<IPage<Student>>().setData(data);
  }

  @RequestMapping(value = "/insertOrUpdate", method = RequestMethod.POST)
  @ApiOperation(value = "编辑或更新数据")
  public Result<Student> saveOrUpdate(Student student) {

    if (iStudentService.saveOrUpdate(student)) {
      return new ResultUtil<Student>().setData(student);
    }
    return new ResultUtil<Student>().setErrorMsg("操作失败");
  }

  @RequestMapping(value = "/delByIds/{ids}", method = RequestMethod.DELETE)
  @ApiOperation(value = "批量通过id删除")
  public Result<Object> delAllByIds(@PathVariable String[] ids) {

    for (String id : ids) {
      iStudentService.removeById(id);
    }
    return ResultUtil.success("批量通过id删除数据成功");
  }

  @RequestMapping(value = "/getMenuList", method = RequestMethod.GET)
  @ApiOperation(value = "获取用户页面菜单数据")
  public Result<List<Permission>> getAllMenuList(HttpServletRequest request) {

    // 用户所有权限 已排序去重
    List<UserRole> roles = userRoleMapper.findByUserId("682265633886209");
    List<Permission> list = new ArrayList<>();
    for (UserRole role : roles) {
      List<Permission> rolePermission=rolePermissionMapper.findByRoleId(role.getRoleId());
      list.addAll(rolePermission);
    }

    List<Permission> menuList = new ArrayList<>();
    // 筛选一级页面
    for (Permission p : list) {
      if (CommonConstant.PERMISSION_PAGE.equals(p.getType()) && CommonConstant.LEVEL_ONE.equals(p.getLevel())) {
        menuList.add(p);
      }
    }
    // 筛选二级页面
    List<Permission> secondMenuList = new ArrayList<>();
    for (Permission p : list) {
      if (CommonConstant.PERMISSION_PAGE.equals(p.getType()) && CommonConstant.LEVEL_TWO.equals(p.getLevel())) {
        secondMenuList.add(p);
      }
    }
    // 筛选三级页面
    List<Permission> thirdMenuList = new ArrayList<>();
    for (Permission p : list) {
      if (CommonConstant.PERMISSION_PAGE.equals(p.getType()) && CommonConstant.LEVEL_THREE.equals(p.getLevel())) {
        thirdMenuList.add(p);
      }
    }
    // 筛选二级页面拥有的按钮权限
    List<Permission> buttonPermissions = new ArrayList<>();
    for (Permission p : list) {
      if (CommonConstant.PERMISSION_OPERATION.equals(p.getType()) && CommonConstant.LEVEL_THREE.equals(p.getLevel())) {
        buttonPermissions.add(p);
      }
    }

    // 筛选三级页面拥有的按钮权限
    List<Permission> thirdButtonPermissions = new ArrayList<>();
    for (Permission p : list) {
      if (CommonConstant.PERMISSION_OPERATION.equals(p.getType()) && CommonConstant.LEVEL_FOURE.equals(p.getLevel())) {
        thirdButtonPermissions.add(p);
      }
    }

    // 匹配三级页面拥有权限
    for (Permission p : thirdMenuList) {
      List<String> permTypes = new ArrayList<>();
      for (Permission pe : thirdButtonPermissions) {
        if (p.getId().equals(pe.getParentId())) {
          permTypes.add(pe.getButtonType());
        }
      }
      p.setPermTypes(permTypes);
    }

    // 匹配二级页面拥有权限
    for (Permission p : secondMenuList) {
      List<String> permTypes = new ArrayList<>();
      for (Permission pe : buttonPermissions) {
        if (p.getId().equals(pe.getParentId())) {
          permTypes.add(pe.getButtonType());
        }
      }
      p.setPermTypes(permTypes);
    }

    // 匹配二级页面拥有三级页面
    for (Permission p : secondMenuList) {
      List<Permission> thirdMenu = new ArrayList<>();
      for (Permission pe : thirdMenuList) {
        if (p.getId().equals(pe.getParentId())) {
          thirdMenu.add(pe);
        }
      }

      p.setChildren(thirdMenu);
    }

    // 匹配一级页面拥有二级页面
    for (Permission p : menuList) {
      List<Permission> secondMenu = new ArrayList<>();
      for (Permission pe : secondMenuList) {
        if (p.getId().equals(pe.getParentId())) {
          secondMenu.add(pe);
        }
      }
      p.setChildren(secondMenu);
    }

    return new ResultUtil<List<Permission>>().setData(menuList);
  }

}
