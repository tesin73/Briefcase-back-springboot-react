package com.web.portafolios.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.web.portafolios.entity.Knowledge;
import com.web.portafolios.service.KnowledgeService;

@RestController
@RequestMapping(path = "/knw")
public class KnowledgeController {
    @Autowired
    KnowledgeService knowledgeService;

    @GetMapping("/knowledge")
    public List<Knowledge> getAllKnowledges() {
        return knowledgeService.getAllKnowledges();
    }

    @GetMapping("/knowledge/{id}")
    public Knowledge getKnowledge(@PathVariable("id") int id) {
        return knowledgeService.getKnowledgeEntityById(id);
    }

    @PostMapping(value = "/knowledge", consumes = { "*/*" })
    public void addKnowledge(@RequestBody Knowledge knowledge) {
        knowledgeService.saveOrUpdate(knowledge);
    }

    @PutMapping("/knowledge")
    public void updateKnowledge(@RequestBody Knowledge knowledge) {
        knowledgeService.saveOrUpdate(knowledge);
    }

    @DeleteMapping("/knowledge/{id}")
    public void deleteKnowledgeById(@PathVariable("id") int id) {
        knowledgeService.deleteKnowledgeById(id);
    }
}
