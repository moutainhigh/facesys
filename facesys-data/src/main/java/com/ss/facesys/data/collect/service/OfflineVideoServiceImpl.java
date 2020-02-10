package com.ss.facesys.data.collect.service;

import com.github.pagehelper.PageHelper;
import com.ss.facesys.data.baseinfo.service.BaseServiceImpl;
import com.ss.facesys.data.collect.client.IOfflineVideoService;
import com.ss.facesys.data.collect.common.model.OfflineVideo;
import com.ss.facesys.data.collect.mapper.OfflineVideoMapper;
import com.ss.facesys.data.resource.common.web.OfflineVideoVO;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
* 离线视频
* @author chao
* @create 2020/2/7
* @email lishuangchao@ss-cas.com
**/
@Service
@Transactional(rollbackFor = {Exception.class})
public class OfflineVideoServiceImpl extends BaseServiceImpl implements IOfflineVideoService {
  public static final Log logger = LogFactory.getLog(OfflineVideoServiceImpl.class);

  @Autowired
  private OfflineVideoMapper offlineVideoMapper;

  /**
   * 离线视频分页查询
   * @param offlineVideoVO
   * @return
   */
  @Override
  public List<OfflineVideo> offlineVideoPage(OfflineVideoVO offlineVideoVO) {
    PageHelper.startPage(offlineVideoVO.getCurrentPage(), offlineVideoVO.getPageSize());
    List<OfflineVideo> internetBars = this.offlineVideoMapper.offlineVideoPage(offlineVideoVO);
    return internetBars;
  }
}