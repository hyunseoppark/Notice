package com.human.notice.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface NoticeDAO {
    public List selectNoticeList() throws DataAccessException;
}