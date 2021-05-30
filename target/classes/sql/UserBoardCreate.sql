create table UserTableSAS(
userName varchar(100) primary key,
password varchar(300),
createDate DATE DEFAULT SYSDATE
);


create table BoardTableSAS(
BoardId Number(4,2) primary key,
title varchar(100),
writeuser varchar(100),
content CLOB,
CONSTRAINT fk_user FOREIGN KEY(writeuser)
         REFERENCES UserTableSAS(userName) ON DELETE CASCADE
);

CREATE SEQUENCE Autoadd
  START WITH 1
  INCREMENT BY 1
  MAXVALUE 10000
  MINVALUE 1
  NOCYCLE;
