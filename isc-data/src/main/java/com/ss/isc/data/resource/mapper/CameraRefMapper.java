package com.ss.isc.data.resource.mapper;

import com.ss.isc.data.resource.common.model.CameraRef;
import com.ss.mapper.CWMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * CameraRefMapper
 * @author FrancisYs
 * @date 2019/8/16
 * @email yaoshuai@ss-cas.com
 */
@Mapper
public interface CameraRefMapper extends CWMapper<CameraRef> {

    /**
     * 删除相机关联关系
     * @param paramCameraRef
     */
    void deletes(CameraRef paramCameraRef);

    /**
     * 更新相机关联关系
     * @param paramCameraRef
     */
    void updates(CameraRef paramCameraRef);

}
