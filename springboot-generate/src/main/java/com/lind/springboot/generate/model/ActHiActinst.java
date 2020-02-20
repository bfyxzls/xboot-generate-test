package com.lind.springboot.generate.model;

import java.io.Serializable;
import java.util.Date;

public class ActHiActinst implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column act_hi_actinst.ID_
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column act_hi_actinst.PROC_DEF_ID_
     *
     * @mbg.generated
     */
    private String procDefId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column act_hi_actinst.PROC_INST_ID_
     *
     * @mbg.generated
     */
    private String procInstId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column act_hi_actinst.EXECUTION_ID_
     *
     * @mbg.generated
     */
    private String executionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column act_hi_actinst.ACT_ID_
     *
     * @mbg.generated
     */
    private String actId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column act_hi_actinst.TASK_ID_
     *
     * @mbg.generated
     */
    private String taskId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column act_hi_actinst.CALL_PROC_INST_ID_
     *
     * @mbg.generated
     */
    private String callProcInstId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column act_hi_actinst.ACT_NAME_
     *
     * @mbg.generated
     */
    private String actName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column act_hi_actinst.ACT_TYPE_
     *
     * @mbg.generated
     */
    private String actType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column act_hi_actinst.ASSIGNEE_
     *
     * @mbg.generated
     */
    private String assignee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column act_hi_actinst.START_TIME_
     *
     * @mbg.generated
     */
    private Date startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column act_hi_actinst.END_TIME_
     *
     * @mbg.generated
     */
    private Date endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column act_hi_actinst.DURATION_
     *
     * @mbg.generated
     */
    private Long duration;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column act_hi_actinst.TENANT_ID_
     *
     * @mbg.generated
     */
    private String tenantId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table act_hi_actinst
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column act_hi_actinst.ID_
     *
     * @return the value of act_hi_actinst.ID_
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column act_hi_actinst.ID_
     *
     * @param id the value for act_hi_actinst.ID_
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column act_hi_actinst.PROC_DEF_ID_
     *
     * @return the value of act_hi_actinst.PROC_DEF_ID_
     *
     * @mbg.generated
     */
    public String getProcDefId() {
        return procDefId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column act_hi_actinst.PROC_DEF_ID_
     *
     * @param procDefId the value for act_hi_actinst.PROC_DEF_ID_
     *
     * @mbg.generated
     */
    public void setProcDefId(String procDefId) {
        this.procDefId = procDefId == null ? null : procDefId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column act_hi_actinst.PROC_INST_ID_
     *
     * @return the value of act_hi_actinst.PROC_INST_ID_
     *
     * @mbg.generated
     */
    public String getProcInstId() {
        return procInstId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column act_hi_actinst.PROC_INST_ID_
     *
     * @param procInstId the value for act_hi_actinst.PROC_INST_ID_
     *
     * @mbg.generated
     */
    public void setProcInstId(String procInstId) {
        this.procInstId = procInstId == null ? null : procInstId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column act_hi_actinst.EXECUTION_ID_
     *
     * @return the value of act_hi_actinst.EXECUTION_ID_
     *
     * @mbg.generated
     */
    public String getExecutionId() {
        return executionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column act_hi_actinst.EXECUTION_ID_
     *
     * @param executionId the value for act_hi_actinst.EXECUTION_ID_
     *
     * @mbg.generated
     */
    public void setExecutionId(String executionId) {
        this.executionId = executionId == null ? null : executionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column act_hi_actinst.ACT_ID_
     *
     * @return the value of act_hi_actinst.ACT_ID_
     *
     * @mbg.generated
     */
    public String getActId() {
        return actId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column act_hi_actinst.ACT_ID_
     *
     * @param actId the value for act_hi_actinst.ACT_ID_
     *
     * @mbg.generated
     */
    public void setActId(String actId) {
        this.actId = actId == null ? null : actId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column act_hi_actinst.TASK_ID_
     *
     * @return the value of act_hi_actinst.TASK_ID_
     *
     * @mbg.generated
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column act_hi_actinst.TASK_ID_
     *
     * @param taskId the value for act_hi_actinst.TASK_ID_
     *
     * @mbg.generated
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column act_hi_actinst.CALL_PROC_INST_ID_
     *
     * @return the value of act_hi_actinst.CALL_PROC_INST_ID_
     *
     * @mbg.generated
     */
    public String getCallProcInstId() {
        return callProcInstId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column act_hi_actinst.CALL_PROC_INST_ID_
     *
     * @param callProcInstId the value for act_hi_actinst.CALL_PROC_INST_ID_
     *
     * @mbg.generated
     */
    public void setCallProcInstId(String callProcInstId) {
        this.callProcInstId = callProcInstId == null ? null : callProcInstId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column act_hi_actinst.ACT_NAME_
     *
     * @return the value of act_hi_actinst.ACT_NAME_
     *
     * @mbg.generated
     */
    public String getActName() {
        return actName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column act_hi_actinst.ACT_NAME_
     *
     * @param actName the value for act_hi_actinst.ACT_NAME_
     *
     * @mbg.generated
     */
    public void setActName(String actName) {
        this.actName = actName == null ? null : actName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column act_hi_actinst.ACT_TYPE_
     *
     * @return the value of act_hi_actinst.ACT_TYPE_
     *
     * @mbg.generated
     */
    public String getActType() {
        return actType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column act_hi_actinst.ACT_TYPE_
     *
     * @param actType the value for act_hi_actinst.ACT_TYPE_
     *
     * @mbg.generated
     */
    public void setActType(String actType) {
        this.actType = actType == null ? null : actType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column act_hi_actinst.ASSIGNEE_
     *
     * @return the value of act_hi_actinst.ASSIGNEE_
     *
     * @mbg.generated
     */
    public String getAssignee() {
        return assignee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column act_hi_actinst.ASSIGNEE_
     *
     * @param assignee the value for act_hi_actinst.ASSIGNEE_
     *
     * @mbg.generated
     */
    public void setAssignee(String assignee) {
        this.assignee = assignee == null ? null : assignee.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column act_hi_actinst.START_TIME_
     *
     * @return the value of act_hi_actinst.START_TIME_
     *
     * @mbg.generated
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column act_hi_actinst.START_TIME_
     *
     * @param startTime the value for act_hi_actinst.START_TIME_
     *
     * @mbg.generated
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column act_hi_actinst.END_TIME_
     *
     * @return the value of act_hi_actinst.END_TIME_
     *
     * @mbg.generated
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column act_hi_actinst.END_TIME_
     *
     * @param endTime the value for act_hi_actinst.END_TIME_
     *
     * @mbg.generated
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column act_hi_actinst.DURATION_
     *
     * @return the value of act_hi_actinst.DURATION_
     *
     * @mbg.generated
     */
    public Long getDuration() {
        return duration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column act_hi_actinst.DURATION_
     *
     * @param duration the value for act_hi_actinst.DURATION_
     *
     * @mbg.generated
     */
    public void setDuration(Long duration) {
        this.duration = duration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column act_hi_actinst.TENANT_ID_
     *
     * @return the value of act_hi_actinst.TENANT_ID_
     *
     * @mbg.generated
     */
    public String getTenantId() {
        return tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column act_hi_actinst.TENANT_ID_
     *
     * @param tenantId the value for act_hi_actinst.TENANT_ID_
     *
     * @mbg.generated
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_hi_actinst
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
        sb.append(", procDefId=").append(procDefId);
        sb.append(", procInstId=").append(procInstId);
        sb.append(", executionId=").append(executionId);
        sb.append(", actId=").append(actId);
        sb.append(", taskId=").append(taskId);
        sb.append(", callProcInstId=").append(callProcInstId);
        sb.append(", actName=").append(actName);
        sb.append(", actType=").append(actType);
        sb.append(", assignee=").append(assignee);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", duration=").append(duration);
        sb.append(", tenantId=").append(tenantId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}