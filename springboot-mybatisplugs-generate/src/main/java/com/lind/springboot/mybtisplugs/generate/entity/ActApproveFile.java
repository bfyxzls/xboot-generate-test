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
@TableName("act_approve_file")
public class ActApproveFile extends Model<ActApproveFile> {

    private static final long serialVersionUID = 1L;

	private String id;
    /**
     * 流程实例id
     */
	@TableField("proc_inst_id")
	private String procInstId;
    /**
     * 任务id
     */
	@TableField("task_id")
	private String taskId;
    /**
     * 附件名称
     */
	@TableField("file_name")
	private String fileName;
    /**
     * 附件下载地址
     */
	@TableField("file_address")
	private String fileAddress;
    /**
     * 创建时间
     */
	@TableField("create_time")
	private Date createTime;
    /**
     * 创建人
     */
	@TableField("create_by")
	private String createBy;
    /**
     * 最新更新时间
     */
	@TableField("update_time")
	private Date updateTime;
    /**
     * 最新更新人
     */
	@TableField("update_by")
	private String updateBy;
    /**
     * 租户ID
     */
	@TableField("tenant_id")
	private String tenantId;
    /**
     * 创建人部门
     */
	@TableField("create_department_id")
	private String createDepartmentId;
    /**
     * 创建人部门IDS
     */
	@TableField("create_department_ids")
	private String createDepartmentIds;
    /**
     * 更新人部门
     */
	@TableField("update_department_id")
	private String updateDepartmentId;
    /**
     * 更新人部门IDS
     */
	@TableField("update_department_ids")
	private String updateDepartmentIds;


	public String getId() {
		return id;
	}

	public ActApproveFile setId(String id) {
		this.id = id;
		return this;
	}

	public String getProcInstId() {
		return procInstId;
	}

	public ActApproveFile setProcInstId(String procInstId) {
		this.procInstId = procInstId;
		return this;
	}

	public String getTaskId() {
		return taskId;
	}

	public ActApproveFile setTaskId(String taskId) {
		this.taskId = taskId;
		return this;
	}

	public String getFileName() {
		return fileName;
	}

	public ActApproveFile setFileName(String fileName) {
		this.fileName = fileName;
		return this;
	}

	public String getFileAddress() {
		return fileAddress;
	}

	public ActApproveFile setFileAddress(String fileAddress) {
		this.fileAddress = fileAddress;
		return this;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public ActApproveFile setCreateTime(Date createTime) {
		this.createTime = createTime;
		return this;
	}

	public String getCreateBy() {
		return createBy;
	}

	public ActApproveFile setCreateBy(String createBy) {
		this.createBy = createBy;
		return this;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public ActApproveFile setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
		return this;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public ActApproveFile setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
		return this;
	}

	public String getTenantId() {
		return tenantId;
	}

	public ActApproveFile setTenantId(String tenantId) {
		this.tenantId = tenantId;
		return this;
	}

	public String getCreateDepartmentId() {
		return createDepartmentId;
	}

	public ActApproveFile setCreateDepartmentId(String createDepartmentId) {
		this.createDepartmentId = createDepartmentId;
		return this;
	}

	public String getCreateDepartmentIds() {
		return createDepartmentIds;
	}

	public ActApproveFile setCreateDepartmentIds(String createDepartmentIds) {
		this.createDepartmentIds = createDepartmentIds;
		return this;
	}

	public String getUpdateDepartmentId() {
		return updateDepartmentId;
	}

	public ActApproveFile setUpdateDepartmentId(String updateDepartmentId) {
		this.updateDepartmentId = updateDepartmentId;
		return this;
	}

	public String getUpdateDepartmentIds() {
		return updateDepartmentIds;
	}

	public ActApproveFile setUpdateDepartmentIds(String updateDepartmentIds) {
		this.updateDepartmentIds = updateDepartmentIds;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
