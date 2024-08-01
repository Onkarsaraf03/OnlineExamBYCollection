package org.onlineexam.model;

import java.util.ArrayList;

public class Exam {
private int eid;
private String Name;
private String Date;
private String StartTime;
private String EndTime;
private ArrayList questionbank;

public int getEid() {
	return eid;
}

public ArrayList getquestionbank() {
	return questionbank;
}

public void setquestionbank(ArrayList questionbank) {
	this.questionbank = questionbank;
}

public void setEid(int eid) {
	this.eid = eid;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public String getDate() {
	return Date;
}

public void setDate(String date) {
	Date = date;
}

public String getStartTime() {
	return StartTime;
}

public void setStartTime(String startTime) {
	StartTime = startTime;
}

public String getEndTime() {
	return EndTime;
}

public void setEndTime(String endTime) {
	EndTime = endTime;
}
}
