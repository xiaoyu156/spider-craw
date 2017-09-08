package cn.ac.iie.spidercraw.base.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.ac.iie.spidercraw.base.domain.SysPermission;

public interface PermissionRepository extends JpaRepository<SysPermission, Long> {

}
