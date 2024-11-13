show  databases;

create database medicaldb;
USE medicaldb;

CREATE TABLE patient(
    id int PRIMARY KEY AUTO_INCREMENT,
    firstName varchar(50),
   lastName varchar(50),
   age int,
   Email VARCHAR(100),
	gender varchar(10),
    patient_type varchar(50)
);

drop table patient;
INSERT  INTO patient(name,gender,patient_type)
  VALUES('BOLA','female'
  select * from patient
  Insert into patient(name, gender,patient_type) 
  Values('Bolatito','Akinyemi'," Female","25","a.b@gmail.com","walk-in");
  dELETE FROM PATIENT WHERE ID =?;
  UPDATE PATIENT SET firstName =?,lastName= ?, GENDER =?, WHERE ID =?;
  
  SELECT * FROM PATIENT