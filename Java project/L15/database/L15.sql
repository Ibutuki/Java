/****** Script for SelectTopNRows command from SSMS  ******/
if exists(select * from sysobjects where name = 'proc_Company')
drop procedure poroc_Company1
go

create procedure proc_Company(
	@name nvarchar(50),
	@price int OUTPUT
)AS
SELECT @price = price from Company1 where name = @name
--TASK2 proc统计武将信息
create table Wujiang(
	id int identity,
	name varchar(50),
	area varchar(50)
)
insert into Wujiang(name,area) values('刘备','蜀国')
insert into Wujiang(name,area) values('关羽','蜀国')
insert into Wujiang(name,area) values('曹操','魏国')
insert into Wujiang(name,area) values('夏侯惇','魏国')
insert into Wujiang(name,area) values('孙权','吴国')
insert into Wujiang(name,area) values('周瑜','吴国')

if exists(select * from sysobjects where name = 'proc_Wujiang')
drop procedure proc_Wujiang
go
create proc proc_Wujiang(
	@area nvarchar(50),
	@number int output
)as
select @number = count(*) from Wujiang where area = @area
--TASK2 proc新增武将信息
if exists(select * from sysobjects where name = 'proc_insertWujiang')
drop procedure proc_insertWujiang
go
create proc proc_insertWujiang(
	@name nvarchar(50),
	@area nvarchar(50)
)as
insert into Wujiang(name, area) values( @name, @area)