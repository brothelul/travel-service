package com.tip.travel.service.dao;

import com.tip.travel.service.entity.SystemLogBo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SystemLogDao {

    @Insert("INSERT INTO sys_log(action_type,method_name,user_id,request_url,in_params,out_params,exception,token,ip_address,time_cost,start_datetime,end_datetime,entry_id,entry_datetime)" +
            " VALUES(#{actionType},#{methodName},#{userId},#{requestUrl},#{inParams},#{outParams},#{exception},#{token},#{ipAddress},#{timeCost},#{startDatetime},#{endDatetime},#{entryId},#{entryDatetime})")
    Long saveSystemLog(SystemLogBo logBo);
}
