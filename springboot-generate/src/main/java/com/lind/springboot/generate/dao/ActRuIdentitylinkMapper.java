package com.lind.springboot.generate.dao;

import com.lind.springboot.generate.model.ActRuIdentitylink;
import java.util.List;

public interface ActRuIdentitylinkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_ru_identitylink
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_ru_identitylink
     *
     * @mbg.generated
     */
    int insert(ActRuIdentitylink record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_ru_identitylink
     *
     * @mbg.generated
     */
    ActRuIdentitylink selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_ru_identitylink
     *
     * @mbg.generated
     */
    List<ActRuIdentitylink> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_ru_identitylink
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ActRuIdentitylink record);
}