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
@TableName("act_re_model")
public class ActReModel extends Model<ActReModel> {

    private static final long serialVersionUID = 1L;

    @TableId("ID_")
	private String id;
	@TableField("REV_")
	private Integer rev;
	@TableField("NAME_")
	private String name;
	@TableField("KEY_")
	private String key;
	@TableField("CATEGORY_")
	private String category;
	@TableField("CREATE_TIME_")
	private Date createTime;
	@TableField("LAST_UPDATE_TIME_")
	private Date lastUpdateTime;
	@TableField("VERSION_")
	private Integer version;
	@TableField("META_INFO_")
	private String metaInfo;
	@TableField("DEPLOYMENT_ID_")
	private String deploymentId;
	@TableField("EDITOR_SOURCE_VALUE_ID_")
	private String editorSourceValueId;
	@TableField("EDITOR_SOURCE_EXTRA_VALUE_ID_")
	private String editorSourceExtraValueId;
	@TableField("TENANT_ID_")
	private String tenantId;


	public String getId() {
		return id;
	}

	public ActReModel setId(String id) {
		this.id = id;
		return this;
	}

	public Integer getRev() {
		return rev;
	}

	public ActReModel setRev(Integer rev) {
		this.rev = rev;
		return this;
	}

	public String getName() {
		return name;
	}

	public ActReModel setName(String name) {
		this.name = name;
		return this;
	}

	public String getKey() {
		return key;
	}

	public ActReModel setKey(String key) {
		this.key = key;
		return this;
	}

	public String getCategory() {
		return category;
	}

	public ActReModel setCategory(String category) {
		this.category = category;
		return this;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public ActReModel setCreateTime(Date createTime) {
		this.createTime = createTime;
		return this;
	}

	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}

	public ActReModel setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
		return this;
	}

	public Integer getVersion() {
		return version;
	}

	public ActReModel setVersion(Integer version) {
		this.version = version;
		return this;
	}

	public String getMetaInfo() {
		return metaInfo;
	}

	public ActReModel setMetaInfo(String metaInfo) {
		this.metaInfo = metaInfo;
		return this;
	}

	public String getDeploymentId() {
		return deploymentId;
	}

	public ActReModel setDeploymentId(String deploymentId) {
		this.deploymentId = deploymentId;
		return this;
	}

	public String getEditorSourceValueId() {
		return editorSourceValueId;
	}

	public ActReModel setEditorSourceValueId(String editorSourceValueId) {
		this.editorSourceValueId = editorSourceValueId;
		return this;
	}

	public String getEditorSourceExtraValueId() {
		return editorSourceExtraValueId;
	}

	public ActReModel setEditorSourceExtraValueId(String editorSourceExtraValueId) {
		this.editorSourceExtraValueId = editorSourceExtraValueId;
		return this;
	}

	public String getTenantId() {
		return tenantId;
	}

	public ActReModel setTenantId(String tenantId) {
		this.tenantId = tenantId;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
