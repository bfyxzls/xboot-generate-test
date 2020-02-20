package com.lind.springboot.generate.dao;

import com.lind.springboot.generate.model.ActApproveAgent;
import java.util.List;

public interface ActApproveAgentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_approve_agent
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_approve_agent
     *
     * @mbg.generated
     */
    int insert(ActApproveAgent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_approve_agent
     *
     * @mbg.generated
     */
    ActApproveAgent selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_approve_agent
     *
     * @mbg.generated
     */
    List<ActApproveAgent> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_approve_agent
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ActApproveAgent record);
}