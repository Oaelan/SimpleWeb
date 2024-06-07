package org.hj.model;

import java.time.LocalDateTime;

public class PostInfo {
	private int bno;
	private String title;
	private String writer;
	private String content;
	private LocalDateTime updatedate;
	
	public PostInfo() {
    }
	
// bno의 게터와 세터
	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

// title의 게터와 세터
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

// writer의 게터와 세터
	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

// content의 게터와 세터
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

// updatedate의 게터와 세터
	public LocalDateTime getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(LocalDateTime updatedate) {
		this.updatedate = updatedate;
	}

}
