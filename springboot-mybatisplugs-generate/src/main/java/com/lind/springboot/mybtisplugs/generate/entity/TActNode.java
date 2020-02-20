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
@TableName("t_act_node")
public class TActNode extends Model<TActNode> {

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
     * 节点id
     */
	@TableField("node_id")
	private String nodeId;
    /**
     * 角色id
     */
	@TableField("role_id")
	private String roleId;
    /**
     * 节点关联类型 0角色 1用户
     */
	private String type;
    /**
     * 用户id
     */
	@TableField("user_id")
	private String userId;
	@TableField("relate_id")
	private String relateId;
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

	public TActNode setId(String id) {
		this.id = id;
		return this;
	}

	public String getCreateBy() {
		return createBy;
	}

	public TActNode setCreateBy(String createBy) {
		this.createBy = createBy;
		return this;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public TActNode setCreateTime(Date createTime) {
		this.createTime = createTime;
		return this;
	}

	public Integer getDelFlag() {
		return delFlag;
	}

	public TActNode setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
		return this;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public TActNode setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
		return this;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public TActNode setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
		return this;
	}

	public String getNodeId() {
		return nodeId;
	}

	public TActNode setNodeId(String nodeId) {
		this.nodeId = nodeId;
		return this;
	}

	public String getRoleId() {
		return roleId;
	}

	public TActNode setRoleId(String roleId) {
		this.roleId = roleId;
		return this;
	}

	public String getType() {
		return type;
	}

	public TActNode setType(String type) {
		this.type = type;
		return this;
	}

	public String getUserId() {
		return userId;
	}

	public TActNode setUserId(String userId) {
		this.userId = userId;
		return this;
	}

	public String getRelateId() {
		return relateId;
	}

	public TActNode setRelateId(String relateId) {
		this.relateId = relateId;
		return this;
	}

	public String getCreateDepartmentId() {
		return createDepartmentId;
	}

	public TActNode setCreateDepartmentId(String createDepartmentId) {
		this.createDepartmentId = createDepartmentId;
		return this;
	}

	public String getTenantId() {
		return tenantId;
	}

	public TActNode setTenantId(String tenantId) {
		this.tenantId = tenantId;
		return this;
	}

	public String getCreateDepartmentIds() {
		return createDepartmentIds;
	}

	public TActNode setCreateDepartmentIds(String createDepartmentIds) {
		this.createDepartmentIds = createDepartmentIds;
		return this;
	}

	public String getUpdateDepartmentId() {
		return updateDepartmentId;
	}

	public TActNode setUpdateDepartmentId(String updateDepartmentId) {
		this.updateDepartmentId = updateDepartmentId;
		return this;
	}

	public String getUpdateDepartmentIds() {
		return updateDepartmentIds;
	}

	public TActNode setUpdateDepartmentIds(String updateDepartmentIds) {
		this.updateDepartmentIds = updateDepartmentIds;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
