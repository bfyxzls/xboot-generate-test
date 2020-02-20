package com.lind.springboot.generate.dao;

import com.lind.springboot.generate.model.ActProcdefInfo;
import java.util.List;

public interface ActProcdefInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_procdef_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_procdef_info
     *
     * @mbg.generated
     */
    int insert(ActProcdefInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_procdef_info
     *
     * @mbg.generated
     */
    ActProcdefInfo selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_procdef_info
     *
     * @mbg.generated
     */
    List<ActProcdefInfo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_procdef_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ActProcdefInfo record);
}