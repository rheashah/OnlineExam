package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.model.Question;

@Repository
public class QuestionDao extends GenericDao {

	@PersistenceContext
	public EntityManager entityManager;
	
	public List<Question> fetchQuestions(int subjectId){
		
		String ql = "select q from Question q where q.subject=:tp";
		Query q = entityManager.createQuery(ql);
		q.setParameter("tp",subjectId);
		
		return q.getResultList();
		
	}
}
