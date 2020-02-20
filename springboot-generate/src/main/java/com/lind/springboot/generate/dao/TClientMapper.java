package com.lind.springboot.generate.dao;

import com.lind.springboot.generate.model.TClient;
import java.util.List;

public interface TClientMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_client
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_client
     *
     * @mbg.generated
     */
    int insert(TClient record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_client
     *
     * @mbg.generated
     */
    TClient selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_client
     *
     * @mbg.generated
     */
    List<TClient> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_client
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TClient record);
}