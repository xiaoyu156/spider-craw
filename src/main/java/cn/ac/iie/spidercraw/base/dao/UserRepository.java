package cn.ac.iie.spidercraw.base.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.ac.iie.spidercraw.base.domain.UserInfo;

public interface UserRepository extends JpaRepository<UserInfo, Long>{
	UserInfo findByUserName(String userName);
}
