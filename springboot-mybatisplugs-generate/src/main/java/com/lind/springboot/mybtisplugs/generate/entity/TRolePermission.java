package com.lind.springboot.mybtisplugs.generate.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lqh
 * @since 2020-02-20
 */
@TableName("t_role_permission")
public class TRolePermission extends Model<TRolePermission> {

    private static final long serialVersionUID = 1L;

	private String id;
	@TableField("create_by")
	private String createBy;
	@TableField("create_time")
	private Date createTime;
	@TableField("del_flag")
	private Integer delFlag;
	@TableField("update_by")
	private String updateBy;
	@TableField("update_time")
	private Date updateTime;
	@TableField("permission_id")
	private String permissionId;
	@TableField("role_id")
	private String roleId;


	public String getId() {
		return id;
	}

	public TRolePermission setId(String id) {
		this.id = id;
		return this;
	}

	public String getCreateBy() {
		return createBy;
	}

	public TRolePermission setCreateBy(String createBy) {
		this.createBy = createBy;
		return this;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public TRolePermission setCreateTime(Date createTime) {
		this.createTime = createTime;
		return this;
	}

	public Integer getDelFlag() {
		return delFlag;
	}

	public TRolePermission setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
		return this;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public TRolePermission setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
		return this;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public TRolePermission setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
		return this;
	}

	public String getPermissionId() {
		return permissionId;
	}

	public TRolePermission setPermissionId(String permissionId) {
		this.permissionId = permissionId;
		return this;
	}

	public String getRoleId() {
		return roleId;
	}

	public TRolePermission setRoleId(String roleId) {
		this.roleId = roleId;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
