# # Write your MySQL query statement below
# select machine_id, round(avg(timestamp),3) as procesing_time
# from activity
# group by process_id

SELECT machine_id, ROUND(SUM(IF(activity_type = 'start',-1,1)*timestamp)/COUNT(DISTINCT process_id),3) AS processing_time
FROM Activity
GROUP BY 1