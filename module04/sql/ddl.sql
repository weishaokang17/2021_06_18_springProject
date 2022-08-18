create database atguigu_spring;

use atguigu_spring;


create table t_book
(userId varchar(50) comment '主键' primary key,
username varchar(100) comment '名称',
ustatus varchar(50) comment '状态'
)

create table t_account
(id varchar(20) comment '主键' not null primary key,
username varchar(50) comment '姓名',
money int comment '余额'
)

insert into t_account (id,username,money) values ('1','lucy',2000);
insert into t_account (id,username,money) values ('2','mary',2000);
