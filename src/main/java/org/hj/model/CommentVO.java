package org.hj.model;

import java.time.LocalDateTime;

public class CommentVO {
    private int cno;
    private int bno;
    private String comment;
    private String writer;
    private LocalDateTime updatedate;


	// 생성자
    public CommentVO() {
    }

    // 생성자 - 모든 필드를 포함하는 경우
    public CommentVO(int cno,int bno, String comment, String writer, LocalDateTime updatedate) {
        this.cno = cno;
        this.bno = bno;
        this.comment = comment;
        this.writer = writer;
        this.updatedate = updatedate;
    }

    
    // Getters 및 Setters

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public LocalDateTime getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(LocalDateTime updatedate) {
        this.updatedate = updatedate;
    }
    
    @Override
   	public String toString() {
   		return "CommentVO [cno=" + cno + ", bno=" + bno + ", comment=" + comment + ", writer=" + writer
   				+ ", updatedate=" + updatedate + "]";
   	}
}
