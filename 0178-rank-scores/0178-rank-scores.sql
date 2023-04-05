# Write your MySQL query statement below
select m1.Score,
(select count(distinct Score)
from Scores where Score >= m1.Score )  as 'rank' 
from scores m1
order by m1.score desc;