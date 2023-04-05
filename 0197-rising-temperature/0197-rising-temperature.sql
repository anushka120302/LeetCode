# Write your MySQL query statement below
#select w.id
#from weather w , weather ww 
#where w.id>ww.id+1 and w.temperature>ww.temperature;

SELECT t1.Id
FROM Weather t1
INNER JOIN Weather t2
ON TO_DAYS(t1.recordDate) = TO_DAYS(t2.recordDate) + 1
WHERE t1.Temperature > t2.Temperature