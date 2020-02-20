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
@TableName("t_dict_data")
public class TDictData extends Model<TDictData> {

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
	@TableField("dict_id")
	private String dictId;
	@TableField("sort_order")
	private BigDecimal sortOrder;
	private Integer status;
	private String title;
	private String value;


	public String getId() {
		return id;
	}

	public TDictData setId(String id) {
		this.id = id;
		return this;
	}

	public String getCreateBy() {
		return createBy;
	}

	public TDictData setCreateBy(String createBy) {
		this.createBy = createBy;
		return this;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public TDictData setCreateTime(Date createTime) {
		this.createTime = createTime;
		return this;
	}

	public Integer getDelFlag() {
		return delFlag;
	}

	public TDictData setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
		return this;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public TDictData setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
		return this;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public TDictData setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public TDictData setDescription(String description) {
		this.description = description;
		return this;
	}

	public String getDictId() {
		return dictId;
	}

	public TDictData setDictId(String dictId) {
		this.dictId = dictId;
		return this;
	}

	public BigDecimal getSortOrder() {
		return sortOrder;
	}

	public TDictData setSortOrder(BigDecimal sortOrder) {
		this.sortOrder = sortOrder;
		return this;
	}

	public Integer getStatus() {
		return status;
	}

	public TDictData setStatus(Integer status) {
		this.status = status;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public TDictData setTitle(String title) {
		this.title = title;
		return this;
	}

	public String getValue() {
		return value;
	}

	public TDictData setValue(String value) {
		this.value = value;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
