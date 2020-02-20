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
@TableName("t_permission")
public class TPermission extends Model<TPermission> {

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
	@TableField("button_type")
	private String buttonType;
	private String component;
	private String description;
	private String icon;
	private Integer level;
	private String name;
	@TableField("parent_id")
	private String parentId;
	private String path;
	@TableField("show_always")
	private Boolean showAlways;
	@TableField("sort_order")
	private BigDecimal sortOrder;
	private Integer status;
	private String title;
	private Integer type;
	private String url;


	public String getId() {
		return id;
	}

	public TPermission setId(String id) {
		this.id = id;
		return this;
	}

	public String getCreateBy() {
		return createBy;
	}

	public TPermission setCreateBy(String createBy) {
		this.createBy = createBy;
		return this;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public TPermission setCreateTime(Date createTime) {
		this.createTime = createTime;
		return this;
	}

	public Integer getDelFlag() {
		return delFlag;
	}

	public TPermission setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
		return this;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public TPermission setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
		return this;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public TPermission setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
		return this;
	}

	public String getButtonType() {
		return buttonType;
	}

	public TPermission setButtonType(String buttonType) {
		this.buttonType = buttonType;
		return this;
	}

	public String getComponent() {
		return component;
	}

	public TPermission setComponent(String component) {
		this.component = component;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public TPermission setDescription(String description) {
		this.description = description;
		return this;
	}

	public String getIcon() {
		return icon;
	}

	public TPermission setIcon(String icon) {
		this.icon = icon;
		return this;
	}

	public Integer getLevel() {
		return level;
	}

	public TPermission setLevel(Integer level) {
		this.level = level;
		return this;
	}

	public String getName() {
		return name;
	}

	public TPermission setName(String name) {
		this.name = name;
		return this;
	}

	public String getParentId() {
		return parentId;
	}

	public TPermission setParentId(String parentId) {
		this.parentId = parentId;
		return this;
	}

	public String getPath() {
		return path;
	}

	public TPermission setPath(String path) {
		this.path = path;
		return this;
	}

	public Boolean isShowAlways() {
		return showAlways;
	}

	public TPermission setShowAlways(Boolean showAlways) {
		this.showAlways = showAlways;
		return this;
	}

	public BigDecimal getSortOrder() {
		return sortOrder;
	}

	public TPermission setSortOrder(BigDecimal sortOrder) {
		this.sortOrder = sortOrder;
		return this;
	}

	public Integer getStatus() {
		return status;
	}

	public TPermission setStatus(Integer status) {
		this.status = status;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public TPermission setTitle(String title) {
		this.title = title;
		return this;
	}

	public Integer getType() {
		return type;
	}

	public TPermission setType(Integer type) {
		this.type = type;
		return this;
	}

	public String getUrl() {
		return url;
	}

	public TPermission setUrl(String url) {
		this.url = url;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
