package com.example.demo.entity;

import java.sql.Date;

public class board {
	
	private int id;
	
	private String title;
	
	private String memberName;
	
	private String content;
	
	private Date regdate;
	
	private int hit;
	
	private boolean pub;
	
	private int memberId;
	
	public board() {
		// TODO Auto-generated constructor stub
	}

	public board(int id, String title, String memberName, String content, Date regdate, int hit, boolean pub,
			int memberId) {
		super();
		this.id = id;
		this.title = title;
		this.memberName = memberName;
		this.content = content;
		this.regdate = regdate;
		this.hit = hit;
		this.pub = pub;
		this.memberId = memberId;
	}

	@Override
	public String toString() {
		return "board [id=" + id + ", title=" + title + ", memberName=" + memberName + ", content=" + content
				+ ", regdate=" + regdate + ", hit=" + hit + ", pub=" + pub + ", memberId=" + memberId + "]";
	}
	
}
