package com.source;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "heroes")
public class Heroes {
	
	public Heroes() {
		
	}
	public Heroes(String alias, String race) {
		
		this.alias = alias;
		
		this.race = race;
		
	}

	@Id
	@Column(name = "hero_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hero_id;

	@Column(name = "alias")
	private String alias;
	

	@Column(name = "race")
	private String race;
	
	public int getHero_id() {
		return hero_id;
	}
	public void setHero_id(int hero_id) {
		this.hero_id = hero_id;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	@Override
	public String toString() {
		return "Heroes [hero_id=" + hero_id + ", alias=" + alias + ", race=" + race + "]";
	}
	
}
