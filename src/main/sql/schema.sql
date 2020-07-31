create database ssm;
use ssm;
drop table if exists movie_list;
create table movie_list(
id int primary key auto_increment,
name varchar(20),
director varchar(20),
actor varchar(20)
);

insert  into movie_list(`name`,`director`,`actor`) values('燃烧','李沧东','刘亚仁');
insert  into movie_list(`name`,`director`,`actor`) values('东邪西毒','王家卫','张国荣');
insert  into movie_list(`name`,`director`,`actor`) values('重庆森林','王家卫','梁朝伟');
insert  into movie_list(`name`,`director`,`actor`) values('海街日记','是枝裕和','绫濑遥');
insert  into movie_list(`name`,`director`,`actor`) values('低俗小说','昆汀','乌玛瑟曼');
insert  into movie_list(`name`,`director`,`actor`) values('星际穿越','诺兰','马修麦康纳');
select * from movie_list;
