package com.lind.springboot.mybtisplugs.generate.serviceImpl;

import com.lind.springboot.mybtisplugs.generate.entity.TStudent;
import com.lind.springboot.mybtisplugs.generate.mapper.TStudentMapper;
import com.lind.springboot.mybtisplugs.generate.service.ITStudentService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lqh
 * @since 2020-02-20
 */
@Service
public class TStudentServiceImpl extends ServiceImpl<TStudentMapper, TStudent> implements ITStudentService {
	
}
