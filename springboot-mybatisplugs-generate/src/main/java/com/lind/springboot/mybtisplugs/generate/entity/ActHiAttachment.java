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
@TableName("act_hi_attachment")
public class ActHiAttachment extends Model<ActHiAttachment> {

    private static final long serialVersionUID = 1L;

    @TableId("ID_")
	private String id;
	@TableField("REV_")
	private Integer rev;
	@TableField("USER_ID_")
	private String userId;
	@TableField("NAME_")
	private String name;
	@TableField("DESCRIPTION_")
	private String description;
	@TableField("TYPE_")
	private String type;
	@TableField("TASK_ID_")
	private String taskId;
	@TableField("PROC_INST_ID_")
	private String procInstId;
	@TableField("URL_")
	private String url;
	@TableField("CONTENT_ID_")
	private String contentId;
	@TableField("TIME_")
	private Date time;


	public String getId() {
		return id;
	}

	public ActHiAttachment setId(String id) {
		this.id = id;
		return this;
	}

	public Integer getRev() {
		return rev;
	}

	public ActHiAttachment setRev(Integer rev) {
		this.rev = rev;
		return this;
	}

	public String getUserId() {
		return userId;
	}

	public ActHiAttachment setUserId(String userId) {
		this.userId = userId;
		return this;
	}

	public String getName() {
		return name;
	}

	public ActHiAttachment setName(String name) {
		this.name = name;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public ActHiAttachment setDescription(String description) {
		this.description = description;
		return this;
	}

	public String getType() {
		return type;
	}

	public ActHiAttachment setType(String type) {
		this.type = type;
		return this;
	}

	public String getTaskId() {
		return taskId;
	}

	public ActHiAttachment setTaskId(String taskId) {
		this.taskId = taskId;
		return this;
	}

	public String getProcInstId() {
		return procInstId;
	}

	public ActHiAttachment setProcInstId(String procInstId) {
		this.procInstId = procInstId;
		return this;
	}

	public String getUrl() {
		return url;
	}

	public ActHiAttachment setUrl(String url) {
		this.url = url;
		return this;
	}

	public String getContentId() {
		return contentId;
	}

	public ActHiAttachment setContentId(String contentId) {
		this.contentId = contentId;
		return this;
	}

	public Date getTime() {
		return time;
	}

	public ActHiAttachment setTime(Date time) {
		this.time = time;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
