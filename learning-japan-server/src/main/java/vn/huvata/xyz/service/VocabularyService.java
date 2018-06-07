package vn.huvata.xyz.service;

import java.util.List;

import vn.huvata.xyz.domain.Vocabulary;

/**
 * @author van-thanh
 *
 */
public interface VocabularyService {

	Vocabulary create(Vocabulary vocabulary);

	Vocabulary delete(int id);

    List<Vocabulary> findAll();

    Vocabulary findById(int id);

    Vocabulary update(Vocabulary vocabulary);
}
