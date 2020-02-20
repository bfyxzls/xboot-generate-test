package com.lind.springboot.generate.dao;

import com.lind.springboot.generate.model.TActModel;
import java.util.List;

public interface TActModelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_act_model
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_act_model
     *
     * @mbg.generated
     */
    int insert(TActModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_act_model
     *
     * @mbg.generated
     */
    TActModel selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_act_model
     *
     * @mbg.generated
     */
    List<TActModel> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_act_model
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TActModel record);
}