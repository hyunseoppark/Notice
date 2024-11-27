package com.human.notice.service;

import com.human.notice.repository.NoticeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("noticeService")
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    private NoticeDAO noticeDAO;

    public List selectNoticeList() throws Exception {
        return noticeDAO.selectNoticeList();
    }

}
