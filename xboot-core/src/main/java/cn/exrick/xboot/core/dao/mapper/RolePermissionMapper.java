package cn.exrick.xboot.core.dao.mapper;

import cn.exrick.xboot.core.entity.Permission;
import cn.exrick.xboot.core.entity.RolePermission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author Exrickx
 */
public interface RolePermissionMapper extends BaseMapper<RolePermission> {

    /**
     * 通过用户id获取
     * @param roleId
     * @return
     */
    List<Permission> findByRoleId(@Param("roleId") String roleId);
}
