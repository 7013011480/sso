package com.shekhargulati.ssoserver;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	@Id 
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	  @Column(name= "username") 
	  private String username;
	 
	@Column(name= "password")
	private String password;
	
	
	@Column(name= "enabled")
	private boolean enabled;
	
	@Column(name= "authority")
	private String authority;
	
	public User()
	{
		
	}
	
	public User( String username, String password, boolean enabled, String authority)
	{
		this.username= username;
		this.password= password;
		this.enabled= enabled;
		this.authority= authority;
	}

	public long getId() {
		return id;
	}

	
	  public String getUsername() 
	  {
		  return username;
	  }
	  
	  public void setUsername(String username) {
		  this.username = username; 
		  }
	 
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	
}
