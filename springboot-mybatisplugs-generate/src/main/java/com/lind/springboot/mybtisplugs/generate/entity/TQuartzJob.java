package com.lind.springboot.mybtisplugs.generate.entity;

import java.util.Date;
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
@TableName("t_quartz_job")
public class TQuartzJob extends Model<TQuartzJob> {

    private static final long serialVersionUID = 1L;

	private String id;
	@TableField("create_by")
	private String createBy;
	@TableField("create_time")
	private Date createTime;
	@TableField("del_flag")
	private Integer delFlag;
	@TableField("update_by")
	private String updateBy;
	@TableField("update_time")
	private Date updateTime;
	@TableField("cron_expression")
	private String cronExpression;
	private String description;
	@TableField("job_class_name")
	private String jobClassName;
	private String parameter;
	private Integer status;


	public String getId() {
		return id;
	}

	public TQuartzJob setId(String id) {
		this.id = id;
		return this;
	}

	public String getCreateBy() {
		return createBy;
	}

	public TQuartzJob setCreateBy(String createBy) {
		this.createBy = createBy;
		return this;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public TQuartzJob setCreateTime(Date createTime) {
		this.createTime = createTime;
		return this;
	}

	public Integer getDelFlag() {
		return delFlag;
	}

	public TQuartzJob setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
		return this;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public TQuartzJob setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
		return this;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public TQuartzJob setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
		return this;
	}

	public String getCronExpression() {
		return cronExpression;
	}

	public TQuartzJob setCronExpression(String cronExpression) {
		this.cronExpression = cronExpression;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public TQuartzJob setDescription(String description) {
		this.description = description;
		return this;
	}

	public String getJobClassName() {
		return jobClassName;
	}

	public TQuartzJob setJobClassName(String jobClassName) {
		this.jobClassName = jobClassName;
		return this;
	}

	public String getParameter() {
		return parameter;
	}

	public TQuartzJob setParameter(String parameter) {
		this.parameter = parameter;
		return this;
	}

	public Integer getStatus() {
		return status;
	}

	public TQuartzJob setStatus(Integer status) {
		this.status = status;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
