package vn.huvata.xyz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.huvata.xyz.domain.RandomCity;
import vn.huvata.xyz.domain.User;
import vn.huvata.xyz.repository.RandomCityRepository;
import vn.huvata.xyz.repository.UserRepository;
import vn.huvata.xyz.service.GenericService;

/**
 * @author van-thanh
 *
 */
@Service
public class GenericServiceImpl implements GenericService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RandomCityRepository randomCityRepository;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> findAllUsers() {
        return (List<User>)userRepository.findAll();
    }

    @Override
    public List<RandomCity> findAllRandomCities() {
        return (List<RandomCity>)randomCityRepository.findAll();
    }
}
