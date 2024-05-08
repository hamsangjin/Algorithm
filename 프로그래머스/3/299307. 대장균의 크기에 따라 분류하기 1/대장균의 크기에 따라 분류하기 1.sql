# 크기가 100 이하라면 'LOW', 100 초과 1000 이하라면 'MEDIUM', 1000 초과라면 'HIGH' 라고 분류

select ID,
        (CASE
            WHEN SIZE_OF_COLONY <= 100 THEN 'LOW'
            WHEN SIZE_OF_COLONY > 100  and SIZE_OF_COLONY <= 1000 THEN 'MEDIUM'
            else 'HIGH'
        END) as SIZE
from ECOLI_DATA
order by ID;