package com.ss.isc.data.viid.mapper;

import com.ss.isc.data.collect.common.web.SubscribeVO;
import com.ss.isc.data.viid.common.from.SubscribeBaseForm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface SubscribeMapper {
    Integer add(SubscribeVO subscribeVO);

    Integer delete(SubscribeVO subscribeVO);

    Integer update(SubscribeVO subscribeVO);

    SubscribeBaseForm check(@Param("subscribeId")String subscribeId);
}
