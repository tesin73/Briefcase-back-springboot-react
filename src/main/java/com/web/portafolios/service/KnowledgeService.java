package com.web.portafolios.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.web.portafolios.entity.Knowledge;
import com.web.portafolios.repository.KnowledgeRepository;

@Service
public class KnowledgeService {
    @Autowired
    KnowledgeRepository repository;

    public Knowledge getKnowledgeEntityById(int id) {
        return repository.findById(id).get();
    }

    public List<Knowledge> getAllKnowledges() {
        List<Knowledge> knowledges = new ArrayList<Knowledge>();
        repository.findAll().forEach(knowledge -> knowledges.add(knowledge));
        return knowledges;
    }

    public void saveOrUpdate(Knowledge knowledge) {
        repository.save(knowledge);
    }

    public void deleteKnowledgeById(int id) {
        repository.deleteById(id);
    }
}
