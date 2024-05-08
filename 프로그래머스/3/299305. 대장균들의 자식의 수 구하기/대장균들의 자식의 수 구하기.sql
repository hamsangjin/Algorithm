select t1.ID, COUNT(t2.ID) as CHILD_COUNT
from ECOLI_DATA t1 left outer join ECOLI_DATA t2
on t1.ID = t2.PARENT_ID
group by t1.ID
order by t1.ID;