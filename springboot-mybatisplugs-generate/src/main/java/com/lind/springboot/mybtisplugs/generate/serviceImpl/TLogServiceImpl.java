package com.lind.springboot.mybtisplugs.generate.serviceImpl;

import com.lind.springboot.mybtisplugs.generate.entity.TLog;
import com.lind.springboot.mybtisplugs.generate.mapper.TLogMapper;
import com.lind.springboot.mybtisplugs.generate.service.ITLogService;
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
public class TLogServiceImpl extends ServiceImpl<TLogMapper, TLog> implements ITLogService {
	
}
