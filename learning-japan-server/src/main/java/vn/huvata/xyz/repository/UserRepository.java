package vn.huvata.xyz.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import vn.huvata.xyz.domain.User;

public interface UserRepository extends CrudRepository<User, Integer> {

    void delete(User user);

    List<User> findAll();

//    User findOne(int id);

    User save(User user);
}
