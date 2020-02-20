package com.lind.springboot.generate.dao;

import com.lind.springboot.generate.model.TActNode;
import java.util.List;

public interface TActNodeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_act_node
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_act_node
     *
     * @mbg.generated
     */
    int insert(TActNode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_act_node
     *
     * @mbg.generated
     */
    TActNode selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_act_node
     *
     * @mbg.generated
     */
    List<TActNode> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_act_node
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TActNode record);
}