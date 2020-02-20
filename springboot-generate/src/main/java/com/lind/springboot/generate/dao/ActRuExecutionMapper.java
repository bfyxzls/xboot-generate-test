package com.lind.springboot.generate.dao;

import com.lind.springboot.generate.model.ActRuExecution;
import java.util.List;

public interface ActRuExecutionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_ru_execution
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_ru_execution
     *
     * @mbg.generated
     */
    int insert(ActRuExecution record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_ru_execution
     *
     * @mbg.generated
     */
    ActRuExecution selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_ru_execution
     *
     * @mbg.generated
     */
    List<ActRuExecution> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_ru_execution
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ActRuExecution record);
}