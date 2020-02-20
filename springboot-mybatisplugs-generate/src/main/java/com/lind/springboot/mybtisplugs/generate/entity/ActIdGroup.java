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
@TableName("act_id_group")
public class ActIdGroup extends Model<ActIdGroup> {

    private static final long serialVersionUID = 1L;

    @TableId("ID_")
	private String id;
	@TableField("REV_")
	private Integer rev;
	@TableField("NAME_")
	private String name;
	@TableField("TYPE_")
	private String type;


	public String getId() {
		return id;
	}

	public ActIdGroup setId(String id) {
		this.id = id;
		return this;
	}

	public Integer getRev() {
		return rev;
	}

	public ActIdGroup setRev(Integer rev) {
		this.rev = rev;
		return this;
	}

	public String getName() {
		return name;
	}

	public ActIdGroup setName(String name) {
		this.name = name;
		return this;
	}

	public String getType() {
		return type;
	}

	public ActIdGroup setType(String type) {
		this.type = type;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
