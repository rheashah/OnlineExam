package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.AdminSearchDao;
import com.lti.model.Answer;
import com.lti.model.Exam;
import com.lti.model.User;



@Service
public class AdminSearchService {

	@Autowired
	public AdminSearchDao adminSearchdao;
	
	public List<User> search(String firstselect,String secondselect) {
		
		
		if(firstselect.equals("technology")){
			return adminSearchdao.searchUsersByTechnology(firstselect, secondselect);
		}
		
		return adminSearchdao.searchUsers(firstselect,secondselect);
	}
	
	
	public List<Exam> searchUsersById(int studentId){
		
		return adminSearchdao.searchUsersById(studentId);
	}
	
	
	public List<Answer> viewReportBySubjectNameAndEmail(int examId){
		return adminSearchdao.viewReportBySubjectNameAndEmail(examId);
	}
}
