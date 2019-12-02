package com.ss.isc.data.baseinfo.mapper;

import com.ss.isc.data.baseinfo.common.model.BaseEnums;
import com.ss.mapper.CWMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

/**
 * EnumMapper
 * @author FrancisYs
 * @date 2019/8/14
 * @email yaoshuai@ss-cas.com
 */
@Mapper
public interface EnumMapper extends CWMapper<BaseEnums> {

    /**
     * 查询枚举列表
     * @param paramBaseEnums
     * @return
     */
    List<BaseEnums> findList(BaseEnums paramBaseEnums);

}
