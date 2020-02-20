package com.lind.springboot.generate.dao;

import com.lind.springboot.generate.model.ActHiAttachment;
import java.util.List;

public interface ActHiAttachmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_hi_attachment
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_hi_attachment
     *
     * @mbg.generated
     */
    int insert(ActHiAttachment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_hi_attachment
     *
     * @mbg.generated
     */
    ActHiAttachment selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_hi_attachment
     *
     * @mbg.generated
     */
    List<ActHiAttachment> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_hi_attachment
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ActHiAttachment record);
}