package com.sist.web.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/*
 * NO int 
TITLE text 
POSTER text 
CHEF text 
LINK text 
JJIMCOUNT int 
HIT int
 * */

@Entity
@Data
public class Recipe2 {
	@Id
	private int no;
	private String title;
	private String poster;
	private String chef;
	private int hit;
}
