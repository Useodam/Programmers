-- 코드를 입력하세요
SELECT COUNT(*)
FROM USER_INFO 
WHERE AGE >= 20 AND AGE <= 29 
AND JOINED < '2022-01-01' AND JOINED > '2020-12-31'