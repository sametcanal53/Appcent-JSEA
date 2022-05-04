CREATE TABLE USERS(
id INTEGER AUTO_INCREMENT PRIMARY KEY,
first_name VARCHAR(50),
last_name VARCHAR(50),
email VARCHAR(250),
password VARCHAR(250)
);



CREATE TABLE TASKS(
task_id INTEGER AUTO_INCREMENT,
task_name VARCHAR(250),
user_id INTEGER,
foreign key (user_id) references USERS(ID)
);



