package edu.kh.collection.list.dto;

import java.util.Objects;

public class Student {
	
	private String name;
	private int grade;
	private int classROom;
	private int number;
	private String address;
	private char gender;
	private int score;
	
	public Student(String name, int grade, int classROom, int number, String address, char gender, int score) {
		this.name = name;
		this.grade = grade;
		this.classROom = classROom;
		this.number = number;
		this.address = address;
		this.gender = gender;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassROom() {
		return classROom;
	}
	public void setClassROom(int classROom) {
		this.classROom = classROom;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + ", classROom=" + classROom + ", number=" + number
				+ ", address=" + address + ", gender=" + gender + ", score=" + score + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, classROom, gender, grade, name, number, score);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(address, other.address) && classROom == other.classROom && gender == other.gender
				&& grade == other.grade && Objects.equals(name, other.name) && number == other.number
				&& score == other.score;
	}

	

}
