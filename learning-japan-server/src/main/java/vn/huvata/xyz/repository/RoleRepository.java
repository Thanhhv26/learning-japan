package vn.huvata.xyz.repository;

import org.springframework.data.repository.CrudRepository;

import vn.huvata.xyz.domain.Role;

/**
 * @author van-thanh
 *
 */
public interface RoleRepository extends CrudRepository<Role, Long> {
	
}
