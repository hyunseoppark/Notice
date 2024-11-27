package com.human.notice.vo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Component("noticeVO")
@MapperScan("com.human.notice.repository")
public class NoticeVO {
    private int idx;
    private String category;
    private String title;
    private String content;
    private Date regDate;
    private Date update;
    private char status;

    public NoticeVO() {
    }
    public int getIdx() {
        return idx;
    }
    public void setIdx(int idx) {
        this.idx = idx;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Date getRegDate() {
        return regDate;
    }
    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }
    public Date getUpdate() {
        return update;
    }
    public void setUpdate(Date update) {
        this.update = update;
    }
    public char getStatus() {
        return status;
    }
    public void setStatus(char status) {
        this.status = status;
    }
}
