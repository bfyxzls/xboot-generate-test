package cn.exrick.xboot.core.serviceimpl.mybatis;

import cn.exrick.xboot.core.dao.mapper.RoleMapper;
import cn.exrick.xboot.core.dao.mapper.UserRoleMapper;
import cn.exrick.xboot.core.entity.Role;
import cn.exrick.xboot.core.entity.UserRole;
import cn.exrick.xboot.core.service.mybatis.IUserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Exrickx
 */
@Service
public class IUserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {

  @Autowired
  RoleMapper roleMapper;
  @Autowired
  private UserRoleMapper userRoleMapper;

  @Override
  public List<Role> findByUserId(String userId) {

    List<UserRole> userRoles = userRoleMapper.findByUserId(userId);
    List<Role> roles = new ArrayList<>();
    for (UserRole userRole : userRoles) {
      roles.add(roleMapper.selectById(userRole.getRoleId()));
    }
    return roles;
  }

  @Override
  public List<String> findDepIdsByUserId(String userId) {

    return userRoleMapper.findDepIdsByUserId(userId);
  }
}
