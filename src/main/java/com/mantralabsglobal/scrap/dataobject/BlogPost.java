package com.mantralabsglobal.scrap.dataobject;

import java.util.List;

import org.springframework.data.annotation.Id;

public class BlogPost {

	@Id
	private String id;
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private String title;
	private String content;
	private long lastModified;
	private String summary;
	private String author;
	private String blog;
	private String url;
	private List<String> imageUrlList;
	
	private List<BlogComment> comments;
	private int commentCount;
	
	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public long getLastModified() {
		return lastModified;
	}

	public String getAuthor() {
		return author;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setLastModified(long lastModified) {
		this.lastModified = lastModified;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBlog() {
		return blog;
	}

	public void setBlog(String blog) {
		this.blog = blog;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public List<BlogComment> getComments() {
		return comments;
	}

	public void setComments(List<BlogComment> comments) {
		this.comments = comments;
	}

	public List<String> getImageUrlList() {
		return imageUrlList;
	}

	public void setImageUrlList(List<String> imageUrlList) {
		this.imageUrlList = imageUrlList;
	}

	public int getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}

}
