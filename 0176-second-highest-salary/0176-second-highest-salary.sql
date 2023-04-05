# Write your MySQL query statement below
select distinct salary as SecondHighestSalary
from employee
group by salary
union all(select null as salary)
order by SecondHighestSalary desc limit 1 offset 1
