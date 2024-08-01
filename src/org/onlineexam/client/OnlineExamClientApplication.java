package org.onlineexam.client;

import java.util.*;

import org.onlineexam.model.Exam;
import org.onlineexam.model.Question;
import org.onlineexam.service.ExamService;
import org.onlineexam.service.QuestionService;

public class OnlineExamClientApplication {
	public static void main(String x[]) {

		QuestionService qserv = new QuestionService();
		ExamService examserv=new ExamService();
		do {

			Scanner xyz = new Scanner(System.in);

			int ch;
			System.out.println("1:Enter Question");
			System.out.println("2:View Question");
			System.out.println("3:Create Exam Schedule");
			System.out.println("4:View Exam Schedule");
			ch = xyz.nextInt();
			switch (ch) {
			case 1:
				xyz.nextLine();
				System.out.println("Enter your question and option with answer.");
				String name = xyz.nextLine();
				String op1 = xyz.nextLine();
				String op2 = xyz.nextLine();
				String op3 = xyz.nextLine();
				String answer = xyz.nextLine();
				Question q = new Question(name, op1, op2, op3, answer);
				boolean b = qserv.isAddQuestion(q);
				if (b) {
					System.out.println("Question Added Sucessfully..");
				} else {
					System.out.println("Question not Added Sucessfully..");
				}
				break;

			case 2:
				ArrayList al = qserv.getAllQuestions();
				if (al != null) {
					for (Object obj : al) {
						Question ques = (Question) obj;
						System.out.println(ques.getQid() + "\t" + ques.getName() + "\t" + ques.getOp1() + "\t"
								+ ques.getOp2() + "\t" + ques.getOp3() + "\t" + ques.getAnswer());
					}
				} else {
					System.out.println("There is no question paper in folder.");
				}

				break;

			case 3:
				System.out.println("Enter Exam id,Name,Date,Start Time,End Time");
				int eid=xyz.nextInt();
				xyz.nextLine();
				String Name=xyz.nextLine();
				String Date=xyz.nextLine();
				String StartTime=xyz.nextLine();
				String EndTime=xyz.nextLine();
				Exam exammodel=new Exam();
				exammodel.setEid(eid);
				exammodel.setName(Name);
				exammodel.setDate(Date);
				exammodel.setStartTime(StartTime);
				exammodel.setEndTime(EndTime);
				b=examserv.isExamSchedule(exammodel);
				if(b)
				{
					System.out.println("Exam Scheduled");
				}
				else
				{
					System.out.println("Can't find the question paper.So,Exam is not Scheduled.");
				}
				break;
				
			case 4:
				 Exam exam=examserv.getExamSchedule();
				 if(exam!=null)
				 {
				 System.out.println(exam.getEid()+"\t"+exam.getName()+"\t"+exam.getDate()+"\t"+exam.getStartTime()+"\t"+exam.getEndTime());
				 System.out.println("======================================");
				 System.out.println("Question Paper ");
				  al=exam.getquestionbank();
				 for(Object o :al)
				 {
					 Question e=(Question)o;
					 System.out.println(e.getQid() + "\t" + e.getName() + "\t" + e.getOp1() + "\t"
								+ e.getOp2() + "\t" + e.getOp3() + "\t" + e.getAnswer());
					 
				 }
				 }
				 else
				 {
					 System.out.println("No exam is Sxhedule");
				 }
				break;
			default:
				System.out.println("Wrong Choice");

			}

		} while (true);
	}
}
