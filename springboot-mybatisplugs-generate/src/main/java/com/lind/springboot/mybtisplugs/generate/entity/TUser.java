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
@TableName("t_user")
public class TUser extends Model<TUser> {

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
	private String address;
	private String avatar;
	@TableField("department_id")
	private String departmentId;
	private String description;
	private String email;
	private String mobile;
	@TableField("nick_name")
	private String nickName;
	@TableField("pass_strength")
	private String passStrength;
	private String password;
	private String sex;
	private Integer status;
	private String street;
	private Integer type;
	private String username;


	public String getId() {
		return id;
	}

	public TUser setId(String id) {
		this.id = id;
		return this;
	}

	public String getCreateBy() {
		return createBy;
	}

	public TUser setCreateBy(String createBy) {
		this.createBy = createBy;
		return this;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public TUser setCreateTime(Date createTime) {
		this.createTime = createTime;
		return this;
	}

	public Integer getDelFlag() {
		return delFlag;
	}

	public TUser setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
		return this;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public TUser setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
		return this;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public TUser setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
		return this;
	}

	public String getAddress() {
		return address;
	}

	public TUser setAddress(String address) {
		this.address = address;
		return this;
	}

	public String getAvatar() {
		return avatar;
	}

	public TUser setAvatar(String avatar) {
		this.avatar = avatar;
		return this;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public TUser setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public TUser setDescription(String description) {
		this.description = description;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public TUser setEmail(String email) {
		this.email = email;
		return this;
	}

	public String getMobile() {
		return mobile;
	}

	public TUser setMobile(String mobile) {
		this.mobile = mobile;
		return this;
	}

	public String getNickName() {
		return nickName;
	}

	public TUser setNickName(String nickName) {
		this.nickName = nickName;
		return this;
	}

	public String getPassStrength() {
		return passStrength;
	}

	public TUser setPassStrength(String passStrength) {
		this.passStrength = passStrength;
		return this;
	}

	public String getPassword() {
		return password;
	}

	public TUser setPassword(String password) {
		this.password = password;
		return this;
	}

	public String getSex() {
		return sex;
	}

	public TUser setSex(String sex) {
		this.sex = sex;
		return this;
	}

	public Integer getStatus() {
		return status;
	}

	public TUser setStatus(Integer status) {
		this.status = status;
		return this;
	}

	public String getStreet() {
		return street;
	}

	public TUser setStreet(String street) {
		this.street = street;
		return this;
	}

	public Integer getType() {
		return type;
	}

	public TUser setType(Integer type) {
		this.type = type;
		return this;
	}

	public String getUsername() {
		return username;
	}

	public TUser setUsername(String username) {
		this.username = username;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
