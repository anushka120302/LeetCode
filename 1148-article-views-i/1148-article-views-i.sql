# Write your MySQL query statement below
select viewer_id as id
from views
where viewer_id=author_id
group by id
order by id ASc