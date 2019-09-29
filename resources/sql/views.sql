create or replace view customer_revenues(customer_name, customer_id, customer_revenue,  constraint customer_revenues_pk primary key (customer_id) disable novalidate)
as
select cust.name customer_name, ov.customer_id customer_id, sum(ov.v) customer_revenue
from 
    (select o.customer_id, (oi.unit_price*oi.quantity) v
    from ORDERS o 
    inner join order_items oi
    on o.order_id=oi.order_id 
    where o.status='Shipped') ov
    inner join customers cust
    on ov.customer_id=cust.customer_id

group by ov.customer_id, cust.name
order by customer_revenue desc;
