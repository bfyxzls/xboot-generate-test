package com.lind.springboot.generate.dao;

import com.lind.springboot.generate.model.ActApproveFile;
import java.util.List;

public interface ActApproveFileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_approve_file
     *
     * @mbg.generated
     */
    int insert(ActApproveFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_approve_file
     *
     * @mbg.generated
     */
    List<ActApproveFile> selectAll();
}