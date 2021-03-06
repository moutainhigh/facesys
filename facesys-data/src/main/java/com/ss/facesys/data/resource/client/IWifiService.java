package com.ss.facesys.data.resource.client;

import com.ss.facesys.data.collect.common.dto.CaptureSumDTO;
import com.ss.facesys.data.resource.common.model.Wifi;
import java.util.List;
import java.util.Map;

public interface IWifiService {
  int insertWifi(Wifi paramWifi);
  
  int updateWifi(Wifi paramWifi);
  
  int deleteWifi(Wifi paramWifi);
  
  List<Wifi> findAllWifis(Wifi paramWifi);
  
  List<CaptureSumDTO> getWifiSum();
  
  List<Wifi> pages(Wifi paramWifi);
  
  String batchImport(List<Wifi> paramList, Map<String, String> paramMap);
  
  List<CaptureSumDTO> getWifiAllSum();
}
