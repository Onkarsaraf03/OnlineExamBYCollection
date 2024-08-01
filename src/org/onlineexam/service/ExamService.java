package org.onlineexam.service;

import org.onlineexam.model.Exam;
import org.onlineexam.repository.ExamRepository;

public class ExamService {
	
	ExamRepository examrepo=new ExamRepository();
	
	public boolean isExamSchedule(Exam exammodel)
	{
		
		return examrepo.isExamSchedule(exammodel);
		
	}
	
	public Exam getExamSchedule()
	{
		return examrepo.getExamSchedule();
		
	}

}
