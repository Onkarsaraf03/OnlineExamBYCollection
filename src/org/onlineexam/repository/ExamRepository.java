package org.onlineexam.repository;

import java.util.ArrayList;

import org.onlineexam.model.Exam;

public class ExamRepository {
    
	 QuestionRepository qrepo=new QuestionRepository();
	 Exam exammodel=null;
	 public boolean  isExamSchedule(Exam exammodel)
	 {   this.exammodel=exammodel;
		 ArrayList al=qrepo.getAllQuestions();
		 if(al.size()>0)
		 {
		   exammodel.setquestionbank(al);
		   return true;
		 }
		 else
		 {
			 return false;
		 }
		 
	 }
	 public Exam getExamSchedule()
	 {
		 if(exammodel!=null)
		 {
	      return exammodel; 
		 }
		 else
		 {
			 return null;
		 }
		
		 
	 }
}
