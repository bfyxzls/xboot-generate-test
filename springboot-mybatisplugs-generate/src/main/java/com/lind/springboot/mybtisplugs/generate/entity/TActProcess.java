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
@TableName("t_act_process")
public class TActProcess extends Model<TActProcess> {

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
     * 所属分类
     */
	@TableField("category_id")
	private String categoryId;
    /**
     * 部署id
     */
	@TableField("deployment_id")
	private String deploymentId;
    /**
     * 描述/备注
     */
	private String description;
    /**
     * 流程图片名
     */
	@TableField("diagram_name")
	private String diagramName;
    /**
     * 最新版本
     */
	private Boolean latest;
    /**
     * 流程名称
     */
	private String name;
    /**
     * 流程标识名称
     */
	@TableField("process_key")
	private String processKey;
    /**
     * 流程状态 部署后默认1激活
     */
	private Integer status;
    /**
     * 版本
     */
	private Integer version;
    /**
     * xml文件名
     */
	@TableField("xml_name")
	private String xmlName;
    /**
     * 关联业务表名
     */
	@TableField("business_table")
	private String businessTable;
    /**
     * 关联前端表单路由名
     */
	@TableField("route_name")
	private String routeName;
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

	public TActProcess setId(String id) {
		this.id = id;
		return this;
	}

	public String getCreateBy() {
		return createBy;
	}

	public TActProcess setCreateBy(String createBy) {
		this.createBy = createBy;
		return this;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public TActProcess setCreateTime(Date createTime) {
		this.createTime = createTime;
		return this;
	}

	public Integer getDelFlag() {
		return delFlag;
	}

	public TActProcess setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
		return this;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public TActProcess setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
		return this;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public TActProcess setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
		return this;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public TActProcess setCategoryId(String categoryId) {
		this.categoryId = categoryId;
		return this;
	}

	public String getDeploymentId() {
		return deploymentId;
	}

	public TActProcess setDeploymentId(String deploymentId) {
		this.deploymentId = deploymentId;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public TActProcess setDescription(String description) {
		this.description = description;
		return this;
	}

	public String getDiagramName() {
		return diagramName;
	}

	public TActProcess setDiagramName(String diagramName) {
		this.diagramName = diagramName;
		return this;
	}

	public Boolean isLatest() {
		return latest;
	}

	public TActProcess setLatest(Boolean latest) {
		this.latest = latest;
		return this;
	}

	public String getName() {
		return name;
	}

	public TActProcess setName(String name) {
		this.name = name;
		return this;
	}

	public String getProcessKey() {
		return processKey;
	}

	public TActProcess setProcessKey(String processKey) {
		this.processKey = processKey;
		return this;
	}

	public Integer getStatus() {
		return status;
	}

	public TActProcess setStatus(Integer status) {
		this.status = status;
		return this;
	}

	public Integer getVersion() {
		return version;
	}

	public TActProcess setVersion(Integer version) {
		this.version = version;
		return this;
	}

	public String getXmlName() {
		return xmlName;
	}

	public TActProcess setXmlName(String xmlName) {
		this.xmlName = xmlName;
		return this;
	}

	public String getBusinessTable() {
		return businessTable;
	}

	public TActProcess setBusinessTable(String businessTable) {
		this.businessTable = businessTable;
		return this;
	}

	public String getRouteName() {
		return routeName;
	}

	public TActProcess setRouteName(String routeName) {
		this.routeName = routeName;
		return this;
	}

	public String getCreateDepartmentId() {
		return createDepartmentId;
	}

	public TActProcess setCreateDepartmentId(String createDepartmentId) {
		this.createDepartmentId = createDepartmentId;
		return this;
	}

	public String getTenantId() {
		return tenantId;
	}

	public TActProcess setTenantId(String tenantId) {
		this.tenantId = tenantId;
		return this;
	}

	public String getCreateDepartmentIds() {
		return createDepartmentIds;
	}

	public TActProcess setCreateDepartmentIds(String createDepartmentIds) {
		this.createDepartmentIds = createDepartmentIds;
		return this;
	}

	public String getUpdateDepartmentId() {
		return updateDepartmentId;
	}

	public TActProcess setUpdateDepartmentId(String updateDepartmentId) {
		this.updateDepartmentId = updateDepartmentId;
		return this;
	}

	public String getUpdateDepartmentIds() {
		return updateDepartmentIds;
	}

	public TActProcess setUpdateDepartmentIds(String updateDepartmentIds) {
		this.updateDepartmentIds = updateDepartmentIds;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
