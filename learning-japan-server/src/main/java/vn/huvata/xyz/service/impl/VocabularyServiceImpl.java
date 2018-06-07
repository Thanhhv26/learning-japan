package vn.huvata.xyz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.huvata.xyz.domain.Vocabulary;
import vn.huvata.xyz.repository.VocabularyRepository;
import vn.huvata.xyz.service.VocabularyService;

/**
 * @author van-thanh
 *
 */
@Service
public class VocabularyServiceImpl implements VocabularyService {

    @Autowired
    private VocabularyRepository repository;

    @Override
    public Vocabulary create(Vocabulary vocabulary) {
        return repository.save(vocabulary);
    }

    @Override
    public Vocabulary delete(int id) {
    	Vocabulary vocabulary = findById(id);
        if(vocabulary != null){
            repository.delete(vocabulary);
        }
        return vocabulary;
    }

    @Override
    public List<Vocabulary> findAll() {
        return repository.findAll();
    }

    @Override
    public Vocabulary findById(int id) {
//        return repository.findOne(id);
    	return null;
    }

    @Override
    public Vocabulary update(Vocabulary vocabulary) {
        return null;
    }
}
