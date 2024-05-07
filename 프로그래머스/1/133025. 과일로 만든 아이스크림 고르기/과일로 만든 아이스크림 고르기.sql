select f.FLAVOR
from FIRST_HALF f, ICECREAM_INFO i
where f.FLAVOR = i.FLAVOR and f.TOTAL_ORDER > 3000 and i.INGREDIENT_TYPE = 'fruit_based'
order by TOTAL_ORDER desc;