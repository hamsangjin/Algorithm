select DR_NAME, DR_ID, MCDP_CD, DATE_FORMAT(HIRE_YMD, '%Y-%m-%d') as HIRE_YMD
from DOCTOR
where MCDP_CD in ('CS', 'GS')
order by HIRE_YMD desc, DR_NAME;