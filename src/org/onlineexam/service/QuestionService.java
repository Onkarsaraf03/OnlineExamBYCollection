package org.onlineexam.service;

import java.util.ArrayList;

import org.onlineexam.model.Question;
import org.onlineexam.repository.QuestionRepository;

public class QuestionService {
	
	QuestionRepository qrepo=new QuestionRepository();

	public boolean isAddQuestion(Question q)
	{
		int qid=qrepo.getid();
		qid=qid+1;
		q.setQid(qid);
		boolean b=qrepo.isAddQuestion(q);
		return b;	
	}
	
	public ArrayList getAllQuestions()
	{
		ArrayList al=qrepo.getAllQuestions();
		return al.size()>0?al:null;
		
	}
}
