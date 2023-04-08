# Write your MySQL query statement below

select id,
sum(if(month='Jan',revenue,null)) as Jan_revenue,
sum(if(month='Feb',revenue,null)) as Feb_revenue,
sum(if(month='Mar',revenue,null)) as Mar_revenue,
sum(if(month='Apr',revenue,null)) as Apr_revenue,
sum(if(month='May',revenue,null)) as May_revenue,
sum(if(month='Jun',revenue,null)) as Jun_revenue,
sum(if(month='Jul',revenue,null)) as Jul_revenue,
sum(if(month='Aug',revenue,null)) as Aug_revenue,
sum(if(month='Sep',revenue,null)) as Sep_revenue,
sum(if(month='Oct',revenue,null)) as Oct_revenue,
sum(if(month='Nov',revenue,null)) as Nov_revenue,
sum(if(month='Dec',revenue,null)) as Dec_revenue
from department 
group by id;