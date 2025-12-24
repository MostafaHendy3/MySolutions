1# Write your MySQL query statement below
2select firstName , lastName ,city ,state
3from Person
4left join Address
5on Person.personId = Address.personId