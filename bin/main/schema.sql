DROP TABLE IF EXISTS "user";

CREATE TABLE "user" (
	id int NOT NULL,
	email varchar(255) DEFAULT NULL,
	password varchar(255) DEFAULT NULL,
	first_name varchar(255) DEFAULT NULL,
	last_name varchar(255) DEFAULT NULL,
	mobile_no varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
);
INSERT INTO "user" VALUES (1,'ojaswi.s@gmail.com','pass','Ojaswi','Srivastava','987654321');
