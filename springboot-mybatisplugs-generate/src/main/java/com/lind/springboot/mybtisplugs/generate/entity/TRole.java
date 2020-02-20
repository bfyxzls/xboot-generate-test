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
@TableName("t_role")
public class TRole extends Model<TRole> {

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
	@TableField("data_type")
	private Integer dataType;
	@TableField("default_role")
	private Boolean defaultRole;
	private String description;
	private String name;


	public String getId() {
		return id;
	}

	public TRole setId(String id) {
		this.id = id;
		return this;
	}

	public String getCreateBy() {
		return createBy;
	}

	public TRole setCreateBy(String createBy) {
		this.createBy = createBy;
		return this;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public TRole setCreateTime(Date createTime) {
		this.createTime = createTime;
		return this;
	}

	public Integer getDelFlag() {
		return delFlag;
	}

	public TRole setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
		return this;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public TRole setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
		return this;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public TRole setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
		return this;
	}

	public Integer getDataType() {
		return dataType;
	}

	public TRole setDataType(Integer dataType) {
		this.dataType = dataType;
		return this;
	}

	public Boolean isDefaultRole() {
		return defaultRole;
	}

	public TRole setDefaultRole(Boolean defaultRole) {
		this.defaultRole = defaultRole;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public TRole setDescription(String description) {
		this.description = description;
		return this;
	}

	public String getName() {
		return name;
	}

	public TRole setName(String name) {
		this.name = name;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
