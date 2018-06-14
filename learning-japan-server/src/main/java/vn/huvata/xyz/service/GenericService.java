package vn.huvata.xyz.service;

import java.util.List;

import vn.huvata.xyz.domain.RandomCity;
import vn.huvata.xyz.domain.User;

/**
 * @author van-thanh
 *
 */
public interface GenericService {
	User findByUsername(String username);

	List<User> findAllUsers();

	List<RandomCity> findAllRandomCities();
}
