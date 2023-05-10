# Write your MySQL query statement below
select name, bonus
from employee e left outer join bonus b 
on e.empId= b.empId
where b.bonus<1000 or b.bonus is null