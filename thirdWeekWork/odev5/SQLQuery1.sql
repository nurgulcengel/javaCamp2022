select * from Customers

select * from Customers where City='London'

select * from Products where CategoryID=3 or CategoryID=5

select * from Products where CategoryID=7 and UnitPrice>=20

select * from Products order by ProductName

select * from Products where CategoryID=2 order by UnitPrice desc

--group by

select count(*) from Products 

select count(*), productName from Products group by ProductName

select count(*), CategoryID from Products group by CategoryID

select count(*), CategoryID from Products group by CategoryID having COUNT(*)>10

select count(*), CategoryID from Products where UnitPrice>10 group by CategoryID having count(*)>10


--joinler
select * from Products p inner join Categories c
on p.CategoryID=c.CategoryID

select ProductName,CategoryName,UnitPrice from Products p inner join Categories c
on p.CategoryID=c.CategoryID

select * from Products p inner join [Order Details] od
on p.ProductID=od.ProductID

select * from Products p left join [Order Details] od
on p.ProductID=od.ProductID

select * from Customers c left join Orders o 
on c.CustomerID=o.CustomerID
where o.CustomerID is null

