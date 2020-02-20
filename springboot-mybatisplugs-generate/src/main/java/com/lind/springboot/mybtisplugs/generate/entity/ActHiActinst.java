package com.lind.springboot.mybtisplugs.generate.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
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
@TableName("act_hi_actinst")
public class ActHiActinst extends Model<ActHiActinst> {

    private static final long serialVersionUID = 1L;

    @TableId("ID_")
	private String id;
	@TableField("PROC_DEF_ID_")
	private String procDefId;
	@TableField("PROC_INST_ID_")
	private String procInstId;
	@TableField("EXECUTION_ID_")
	private String executionId;
	@TableField("ACT_ID_")
	private String actId;
	@TableField("TASK_ID_")
	private String taskId;
	@TableField("CALL_PROC_INST_ID_")
	private String callProcInstId;
	@TableField("ACT_NAME_")
	private String actName;
	@TableField("ACT_TYPE_")
	private String actType;
	@TableField("ASSIGNEE_")
	private String assignee;
	@TableField("START_TIME_")
	private Date startTime;
	@TableField("END_TIME_")
	private Date endTime;
	@TableField("DURATION_")
	private Long duration;
	@TableField("TENANT_ID_")
	private String tenantId;


	public String getId() {
		return id;
	}

	public ActHiActinst setId(String id) {
		this.id = id;
		return this;
	}

	public String getProcDefId() {
		return procDefId;
	}

	public ActHiActinst setProcDefId(String procDefId) {
		this.procDefId = procDefId;
		return this;
	}

	public String getProcInstId() {
		return procInstId;
	}

	public ActHiActinst setProcInstId(String procInstId) {
		this.procInstId = procInstId;
		return this;
	}

	public String getExecutionId() {
		return executionId;
	}

	public ActHiActinst setExecutionId(String executionId) {
		this.executionId = executionId;
		return this;
	}

	public String getActId() {
		return actId;
	}

	public ActHiActinst setActId(String actId) {
		this.actId = actId;
		return this;
	}

	public String getTaskId() {
		return taskId;
	}

	public ActHiActinst setTaskId(String taskId) {
		this.taskId = taskId;
		return this;
	}

	public String getCallProcInstId() {
		return callProcInstId;
	}

	public ActHiActinst setCallProcInstId(String callProcInstId) {
		this.callProcInstId = callProcInstId;
		return this;
	}

	public String getActName() {
		return actName;
	}

	public ActHiActinst setActName(String actName) {
		this.actName = actName;
		return this;
	}

	public String getActType() {
		return actType;
	}

	public ActHiActinst setActType(String actType) {
		this.actType = actType;
		return this;
	}

	public String getAssignee() {
		return assignee;
	}

	public ActHiActinst setAssignee(String assignee) {
		this.assignee = assignee;
		return this;
	}

	public Date getStartTime() {
		return startTime;
	}

	public ActHiActinst setStartTime(Date startTime) {
		this.startTime = startTime;
		return this;
	}

	public Date getEndTime() {
		return endTime;
	}

	public ActHiActinst setEndTime(Date endTime) {
		this.endTime = endTime;
		return this;
	}

	public Long getDuration() {
		return duration;
	}

	public ActHiActinst setDuration(Long duration) {
		this.duration = duration;
		return this;
	}

	public String getTenantId() {
		return tenantId;
	}

	public ActHiActinst setTenantId(String tenantId) {
		this.tenantId = tenantId;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
