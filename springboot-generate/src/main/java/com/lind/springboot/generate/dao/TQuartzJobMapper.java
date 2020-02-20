package com.lind.springboot.generate.dao;

import com.lind.springboot.generate.model.TQuartzJob;
import java.util.List;

public interface TQuartzJobMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_quartz_job
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_quartz_job
     *
     * @mbg.generated
     */
    int insert(TQuartzJob record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_quartz_job
     *
     * @mbg.generated
     */
    TQuartzJob selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_quartz_job
     *
     * @mbg.generated
     */
    List<TQuartzJob> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_quartz_job
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TQuartzJob record);
}