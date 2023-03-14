-- 1번

SELECT EMP_ID, EMP_NAME, PHONE, HIRE_DATE, DEPT_TITLE
FROM EMPLOYEE
NATURAL JOIN JOB
JOIN DEPARTMENT ON(DEPT_CODE = DEPT_ID)
WHERE (DEPT_CODE) = (SELECT DEPT_CODE
                                FROM EMPLOYEE
                                WHERE EMP_NAME = '전지연')
AND EMP_NAME != '전지연';



-- 2번
SELECT EMP_ID, EMP_NAME, PHONE, SALARY, JOB_NAME
FROM EMPLOYEE
NATURAL JOIN JOB
WHERE HIRE_DATE = (SELECT HIRE_DATE
                    FROM EMPLOYEE
                    WHERE EXTRACT(YEAR FROM HIRE_DATE) > 2000)
                             
  AND SALARY > (SELECT MAX(SALARY)
                FROM EMPLOYEE
                WHERE JOB_NAME = JOB_NAME);
                             


              









