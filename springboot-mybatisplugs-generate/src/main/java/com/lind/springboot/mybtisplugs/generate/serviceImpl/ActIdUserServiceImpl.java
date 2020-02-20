package com.lind.springboot.mybtisplugs.generate.serviceImpl;

import com.lind.springboot.mybtisplugs.generate.entity.ActIdUser;
import com.lind.springboot.mybtisplugs.generate.mapper.ActIdUserMapper;
import com.lind.springboot.mybtisplugs.generate.service.IActIdUserService;
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
public class ActIdUserServiceImpl extends ServiceImpl<ActIdUserMapper, ActIdUser> implements IActIdUserService {
	
}
