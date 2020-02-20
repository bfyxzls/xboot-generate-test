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
@TableName("act_id_info")
public class ActIdInfo extends Model<ActIdInfo> {

    private static final long serialVersionUID = 1L;

    @TableId("ID_")
	private String id;
	@TableField("REV_")
	private Integer rev;
	@TableField("USER_ID_")
	private String userId;
	@TableField("TYPE_")
	private String type;
	@TableField("KEY_")
	private String key;
	@TableField("VALUE_")
	private String value;
	@TableField("PASSWORD_")
	private byte[] password;
	@TableField("PARENT_ID_")
	private String parentId;


	public String getId() {
		return id;
	}

	public ActIdInfo setId(String id) {
		this.id = id;
		return this;
	}

	public Integer getRev() {
		return rev;
	}

	public ActIdInfo setRev(Integer rev) {
		this.rev = rev;
		return this;
	}

	public String getUserId() {
		return userId;
	}

	public ActIdInfo setUserId(String userId) {
		this.userId = userId;
		return this;
	}

	public String getType() {
		return type;
	}

	public ActIdInfo setType(String type) {
		this.type = type;
		return this;
	}

	public String getKey() {
		return key;
	}

	public ActIdInfo setKey(String key) {
		this.key = key;
		return this;
	}

	public String getValue() {
		return value;
	}

	public ActIdInfo setValue(String value) {
		this.value = value;
		return this;
	}

	public byte[] getPassword() {
		return password;
	}

	public ActIdInfo setPassword(byte[] password) {
		this.password = password;
		return this;
	}

	public String getParentId() {
		return parentId;
	}

	public ActIdInfo setParentId(String parentId) {
		this.parentId = parentId;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
