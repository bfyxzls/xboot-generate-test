package com.lind.springboot.mybtisplugs.generate.entity;

import java.math.BigDecimal;
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
@TableName("t_department")
public class TDepartment extends Model<TDepartment> {

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
	@TableField("is_parent")
	private Boolean isParent;
	@TableField("parent_id")
	private String parentId;
	@TableField("sort_order")
	private BigDecimal sortOrder;
	private Integer status;
	private String title;


	public String getId() {
		return id;
	}

	public TDepartment setId(String id) {
		this.id = id;
		return this;
	}

	public String getCreateBy() {
		return createBy;
	}

	public TDepartment setCreateBy(String createBy) {
		this.createBy = createBy;
		return this;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public TDepartment setCreateTime(Date createTime) {
		this.createTime = createTime;
		return this;
	}

	public Integer getDelFlag() {
		return delFlag;
	}

	public TDepartment setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
		return this;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public TDepartment setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
		return this;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public TDepartment setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
		return this;
	}

	public Boolean isIsParent() {
		return isParent;
	}

	public TDepartment setIsParent(Boolean isParent) {
		this.isParent = isParent;
		return this;
	}

	public String getParentId() {
		return parentId;
	}

	public TDepartment setParentId(String parentId) {
		this.parentId = parentId;
		return this;
	}

	public BigDecimal getSortOrder() {
		return sortOrder;
	}

	public TDepartment setSortOrder(BigDecimal sortOrder) {
		this.sortOrder = sortOrder;
		return this;
	}

	public Integer getStatus() {
		return status;
	}

	public TDepartment setStatus(Integer status) {
		this.status = status;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public TDepartment setTitle(String title) {
		this.title = title;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
