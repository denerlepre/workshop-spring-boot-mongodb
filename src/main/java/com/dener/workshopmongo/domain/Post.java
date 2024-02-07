package com.dener.workshopmongo.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.dener.workshopmongo.dto.AuthorDTO;
import com.dener.workshopmongo.dto.CommentDTO;

@Document
public class Post implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private Date date;
	private String title;
	private String boby;
	private AuthorDTO author;
	
	private List<CommentDTO> commets = new ArrayList<>();
	
	public Post () {
	}

	public Post(String id, Date date, String title, String boby, AuthorDTO author) {
		super();
		this.id = id;
		this.date = date;
		this.title = title;
		this.boby = boby;
		this.author = author;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBoby() {
		return boby;
	}

	public void setBoby(String boby) {
		this.boby = boby;
	}
	public AuthorDTO getAuthor() {
		return author;
	}

	public void setAuthor(AuthorDTO author) {
		this.author = author;
	}

	public List<CommentDTO> getCommets() {
		return commets;
	}

	public void setCommets(List<CommentDTO> commets) {
		this.commets = commets;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	

	
	
}
