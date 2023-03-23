

SELECT CASE 
	-- 존재하지 않는 사원
	WHEN (SELECT COUNT(*) FROM EMPLOYEE WHERE EMP_ID = 200) = 0
	THEN 0
	
	-- 존재하지만 퇴직한 사원?
	WHEN (SELECT COUNT(*) FROM EMPLOYEE WHERE EMP_ID = 200 AND ENT_YN = 'Y') = 1
	THEN 1
	
	-- 존재는 하지만 퇴직하지 않은 사원!
	ELSE 2
END "CHECK"
FROM DUAL;

/* 9.
가장 최근 (입사일이 늦은) 사원 5명의
사번, 이름, 부서명 ,입사일
입사일 내림차순으로 조회 */
-- ROWNUM, 인라인뷰(FROM절 서브쿼리)

SELECT * FROM
(SELECT EMP_ID, EMP_NAME, HIRE_DATE, 
     NVL(DEPT_TITLE, '부서없음') DEPT_TITLE
FROM EMPLOYEE
LEFT JOIN DEPARTMENT ON (DEPT_CODE = DEPT_ID)
ORDER BY HIRE_DATE DESC)
WHERE ROWNUM <= 5;
 



                
                


                