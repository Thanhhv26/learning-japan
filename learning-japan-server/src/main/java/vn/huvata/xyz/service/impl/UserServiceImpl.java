package vn.huvata.xyz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.huvata.xyz.domain.User;
import vn.huvata.xyz.repository.UserRepository;
import vn.huvata.xyz.service.UserService;

/**
 * @author van-thanh
 *
 */
@Service
//public class UserServiceImpl implements UserDetailsService, UserService {
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User create(User user) {
        return repository.save(user);
    }

    @Override
    public User delete(int id) {
        User user = findById(id);
        if(user != null){
            repository.delete(user);
        } 
        return user;
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User findById(int id) {
//        return repository.findOne(id);
    	return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		User user = repository.findByUsername(username);
//		if(user == null){
//			throw new UsernameNotFoundException("Invalid username or password.");
//		}
//		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), getAuthority());
//	}
//	
//	private List<SimpleGrantedAuthority> getAuthority() {
//		return Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
//	}
}
