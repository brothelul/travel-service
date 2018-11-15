package com.tip.travel.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tip.travel.common.domain.SystemLog;
import com.tip.travel.common.service.SystemLogService;
import com.tip.travel.service.dao.SystemLogDao;
import com.tip.travel.service.entity.SystemLogBo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

@Service(version = "1.0.0")
public class SystemLogServiceImpl implements SystemLogService {
    @Autowired
    private SystemLogDao systemLogDao;

    @Override
    public void saveSystemLog(SystemLog log) {
        SystemLogBo systemLogBo = new SystemLogBo();
        BeanUtils.copyProperties(log, systemLogBo);
        systemLogBo.setEntryId(-9999);
        systemLogBo.setEntryDatetime(new Date());
        systemLogDao.saveSystemLog(systemLogBo);
    }
}
