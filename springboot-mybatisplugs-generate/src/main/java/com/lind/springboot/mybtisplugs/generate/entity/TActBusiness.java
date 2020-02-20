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
@TableName("t_act_business")
public class TActBusiness extends Model<TActBusiness> {

    private static final long serialVersionUID = 1L;

	private String id;
    /**
     * 结果状态    0未提交默认 1处理中 2通过 3驳回 4退回
     */
	private Integer result;
    /**
     * 申请标题
     */
	private String title;
    /**
     * 状态 0草稿默认 1处理中 2结束
     */
	private Integer status;
    /**
     * 关联业务表id
     */
	@TableField("table_id")
	private String tableId;
    /**
     * 流程类型： 1.合同流程  2.制度流程 3.授权流程
     */
	@TableField("business_type")
	private String businessType;
    /**
     * 流程定义id
     */
	@TableField("proc_def_id")
	private String procDefId;
    /**
     * 流程实例id
     */
	@TableField("proc_inst_id")
	private String procInstId;
    /**
     * 创建用户id
     */
	@TableField("user_id")
	private String userId;
    /**
     * 创建人
     */
	@TableField("create_by")
	private String createBy;
    /**
     * 创建时间
     */
	@TableField("create_time")
	private Date createTime;
    /**
     * 删除标记
     */
	@TableField("del_flag")
	private Integer delFlag;
    /**
     * 更新人
     */
	@TableField("update_by")
	private String updateBy;
    /**
     * 更新时间
     */
	@TableField("update_time")
	private Date updateTime;
    /**
     * 提交申请时间
     */
	@TableField("apply_time")
	private Date applyTime;
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
    /**
     * 回退之后，下次提交到哪一个节点，空表示按照流程，不空则表示按照指定节点走
     */
	@TableField("back_flow")
	private String backFlow;
    /**
     * 回退人
     */
	@TableField("retreat_id")
	private String retreatId;


	public String getId() {
		return id;
	}

	public TActBusiness setId(String id) {
		this.id = id;
		return this;
	}

	public Integer getResult() {
		return result;
	}

	public TActBusiness setResult(Integer result) {
		this.result = result;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public TActBusiness setTitle(String title) {
		this.title = title;
		return this;
	}

	public Integer getStatus() {
		return status;
	}

	public TActBusiness setStatus(Integer status) {
		this.status = status;
		return this;
	}

	public String getTableId() {
		return tableId;
	}

	public TActBusiness setTableId(String tableId) {
		this.tableId = tableId;
		return this;
	}

	public String getBusinessType() {
		return businessType;
	}

	public TActBusiness setBusinessType(String businessType) {
		this.businessType = businessType;
		return this;
	}

	public String getProcDefId() {
		return procDefId;
	}

	public TActBusiness setProcDefId(String procDefId) {
		this.procDefId = procDefId;
		return this;
	}

	public String getProcInstId() {
		return procInstId;
	}

	public TActBusiness setProcInstId(String procInstId) {
		this.procInstId = procInstId;
		return this;
	}

	public String getUserId() {
		return userId;
	}

	public TActBusiness setUserId(String userId) {
		this.userId = userId;
		return this;
	}

	public String getCreateBy() {
		return createBy;
	}

	public TActBusiness setCreateBy(String createBy) {
		this.createBy = createBy;
		return this;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public TActBusiness setCreateTime(Date createTime) {
		this.createTime = createTime;
		return this;
	}

	public Integer getDelFlag() {
		return delFlag;
	}

	public TActBusiness setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
		return this;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public TActBusiness setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
		return this;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public TActBusiness setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
		return this;
	}

	public Date getApplyTime() {
		return applyTime;
	}

	public TActBusiness setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
		return this;
	}

	public String getCreateDepartmentId() {
		return createDepartmentId;
	}

	public TActBusiness setCreateDepartmentId(String createDepartmentId) {
		this.createDepartmentId = createDepartmentId;
		return this;
	}

	public String getTenantId() {
		return tenantId;
	}

	public TActBusiness setTenantId(String tenantId) {
		this.tenantId = tenantId;
		return this;
	}

	public String getCreateDepartmentIds() {
		return createDepartmentIds;
	}

	public TActBusiness setCreateDepartmentIds(String createDepartmentIds) {
		this.createDepartmentIds = createDepartmentIds;
		return this;
	}

	public String getUpdateDepartmentId() {
		return updateDepartmentId;
	}

	public TActBusiness setUpdateDepartmentId(String updateDepartmentId) {
		this.updateDepartmentId = updateDepartmentId;
		return this;
	}

	public String getUpdateDepartmentIds() {
		return updateDepartmentIds;
	}

	public TActBusiness setUpdateDepartmentIds(String updateDepartmentIds) {
		this.updateDepartmentIds = updateDepartmentIds;
		return this;
	}

	public String getBackFlow() {
		return backFlow;
	}

	public TActBusiness setBackFlow(String backFlow) {
		this.backFlow = backFlow;
		return this;
	}

	public String getRetreatId() {
		return retreatId;
	}

	public TActBusiness setRetreatId(String retreatId) {
		this.retreatId = retreatId;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
