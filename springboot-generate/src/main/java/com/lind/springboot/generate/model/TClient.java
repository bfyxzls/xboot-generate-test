package com.lind.springboot.generate.model;

import java.io.Serializable;
import java.util.Date;

public class TClient implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_client.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_client.create_by
     *
     * @mbg.generated
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_client.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_client.del_flag
     *
     * @mbg.generated
     */
    private Integer delFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_client.update_by
     *
     * @mbg.generated
     */
    private String updateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_client.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_client.client_secret
     *
     * @mbg.generated
     */
    private String clientSecret;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_client.home_uri
     *
     * @mbg.generated
     */
    private String homeUri;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_client.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_client.redirect_uri
     *
     * @mbg.generated
     */
    private String redirectUri;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_client
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_client.id
     *
     * @return the value of t_client.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_client.id
     *
     * @param id the value for t_client.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_client.create_by
     *
     * @return the value of t_client.create_by
     *
     * @mbg.generated
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_client.create_by
     *
     * @param createBy the value for t_client.create_by
     *
     * @mbg.generated
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_client.create_time
     *
     * @return the value of t_client.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_client.create_time
     *
     * @param createTime the value for t_client.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_client.del_flag
     *
     * @return the value of t_client.del_flag
     *
     * @mbg.generated
     */
    public Integer getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_client.del_flag
     *
     * @param delFlag the value for t_client.del_flag
     *
     * @mbg.generated
     */
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_client.update_by
     *
     * @return the value of t_client.update_by
     *
     * @mbg.generated
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_client.update_by
     *
     * @param updateBy the value for t_client.update_by
     *
     * @mbg.generated
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_client.update_time
     *
     * @return the value of t_client.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_client.update_time
     *
     * @param updateTime the value for t_client.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_client.client_secret
     *
     * @return the value of t_client.client_secret
     *
     * @mbg.generated
     */
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_client.client_secret
     *
     * @param clientSecret the value for t_client.client_secret
     *
     * @mbg.generated
     */
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret == null ? null : clientSecret.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_client.home_uri
     *
     * @return the value of t_client.home_uri
     *
     * @mbg.generated
     */
    public String getHomeUri() {
        return homeUri;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_client.home_uri
     *
     * @param homeUri the value for t_client.home_uri
     *
     * @mbg.generated
     */
    public void setHomeUri(String homeUri) {
        this.homeUri = homeUri == null ? null : homeUri.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_client.name
     *
     * @return the value of t_client.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_client.name
     *
     * @param name the value for t_client.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_client.redirect_uri
     *
     * @return the value of t_client.redirect_uri
     *
     * @mbg.generated
     */
    public String getRedirectUri() {
        return redirectUri;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_client.redirect_uri
     *
     * @param redirectUri the value for t_client.redirect_uri
     *
     * @mbg.generated
     */
    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri == null ? null : redirectUri.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_client
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
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", clientSecret=").append(clientSecret);
        sb.append(", homeUri=").append(homeUri);
        sb.append(", name=").append(name);
        sb.append(", redirectUri=").append(redirectUri);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}