package org.onlineexam.model;

public class Question {
   public Question()
   {
	   
   }
   public Question(String name,String op1,String op2,String op3,String answer)
   {
	   this.name=name;
	   this.op1=op1;
	   this.op2=op2;
	   this.op3=op3;
	   this.answer=answer;
   }
	private int qid;
	private String name;
	private String op1;
	private String op2;
	private String op3;
	private String answer;

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOp1() {
		return op1;
	}

	public void setOp1(String op1) {
		this.op1 = op1;
	}

	public String getOp2() {
		return op2;
	}

	public void setOp2(String op2) {
		this.op2 = op2;
	}

	public String getOp3() {
		return op3;
	}

	public void setOp3(String op3) {
		this.op3 = op3;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
