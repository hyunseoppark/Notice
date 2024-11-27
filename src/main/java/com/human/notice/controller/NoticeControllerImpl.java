package com.human.notice.controller;

import com.human.notice.service.NoticeService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller("noticeController")
@RequestMapping(value = "/notice")
public class NoticeControllerImpl implements NoticeController {
    @Autowired
    private NoticeService noticeService;

    @Override
    @GetMapping(value = "/notice_list.do")
    public ModelAndView noticeList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        List noticeList = noticeService.selectNoticeList();
        System.out.println(noticeList);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/notice/notice_list");
        mav.addObject("noticeList", noticeList);
        return mav;
    }
}
