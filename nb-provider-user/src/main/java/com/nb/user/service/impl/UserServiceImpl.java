package com.nb.user.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nb.user.entity.User;
import com.nb.user.mapper.UserMapper;
import com.nb.user.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 李浩洋
 * @since 2020-04-03
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {


}
