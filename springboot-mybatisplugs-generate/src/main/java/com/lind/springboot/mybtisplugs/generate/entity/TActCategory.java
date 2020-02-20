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
@TableName("t_act_category")
public class TActCategory extends Model<TActCategory> {

    private static final long serialVersionUID = 1L;

	private String id;
    /**
     * 创建者
     */
	@TableField("create_by")
	private String createBy;
    /**
     * 创建时间
     */
	@TableField("create_time")
	private Date createTime;
    /**
     * 删除标志 默认0
     */
	@TableField("del_flag")
	private Integer delFlag;
    /**
     * 更新者
     */
	@TableField("update_by")
	private String updateBy;
    /**
     * 更新时间
     */
	@TableField("update_time")
	private Date updateTime;
    /**
     * 是否为父节点(含子节点) 默认false
     */
	@TableField("parent_flag")
	private Boolean parentFlag;
    /**
     * 父id
     */
	@TableField("parent_id")
	private String parentId;
    /**
     * 排序值
     */
	@TableField("sort_order")
	private BigDecimal sortOrder;
    /**
     * 是否启用 0启用 -1禁用
     */
	private Integer status;
    /**
     * 分类名称
     */
	private String title;
    /**
     * 类型 0分组 1分类
     */
	private Integer type;
    /**
     * 创建人部门
     */
	@TableField("create_department_id")
	private String createDepartmentId;
    /**
     * 租户ID
     */
	@TableField("tenant_id")
	private String tenantId;
    /**
     * 创建人部门IDS
     */
	@TableField("create_department_ids")
	private String createDepartmentIds;
    /**
     * 更新人部门
     */
	@TableField("update_department_id")
	private String updateDepartmentId;
    /**
     * 更新人部门IDS
     */
	@TableField("update_department_ids")
	private String updateDepartmentIds;


	public String getId() {
		return id;
	}

	public TActCategory setId(String id) {
		this.id = id;
		return this;
	}

	public String getCreateBy() {
		return createBy;
	}

	public TActCategory setCreateBy(String createBy) {
		this.createBy = createBy;
		return this;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public TActCategory setCreateTime(Date createTime) {
		this.createTime = createTime;
		return this;
	}

	public Integer getDelFlag() {
		return delFlag;
	}

	public TActCategory setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
		return this;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public TActCategory setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
		return this;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public TActCategory setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
		return this;
	}

	public Boolean isParentFlag() {
		return parentFlag;
	}

	public TActCategory setParentFlag(Boolean parentFlag) {
		this.parentFlag = parentFlag;
		return this;
	}

	public String getParentId() {
		return parentId;
	}

	public TActCategory setParentId(String parentId) {
		this.parentId = parentId;
		return this;
	}

	public BigDecimal getSortOrder() {
		return sortOrder;
	}

	public TActCategory setSortOrder(BigDecimal sortOrder) {
		this.sortOrder = sortOrder;
		return this;
	}

	public Integer getStatus() {
		return status;
	}

	public TActCategory setStatus(Integer status) {
		this.status = status;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public TActCategory setTitle(String title) {
		this.title = title;
		return this;
	}

	public Integer getType() {
		return type;
	}

	public TActCategory setType(Integer type) {
		this.type = type;
		return this;
	}

	public String getCreateDepartmentId() {
		return createDepartmentId;
	}

	public TActCategory setCreateDepartmentId(String createDepartmentId) {
		this.createDepartmentId = createDepartmentId;
		return this;
	}

	public String getTenantId() {
		return tenantId;
	}

	public TActCategory setTenantId(String tenantId) {
		this.tenantId = tenantId;
		return this;
	}

	public String getCreateDepartmentIds() {
		return createDepartmentIds;
	}

	public TActCategory setCreateDepartmentIds(String createDepartmentIds) {
		this.createDepartmentIds = createDepartmentIds;
		return this;
	}

	public String getUpdateDepartmentId() {
		return updateDepartmentId;
	}

	public TActCategory setUpdateDepartmentId(String updateDepartmentId) {
		this.updateDepartmentId = updateDepartmentId;
		return this;
	}

	public String getUpdateDepartmentIds() {
		return updateDepartmentIds;
	}

	public TActCategory setUpdateDepartmentIds(String updateDepartmentIds) {
		this.updateDepartmentIds = updateDepartmentIds;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
