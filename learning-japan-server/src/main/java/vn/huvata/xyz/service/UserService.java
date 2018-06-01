package vn.huvata.xyz.service;

import java.util.List;

import vn.huvata.xyz.domain.User;

/**
 * @author van-thanh
 *
 */
public interface UserService {

    User create(User user);

    User delete(int id);

    List<User> findAll();

    User findById(int id);

    User update(User user);
}
