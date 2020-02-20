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
@TableName("act_re_deployment")
public class ActReDeployment extends Model<ActReDeployment> {

    private static final long serialVersionUID = 1L;

    @TableId("ID_")
	private String id;
	@TableField("NAME_")
	private String name;
	@TableField("CATEGORY_")
	private String category;
	@TableField("TENANT_ID_")
	private String tenantId;
	@TableField("DEPLOY_TIME_")
	private Date deployTime;


	public String getId() {
		return id;
	}

	public ActReDeployment setId(String id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public ActReDeployment setName(String name) {
		this.name = name;
		return this;
	}

	public String getCategory() {
		return category;
	}

	public ActReDeployment setCategory(String category) {
		this.category = category;
		return this;
	}

	public String getTenantId() {
		return tenantId;
	}

	public ActReDeployment setTenantId(String tenantId) {
		this.tenantId = tenantId;
		return this;
	}

	public Date getDeployTime() {
		return deployTime;
	}

	public ActReDeployment setDeployTime(Date deployTime) {
		this.deployTime = deployTime;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
