drop table customer_request;
create table customer_request (
    request_id INTEGER ,
    timestamp timestamp,
	customer_id number(10),
    request_address varchar(30),
    primary key(request_id),
    constraint customer_request_fk 
		foreign key (customer_id) 
		references CUSTOMERS(CUSTOMER_ID)
);

CREATE SEQUENCE CUSTOMER_REQUEST_ID_SEQ;