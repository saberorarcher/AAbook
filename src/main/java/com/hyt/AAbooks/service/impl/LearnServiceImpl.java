package com.hyt.AAbooks.service.impl;

import com.github.pagehelper.PageHelper;
import com.hyt.AAbooks.dao.LearnDao;
import com.hyt.AAbooks.dao.LearnMapper;
import com.hyt.AAbooks.domain.LearnResouce;
import com.hyt.AAbooks.service.LearnService;
import com.hyt.AAbooks.tools.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class LearnServiceImpl implements LearnService {
//    @Autowired
//    LearnDao learnDao;
//    @Override
//    public int add(LearnResouce learnResouce) {
//        return this.learnDao.add(learnResouce);
//    }
//
//    @Override
//    public int update(LearnResouce learnResouce) {
//        return this.learnDao.update(learnResouce);
//    }
//
//    @Override
//    public int deleteByIds(String ids) {
//        return this.learnDao.deleteByIds(ids);
//    }
//
//    @Override
//    public LearnResouce queryLearnResouceById(Long id) {
//        return this.learnDao.queryLearnResouceById(id);
//    }
//
//    @Override
//    public Page queryLearnResouceList(Map<String,Object> params) {
//        return this.learnDao.queryLearnResouceList(params);
//    }
    //mybaties方式
    @Autowired
    LearnMapper learnMapper;
    @Override
    public int add(LearnResouce learnResouce) {
        return this.learnMapper.add(learnResouce);
    }

    @Override
    public int update(LearnResouce learnResouce) {
        return this.learnMapper.update(learnResouce);
    }

    @Override
    public int deleteByIds(String[] ids) {
        return this.learnMapper.deleteByIds(ids);
    }

    @Override
    public LearnResouce queryLearnResouceById(Long id) {
        return this.learnMapper.queryLearnResouceById(id);
    }

    @Override
    public List<LearnResouce> queryLearnResouceList(Map<String,Object> params) {
        PageHelper.startPage(Integer.parseInt(params.get("page").toString()), Integer.parseInt(params.get("rows").toString()));
        return this.learnMapper.queryLearnResouceList(params);
    }

}
