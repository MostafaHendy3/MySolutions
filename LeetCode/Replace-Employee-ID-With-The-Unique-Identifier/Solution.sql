1# Write your MySQL query statement below
2select unique_id, name
3from Employees
4left join EmployeeUNI
5on Employees.id = EmployeeUNI.id
6