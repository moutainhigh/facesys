package com.ss.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface CWMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
