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
@TableName("act_ru_identitylink")
public class ActRuIdentitylink extends Model<ActRuIdentitylink> {

    private static final long serialVersionUID = 1L;

    @TableId("ID_")
	private String id;
	@TableField("REV_")
	private Integer rev;
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
	@TableField("PROC_DEF_ID_")
	private String procDefId;


	public String getId() {
		return id;
	}

	public ActRuIdentitylink setId(String id) {
		this.id = id;
		return this;
	}

	public Integer getRev() {
		return rev;
	}

	public ActRuIdentitylink setRev(Integer rev) {
		this.rev = rev;
		return this;
	}

	public String getGroupId() {
		return groupId;
	}

	public ActRuIdentitylink setGroupId(String groupId) {
		this.groupId = groupId;
		return this;
	}

	public String getType() {
		return type;
	}

	public ActRuIdentitylink setType(String type) {
		this.type = type;
		return this;
	}

	public String getUserId() {
		return userId;
	}

	public ActRuIdentitylink setUserId(String userId) {
		this.userId = userId;
		return this;
	}

	public String getTaskId() {
		return taskId;
	}

	public ActRuIdentitylink setTaskId(String taskId) {
		this.taskId = taskId;
		return this;
	}

	public String getProcInstId() {
		return procInstId;
	}

	public ActRuIdentitylink setProcInstId(String procInstId) {
		this.procInstId = procInstId;
		return this;
	}

	public String getProcDefId() {
		return procDefId;
	}

	public ActRuIdentitylink setProcDefId(String procDefId) {
		this.procDefId = procDefId;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
