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
@TableName("act_ru_task")
public class ActRuTask extends Model<ActRuTask> {

    private static final long serialVersionUID = 1L;

    @TableId("ID_")
	private String id;
	@TableField("REV_")
	private Integer rev;
	@TableField("EXECUTION_ID_")
	private String executionId;
	@TableField("PROC_INST_ID_")
	private String procInstId;
	@TableField("PROC_DEF_ID_")
	private String procDefId;
	@TableField("NAME_")
	private String name;
	@TableField("PARENT_TASK_ID_")
	private String parentTaskId;
	@TableField("DESCRIPTION_")
	private String description;
	@TableField("TASK_DEF_KEY_")
	private String taskDefKey;
	@TableField("OWNER_")
	private String owner;
	@TableField("ASSIGNEE_")
	private String assignee;
	@TableField("DELEGATION_")
	private String delegation;
	@TableField("PRIORITY_")
	private Integer priority;
	@TableField("CREATE_TIME_")
	private Date createTime;
	@TableField("DUE_DATE_")
	private Date dueDate;
	@TableField("CATEGORY_")
	private String category;
	@TableField("SUSPENSION_STATE_")
	private Integer suspensionState;
	@TableField("TENANT_ID_")
	private String tenantId;
	@TableField("FORM_KEY_")
	private String formKey;


	public String getId() {
		return id;
	}

	public ActRuTask setId(String id) {
		this.id = id;
		return this;
	}

	public Integer getRev() {
		return rev;
	}

	public ActRuTask setRev(Integer rev) {
		this.rev = rev;
		return this;
	}

	public String getExecutionId() {
		return executionId;
	}

	public ActRuTask setExecutionId(String executionId) {
		this.executionId = executionId;
		return this;
	}

	public String getProcInstId() {
		return procInstId;
	}

	public ActRuTask setProcInstId(String procInstId) {
		this.procInstId = procInstId;
		return this;
	}

	public String getProcDefId() {
		return procDefId;
	}

	public ActRuTask setProcDefId(String procDefId) {
		this.procDefId = procDefId;
		return this;
	}

	public String getName() {
		return name;
	}

	public ActRuTask setName(String name) {
		this.name = name;
		return this;
	}

	public String getParentTaskId() {
		return parentTaskId;
	}

	public ActRuTask setParentTaskId(String parentTaskId) {
		this.parentTaskId = parentTaskId;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public ActRuTask setDescription(String description) {
		this.description = description;
		return this;
	}

	public String getTaskDefKey() {
		return taskDefKey;
	}

	public ActRuTask setTaskDefKey(String taskDefKey) {
		this.taskDefKey = taskDefKey;
		return this;
	}

	public String getOwner() {
		return owner;
	}

	public ActRuTask setOwner(String owner) {
		this.owner = owner;
		return this;
	}

	public String getAssignee() {
		return assignee;
	}

	public ActRuTask setAssignee(String assignee) {
		this.assignee = assignee;
		return this;
	}

	public String getDelegation() {
		return delegation;
	}

	public ActRuTask setDelegation(String delegation) {
		this.delegation = delegation;
		return this;
	}

	public Integer getPriority() {
		return priority;
	}

	public ActRuTask setPriority(Integer priority) {
		this.priority = priority;
		return this;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public ActRuTask setCreateTime(Date createTime) {
		this.createTime = createTime;
		return this;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public ActRuTask setDueDate(Date dueDate) {
		this.dueDate = dueDate;
		return this;
	}

	public String getCategory() {
		return category;
	}

	public ActRuTask setCategory(String category) {
		this.category = category;
		return this;
	}

	public Integer getSuspensionState() {
		return suspensionState;
	}

	public ActRuTask setSuspensionState(Integer suspensionState) {
		this.suspensionState = suspensionState;
		return this;
	}

	public String getTenantId() {
		return tenantId;
	}

	public ActRuTask setTenantId(String tenantId) {
		this.tenantId = tenantId;
		return this;
	}

	public String getFormKey() {
		return formKey;
	}

	public ActRuTask setFormKey(String formKey) {
		this.formKey = formKey;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
