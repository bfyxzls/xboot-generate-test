package com.lind.springboot.generate.model;

import java.io.Serializable;

public class ActGeProperty implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column act_ge_property.NAME_
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column act_ge_property.VALUE_
     *
     * @mbg.generated
     */
    private String value;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column act_ge_property.REV_
     *
     * @mbg.generated
     */
    private Integer rev;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table act_ge_property
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column act_ge_property.NAME_
     *
     * @return the value of act_ge_property.NAME_
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column act_ge_property.NAME_
     *
     * @param name the value for act_ge_property.NAME_
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column act_ge_property.VALUE_
     *
     * @return the value of act_ge_property.VALUE_
     *
     * @mbg.generated
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column act_ge_property.VALUE_
     *
     * @param value the value for act_ge_property.VALUE_
     *
     * @mbg.generated
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column act_ge_property.REV_
     *
     * @return the value of act_ge_property.REV_
     *
     * @mbg.generated
     */
    public Integer getRev() {
        return rev;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column act_ge_property.REV_
     *
     * @param rev the value for act_ge_property.REV_
     *
     * @mbg.generated
     */
    public void setRev(Integer rev) {
        this.rev = rev;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_ge_property
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", value=").append(value);
        sb.append(", rev=").append(rev);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}