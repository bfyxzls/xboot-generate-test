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
@TableName("act_hi_detail")
public class ActHiDetail extends Model<ActHiDetail> {

    private static final long serialVersionUID = 1L;

    @TableId("ID_")
	private String id;
	@TableField("TYPE_")
	private String type;
	@TableField("PROC_INST_ID_")
	private String procInstId;
	@TableField("EXECUTION_ID_")
	private String executionId;
	@TableField("TASK_ID_")
	private String taskId;
	@TableField("ACT_INST_ID_")
	private String actInstId;
	@TableField("NAME_")
	private String name;
	@TableField("VAR_TYPE_")
	private String varType;
	@TableField("REV_")
	private Integer rev;
	@TableField("TIME_")
	private Date time;
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


	public String getId() {
		return id;
	}

	public ActHiDetail setId(String id) {
		this.id = id;
		return this;
	}

	public String getType() {
		return type;
	}

	public ActHiDetail setType(String type) {
		this.type = type;
		return this;
	}

	public String getProcInstId() {
		return procInstId;
	}

	public ActHiDetail setProcInstId(String procInstId) {
		this.procInstId = procInstId;
		return this;
	}

	public String getExecutionId() {
		return executionId;
	}

	public ActHiDetail setExecutionId(String executionId) {
		this.executionId = executionId;
		return this;
	}

	public String getTaskId() {
		return taskId;
	}

	public ActHiDetail setTaskId(String taskId) {
		this.taskId = taskId;
		return this;
	}

	public String getActInstId() {
		return actInstId;
	}

	public ActHiDetail setActInstId(String actInstId) {
		this.actInstId = actInstId;
		return this;
	}

	public String getName() {
		return name;
	}

	public ActHiDetail setName(String name) {
		this.name = name;
		return this;
	}

	public String getVarType() {
		return varType;
	}

	public ActHiDetail setVarType(String varType) {
		this.varType = varType;
		return this;
	}

	public Integer getRev() {
		return rev;
	}

	public ActHiDetail setRev(Integer rev) {
		this.rev = rev;
		return this;
	}

	public Date getTime() {
		return time;
	}

	public ActHiDetail setTime(Date time) {
		this.time = time;
		return this;
	}

	public String getBytearrayId() {
		return bytearrayId;
	}

	public ActHiDetail setBytearrayId(String bytearrayId) {
		this.bytearrayId = bytearrayId;
		return this;
	}

	public Double getDouble() {
		return double;
	}

	public ActHiDetail setDouble(Double double) {
		this.double = double;
		return this;
	}

	public Long getLong() {
		return long;
	}

	public ActHiDetail setLong(Long long) {
		this.long = long;
		return this;
	}

	public String getText() {
		return text;
	}

	public ActHiDetail setText(String text) {
		this.text = text;
		return this;
	}

	public String getText2() {
		return text2;
	}

	public ActHiDetail setText2(String text2) {
		this.text2 = text2;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
