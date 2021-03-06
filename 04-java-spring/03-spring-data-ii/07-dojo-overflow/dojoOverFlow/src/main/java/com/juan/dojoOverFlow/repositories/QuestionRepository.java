package com.juan.dojoOverFlow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.juan.dojoOverFlow.models.Question;

@Repository
public interface QuestionRepository extends CrudRepository <Question,Long>{
	List<Question> findAll();
}
