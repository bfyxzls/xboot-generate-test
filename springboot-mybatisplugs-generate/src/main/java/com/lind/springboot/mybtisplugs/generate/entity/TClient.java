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
@TableName("t_client")
public class TClient extends Model<TClient> {

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
	@TableField("client_secret")
	private String clientSecret;
	@TableField("home_uri")
	private String homeUri;
	private String name;
	@TableField("redirect_uri")
	private String redirectUri;


	public String getId() {
		return id;
	}

	public TClient setId(String id) {
		this.id = id;
		return this;
	}

	public String getCreateBy() {
		return createBy;
	}

	public TClient setCreateBy(String createBy) {
		this.createBy = createBy;
		return this;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public TClient setCreateTime(Date createTime) {
		this.createTime = createTime;
		return this;
	}

	public Integer getDelFlag() {
		return delFlag;
	}

	public TClient setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
		return this;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public TClient setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
		return this;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public TClient setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
		return this;
	}

	public String getClientSecret() {
		return clientSecret;
	}

	public TClient setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
		return this;
	}

	public String getHomeUri() {
		return homeUri;
	}

	public TClient setHomeUri(String homeUri) {
		this.homeUri = homeUri;
		return this;
	}

	public String getName() {
		return name;
	}

	public TClient setName(String name) {
		this.name = name;
		return this;
	}

	public String getRedirectUri() {
		return redirectUri;
	}

	public TClient setRedirectUri(String redirectUri) {
		this.redirectUri = redirectUri;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
