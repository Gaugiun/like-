package com.h2t.study.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.h2t.study.po.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author hetiantian
 * @since 2019-10-08
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
