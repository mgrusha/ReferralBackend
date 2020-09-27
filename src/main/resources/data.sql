insert into referrals(id,url, code) values((select max(id) + 1 from referrals), 'http://goo.gl','XXX55511');
insert into referrals(id,url, code) values((select max(id) + 1 from referrals),'http://uber.com','SSSSSS2323');
insert into referrals(id,url, code) values((select max(id) + 1 from referrals),'http://booking.com','12343');