package edu.kh.jdbc.run;

import java.util.List;
import java.util.Scanner;
import edu.kh.jdbc.dao.SelectJobNameDAO;
import edu.kh.jdbc.dto.Employee2;

public class JDBCExample4 {
     public static void main(String[] args) {
	
    	 Scanner sc = new Scanner(System.in);
    	 
    	 System.out.print("직급명 입력 : ");
    	 String jobName = sc.nextLine();
    	    	 
 	    SelectJobNameDAO dao = new SelectJobNameDAO();
 	    List<Employee2> empList = dao.select(jobName);
    	 
	    if(empList.isEmpty()) { 
          System.out.println("일치하는 직급이 없습니다.");
            return;
            
	    }
     	    for( Employee2 emp : empList ) {
     		    
    	    	System.out.printf("부서명: %s / 직급명: %s / 이름: %s / 이메일: %s \n",
    	    			         emp.getDepartmentTitle(),
    	    			         emp.getJobName(),
    	    			         emp.getEmpName(),
    	    			         emp.getEmail());
    	    }
    	}
     }

