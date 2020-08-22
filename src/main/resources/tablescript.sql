create schema `service`;
use `service`;

create table service(
service_id Integer primary key,
date varchar(10),
no_of_persons Integer,
source varchar(20),
dept_time varchar(10),
dest varchar(20),
arrival_time varchar(10),
travel_mode varchar(20),
seats_available Integer,
share_mode varchar(10),
price Integer
);

Insert into service values(10,'2020-08-18',5,'Mumbai','07:00:00','Banglore','10:30:00','Bus',15,'No',1000);
Insert into service values(11,'2020-08-18',2,'Pune','13:00:00','Mumbai','18:30:00','Car',03,'Yes',5000);
Insert into service values(12,'2020-08-18',3,'Hyderabad','08:00:00','Karnataka','16:30:00','Car',03,'No',2500);
Insert into service values(13,'2020-08-18',1,'Mysore','07:00:00','KRS Dam','10:30:00','Auto',02,'Yes',100);
Insert into service values(14,'2020-08-18',2,'Mysore','09:00:00','Banglore','13:30:00','Bike',02,'No',1300);


