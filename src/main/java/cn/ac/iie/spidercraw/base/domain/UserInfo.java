package cn.ac.iie.spidercraw.base.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.GenericGenerator;
@Entity
public class UserInfo implements Serializable{
	private static final long serialVersionUID=1L;
	
	@Id
	@GeneratedValue(generator = "uuid") @GenericGenerator(name = "uuid", strategy = "uuid")
	private String id;
	
	@Column(nullable=false,unique=true)
	private String userName;
	
	@Column(nullable=false)
	private String passWord;
	
	@Column(nullable=false,unique=true)
	private String email;
	
	@Column(nullable=false)
	private String regTime; 
	
	@Column(nullable=false)
	private String sex; 
	
	@Column(nullable=false)
	@ColumnDefault(value="0")
	private Integer delFlag; 
	
	@Column(nullable=true)
	@ColumnDefault(value="0")
	private String delTime;
    
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="SysUserRole",joinColumns= {@JoinColumn(name="uid")},inverseJoinColumns= {@JoinColumn(name="roleId")})
	private List<SysRole> roleList;
	
	public UserInfo() {
		super();
	}

	public UserInfo(String userName, String passWord, String email, String regTime, String sex, Integer delFlag,
			String delTime, List<SysRole> roleList) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.email = email;
		this.regTime = regTime;
		this.sex = sex;
		this.delFlag = delFlag;
		this.delTime = delTime;
		this.roleList = roleList;
	}

	public List<SysRole> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<SysRole> roleList) {
		this.roleList = roleList;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRegTime() {
		return regTime;
	}

	public void setRegTime(String regTime) {
		this.regTime = regTime;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
	}

	public String getDelTime() {
		return delTime;
	}

	public void setDelTime(String delTime) {
		this.delTime = delTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", passWord=" + passWord + ", email=" + email
				+ ", regTime=" + regTime + ", sex=" + sex + ", delFlag=" + delFlag + ", delTime=" + delTime + "]";
	}
	
}
