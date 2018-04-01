package com.hyt.AAbooks.dao;

import com.hyt.AAbooks.domain.LearnResouce;
import com.hyt.AAbooks.tools.Page;

import java.util.Map;

public interface LearnDao {
    int add(LearnResouce learnResouce);
    int update(LearnResouce learnResouce);
    int deleteByIds(String ids);
    LearnResouce queryLearnResouceById(Long id);
    Page queryLearnResouceList(Map<String,Object> params);
}
