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
@TableName("act_approve_agent")
public class ActApproveAgent extends Model<ActApproveAgent> {

    private static final long serialVersionUID = 1L;

	private String id;
    /**
     * 代理人ID
     */
	@TableField("agent_id")
	private String agentId;
    /**
     * 授权人ID
     */
	@TableField("authorizer_id")
	private String authorizerId;
    /**
     * 0：持续代理   1：代理一段时间
     */
	@TableField("agent_term")
	private Integer agentTerm;
    /**
     * 代理开始时间
     */
	@TableField("agent_start_time")
	private Date agentStartTime;
    /**
     * 代理结束时间
     */
	@TableField("agent_end_time")
	private Date agentEndTime;
    /**
     * 代理状态（0：开启  1：关闭）
     */
	private Integer status;
    /**
     * 创建时间
     */
	@TableField("create_time")
	private Date createTime;
    /**
     * 创建人
     */
	@TableField("create_by")
	private String createBy;
    /**
     * 最新更新时间
     */
	@TableField("update_time")
	private Date updateTime;
    /**
     * 最新更新人
     */
	@TableField("update_by")
	private String updateBy;
    /**
     * 删除标记
     */
	@TableField("del_flag")
	private Integer delFlag;
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

	public ActApproveAgent setId(String id) {
		this.id = id;
		return this;
	}

	public String getAgentId() {
		return agentId;
	}

	public ActApproveAgent setAgentId(String agentId) {
		this.agentId = agentId;
		return this;
	}

	public String getAuthorizerId() {
		return authorizerId;
	}

	public ActApproveAgent setAuthorizerId(String authorizerId) {
		this.authorizerId = authorizerId;
		return this;
	}

	public Integer getAgentTerm() {
		return agentTerm;
	}

	public ActApproveAgent setAgentTerm(Integer agentTerm) {
		this.agentTerm = agentTerm;
		return this;
	}

	public Date getAgentStartTime() {
		return agentStartTime;
	}

	public ActApproveAgent setAgentStartTime(Date agentStartTime) {
		this.agentStartTime = agentStartTime;
		return this;
	}

	public Date getAgentEndTime() {
		return agentEndTime;
	}

	public ActApproveAgent setAgentEndTime(Date agentEndTime) {
		this.agentEndTime = agentEndTime;
		return this;
	}

	public Integer getStatus() {
		return status;
	}

	public ActApproveAgent setStatus(Integer status) {
		this.status = status;
		return this;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public ActApproveAgent setCreateTime(Date createTime) {
		this.createTime = createTime;
		return this;
	}

	public String getCreateBy() {
		return createBy;
	}

	public ActApproveAgent setCreateBy(String createBy) {
		this.createBy = createBy;
		return this;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public ActApproveAgent setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
		return this;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public ActApproveAgent setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
		return this;
	}

	public Integer getDelFlag() {
		return delFlag;
	}

	public ActApproveAgent setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
		return this;
	}

	public String getCreateDepartmentId() {
		return createDepartmentId;
	}

	public ActApproveAgent setCreateDepartmentId(String createDepartmentId) {
		this.createDepartmentId = createDepartmentId;
		return this;
	}

	public String getTenantId() {
		return tenantId;
	}

	public ActApproveAgent setTenantId(String tenantId) {
		this.tenantId = tenantId;
		return this;
	}

	public String getCreateDepartmentIds() {
		return createDepartmentIds;
	}

	public ActApproveAgent setCreateDepartmentIds(String createDepartmentIds) {
		this.createDepartmentIds = createDepartmentIds;
		return this;
	}

	public String getUpdateDepartmentId() {
		return updateDepartmentId;
	}

	public ActApproveAgent setUpdateDepartmentId(String updateDepartmentId) {
		this.updateDepartmentId = updateDepartmentId;
		return this;
	}

	public String getUpdateDepartmentIds() {
		return updateDepartmentIds;
	}

	public ActApproveAgent setUpdateDepartmentIds(String updateDepartmentIds) {
		this.updateDepartmentIds = updateDepartmentIds;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
