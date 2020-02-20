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
@TableName("act_ru_job")
public class ActRuJob extends Model<ActRuJob> {

    private static final long serialVersionUID = 1L;

    @TableId("ID_")
	private String id;
	@TableField("REV_")
	private Integer rev;
	@TableField("TYPE_")
	private String type;
	@TableField("LOCK_EXP_TIME_")
	private Date lockExpTime;
	@TableField("LOCK_OWNER_")
	private String lockOwner;
	@TableField("EXCLUSIVE_")
	private Integer exclusive;
	@TableField("EXECUTION_ID_")
	private String executionId;
	@TableField("PROCESS_INSTANCE_ID_")
	private String processInstanceId;
	@TableField("PROC_DEF_ID_")
	private String procDefId;
	@TableField("RETRIES_")
	private Integer retries;
	@TableField("EXCEPTION_STACK_ID_")
	private String exceptionStackId;
	@TableField("EXCEPTION_MSG_")
	private String exceptionMsg;
	@TableField("DUEDATE_")
	private Date duedate;
	@TableField("REPEAT_")
	private String repeat;
	@TableField("HANDLER_TYPE_")
	private String handlerType;
	@TableField("HANDLER_CFG_")
	private String handlerCfg;
	@TableField("TENANT_ID_")
	private String tenantId;


	public String getId() {
		return id;
	}

	public ActRuJob setId(String id) {
		this.id = id;
		return this;
	}

	public Integer getRev() {
		return rev;
	}

	public ActRuJob setRev(Integer rev) {
		this.rev = rev;
		return this;
	}

	public String getType() {
		return type;
	}

	public ActRuJob setType(String type) {
		this.type = type;
		return this;
	}

	public Date getLockExpTime() {
		return lockExpTime;
	}

	public ActRuJob setLockExpTime(Date lockExpTime) {
		this.lockExpTime = lockExpTime;
		return this;
	}

	public String getLockOwner() {
		return lockOwner;
	}

	public ActRuJob setLockOwner(String lockOwner) {
		this.lockOwner = lockOwner;
		return this;
	}

	public Integer getExclusive() {
		return exclusive;
	}

	public ActRuJob setExclusive(Integer exclusive) {
		this.exclusive = exclusive;
		return this;
	}

	public String getExecutionId() {
		return executionId;
	}

	public ActRuJob setExecutionId(String executionId) {
		this.executionId = executionId;
		return this;
	}

	public String getProcessInstanceId() {
		return processInstanceId;
	}

	public ActRuJob setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
		return this;
	}

	public String getProcDefId() {
		return procDefId;
	}

	public ActRuJob setProcDefId(String procDefId) {
		this.procDefId = procDefId;
		return this;
	}

	public Integer getRetries() {
		return retries;
	}

	public ActRuJob setRetries(Integer retries) {
		this.retries = retries;
		return this;
	}

	public String getExceptionStackId() {
		return exceptionStackId;
	}

	public ActRuJob setExceptionStackId(String exceptionStackId) {
		this.exceptionStackId = exceptionStackId;
		return this;
	}

	public String getExceptionMsg() {
		return exceptionMsg;
	}

	public ActRuJob setExceptionMsg(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
		return this;
	}

	public Date getDuedate() {
		return duedate;
	}

	public ActRuJob setDuedate(Date duedate) {
		this.duedate = duedate;
		return this;
	}

	public String getRepeat() {
		return repeat;
	}

	public ActRuJob setRepeat(String repeat) {
		this.repeat = repeat;
		return this;
	}

	public String getHandlerType() {
		return handlerType;
	}

	public ActRuJob setHandlerType(String handlerType) {
		this.handlerType = handlerType;
		return this;
	}

	public String getHandlerCfg() {
		return handlerCfg;
	}

	public ActRuJob setHandlerCfg(String handlerCfg) {
		this.handlerCfg = handlerCfg;
		return this;
	}

	public String getTenantId() {
		return tenantId;
	}

	public ActRuJob setTenantId(String tenantId) {
		this.tenantId = tenantId;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
