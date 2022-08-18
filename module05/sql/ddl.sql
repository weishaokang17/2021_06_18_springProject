use atguigu_spring;

create table t_account
(id varchar(20) comment '主键' not null primary key,
username varchar(50) comment '姓名',
money int comment '余额'
)

insert into t_account (id,username,money) values ('1','lucy',2000);
insert into t_account (id,username,money) values ('2','mary',2000);