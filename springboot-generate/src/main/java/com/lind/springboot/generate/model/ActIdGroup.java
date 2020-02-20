package com.lind.springboot.generate.model;

import java.io.Serializable;

public class ActIdGroup implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column act_id_group.ID_
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column act_id_group.REV_
     *
     * @mbg.generated
     */
    private Integer rev;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column act_id_group.NAME_
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column act_id_group.TYPE_
     *
     * @mbg.generated
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table act_id_group
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column act_id_group.ID_
     *
     * @return the value of act_id_group.ID_
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column act_id_group.ID_
     *
     * @param id the value for act_id_group.ID_
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column act_id_group.REV_
     *
     * @return the value of act_id_group.REV_
     *
     * @mbg.generated
     */
    public Integer getRev() {
        return rev;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column act_id_group.REV_
     *
     * @param rev the value for act_id_group.REV_
     *
     * @mbg.generated
     */
    public void setRev(Integer rev) {
        this.rev = rev;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column act_id_group.NAME_
     *
     * @return the value of act_id_group.NAME_
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column act_id_group.NAME_
     *
     * @param name the value for act_id_group.NAME_
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column act_id_group.TYPE_
     *
     * @return the value of act_id_group.TYPE_
     *
     * @mbg.generated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column act_id_group.TYPE_
     *
     * @param type the value for act_id_group.TYPE_
     *
     * @mbg.generated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_id_group
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", rev=").append(rev);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}