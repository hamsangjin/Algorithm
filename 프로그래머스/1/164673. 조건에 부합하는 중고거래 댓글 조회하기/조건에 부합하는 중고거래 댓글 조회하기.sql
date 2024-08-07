-- 코드를 입력하세요
SELECT W.TITLE, W.BOARD_ID, R.REPLY_ID, R.WRITER_ID, R.CONTENTS, DATE_FORMAT(R.CREATED_DATE,"%Y-%m-%d") AS CREATED_DATE
FROM USED_GOODS_BOARD AS W, USED_GOODS_REPLY AS R 
WHERE W.BOARD_ID = R.BOARD_ID AND YEAR(W.CREATED_DATE) = 2022 AND MONTH(W.CREATED_DATE) = 10
order by R.CREATED_DATE, W.TITLE