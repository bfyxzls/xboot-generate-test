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
@TableName("act_hi_comment")
public class ActHiComment extends Model<ActHiComment> {

    private static final long serialVersionUID = 1L;

    @TableId("ID_")
	private String id;
	@TableField("TYPE_")
	private String type;
	@TableField("TIME_")
	private Date time;
	@TableField("USER_ID_")
	private String userId;
	@TableField("TASK_ID_")
	private String taskId;
	@TableField("PROC_INST_ID_")
	private String procInstId;
	@TableField("ACTION_")
	private String action;
	@TableField("MESSAGE_")
	private String message;
	@TableField("FULL_MSG_")
	private byte[] fullMsg;


	public String getId() {
		return id;
	}

	public ActHiComment setId(String id) {
		this.id = id;
		return this;
	}

	public String getType() {
		return type;
	}

	public ActHiComment setType(String type) {
		this.type = type;
		return this;
	}

	public Date getTime() {
		return time;
	}

	public ActHiComment setTime(Date time) {
		this.time = time;
		return this;
	}

	public String getUserId() {
		return userId;
	}

	public ActHiComment setUserId(String userId) {
		this.userId = userId;
		return this;
	}

	public String getTaskId() {
		return taskId;
	}

	public ActHiComment setTaskId(String taskId) {
		this.taskId = taskId;
		return this;
	}

	public String getProcInstId() {
		return procInstId;
	}

	public ActHiComment setProcInstId(String procInstId) {
		this.procInstId = procInstId;
		return this;
	}

	public String getAction() {
		return action;
	}

	public ActHiComment setAction(String action) {
		this.action = action;
		return this;
	}

	public String getMessage() {
		return message;
	}

	public ActHiComment setMessage(String message) {
		this.message = message;
		return this;
	}

	public byte[] getFullMsg() {
		return fullMsg;
	}

	public ActHiComment setFullMsg(byte[] fullMsg) {
		this.fullMsg = fullMsg;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
