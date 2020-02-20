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
@TableName("t_dict")
public class TDict extends Model<TDict> {

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
	private String description;
	@TableField("sort_order")
	private BigDecimal sortOrder;
	private String title;
	private String type;


	public String getId() {
		return id;
	}

	public TDict setId(String id) {
		this.id = id;
		return this;
	}

	public String getCreateBy() {
		return createBy;
	}

	public TDict setCreateBy(String createBy) {
		this.createBy = createBy;
		return this;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public TDict setCreateTime(Date createTime) {
		this.createTime = createTime;
		return this;
	}

	public Integer getDelFlag() {
		return delFlag;
	}

	public TDict setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
		return this;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public TDict setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
		return this;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public TDict setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public TDict setDescription(String description) {
		this.description = description;
		return this;
	}

	public BigDecimal getSortOrder() {
		return sortOrder;
	}

	public TDict setSortOrder(BigDecimal sortOrder) {
		this.sortOrder = sortOrder;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public TDict setTitle(String title) {
		this.title = title;
		return this;
	}

	public String getType() {
		return type;
	}

	public TDict setType(String type) {
		this.type = type;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
