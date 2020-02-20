package com.lind.springboot.generate.model;

import java.io.Serializable;

public class ActIdMembership implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column act_id_membership.USER_ID_
     *
     * @mbg.generated
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column act_id_membership.GROUP_ID_
     *
     * @mbg.generated
     */
    private String groupId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table act_id_membership
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column act_id_membership.USER_ID_
     *
     * @return the value of act_id_membership.USER_ID_
     *
     * @mbg.generated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column act_id_membership.USER_ID_
     *
     * @param userId the value for act_id_membership.USER_ID_
     *
     * @mbg.generated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column act_id_membership.GROUP_ID_
     *
     * @return the value of act_id_membership.GROUP_ID_
     *
     * @mbg.generated
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column act_id_membership.GROUP_ID_
     *
     * @param groupId the value for act_id_membership.GROUP_ID_
     *
     * @mbg.generated
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_id_membership
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", groupId=").append(groupId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}