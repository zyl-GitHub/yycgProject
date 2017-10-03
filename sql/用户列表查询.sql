select * from
(select sysuser.id,sysuser.username,sysuser.groupid,sysuser.sysid,nvl(userjd.mc,nvl(useryy.mc  ,usergys.mc )) sysmc from sysuser
left join userjd on sysuser.sysid = userjd.id
left join useryy on sysuser.sysid = useryy.id
left join usergys on sysuser.sysid = usergys.id) sysuser
where sysuser.sysmc like '%卫生室%' ;
--子查询
select * from
(
select sysuser.id,
      sysuser.userid,
      sysuser.username,
      sysuser.groupid,
      sysuser.sysid,
      decode(sysuser.groupid,
        '1',
        (select mc from userjd where id = sysuser.sysid),
        '2',
         (select mc from userjd where id = sysuser.sysid),
         '3',
          (select mc from useryy where id = sysuser.sysid),
          '4',
           (select mc from usergys where id = sysuser.sysid)
      )
      from sysuser) sysuser
      where sysuser.sysmc like '%卫生室%' ;
