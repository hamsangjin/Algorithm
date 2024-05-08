select i.REST_ID, i.REST_NAME, i.FOOD_TYPE, i.FAVORITES, i.ADDRESS, round(avg(REVIEW_SCORE), 2) as SCORE
from REST_INFO i, REST_REVIEW r
where i.REST_ID = r.REST_ID and substr(i.ADDRESS, 1, 2) = '서울'
group by r.REST_ID
order by SCORE desc, i.FAVORITES desc;