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
@TableName("act_hi_varinst")
public class ActHiVarinst extends Model<ActHiVarinst> {

    private static final long serialVersionUID = 1L;

    @TableId("ID_")
	private String id;
	@TableField("PROC_INST_ID_")
	private String procInstId;
	@TableField("EXECUTION_ID_")
	private String executionId;
	@TableField("TASK_ID_")
	private String taskId;
	@TableField("NAME_")
	private String name;
	@TableField("VAR_TYPE_")
	private String varType;
	@TableField("REV_")
	private Integer rev;
	@TableField("BYTEARRAY_ID_")
	private String bytearrayId;
	@TableField("DOUBLE_")
	private Double double;
	@TableField("LONG_")
	private Long long;
	@TableField("TEXT_")
	private String text;
	@TableField("TEXT2_")
	private String text2;
	@TableField("CREATE_TIME_")
	private Date createTime;
	@TableField("LAST_UPDATED_TIME_")
	private Date lastUpdatedTime;


	public String getId() {
		return id;
	}

	public ActHiVarinst setId(String id) {
		this.id = id;
		return this;
	}

	public String getProcInstId() {
		return procInstId;
	}

	public ActHiVarinst setProcInstId(String procInstId) {
		this.procInstId = procInstId;
		return this;
	}

	public String getExecutionId() {
		return executionId;
	}

	public ActHiVarinst setExecutionId(String executionId) {
		this.executionId = executionId;
		return this;
	}

	public String getTaskId() {
		return taskId;
	}

	public ActHiVarinst setTaskId(String taskId) {
		this.taskId = taskId;
		return this;
	}

	public String getName() {
		return name;
	}

	public ActHiVarinst setName(String name) {
		this.name = name;
		return this;
	}

	public String getVarType() {
		return varType;
	}

	public ActHiVarinst setVarType(String varType) {
		this.varType = varType;
		return this;
	}

	public Integer getRev() {
		return rev;
	}

	public ActHiVarinst setRev(Integer rev) {
		this.rev = rev;
		return this;
	}

	public String getBytearrayId() {
		return bytearrayId;
	}

	public ActHiVarinst setBytearrayId(String bytearrayId) {
		this.bytearrayId = bytearrayId;
		return this;
	}

	public Double getDouble() {
		return double;
	}

	public ActHiVarinst setDouble(Double double) {
		this.double = double;
		return this;
	}

	public Long getLong() {
		return long;
	}

	public ActHiVarinst setLong(Long long) {
		this.long = long;
		return this;
	}

	public String getText() {
		return text;
	}

	public ActHiVarinst setText(String text) {
		this.text = text;
		return this;
	}

	public String getText2() {
		return text2;
	}

	public ActHiVarinst setText2(String text2) {
		this.text2 = text2;
		return this;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public ActHiVarinst setCreateTime(Date createTime) {
		this.createTime = createTime;
		return this;
	}

	public Date getLastUpdatedTime() {
		return lastUpdatedTime;
	}

	public ActHiVarinst setLastUpdatedTime(Date lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
