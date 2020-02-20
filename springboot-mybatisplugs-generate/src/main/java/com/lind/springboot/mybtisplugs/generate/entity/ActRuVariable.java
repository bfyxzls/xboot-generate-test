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
@TableName("act_ru_variable")
public class ActRuVariable extends Model<ActRuVariable> {

    private static final long serialVersionUID = 1L;

    @TableId("ID_")
	private String id;
	@TableField("REV_")
	private Integer rev;
	@TableField("TYPE_")
	private String type;
	@TableField("NAME_")
	private String name;
	@TableField("EXECUTION_ID_")
	private String executionId;
	@TableField("PROC_INST_ID_")
	private String procInstId;
	@TableField("TASK_ID_")
	private String taskId;
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

	public ActRuVariable setId(String id) {
		this.id = id;
		return this;
	}

	public Integer getRev() {
		return rev;
	}

	public ActRuVariable setRev(Integer rev) {
		this.rev = rev;
		return this;
	}

	public String getType() {
		return type;
	}

	public ActRuVariable setType(String type) {
		this.type = type;
		return this;
	}

	public String getName() {
		return name;
	}

	public ActRuVariable setName(String name) {
		this.name = name;
		return this;
	}

	public String getExecutionId() {
		return executionId;
	}

	public ActRuVariable setExecutionId(String executionId) {
		this.executionId = executionId;
		return this;
	}

	public String getProcInstId() {
		return procInstId;
	}

	public ActRuVariable setProcInstId(String procInstId) {
		this.procInstId = procInstId;
		return this;
	}

	public String getTaskId() {
		return taskId;
	}

	public ActRuVariable setTaskId(String taskId) {
		this.taskId = taskId;
		return this;
	}

	public String getBytearrayId() {
		return bytearrayId;
	}

	public ActRuVariable setBytearrayId(String bytearrayId) {
		this.bytearrayId = bytearrayId;
		return this;
	}

	public Double getDouble() {
		return double;
	}

	public ActRuVariable setDouble(Double double) {
		this.double = double;
		return this;
	}

	public Long getLong() {
		return long;
	}

	public ActRuVariable setLong(Long long) {
		this.long = long;
		return this;
	}

	public String getText() {
		return text;
	}

	public ActRuVariable setText(String text) {
		this.text = text;
		return this;
	}

	public String getText2() {
		return text2;
	}

	public ActRuVariable setText2(String text2) {
		this.text2 = text2;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
