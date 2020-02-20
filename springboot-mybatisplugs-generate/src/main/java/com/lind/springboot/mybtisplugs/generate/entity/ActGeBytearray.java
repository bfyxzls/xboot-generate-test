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
@TableName("act_ge_bytearray")
public class ActGeBytearray extends Model<ActGeBytearray> {

    private static final long serialVersionUID = 1L;

    @TableId("ID_")
	private String id;
	@TableField("REV_")
	private Integer rev;
	@TableField("NAME_")
	private String name;
	@TableField("DEPLOYMENT_ID_")
	private String deploymentId;
	@TableField("BYTES_")
	private byte[] bytes;
	@TableField("GENERATED_")
	private Integer generated;


	public String getId() {
		return id;
	}

	public ActGeBytearray setId(String id) {
		this.id = id;
		return this;
	}

	public Integer getRev() {
		return rev;
	}

	public ActGeBytearray setRev(Integer rev) {
		this.rev = rev;
		return this;
	}

	public String getName() {
		return name;
	}

	public ActGeBytearray setName(String name) {
		this.name = name;
		return this;
	}

	public String getDeploymentId() {
		return deploymentId;
	}

	public ActGeBytearray setDeploymentId(String deploymentId) {
		this.deploymentId = deploymentId;
		return this;
	}

	public byte[] getBytes() {
		return bytes;
	}

	public ActGeBytearray setBytes(byte[] bytes) {
		this.bytes = bytes;
		return this;
	}

	public Integer getGenerated() {
		return generated;
	}

	public ActGeBytearray setGenerated(Integer generated) {
		this.generated = generated;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
