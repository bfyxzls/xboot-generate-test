package com.lind.springboot.mybtisplugs.generate.serviceImpl;

import com.lind.springboot.mybtisplugs.generate.entity.TSetting;
import com.lind.springboot.mybtisplugs.generate.mapper.TSettingMapper;
import com.lind.springboot.mybtisplugs.generate.service.ITSettingService;
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
public class TSettingServiceImpl extends ServiceImpl<TSettingMapper, TSetting> implements ITSettingService {
	
}
