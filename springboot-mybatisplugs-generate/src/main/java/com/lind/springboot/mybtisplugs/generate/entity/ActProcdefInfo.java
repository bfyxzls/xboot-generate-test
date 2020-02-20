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
@TableName("act_procdef_info")
public class ActProcdefInfo extends Model<ActProcdefInfo> {

    private static final long serialVersionUID = 1L;

    @TableId("ID_")
	private String id;
	@TableField("PROC_DEF_ID_")
	private String procDefId;
	@TableField("REV_")
	private Integer rev;
	@TableField("INFO_JSON_ID_")
	private String infoJsonId;


	public String getId() {
		return id;
	}

	public ActProcdefInfo setId(String id) {
		this.id = id;
		return this;
	}

	public String getProcDefId() {
		return procDefId;
	}

	public ActProcdefInfo setProcDefId(String procDefId) {
		this.procDefId = procDefId;
		return this;
	}

	public Integer getRev() {
		return rev;
	}

	public ActProcdefInfo setRev(Integer rev) {
		this.rev = rev;
		return this;
	}

	public String getInfoJsonId() {
		return infoJsonId;
	}

	public ActProcdefInfo setInfoJsonId(String infoJsonId) {
		this.infoJsonId = infoJsonId;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
