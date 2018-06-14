package vn.huvata.xyz.repository;

import org.springframework.data.repository.CrudRepository;

import vn.huvata.xyz.domain.RandomCity;

/**
 * @author van-thanh
 *
 */
public interface RandomCityRepository extends CrudRepository<RandomCity, Long> {
	
}
