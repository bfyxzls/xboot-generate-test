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
@TableName("t_role_department")
public class TRoleDepartment extends Model<TRoleDepartment> {

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
	@TableField("department_id")
	private String departmentId;
	@TableField("role_id")
	private String roleId;


	public String getId() {
		return id;
	}

	public TRoleDepartment setId(String id) {
		this.id = id;
		return this;
	}

	public String getCreateBy() {
		return createBy;
	}

	public TRoleDepartment setCreateBy(String createBy) {
		this.createBy = createBy;
		return this;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public TRoleDepartment setCreateTime(Date createTime) {
		this.createTime = createTime;
		return this;
	}

	public Integer getDelFlag() {
		return delFlag;
	}

	public TRoleDepartment setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
		return this;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public TRoleDepartment setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
		return this;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public TRoleDepartment setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
		return this;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public TRoleDepartment setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
		return this;
	}

	public String getRoleId() {
		return roleId;
	}

	public TRoleDepartment setRoleId(String roleId) {
		this.roleId = roleId;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
