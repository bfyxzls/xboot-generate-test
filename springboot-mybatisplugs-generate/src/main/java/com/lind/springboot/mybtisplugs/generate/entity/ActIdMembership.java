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
@TableName("act_id_membership")
public class ActIdMembership extends Model<ActIdMembership> {

    private static final long serialVersionUID = 1L;

    @TableId("USER_ID_")
	private String userId;
	@TableField("GROUP_ID_")
	private String groupId;


	public String getUserId() {
		return userId;
	}

	public ActIdMembership setUserId(String userId) {
		this.userId = userId;
		return this;
	}

	public String getGroupId() {
		return groupId;
	}

	public ActIdMembership setGroupId(String groupId) {
		this.groupId = groupId;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.userId;
	}

}
