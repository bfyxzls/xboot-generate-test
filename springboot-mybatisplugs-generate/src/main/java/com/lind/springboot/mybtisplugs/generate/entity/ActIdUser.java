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
@TableName("act_id_user")
public class ActIdUser extends Model<ActIdUser> {

    private static final long serialVersionUID = 1L;

    @TableId("ID_")
	private String id;
	@TableField("REV_")
	private Integer rev;
	@TableField("FIRST_")
	private String first;
	@TableField("LAST_")
	private String last;
	@TableField("EMAIL_")
	private String email;
	@TableField("PWD_")
	private String pwd;
	@TableField("PICTURE_ID_")
	private String pictureId;


	public String getId() {
		return id;
	}

	public ActIdUser setId(String id) {
		this.id = id;
		return this;
	}

	public Integer getRev() {
		return rev;
	}

	public ActIdUser setRev(Integer rev) {
		this.rev = rev;
		return this;
	}

	public String getFirst() {
		return first;
	}

	public ActIdUser setFirst(String first) {
		this.first = first;
		return this;
	}

	public String getLast() {
		return last;
	}

	public ActIdUser setLast(String last) {
		this.last = last;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public ActIdUser setEmail(String email) {
		this.email = email;
		return this;
	}

	public String getPwd() {
		return pwd;
	}

	public ActIdUser setPwd(String pwd) {
		this.pwd = pwd;
		return this;
	}

	public String getPictureId() {
		return pictureId;
	}

	public ActIdUser setPictureId(String pictureId) {
		this.pictureId = pictureId;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
