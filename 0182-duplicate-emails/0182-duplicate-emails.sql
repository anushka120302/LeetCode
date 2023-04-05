# Write your MySQL query statement below
SELect email
from person 
group by email
having count(*)>1;