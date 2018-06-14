package vn.huvata.xyz.repository;

import org.springframework.data.repository.CrudRepository;

import vn.huvata.xyz.domain.User;

/**
 * @author van-thanh
 *
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
