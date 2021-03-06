package com.lti.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lti.model.Subject;
import com.lti.model.User;
import com.lti.service.RetriveSubjectService;

@Controller
@SessionAttributes("subjects")
public class RetriveSubjectController {

	
	@Autowired
	public RetriveSubjectService retriveSubjectService;
	
	@RequestMapping(path="/retriveSubject.lti",method=RequestMethod.POST) 
	public String fetchAllSubject(@RequestParam("buttonvalue") String buttonvalue, Map model){
		
		List<Subject> subjects =retriveSubjectService.fetchAll();
		
		model.put("subjects", subjects);
		
		if(buttonvalue.equals("addquestion")){
		return "UploadQuestions.jsp";
		}
		else if (buttonvalue.equals("viewreports")) {
			return "fetchrecord.jsp";
		}
		else if(buttonvalue.equals("Viewquestion")){
			return "viewQuestion.jsp";
		}
		
		return "admin.jsp";
	}
	 
}
