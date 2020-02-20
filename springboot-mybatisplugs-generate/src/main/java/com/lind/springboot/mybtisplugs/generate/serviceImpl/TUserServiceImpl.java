package com.lind.springboot.mybtisplugs.generate.serviceImpl;

import com.lind.springboot.mybtisplugs.generate.entity.TUser;
import com.lind.springboot.mybtisplugs.generate.mapper.TUserMapper;
import com.lind.springboot.mybtisplugs.generate.service.ITUserService;
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
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {
	
}
