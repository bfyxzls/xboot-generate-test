package com.lind.springboot.generate.dao;

import com.lind.springboot.generate.model.ActHiTaskinst;
import java.util.List;

public interface ActHiTaskinstMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_hi_taskinst
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_hi_taskinst
     *
     * @mbg.generated
     */
    int insert(ActHiTaskinst record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_hi_taskinst
     *
     * @mbg.generated
     */
    ActHiTaskinst selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_hi_taskinst
     *
     * @mbg.generated
     */
    List<ActHiTaskinst> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_hi_taskinst
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ActHiTaskinst record);
}