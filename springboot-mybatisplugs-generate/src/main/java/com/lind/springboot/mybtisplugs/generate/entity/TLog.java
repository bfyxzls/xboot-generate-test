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
@TableName("t_log")
public class TLog extends Model<TLog> {

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
	@TableField("cost_time")
	private Integer costTime;
	private String ip;
	@TableField("ip_info")
	private String ipInfo;
	@TableField("log_type")
	private Integer logType;
	private String name;
	@TableField("request_param")
	private String requestParam;
	@TableField("request_type")
	private String requestType;
	@TableField("request_url")
	private String requestUrl;
	private String username;


	public String getId() {
		return id;
	}

	public TLog setId(String id) {
		this.id = id;
		return this;
	}

	public String getCreateBy() {
		return createBy;
	}

	public TLog setCreateBy(String createBy) {
		this.createBy = createBy;
		return this;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public TLog setCreateTime(Date createTime) {
		this.createTime = createTime;
		return this;
	}

	public Integer getDelFlag() {
		return delFlag;
	}

	public TLog setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
		return this;
	}

	public String getTenantId() {
		return tenantId;
	}

	public TLog setTenantId(String tenantId) {
		this.tenantId = tenantId;
		return this;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public TLog setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
		return this;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public TLog setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
		return this;
	}

	public Integer getCostTime() {
		return costTime;
	}

	public TLog setCostTime(Integer costTime) {
		this.costTime = costTime;
		return this;
	}

	public String getIp() {
		return ip;
	}

	public TLog setIp(String ip) {
		this.ip = ip;
		return this;
	}

	public String getIpInfo() {
		return ipInfo;
	}

	public TLog setIpInfo(String ipInfo) {
		this.ipInfo = ipInfo;
		return this;
	}

	public Integer getLogType() {
		return logType;
	}

	public TLog setLogType(Integer logType) {
		this.logType = logType;
		return this;
	}

	public String getName() {
		return name;
	}

	public TLog setName(String name) {
		this.name = name;
		return this;
	}

	public String getRequestParam() {
		return requestParam;
	}

	public TLog setRequestParam(String requestParam) {
		this.requestParam = requestParam;
		return this;
	}

	public String getRequestType() {
		return requestType;
	}

	public TLog setRequestType(String requestType) {
		this.requestType = requestType;
		return this;
	}

	public String getRequestUrl() {
		return requestUrl;
	}

	public TLog setRequestUrl(String requestUrl) {
		this.requestUrl = requestUrl;
		return this;
	}

	public String getUsername() {
		return username;
	}

	public TLog setUsername(String username) {
		this.username = username;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
