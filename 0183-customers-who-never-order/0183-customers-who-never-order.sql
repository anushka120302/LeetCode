# Write your MySQL query statement below
Select name as Customers
from Customers
left join orders
on (Customers.id=orders.customerId)
where orders.CustomerId is null