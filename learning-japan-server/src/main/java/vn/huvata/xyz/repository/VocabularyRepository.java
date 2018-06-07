package vn.huvata.xyz.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import vn.huvata.xyz.domain.Vocabulary;

/**
 * @author van-thanh
 *
 */
public interface VocabularyRepository extends CrudRepository<Vocabulary, Integer> {

    void delete(Vocabulary vocabulary);

    List<Vocabulary> findAll();

//    Vocabulary findOne(int id);

    Vocabulary save(Vocabulary vocabulary);
}
