package cn.ac.iie.spidercraw.base.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.ac.iie.spidercraw.base.domain.SysRole;

public interface RoleRepository extends JpaRepository<SysRole, Long> {

}
