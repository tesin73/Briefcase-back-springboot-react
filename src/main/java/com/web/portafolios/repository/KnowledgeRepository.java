package com.web.portafolios.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.web.portafolios.entity.Knowledge;

@Repository
public interface KnowledgeRepository extends CrudRepository<Knowledge, Integer> {
}
