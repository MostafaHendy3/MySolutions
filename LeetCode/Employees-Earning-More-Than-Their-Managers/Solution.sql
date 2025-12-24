1# Write your MySQL query statement below
2select E.name as Employee
3from Employee E inner join Employee M
4on M.id = E.managerId
5where E.salary > M.salary