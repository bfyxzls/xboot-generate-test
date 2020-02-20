package com.lind.springboot.mybtisplugs.generate.entity;

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
@TableName("act_hi_identitylink")
public class ActHiIdentitylink extends Model<ActHiIdentitylink> {

    private static final long serialVersionUID = 1L;

    @TableId("ID_")
	private String id;
	@TableField("GROUP_ID_")
	private String groupId;
	@TableField("TYPE_")
	private String type;
	@TableField("USER_ID_")
	private String userId;
	@TableField("TASK_ID_")
	private String taskId;
	@TableField("PROC_INST_ID_")
	private String procInstId;


	public String getId() {
		return id;
	}

	public ActHiIdentitylink setId(String id) {
		this.id = id;
		return this;
	}

	public String getGroupId() {
		return groupId;
	}

	public ActHiIdentitylink setGroupId(String groupId) {
		this.groupId = groupId;
		return this;
	}

	public String getType() {
		return type;
	}

	public ActHiIdentitylink setType(String type) {
		this.type = type;
		return this;
	}

	public String getUserId() {
		return userId;
	}

	public ActHiIdentitylink setUserId(String userId) {
		this.userId = userId;
		return this;
	}

	public String getTaskId() {
		return taskId;
	}

	public ActHiIdentitylink setTaskId(String taskId) {
		this.taskId = taskId;
		return this;
	}

	public String getProcInstId() {
		return procInstId;
	}

	public ActHiIdentitylink setProcInstId(String procInstId) {
		this.procInstId = procInstId;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
