package com.lind.springboot.generate.dao;

import com.lind.springboot.generate.model.TDict;
import java.util.List;

public interface TDictMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dict
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dict
     *
     * @mbg.generated
     */
    int insert(TDict record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dict
     *
     * @mbg.generated
     */
    TDict selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dict
     *
     * @mbg.generated
     */
    List<TDict> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dict
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TDict record);
}