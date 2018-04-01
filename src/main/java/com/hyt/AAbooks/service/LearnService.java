package com.hyt.AAbooks.service;

import com.hyt.AAbooks.domain.LearnResouce;
import com.hyt.AAbooks.tools.Page;

import java.util.Map;

public interface LearnService {
    int add(LearnResouce learnResouce);
    int update(LearnResouce learnResouce);
    int deleteByIds(String ids);
    LearnResouce queryLearnResouceById(Long learnResouce);
    Page queryLearnResouceList(Map<String,Object> params);
}