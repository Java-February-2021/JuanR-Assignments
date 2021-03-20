package com.juan.dojoOverFlow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.juan.dojoOverFlow.models.Answer;

@Repository
public interface AnswerRepository extends CrudRepository <Answer, Long>{
	List<Answer> findAll();
}
