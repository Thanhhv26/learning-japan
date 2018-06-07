package vn.huvata.xyz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.huvata.xyz.domain.Vocabulary;
import vn.huvata.xyz.service.VocabularyService;

//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
/**
 * @author van-thanh
 *
 */
@RestController
@RequestMapping({"/api/vocabulary"})
@CrossOrigin()
public class VocabularyController { 
    @Autowired
    private VocabularyService service;
    
    @PostMapping
    public Vocabulary create(@RequestBody Vocabulary vocabulary){
        return service.create(vocabulary);
    }

    @GetMapping(path = {"/{id}"})
    public Vocabulary findOne(@PathVariable("id") int id){
        return service.findById(id);
    }

    @PutMapping
    public Vocabulary update(@RequestBody Vocabulary vocabulary){
        return service.update(vocabulary);
    }

    @DeleteMapping(path ={"/{id}"})
    public Vocabulary delete(@PathVariable("id") int id) {
        return service.delete(id);
    }

    @GetMapping
    public List<Vocabulary> findAll(){    	
        return service.findAll();
    }
}
