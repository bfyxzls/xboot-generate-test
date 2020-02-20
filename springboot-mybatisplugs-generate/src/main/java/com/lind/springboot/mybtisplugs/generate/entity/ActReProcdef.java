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
@TableName("act_re_procdef")
public class ActReProcdef extends Model<ActReProcdef> {

    private static final long serialVersionUID = 1L;

    @TableId("ID_")
	private String id;
	@TableField("REV_")
	private Integer rev;
	@TableField("CATEGORY_")
	private String category;
	@TableField("NAME_")
	private String name;
	@TableField("KEY_")
	private String key;
	@TableField("VERSION_")
	private Integer version;
	@TableField("DEPLOYMENT_ID_")
	private String deploymentId;
	@TableField("RESOURCE_NAME_")
	private String resourceName;
	@TableField("DGRM_RESOURCE_NAME_")
	private String dgrmResourceName;
	@TableField("DESCRIPTION_")
	private String description;
	@TableField("HAS_START_FORM_KEY_")
	private Integer hasStartFormKey;
	@TableField("HAS_GRAPHICAL_NOTATION_")
	private Integer hasGraphicalNotation;
	@TableField("SUSPENSION_STATE_")
	private Integer suspensionState;
	@TableField("TENANT_ID_")
	private String tenantId;


	public String getId() {
		return id;
	}

	public ActReProcdef setId(String id) {
		this.id = id;
		return this;
	}

	public Integer getRev() {
		return rev;
	}

	public ActReProcdef setRev(Integer rev) {
		this.rev = rev;
		return this;
	}

	public String getCategory() {
		return category;
	}

	public ActReProcdef setCategory(String category) {
		this.category = category;
		return this;
	}

	public String getName() {
		return name;
	}

	public ActReProcdef setName(String name) {
		this.name = name;
		return this;
	}

	public String getKey() {
		return key;
	}

	public ActReProcdef setKey(String key) {
		this.key = key;
		return this;
	}

	public Integer getVersion() {
		return version;
	}

	public ActReProcdef setVersion(Integer version) {
		this.version = version;
		return this;
	}

	public String getDeploymentId() {
		return deploymentId;
	}

	public ActReProcdef setDeploymentId(String deploymentId) {
		this.deploymentId = deploymentId;
		return this;
	}

	public String getResourceName() {
		return resourceName;
	}

	public ActReProcdef setResourceName(String resourceName) {
		this.resourceName = resourceName;
		return this;
	}

	public String getDgrmResourceName() {
		return dgrmResourceName;
	}

	public ActReProcdef setDgrmResourceName(String dgrmResourceName) {
		this.dgrmResourceName = dgrmResourceName;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public ActReProcdef setDescription(String description) {
		this.description = description;
		return this;
	}

	public Integer getHasStartFormKey() {
		return hasStartFormKey;
	}

	public ActReProcdef setHasStartFormKey(Integer hasStartFormKey) {
		this.hasStartFormKey = hasStartFormKey;
		return this;
	}

	public Integer getHasGraphicalNotation() {
		return hasGraphicalNotation;
	}

	public ActReProcdef setHasGraphicalNotation(Integer hasGraphicalNotation) {
		this.hasGraphicalNotation = hasGraphicalNotation;
		return this;
	}

	public Integer getSuspensionState() {
		return suspensionState;
	}

	public ActReProcdef setSuspensionState(Integer suspensionState) {
		this.suspensionState = suspensionState;
		return this;
	}

	public String getTenantId() {
		return tenantId;
	}

	public ActReProcdef setTenantId(String tenantId) {
		this.tenantId = tenantId;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
