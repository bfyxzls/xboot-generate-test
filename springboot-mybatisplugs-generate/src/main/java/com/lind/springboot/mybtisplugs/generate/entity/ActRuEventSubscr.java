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
@TableName("act_ru_event_subscr")
public class ActRuEventSubscr extends Model<ActRuEventSubscr> {

    private static final long serialVersionUID = 1L;

    @TableId("ID_")
	private String id;
	@TableField("REV_")
	private Integer rev;
	@TableField("EVENT_TYPE_")
	private String eventType;
	@TableField("EVENT_NAME_")
	private String eventName;
	@TableField("EXECUTION_ID_")
	private String executionId;
	@TableField("PROC_INST_ID_")
	private String procInstId;
	@TableField("ACTIVITY_ID_")
	private String activityId;
	@TableField("CONFIGURATION_")
	private String configuration;
	@TableField("CREATED_")
	private Date created;
	@TableField("PROC_DEF_ID_")
	private String procDefId;
	@TableField("TENANT_ID_")
	private String tenantId;


	public String getId() {
		return id;
	}

	public ActRuEventSubscr setId(String id) {
		this.id = id;
		return this;
	}

	public Integer getRev() {
		return rev;
	}

	public ActRuEventSubscr setRev(Integer rev) {
		this.rev = rev;
		return this;
	}

	public String getEventType() {
		return eventType;
	}

	public ActRuEventSubscr setEventType(String eventType) {
		this.eventType = eventType;
		return this;
	}

	public String getEventName() {
		return eventName;
	}

	public ActRuEventSubscr setEventName(String eventName) {
		this.eventName = eventName;
		return this;
	}

	public String getExecutionId() {
		return executionId;
	}

	public ActRuEventSubscr setExecutionId(String executionId) {
		this.executionId = executionId;
		return this;
	}

	public String getProcInstId() {
		return procInstId;
	}

	public ActRuEventSubscr setProcInstId(String procInstId) {
		this.procInstId = procInstId;
		return this;
	}

	public String getActivityId() {
		return activityId;
	}

	public ActRuEventSubscr setActivityId(String activityId) {
		this.activityId = activityId;
		return this;
	}

	public String getConfiguration() {
		return configuration;
	}

	public ActRuEventSubscr setConfiguration(String configuration) {
		this.configuration = configuration;
		return this;
	}

	public Date getCreated() {
		return created;
	}

	public ActRuEventSubscr setCreated(Date created) {
		this.created = created;
		return this;
	}

	public String getProcDefId() {
		return procDefId;
	}

	public ActRuEventSubscr setProcDefId(String procDefId) {
		this.procDefId = procDefId;
		return this;
	}

	public String getTenantId() {
		return tenantId;
	}

	public ActRuEventSubscr setTenantId(String tenantId) {
		this.tenantId = tenantId;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
