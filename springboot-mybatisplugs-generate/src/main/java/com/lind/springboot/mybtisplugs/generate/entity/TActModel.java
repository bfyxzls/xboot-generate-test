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
@TableName("t_act_model")
public class TActModel extends Model<TActModel> {

    private static final long serialVersionUID = 1L;

	private String id;
    /**
     * 创建者
     */
	@TableField("create_by")
	private String createBy;
    /**
     * 创建时间
     */
	@TableField("create_time")
	private Date createTime;
    /**
     * 删除标志 默认0
     */
	@TableField("del_flag")
	private Integer delFlag;
    /**
     * 更新者
     */
	@TableField("update_by")
	private String updateBy;
    /**
     * 更新时间
     */
	@TableField("update_time")
	private Date updateTime;
    /**
     * 描述/备注
     */
	private String description;
    /**
     * 标识
     */
	@TableField("model_key")
	private String modelKey;
    /**
     * 模型名称
     */
	private String name;
    /**
     * 版本
     */
	private Integer version;
    /**
     * 创建人部门
     */
	@TableField("create_department_id")
	private String createDepartmentId;
    /**
     * 租户ID
     */
	@TableField("tenant_id")
	private String tenantId;
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

	public TActModel setId(String id) {
		this.id = id;
		return this;
	}

	public String getCreateBy() {
		return createBy;
	}

	public TActModel setCreateBy(String createBy) {
		this.createBy = createBy;
		return this;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public TActModel setCreateTime(Date createTime) {
		this.createTime = createTime;
		return this;
	}

	public Integer getDelFlag() {
		return delFlag;
	}

	public TActModel setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
		return this;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public TActModel setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
		return this;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public TActModel setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public TActModel setDescription(String description) {
		this.description = description;
		return this;
	}

	public String getModelKey() {
		return modelKey;
	}

	public TActModel setModelKey(String modelKey) {
		this.modelKey = modelKey;
		return this;
	}

	public String getName() {
		return name;
	}

	public TActModel setName(String name) {
		this.name = name;
		return this;
	}

	public Integer getVersion() {
		return version;
	}

	public TActModel setVersion(Integer version) {
		this.version = version;
		return this;
	}

	public String getCreateDepartmentId() {
		return createDepartmentId;
	}

	public TActModel setCreateDepartmentId(String createDepartmentId) {
		this.createDepartmentId = createDepartmentId;
		return this;
	}

	public String getTenantId() {
		return tenantId;
	}

	public TActModel setTenantId(String tenantId) {
		this.tenantId = tenantId;
		return this;
	}

	public String getCreateDepartmentIds() {
		return createDepartmentIds;
	}

	public TActModel setCreateDepartmentIds(String createDepartmentIds) {
		this.createDepartmentIds = createDepartmentIds;
		return this;
	}

	public String getUpdateDepartmentId() {
		return updateDepartmentId;
	}

	public TActModel setUpdateDepartmentId(String updateDepartmentId) {
		this.updateDepartmentId = updateDepartmentId;
		return this;
	}

	public String getUpdateDepartmentIds() {
		return updateDepartmentIds;
	}

	public TActModel setUpdateDepartmentIds(String updateDepartmentIds) {
		this.updateDepartmentIds = updateDepartmentIds;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
