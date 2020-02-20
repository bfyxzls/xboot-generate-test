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
@TableName("t_act_leave")
public class TActLeave extends Model<TActLeave> {

    private static final long serialVersionUID = 1L;

	private String id;
	@TableField("create_by")
	private String createBy;
	@TableField("create_time")
	private Date createTime;
	@TableField("del_flag")
	private Integer delFlag;
	@TableField("tenant_id")
	private String tenantId;
	@TableField("update_by")
	private String updateBy;
	@TableField("update_time")
	private Date updateTime;
	@TableField("apply_time")
	private Date applyTime;
	private Integer result;
	private String title;
	@TableField("user_id")
	private String userId;


	public String getId() {
		return id;
	}

	public TActLeave setId(String id) {
		this.id = id;
		return this;
	}

	public String getCreateBy() {
		return createBy;
	}

	public TActLeave setCreateBy(String createBy) {
		this.createBy = createBy;
		return this;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public TActLeave setCreateTime(Date createTime) {
		this.createTime = createTime;
		return this;
	}

	public Integer getDelFlag() {
		return delFlag;
	}

	public TActLeave setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
		return this;
	}

	public String getTenantId() {
		return tenantId;
	}

	public TActLeave setTenantId(String tenantId) {
		this.tenantId = tenantId;
		return this;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public TActLeave setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
		return this;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public TActLeave setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
		return this;
	}

	public Date getApplyTime() {
		return applyTime;
	}

	public TActLeave setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
		return this;
	}

	public Integer getResult() {
		return result;
	}

	public TActLeave setResult(Integer result) {
		this.result = result;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public TActLeave setTitle(String title) {
		this.title = title;
		return this;
	}

	public String getUserId() {
		return userId;
	}

	public TActLeave setUserId(String userId) {
		this.userId = userId;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
