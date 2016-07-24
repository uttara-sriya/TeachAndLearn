package com.doit.Domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Entity
@Table(name = "users_all")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="userid")
    private Long userId;

	@Column(name = "username")
    private String username;

	@Column(name = "password")
    private String password;   

	@Column(name = "email")
    private String email;
    
	@Column(name ="isactive")
	private int enabled;

	@Column(name = "role_id")
	private int role_id;

	//private Role roles;

	public User(){
		
	}
	
	public User(User user) {
	        this.userId = user.userId;
	        this.username = user.username;
	        this.email = user.email;       
	        this.password = user.password;
	        this.enabled=user.enabled;
		    this.role_id=user.role_id;
	}
	public  User(String username){
		this.username = username;
	}
	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}	

	public Long getUserid() {
		return userId;
	}

	public void setUserid(Long userid) {
		this.userId = userid;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	//	@ManyToOne
//	@JoinTable(name = "user_role")
//	public Role getRoles() {
//		return roles;
//	}
//
//	public void setRoles(Role roles) {
//		this.roles = roles;
//	}
	//	@ManyToMany
//	@JoinTable(name = "users_all_role", joinColumns = @JoinColumn(name = "userid"), inverseJoinColumns = @JoinColumn(name = "id"))
//	public Set<Role> getRoles() {
//		return roles;
//	}
//
//	public void setRoles(Set<Role> roles) {
//		this.roles = roles;
//	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
}