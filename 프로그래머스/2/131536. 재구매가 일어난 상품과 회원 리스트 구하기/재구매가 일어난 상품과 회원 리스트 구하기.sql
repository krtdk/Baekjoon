select distinct
    os1.USER_ID,
    os1.PRODUCT_ID
from ONLINE_SALE os1
join ONLINE_SALE os2 on os1.USER_ID = os2.USER_ID
where os1.PRODUCT_ID = os2.PRODUCT_ID
and os1.SALES_DATE < os2.SALES_DATE
order by os1.USER_ID, os1.PRODUCT_ID desc;