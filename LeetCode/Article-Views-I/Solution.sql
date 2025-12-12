1# Write your MySQL query statement below
2select DISTINCT author_id as id
3from Views 
4where author_id = viewer_id 
5ORDER BY author_id ASC