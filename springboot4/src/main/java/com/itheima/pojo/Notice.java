package com.itheima.pojo;

public class Notice {
	
	private Long id;
	private String content;
	private String title;
	public Notice() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Notice [id=" + id + ", content=" + content + ", title=" + title + "]";
	}
	
	

}
