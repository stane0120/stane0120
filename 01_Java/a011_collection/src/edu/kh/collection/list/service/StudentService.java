package edu.kh.collection.list.service;

import java.util.ArrayList;
import java.util.List;

import edu.kh.collection.list.dto.Student;

public class StudentService {
	
	private List<Student> studentList = new ArrayList<Student>();
	
	public StudentService() {
		
		studentList.add(new Student("홍길동", 3, 5, 17, "서울시 중구", 'M', 75));		
		studentList.add(new Student("김갑순", 2, 7, 12, "서울시 서대문구", 'F', 85));		
		studentList.add(new Student("박혜미", 1, 4, 11, "서울시 은평구", 'F', 90));		
		studentList.add(new Student("김현수", 3, 1, 4, "서울시 강남구", 'M', 59));		
		studentList.add(new Student("이소연", 2, 6, 5, "서울시 강서구", 'F', 70));
	
	}

	
	/** StudentList에 학생 추가
	 * @param std
	 * @return true
	 */
	public boolean addStudent(Student std) {
		return studentList.add(std);	
	}
	
	
	/** 학생 전체 조회 서비스
	 * @return studentList
	 */
	public List<Student> selectAll() {
		return studentList;
	}

	
	/** 학생 정보 수정 서비스
	 * @param index
	 * @paran std
	 * @return s:Student (수정되기 전 학생 정보)
	 */
	public Student updateStudent(int index, Student std) {
		
		// e2 set(int index, E e) : 1) index에 위치하는 요소를 e로 변경
		//                          2) 기존에 있던 요소 e2를 반환
		
		return studentList.set(index, std);
	}

    /** 학생 정보 제거
     * @param index
     * @return s:Student (제거된 학생 정보)
     */
	public Student removeStudent(int index) {
		
		// E remove(int index) : index번째 요소를 List에서 제거하여 반환
		
		// boolean remove(E e) : List에서 E와 일치하는 요소를 찾아서
		//                       있으면 제거하고 True
		//                       없으면 false 반환

		return studentList.remove(index);
	}
	

}
