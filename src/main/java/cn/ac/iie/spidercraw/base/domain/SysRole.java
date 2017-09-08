package cn.ac.iie.spidercraw.base.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class SysRole {
	@Id
	@GeneratedValue(generator = "uuid") @GenericGenerator(name = "uuid", strategy = "uuid")
	private String id;
	
	@Column(unique=true)
	private String role;
	
	@Column
	private String description;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="SysRolePermission",joinColumns= {@JoinColumn(name="roleId")},inverseJoinColumns={@JoinColumn(name="permissionId")})
	private List<SysPermission> permissions;
	
	@ManyToMany
	@JoinTable(name="SysUserRole",joinColumns= {@JoinColumn(name="roleId")},inverseJoinColumns= {@JoinColumn(name="uid")})
	private List<SysRole> roles;
    
	
	public SysRole() {
		super();
	}

	public SysRole(String role, String description, List<SysPermission> permissions, List<SysRole> roles) {
		super();
		this.role = role;
		this.description = description;
		this.permissions = permissions;
		this.roles = roles;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<SysPermission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<SysPermission> permissions) {
		this.permissions = permissions;
	}

	public List<SysRole> getRoles() {
		return roles;
	}

	public void setRoles(List<SysRole> roles) {
		this.roles = roles;
	}
	
}
