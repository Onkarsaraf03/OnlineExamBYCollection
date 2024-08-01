package org.onlineexam.repository;

import java.util.*;

import org.onlineexam.model.Question;

public class QuestionRepository {

	static ArrayList al=new ArrayList();//This is my temporary database
	
	public int getid()
	{
		return al.size();
		
	}
	public boolean isAddQuestion(Question q)
	{
		boolean b=al.add(q);
		return b;
		
	}
	public ArrayList getAllQuestions()
	{
		return al;
	}
}
 