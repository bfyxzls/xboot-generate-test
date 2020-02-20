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
@TableName("act_ge_property")
public class ActGeProperty extends Model<ActGeProperty> {

    private static final long serialVersionUID = 1L;

    @TableId("NAME_")
	private String name;
	@TableField("VALUE_")
	private String value;
	@TableField("REV_")
	private Integer rev;


	public String getName() {
		return name;
	}

	public ActGeProperty setName(String name) {
		this.name = name;
		return this;
	}

	public String getValue() {
		return value;
	}

	public ActGeProperty setValue(String value) {
		this.value = value;
		return this;
	}

	public Integer getRev() {
		return rev;
	}

	public ActGeProperty setRev(Integer rev) {
		this.rev = rev;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.name;
	}

}
