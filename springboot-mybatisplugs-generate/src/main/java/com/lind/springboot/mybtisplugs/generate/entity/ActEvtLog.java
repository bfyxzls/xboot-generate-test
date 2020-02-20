package com.lind.springboot.mybtisplugs.generate.entity;

import com.baomidou.mybatisplus.enums.IdType;
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
@TableName("act_evt_log")
public class ActEvtLog extends Model<ActEvtLog> {

    private static final long serialVersionUID = 1L;

	@TableId(value="LOG_NR_", type= IdType.AUTO)
	private Long logNr;
	@TableField("TYPE_")
	private String type;
	@TableField("PROC_DEF_ID_")
	private String procDefId;
	@TableField("PROC_INST_ID_")
	private String procInstId;
	@TableField("EXECUTION_ID_")
	private String executionId;
	@TableField("TASK_ID_")
	private String taskId;
	@TableField("TIME_STAMP_")
	private Date timeStamp;
	@TableField("USER_ID_")
	private String userId;
	@TableField("DATA_")
	private byte[] data;
	@TableField("LOCK_OWNER_")
	private String lockOwner;
	@TableField("LOCK_TIME_")
	private Date lockTime;
	@TableField("IS_PROCESSED_")
	private Integer isProcessed;


	public Long getLogNr() {
		return logNr;
	}

	public ActEvtLog setLogNr(Long logNr) {
		this.logNr = logNr;
		return this;
	}

	public String getType() {
		return type;
	}

	public ActEvtLog setType(String type) {
		this.type = type;
		return this;
	}

	public String getProcDefId() {
		return procDefId;
	}

	public ActEvtLog setProcDefId(String procDefId) {
		this.procDefId = procDefId;
		return this;
	}

	public String getProcInstId() {
		return procInstId;
	}

	public ActEvtLog setProcInstId(String procInstId) {
		this.procInstId = procInstId;
		return this;
	}

	public String getExecutionId() {
		return executionId;
	}

	public ActEvtLog setExecutionId(String executionId) {
		this.executionId = executionId;
		return this;
	}

	public String getTaskId() {
		return taskId;
	}

	public ActEvtLog setTaskId(String taskId) {
		this.taskId = taskId;
		return this;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public ActEvtLog setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
		return this;
	}

	public String getUserId() {
		return userId;
	}

	public ActEvtLog setUserId(String userId) {
		this.userId = userId;
		return this;
	}

	public byte[] getData() {
		return data;
	}

	public ActEvtLog setData(byte[] data) {
		this.data = data;
		return this;
	}

	public String getLockOwner() {
		return lockOwner;
	}

	public ActEvtLog setLockOwner(String lockOwner) {
		this.lockOwner = lockOwner;
		return this;
	}

	public Date getLockTime() {
		return lockTime;
	}

	public ActEvtLog setLockTime(Date lockTime) {
		this.lockTime = lockTime;
		return this;
	}

	public Integer getIsProcessed() {
		return isProcessed;
	}

	public ActEvtLog setIsProcessed(Integer isProcessed) {
		this.isProcessed = isProcessed;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.logNr;
	}

}
