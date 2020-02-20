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
@TableName("t_department_header")
public class TDepartmentHeader extends Model<TDepartmentHeader> {

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
	private Integer type;
	@TableField("user_id")
	private String userId;


	public String getId() {
		return id;
	}

	public TDepartmentHeader setId(String id) {
		this.id = id;
		return this;
	}

	public String getCreateBy() {
		return createBy;
	}

	public TDepartmentHeader setCreateBy(String createBy) {
		this.createBy = createBy;
		return this;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public TDepartmentHeader setCreateTime(Date createTime) {
		this.createTime = createTime;
		return this;
	}

	public Integer getDelFlag() {
		return delFlag;
	}

	public TDepartmentHeader setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
		return this;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public TDepartmentHeader setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
		return this;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public TDepartmentHeader setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
		return this;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public TDepartmentHeader setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
		return this;
	}

	public Integer getType() {
		return type;
	}

	public TDepartmentHeader setType(Integer type) {
		this.type = type;
		return this;
	}

	public String getUserId() {
		return userId;
	}

	public TDepartmentHeader setUserId(String userId) {
		this.userId = userId;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
