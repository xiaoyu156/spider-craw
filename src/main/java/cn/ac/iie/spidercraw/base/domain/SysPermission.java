package cn.ac.iie.spidercraw.base.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class SysPermission implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "uuid") @GenericGenerator(name = "uuid", strategy = "uuid")
	private String id;
	
	@Column
	private String name;
	
	@Column(columnDefinition="enum('menu','button')")
	private String resourceType;
	
	@Column
	private String url;
	
	@Column
	private String permission;
	
	@Column
	private String parentId;
	
	@Column
	private String parents;
	
	@Column
	private Boolean available=Boolean.FALSE;
	
	@ManyToMany
	@JoinTable(name="SysRolePermission",joinColumns= {@JoinColumn(name="permissionId")},inverseJoinColumns={@JoinColumn(name="roleId")})
	private List<SysRole> roles;
	
}
