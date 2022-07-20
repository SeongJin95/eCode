--[�λ����]
--���̺��:���(emp)
--empno(�����ȣ), ename(����̸�), job(����), mgr(����� �����ȣ)
--hiredate(�Ի�����), sal(�޿�),  comm(Ŀ�̼�), deptno(�μ���ȣ)

--���̺��:�μ�(dept)
--deptno(�μ���ȣ), dname(�μ���), loc(�μ���ġ)

--���̺��:�޿�����(salgrade)
--grade(�޿����), losal(�����޿�), hisal(�����޿�)

--[�л����]
--���̺��:�л�(student)
--stu_no(�й�), stu_name(�̸�), stu_dept(�а�), stu_grade(�г�)
--stu_class(��), stu_gender(����), stu_height(Ű), stu_weight(ü��)

--���̺��:����(subject)
--sub_no(�����ȣ), sub_name(�����̸�), sub_prof(������), sub_grade(�г�), sub_dept(�а�)

--���̺��:����(enrol)
--sub_no(�����ȣ), stu_no(�й�), enr_grade(����)

--[2022�� 6�� 9��(��) �ǽ�]

--student ���̺� ����
desc student;

--enrol ���̺� ����
desc enrol;

--subject ���̺� ����
desc subject;

--student ���̺� �ִ� ��� �����͸� �˻��Ͻÿ�.
select * from student;

--student ���̺��� stu_no, stu_name�� �˻��Ͻÿ�.
select stu_no, stu_name from student;

--student ���̺��� stu_dept�� �˻��Ͻÿ�.
select stu_dept from student;

--student ���̺��� stu_dept�� �˻��Ͻÿ�(�ߺ�����).
select distinct stu_dept from student;

--student ���̺��� stu_grade, stu_class�� �˻��Ͻÿ�(�ߺ�����).
select distinct stu_grade, stu_class from student;

--student ���̺��� enr_grade ���� �����Ϳ� 10���� ���ؼ� �˻�
select stu_no, sub_no, enr_grade, enr_grade+10 from enrol;

--student ���̺��� stu_no���� "�й�"���� stu_name���� "�̸�"���� ��Ī �ο�
select stu_no as �й�, stu_name as �̸� from student;
-- ("")�� ����ϸ� as�� �����Ͽ� ��Ī�ο� ����
select stu_no "�й�", stu_name "�̸�" from student;

--emp���̺��� �� ename, sal���� �̸� , ���� ��Ī�� �ο��ϰ� sal������ 12�� ���� �������� ��Ī�ο�
select ename "�̸�", sal*12 as ���� from emp;

--student ���̺��� stu_dept���� stu_name���� �����ϰ� �а� �������� ��Ī�ο�
select stu_dept || stu_name as �а����� from student;
select stu_dept || ',' || stu_name || '�Դϴ�' as �а����� from student;

--emp ���̺��� ename�� "�̸�", sal�� "����", sal*12�� "����" ��Ī�� ���
select ename "�̸�", sal "����", sal*12 "����" from emp;

select ename || '''s job is ' || job "NAME AND JOB" from emp;

--student ���̺��� '��ǻ������'�� �л��� stu_name, stu_dept, stu_grade, stu_class �˻�
select stu_name, stu_dept, stu_grade, stu_class from student where stu_dept = '��ǻ������';

--emp ���̺��� ����(job)�� 'SALESMAN'�� ����� ename, job, sal, deptno�� �˻�
select ename, job, sal, deptno from emp where job = 'SALESMAN';

--student ���̺��� '��ǻ������'���� �г��� 2�� �л��� stu_name, stu_dept, stu_grade, stu_class �˻�
select stu_name, stu_dept, stu_grade, stu_class from student where stu_dept = '��ǻ������' and stu_grade = 2;

--emp ���̺��� �μ���ȣ(DEPTNO)�� 10�̰� ����(JOB)�� 'MANAGER'�� ������ �˻�
select * from emp where DEPTNO = 10 and JOB = 'MANAGER';

--emp ���̺��� �μ���ȣ(DEPTNO)�� 10���� �ƴ� ������� �˻�
select * from emp where DEPTNO != 10;
select * from emp where DEPTNO <> 10;

--emp ���̺��� �޿���(sal)�� 900�̸� �̰ų� 4000�ʰ��� ����� �˻�
select * from emp where sal > 4000 or sal < 900;

--student ���̺��� Ű�� 170�̻��̰� �����԰� 80kg �̻��� ������ �˻�
select * from student where stu_height >= 170 and stu_weight >= 80;

--student ���̺��� �����԰� 60�� 70 ������ ������ �˻�
select * from student where stu_weight between 60 and 70;
select * from student where stu_weight >= 60 and stu_weight <= 70;

--emp ���̺��� �޿�(sal)�� 1000���� 1500������ �����͸� �˻�
select * from emp where sal between 1000 and 1500;
select * from emp where sal >=1000 and sal <= 1500;

--student ���̺��� �й�(STU_NO)�� 20140001���� 20149999 ������ ������ �˻�
select * from student where stu_no between '20140001' and '20149999';

--student���� �̸��� '��'���� �����ϴ� �л��� stu_no, stu_name, stu_dept �˻�
select stu_no, stu_name, stu_dept from student where stu_name like '��%';

--emp ���̺��� ����̸�(ename) �� J�ڷ� �����ϴ� ����� ����(empno, ename, job)�� �˻�
select empno, ename, job from emp where ename like 'J%';

--student ���̺��� �̸��� �� ��° ���ڰ� '��'�� �л��� stu_no, stu_name, stu_dept �˻�
select stu_no, stu_name, stu_dept from student where stu_name like '_��%';

--emp ���̺��� ����̸�(ename)�� �� ��° ���ڰ� 'L'�� ����� empno, ename, job�� �˻�
select empno, ename, job from emp where ename like '_L%';

--student ���̺��� �й�(stu_no)�� '2014'�� �����ϴ� ������ �˻�
select * from student where stu_no like '2014%';

--student ���̺��� Ű(stu_height)�� �Է� �� �� �л��� stu_no, stu_name, stu_height �˻�
select stu_no, stu_name, stu_height  from student;
select stu_no, stu_name, stu_height  from student where stu_height is null;
select stu_no, stu_name, stu_height  from student where stu_height is not null;

--emp ���̺��� comm�� null�� ����� empno, ename, comm�� �˻�
select empno, ename, comm from emp;
select empno, ename, comm from emp where comm is null;
select empno, ename, comm from emp where comm is not null;

--student ���̺��� '��ǻ������'���� '���'���� �л���  stu_no, stu_name  �˻�
select stu_no, stu_name from student where stu_dept = '��ǻ������' or stu_dept = '���';
select stu_no, stu_name from student where stu_dept in ('��ǻ������','���');
select stu_no, stu_name, stu_dept from student where stu_dept = '��ǻ������' or stu_dept = '���';

--emp ���̺��� �μ���ȣ(deptno)�� 10,30�� �μ��� �ٹ��ϴ� empno, deptno�� �˻�
select empno, deptno from emp where deptno in (10, 30);
select empno, deptno from emp where deptno = 10 or deptno = 30;

--studet ���̺��� �л����� �Ż� �߿��� �й��� �������� ������������ �˻�
select * from student order by stu_no;

--studet ���̺��� �л����� �Ż� �߿��� �й��� �������� ������������ �˻�
select * from student order by stu_no desc; 

--emp ���̺��� �ֱٿ� �Ի��� ������� �˻�[�Ի�����(hiredate)]
select * from emp order by hiredate desc;

-- ��Ī(target)�� ������ ����
select stu_no, stu_name, stu_dept, stu_weight-5 as target from student order by target;

--���� ������ȣ(4)�� �̿��Ͽ� ����
select stu_no, stu_name, stu_dept, stu_weight-5 as target from student order by 4;

--������� ���� �̸�(stu_weight-5)�� �̿��Ͽ� ����
select stu_no, stu_name, stu_dept, stu_weight-5 as target from student order by stu_weight-5;
 
 --emp ���̺��� ������ �������� ������������ ����
 select  empno, ename, deptno, sal*12 as annualsal from emp order by annualsal;
 select  empno, ename, deptno, sal*12 as annualsal from emp order by 4;
 select  empno, ename, deptno, sal*12 as annualsal from emp order by sal*12;
 
--���� stu_dept ���� �������� ���� ��, target(stu_weight-5)�������� �������� ����
select stu_no, stu_name, stu_dept, stu_weight-5 as target from student order by stu_dept, target;

--���� stu_dept ���� �������� ���� ��, target(stu_weight-5)�������� �������� ����
select stu_no, stu_name, stu_dept, stu_weight-5 as target from student order by stu_dept, target desc;

--select ���� ���Ե��� �ʴ� ���� �̿��Ͽ� �����ϴ� ���ǹ�
select stu_no, stu_name, stu_dept, stu_weight-5  as target from student order by stu_height;

--select ���� ���Ե��� ���� hiredate�� �������� ����
select empno, ename, deptno, sal*12 as annualsal from emp order by hiredate;

--emp ���̺��� deptno, annualsal�� �������� �������� ����
select empno, ename, deptno, sal*12 as annualsal from emp order by deptno, annualsal;

--emp ���̺��� deptno�� �������� �������� annualsal�� �������� �������� ����
select empno, ename, deptno, sal*12 as annualsal from emp order by deptno asc, annualsal desc;

--round (m,n):m���� �Ҽ��� n�� �ڸ����� �ݿø�
select round(345.678), round(345.678,0),round(345.678,1),round(345.678,-1) from dual;

--turnc(m,n): m���� �Ҽ��� n�� �ڸ����� �����ϰ�, ������ ����
select trunc(997.654, 2) "trunc1", trunc(997.654, 0) "trunc2", trunc(997.654, -1) "trunc3" from dual;

--�Լ�(�����Լ�)

--upper(m):�ҹ��ڸ� �빮�ڷ� ��ȯ
select upper('korea') from dual;

--lower(m):�빮�ڸ� �ҹ��ڷ� ��ȯ
select lower('KOREA') from dual;

--initcap(m):ù ��° ���ڸ� �빮�ڷ� ��ȯ
select ename, initcap(ename) "initcap" from emp;

--length(m) : ���� ���� ���
select ename, length(ename) from emp;

--concat(m,n) : �� ���ڸ� ���� (���� ������||�� ����)
select concat(ename,job) from emp where deptno=10;


--mod(m,n): m�� ���� n���� ���� ������ ���\
--abs(n) : n�� ������ ���
--floor(n): �Ҽ��� ���� �ڸ� �����Ͽ� ���
--power(m,n): m�� n���� ���
select mod(10,3), abs(-100), floor(123.456), power(2,3) from dual;

--substr(a,b,c) : a�� �Ϻκ��� ����(a�� b��°�κ��� c���� ���� ����)
select substr('abcde',3,2), substr('abcde',-4,2) from dual;
select substr('WELCOME TO ORACLE',3,4) from dual;
select substr('����������Ŭ',4,3) from dual;

--INSTR(�μ�1,�μ�2,�μ�3,�μ�4): �����μ� �� Ư�� ������ ������ġ�� ��ȯ
select instr('WELCOME TO ORACLE', 'O') from dual;
select instr('WELCOME TO ORACLE', 'O',6,2) from dual;

--lpad(a,b,c): �ڸ����� �����ϰ� �� ������ Ư�� ���ڷ� ���ʺ��� ä���� ���
select ename, lpad(ename,10,'*') from emp;

--rpad(a,b,c): �ڸ����� �����ϰ� �� ������ Ư�� ���ڷ� �����ʺ��� ä���� ���
select ename, rpad(ename,10,'*') from emp;

--replace(a,b,c) : a���� b�� �ش��ϴ� ���ڸ� c�� ��ü
select ename, replace(ename, substr(ename,1,2),'**') "replace" from emp where deptno = 10;

--ltrim(' abc '): ���� ���� �Ǵ� ���� ����
--rtrim(' abc '): ������ ���� �Ǵ� ���� ����
--trim(' abc '): ���� ���� ����
select ltrim('  abc  '), rtrim('  abc  '), trim('  abc  ') from dual;
select ename, ltrim(ename,'R') from emp where deptno = 10;
select ename, rtrim(ename,'R') from emp where deptno = 10;

--�Լ�(��¥�Լ�)

--�ý����� ���� ��¥ ���
select sysdate from dual;

--������ �������� 100�� ������ ��¥
select sysdate-100 from dual;

--������ �������� 100�� ������ ��¥
select sysdate+100 from dual;

--next_day(m,n) : m�� �������� ������ ���� n������ ��¥ ���
select next_day(sysdate, '��') from dual;
select next_day(sysdate, 7) from dual;

--months_between(m, n) : m�� n�� �� �� ����(�� ����)
select months_between('14/10/30','14/08/30') from dual;
select months_between('14/8/31','14/09/30') from dual;


--add_months(m,n):m�� n�� ���� ���Ͽ� ���
select sysdate,add_months(sysdate,1) from dual;

--last_day(m) : m�� ���� ���� ������ �� ���
select last_day(sysdate) from dual;

--round(m): �Ϸ��� ���� �ѱ�� ���� ��¥�� ���(�ݿø�), trunc(m):���Ϸ� ǥ��(����)
select sysdate,round(sysdate),trunc(sysdate) from dual;
select round(sysdate,'month') from dual;
select round(sysdate,'MON') from dual;

--�Լ�(��ȯ�Լ�)

--to_char �Լ�: ����, ��¥ �����͸� ���� �����ͷ� ��ȯ
select empno, ename, to_char(hiredate, 'yyyy-mm') as �Ի��� from emp;

--���� ��¥�� 'yyyy'�� 'yy'�� ������ ���� �����ͷ� ��ȯ
select sysdate, to_char(sysdate, 'yyyy'), to_char(sysdate,'yy') from dual;

--���� ��¥�� 'mm'�� 'month'(n��)�� ������ ���� �����ͷ� ��ȯ
select sysdate, to_char(sysdate, 'mm'), to_char(sysdate,'month') from dual;

--���� ��¥�� 'dd'�� 'day'(n����)�� ������ ���� �����ͷ� ��ȯ
select sysdate, to_char(sysdate, 'dd'), to_char(sysdate,'day') from dual;

--���� ��¥�� 'YYYY-MM-DD:HH24:MI:SS'(��-��-��-��-��-��)�� 'month'(n��)�� ������ ���� �����ͷ� ��ȯ
select sysdate, to_char(sysdate,'YYYY-MM-DD:HH24:MI:SS'), to_char(sysdate, 'month') from dual;

--������� �Ի����� ����ϵ� ���ϱ��� �Բ� ����ϱ�
select hiredate, to_char(hiredate, 'YYYY-MM-DD day') from emp;

--�Ҽ��� �̻� 1000�� �ڸ��� �״�� ǥ��, �Ҽ��� ���ϴ� ��°�ڸ����� �ݿø�
select to_char(to_number(1234.5678),'9999.999') from dual;
select to_char(to_number(1234.5678),'999.999') from dual;

select to_char(1234,'99999'), to_char(1234,'099999'), to_char(1234,'$9999'), to_char(1234,'9999.99') , to_char(12345,'99,999') from dual;

--to_number �Լ� : ���� �����͸� ���� �����ͷ� ��ȯ.(java�� parseInt�� ����)
select 2+to_number( '2') from dual;

--to_date �Լ�: ���� �����͸� ��¥ �����ͷ� ��ȯ
select empno, ename from emp where hiredate = to_date('1980-12-17','yy-mm-dd');

--����
select to_char(sysdate-1, 'YYYY/MM/DD') ����,  to_char(sysdate, 'YYYY/MM/DD') ����,  to_char(sysdate+1, 'YYYY/MM/DD') ���� from dual;

--nvl(m,n) �Լ�:m�� ���̸� n���� �ְ�, �ƴϸ� ���
--stu_height �ʵ� ���� null�̸� 0�� �ְ�, �ƴϸ� �Էµ� ���� ���
select nvl(stu_height,0) from student;

--emp ���̺��� comm�� null�̸� 0�� ���� �ʵ��, comm�� null�̸� 100�� ���� �ʵ� ���
select ename, comm, nvl(comm,0), nvl(comm,100) from emp where deptno=30;

--emp���̺��� mgr�� null�̸� 0�� ���� �ʵ� ���
select empno, nvl(mgr,0) from emp where deptno = 10;

--nvl2(l,m,n) �Լ� :  l�� ���� �ƴϸ� m���� �ְ�, ���̸� n���� �־� ���
--comm�� ���� �ƴϸ� sal + comm ���� �ְ�, ���̸� sal ���� ���� �ʵ� ���
select ename, sal, comm, nvl2(comm,sal+comm,sal) from emp;

--[2022�� 6�� 13��(��) �ǽ�]
--nullif(m,n) �Լ�: m�� n�� ���ؼ� ���� ������ ��, �ٸ��� m�� ���
--nullif('A','A')���� �� �μ��� �����Ƿ� null�� ����ϰ�,
--nvl(null,'�� ��')������ ù ��° �μ��� null�̹Ƿ� '�� ��' ���
select nullif('A','A') from dual;
select nullif('A','B') from dual;
select nvl(nullif('A','A'),'�� ��') from dual;

--coalesce(a,b,c,d,e) �Լ� : a�� null�� �ƴϸ� a ���, null�̸� b�� �˻��� null�� �ƴϸ� b ���, null�̸� c �˻�...
--ù° , ��° �μ��� null�̹Ƿ� ��° �μ��� �˻��ϰ�, ���� �ƴϹǷ� 10 ���
select coalesce(null, null, 10, 100, null) from dual;


--null�� �ǳʶٰ� null�� �ƴ� ó���� ���� �μ� ���
select
coalesce('A','B','C'),coalesce(null,'B','C'),
coalesce(null,null,'C'),coalesce(null,null,null)
from dual;

select empno, ename, sal, case job when 'SALESMAN' then sal * 1.1
when 'CLERK' then sal * 1.15
when 'MANAGER' then sal * 1.2
else sal
end as �޿��λ�
from emp;

select empno, ename , sal, 
case when sal between 1 and 1000 then 'LEVEL 1'
       when sal between 1001 and 2000 then 'LEVEL 2'
       when sal between 2001 and 3000 then 'LEVEL 3'
       when sal between 3001 and 4000 then 'LEVEL 4'
       when sal > 4001 then 'LEVEL 5'
end "LEVEL"
from emp
order by sal desc;


--decode �Լ� : [select �ʵ� decode(�ʵ�, ����, ó��) from ���̺�;]
select empno, ename,job,sal,
decode(job,'SALESMAN',sal*1.1,'CLERK',sal*1.15,'MANAGER',sal*1.2,sal)as �λ�ȱ޿�
from emp;

--�׷��Լ�(���� �Լ�)
--max(n),min(n):������ �����ϴ� �������� �ִ밪,�ּҰ�
--enrol ���̺��� enr_grade�� �ִ밪�� �ּҰ� ���ϱ�
select max(enr_grade),min(enr_grade) from enrol;

--student ���̺��� stu_dept�� ����� ������ �� stu_weight�� �ּҰ�,�ִ밪 ���ϱ�
select min(stu_weight), max(stu_weight) from student where stu_dept = '���';

--emp ���̺��� �޿�(sal)�� ���� ���� �޿��� ���� ���� �޿��� �˻�
select max(sal), min(sal) from emp;

--greatest(a,b,c,d), least(a,b,c,d)
select greatest(10,30,50,80) from dual;
select least(10,30,50,80) from dual;

--count(n): ������ �����ϴ� ������ ����
--count(*):��� ���� ���� ���
--count(stu_height):stu_height�ʵ忡�� null ���� ������ ������ ���� ���
select count(*), count(stu_height) from student;


--count(stu_dept):stu_dept�ʵ忡�� null ���� ������ ������ ���� ���
--count(distinct stu_dept):stu_dept�ʵ忡�� �ߺ��� ������ �����ϰ� ���� ���
select count(stu_dept),count(distinct stu_dept) from student;

--emp ���̺��� ���ڵ��� ����
select count(*) from emp;

--emp ���̺��� job�� ���� �˻��ؼ� ��Ī "������" �ο�(��, �ߺ�����)
select count(distinct job) as ������ from emp;

--sum(n), avg(n):������ �����ϴ� �������� ��, ���
select sum(stu_weight), to_char(avg(stu_weight),'9999.99')
from student
where stu_dept = '��ǻ������';

select count(*) as �л�, sum(stu_height) as ������,
count(stu_height) "�ش��л���", avg(stu_height) "��ս���"
from student;

--emp ���̺��� �޿�(sal)�� ��
select sum(sal) from emp;

--emp ���̺��� job�� 'MANAGER'�� ����� �޿�(sal) �հ� ���
select sum(sal), to_char(avg(sal), '9999.99') from emp where job = 'MANAGER';
select ename, sal from emp where job = 'MANAGER';

--rownum: ���ڵ��� ���� ���
select rownum, empno, ename from emp;

select stu_dept, avg(stu_weight)
from student
group by stu_dept;

--student ���̺��� ������(stu_weight)�� 50 �̻��� �л� �� ������ ����ؼ� �а�(stu_dept)���� ����
select stu_dept, count(*) from student where stu_weight >= 50 group by stu_dept;

--emp ���̺��� �޿��� ���� �μ��� �׷�ȭ�Ͽ� ���(deptno,sum(sal))
select deptno, sum(sal) from emp group by deptno;

--student ���̺��� �л� ���Ű�� �ִ��� �а��� ���Ű�� �Ҽ��� ��°�ڸ����� ǥ���ϸ� �а����� �׷�ȭ�Ͽ� ���
select to_char(max(avg(stu_height)),'9999.99') from student group by stu_dept;

--emp ���̺��� �޿��� 2000�̻� ������� �μ����� �׷�ȭ�Ͽ� ����� ���(deptno, count(*))
select deptno, count(*) from emp where sal >= 2000 group by deptno order by deptno;

--student ���̺��� 1���� �а����� �׷�ȭ�ϰ�  2���� �а� ������ �г� ���� �׷�ȭ�ؼ� ���
select stu_dept, stu_grade, count(*) from student group by stu_dept, stu_grade order by stu_dept;
select stu_dept, stu_grade from student;

--having (����): �׷��Լ� ���� ����� �ٽ� ���� �ο�
--[select �ʵ� from ���̺� group by ���� having ����;]
--student ���̺��� '���'�� �л����� �г⺰�� �׷�ȭ�Ͽ� ��� Ű�� 160�̻��� �г��� ���Ű ���
select stu_grade, avg(stu_height) from student where stu_dept = '���' group by stu_grade having avg(stu_height) >= 160;

--emp ���̺��� �Ҽ� �μ���(deptno) �ִ� �޿��� �ּ� �޿� ���ϱ�
select deptno, max(sal), min(sal) from emp group by deptno;

--student ���̺��� �а��� �׷�ȭ�Ͽ� �ִ� Ű��175�̻��� �а��� �ִ�Ű ���
select stu_dept, max(stu_height) from student group by stu_dept having max(stu_height) >= 175;

select to_char(max(avg(stu_height)),'999.99') from student group by stu_dept;

--emp���̺��� ������ 'SALESMAN'�� �ƴ� ����� ���� �μ��� �޿� ���� 6500 �̻��� �μ��� ��ȣ ���
select deptno, sum(sal) from emp where job != 'SALESMAN' group by deptno having sum(sal) >= 6500;

--emp���̺��� ������ 'SALESMAN'�� �ƴ� ����� ���� �ִ� �޿��� 4000 �̻��� �μ��� ��ȣ�� �޿� �� ���
select deptno, sum(sal) from emp where job != 'SALESMAN' group by deptno having max(sal) >= 4000;


--[3�� �ǽ�����]

--�л�(student), ����(subject), ����(enrol) ���̺�

--1. ����(subject) ���̺��� ������ �˻��Ͻÿ�.
desc subject;
--2. �л����� �й��� �̸�, �г�, ���� �˻��Ͻÿ�.
select stu_no, stu_name, stu_grade, stu_class  from student;
--3. �л����� �а� �ߺ��� �����ϰ� �˻��Ͻÿ�.
select distinct stu_dept from student;
--4. �л��� �̸��� �а��� '��ǻ�������� ���Ѻ��Դϴ�.'������ �˻��Ͻÿ�.
select stu_dept || '�� ' || stu_name || '�Դϴ�' from student;
--5. �а��� '���'�� �л����� �й�, �̸��� �˻��Ͻÿ�.
select stu_no, stu_name from student where stu_dept = '���';
--6. '��ǻ������'�� �л� �� 1�г� �л��� ��� �˻��Ͻÿ�.
select * from student where stu_dept = '��ǻ������' and stu_grade = 1;
--7. ������ ���л��̸�, ü���� 60������ �л��� ��� �˻��Ͻÿ�.
select * from student where stu_gender = 'F' and stu_weight <= 60;
--8. ������ 160 �̻��̰� 170 ������ �л��� �й��� �̸��� ����Ͻÿ�.
select stu_no, stu_name from student where stu_height >= 160 and stu_height <= 170;
--9. '��'�� ���� ���� �л��� �й��� �̸��� �˻��Ͻÿ�.
select stu_no, stu_name from student where stu_name like '��%';
--10. �̸��� '��'�� ���� �л��� �̸��� �˻��Ͻÿ�.
select stu_name from student where stu_name like '%��%';
--11. ������ �ΰ��� �л��� �̸��� �˻��Ͻÿ�.
select stu_name from student where stu_height is null;
--12. �л����� �й�, �̸��� �̸����� �������� �˻��Ͻÿ�.
select stu_no, stu_name from student order by stu_name;
--13. �л����� �̸��� �̸��� ù2�ڸ� �˻��Ͻÿ�.(�Լ����)
select stu_name, substr(stu_name,1,2) from student;
--14. �л��� �̸��� 15�ڸ��� �ϰ�, �ڿ� '&'�� ä�� �˻��Ͻÿ�.(�Լ����)
select stu_name, rpad(stu_name,15,'&') from student;
--15. ������ �ΰ��� ��� '�Է¿��'���� �ٲپ� �й�, �̸��� �˻��Ͻÿ�.(�Լ����)
select stu_no, stu_name, nvl(to_char(stu_height),'�Է¿��') from student;
--16. �л����� �̸��� '��'�� �� ��° �ִ��� �˻��Ͻÿ�.(�Լ����)
select stu_name, instr(stu_name, '��') from student;
--17. �л��� �й�, �̸�, ������ �˻��Ͻÿ�.(������ ���� �ڸ����� �ݿø�)
select stu_no, stu_name, round(stu_height, -1) from student;
--18. �л��� ������ ���л��� ��� '����'�� �����Ͻÿ�.(�Լ����)
select stu_name, stu_gender, nvl(nullif(stu_gender, 'M'), '����') from student;
--19. ��ü �л��� ü��, ������ �ְ��� �������� �˻��Ͻÿ�.(�Լ����)
select max(stu_height), max(stu_weight),min(stu_height), min(stu_weight) from student;
--20. �г⺰ �л����� �ο����� �˻��Ͻÿ�.
select stu_grade || '�г�', count(*) from student group by stu_grade;
--21. �а��� �г⺰ �л����� ���ü���� �˻��Ͻÿ�.
select stu_dept, stu_grade, avg(stu_weight) from student group by stu_dept, stu_grade;
--22. �а��� �л����� �ο����� �ο����� ���� ������ �˻��Ͻÿ�.
select stu_dept, count(*) from student group by stu_dept order by count(*) desc;
--23. �а��� �л����� ��ս����� ��ս����� ���� ������ �˻��Ͻÿ�(��ս����� �Ҽ����� 1�ڸ����� �ݿø���)
select stu_dept, round(avg(stu_height),0) from student group by stu_dept order by avg(stu_height) desc;
--24. �л����� �̸�, �а��� �����Ͽ� �˻��Ͻÿ�. (concat �Լ� ���)
select concat(stu_name, stu_dept) from student;
--25. �л����� �а��� '��'�� �� ��° �ִ��� �˻��Ͻÿ�.
select stu_dept, instr(stu_dept, '��') from student;

--4�� ���ΰ� ������

--ũ�ν� ����

--�л����̺�� �������̺� ����
select * from student;
select * from enrol;

select student.*, enrol.*
from student cross join enrol;

--������̺�(emp)�� �μ����̺�(dept) ����
select * from emp;
select * from dept;

select emp.*, dept.* from emp cross join dept;

--EQUI ����
--stu_no�� ����� ���̹Ƿ� student.su_no, enrol.stu_no�� ǥ��
select student.stu_no, stu_name, stu_dept, enr_grade
from student, enrol
where student.stu_no = enrol.stu_no;

select student.stu_no, stu_name
from student, enrol
where student.stu_no = enrol.stu_no and sub_no = 101;

select empno, ename, job, emp.deptno, dname, dept.deptno 
from emp, dept 
where emp.deptno = dept.deptno;

--emp ���̺��� �μ������� 'CHICAGO'�� ����� �̸� �˻�
select empno, ename from emp, dept where dept.deptno=emp.deptno and dept.loc = 'CHICAGO';
select * from emp;

--101���̳� 102�� ������ �����ϴ� �л����� �й��� �̸� �˻�
select student.stu_no, stu_name
from student, enrol
where student.stu_no = enrol.stu_no
and (sub_no = 101 or sub_no = 102);

--EQUI ������ �ٸ� ������� ǥ���ϱ�(3���� ��� : natural join / join = using / join = on )
select stu_no, stu_name
from student natural join enrol
where sub_no = 101 or sub_no = 102;

select stu_no, stu_name
from student join enrol using(stu_no)
where sub_no = 101 or sub_no = 102;

select student.stu_no, student.stu_name
from student join enrol on student.stu_no = enrol.stu_no
where sub_no = 101 or sub_no = 102;

--3���̺� ����
--��ǻ�Ͱ��� ������ �����ϴ� �л����� �й�, �̸� , �����̸� �˻�
select student.stu_no, stu_name, sub_name from student, enrol, subject
where student.stu_no = enrol.stu_no
and enrol.sub_no=subject.sub_no
and enrol.sub_no=101;

--non-equi ���� : where ������ ����ϴ� '='�� �ƴ� ������ ���.
select empno, ename, sal,  grade
from emp, salgrade
where sal between losal and hisal;

--self ���� : ���� ���̺� ���� , ���̺��� ��Ī�� ���
--�ڽ��� ����ڸ� ���ϴ� ���ǹ�
select a.empno as �����ȣ, a.ename as ����̸�, b.empno as ����ڻ����ȣ, b.ename as ������̸�
from emp a, emp b
where a.mgr = b.empno;

--�����ȣ 109~111�� �������� ����(�ش� ���� ����) ���ο��� ����
select a.*, sub_name from enrol a, subject b where a.sub_no = b.sub_no order by 1;

select *
 2 from student
 3 where stu_weight =
 4 (select stu_weight
 5 from student
 6 where stu_name = '����ö');

select *
 2 from student
 3 where stu_weight =
 4 (select stu_weight
 5 from student
 6 where stu_name = '����ö')
 7 and stu_name <> '����ö';

select *
 2 from student
 3 where stu_class in
 4 (select distinct stu_class
 5 from student
 6 where stu_dept = '��ǻ������')
 7 and stu_dept <> '��ǻ������';

select *
 2 from student
 3 where stu_height >
 4 (select avg(stu_height)
 5 from student);

 select *
 2 from student
 3 where stu_height > all
 4 (select avg(stu_height)
 5 from student
 6 group by stu_dept);
 
 select stu_dept, min(stu_height)
 2 from student
 3 group by stu_dept having min(stu_height) >
 4 (select min(stu_height)
 5 from student
 6 where stu_dept = '��ǻ������');
 
 select *
 2 from student
 3 where stu_no in
 4 (select stu_no
 5 from enrol
 6 where sub_no = 101);
 SQL> select *
 2 from student a, enrol b
 3 where a.stu_no = b.stu_no and b.sub_no = 101;
 
select a.stu_no, a.stu_name, b.enr_grade
 2 from student a, enrol b
 3 where a.stu_no = b.stu_no and b.sub_no = 101;
 
 create table test(empno, ename, sal, comm, deptno)
 as
 select empno, ename, sal, comm, deptno
 from emp
 where deptno = 1;
 
insert into test values(11, 'apple', 1000, null, 30);
insert into test values(12, 'banana', 2000, 100, 30);
insert into test values(13, 'cheese', 1000, 0, 10);
insert into test values(14, 'dog', 2000, null, 20);
insert into test values(15, 'egg', 1000, 100, 20);
 
select *
from test;

 select *
 from test
 where (sal, nvl(comm, -1)) =
 (select sal, nvl(comm,-1)
 from test
 where empno = 11);

select *
from test
where (sal, nvl(comm, -1)) in (select sal, nvl(comm, -1)
from test
where deptno = 30);
 
--[2022�� 6�� 15��(��) �ǽ�]

--union: �ߺ� ������ ���(������)
select * from a_student
union
select * from b_student;

--union all : �ߺ� ������ ���
select * from a_student
union all
select * from b_student;

--intersect : �ߺ��� (������) 
select * from a_student
intersect
select * from b_student;

--minus : �ߺ� ������ ������
select * from a_student
minus
select * from b_student;

select * from b_student
minus
select * from a_student;

--emp ���̺� ����;
create table tmpa_emp(empno, ename, hiredate, sal, deptno)
as
select empno, ename, hiredate, sal, deptno
from emp
where deptno in(10, 20);

select * from tmpa_emp;

create table tmpb_emp(empno, ename, hiredate, sal, deptno)
as
select empno, ename, hiredate, sal, deptno
from emp
where deptno in(20, 30);

select * from tmpb_emp;

select * from tmpa_emp
union
select * from tmpb_emp;

select * from tmpb_emp
union all
select * from tmpa_emp;

select * from tmpa_emp
intersect
select * from tmpb_emp;

select * from tmpa_emp
minus
select * from tmpb_emp;

select * from tmpb_emp
minus
select * from tmpa_emp;

--rank() : ������ ����.
select ename from emp order by ename;
--sal�� ���� �������� �������� �� ��ü ���� ���
select empno, ename, sal, rank() over(order by sal) as rank_asc from emp;
--sal�� ���� �������� �������� �� ��ü ���� ���
select empno, ename, sal, rank() over(order by sal desc) as rank_asc from emp;

--RANK() OVER()�� ���� ������ ��� 1,1,3 �������� ���������
--DENSE_RANK() Over()�� ���� ������ ��� 1,1,2 �������� ���
--ROW_NUMBER() OVER()�� ���� ������ ��� 1,2,3 �������� ���

select empno, ename, job, sal,
rank() over(order by sal desc) sal_rank, 
dense_rank() over (order by sal desc) sal_dense_rank,
row_number()  over (order by sal desc) sal_row_num
from emp;

--[4�� �ǽ�����]

--�л�(student), ����(subject), ����(enrol) ���̺�
select * from student ;
select * from subject ;
select * from enrol ;

--1. �л� ���̺�� ���� ���̺��� ��� �����͸� �˻��Ͻÿ�.(natural join)
select * from student natural join enrol;

--2. �й�, �̸�, �����, ������ �˻��Ͻÿ�.(equi_join)
select student.stu_no, student.stu_name, sub_name, enr_grade
from enrol, subject, student
where subject.sub_no = enrol.sub_no and student.stu_no = enrol.stu_no;

select student.stu_no, student.stu_name, sub_name, enr_grade
from enrol join subject on subject.sub_no = enrol.sub_no join student on student.stu_no = enrol.stu_no;

--3. ������ �й�, ������ �˻��Ͻÿ�.(natural join)
select sub_name, stu_no, enr_grade
from subject natural join enrol;

--4. ������ �й�, ������ �˻��Ͻÿ�.(join ~ using)
select sub_name, stu_no, enr_grade
from subject join enrol using(sub_no);

--5. ������ 70�� �̻��� �л� �̸��� �˻��Ͻÿ�.(equi_join)
select student.stu_name, enr_grade
from enrol,  student
where enrol.stu_no = student.stu_no and enr_grade >= 70;

select student.stu_no, enr_grade
from enrol join subject on subject.sub_no = enrol.sub_no  join student on enrol.stu_no = student.stu_no
where enr_grade >= 70;

--6. ������ 60�� �̻��� �л� �̸��� �˻��Ͻÿ�.(join ~ using)
select stu_name, enr_grade
from subject join enrol using(sub_no) join student using(stu_no)
where enr_grade >= 60;

--7. ������ 70�� ������ �л� �̸��� �˻��Ͻÿ�.(natural join)
select stu_name, enr_grade
from enrol natural join student
where enr_grade <= 70;

--8. ������ �л��� �����ϴ� ������ ���� ������ �˻��Ͻÿ�.(equi_join)
select sub_name, sub_prof
from enrol, subject, student
where subject.sub_no = enrol.sub_no and student.stu_no = enrol.stu_no and stu_name = '������';

select sub_name, sub_prof
from enrol join subject on subject.sub_no = enrol.sub_no join student on student.stu_no = enrol.stu_no
where stu_name = '������';

--9. ������ �л��� �����ϴ� ������ ���� ������ �˻��Ͻÿ�.(natural join)
select sub_name, sub_prof
from subject natural join enrol natural join student
where stu_name = '������';

--10. ������ �л��� �����ϴ� ������ ���� ������ �˻��Ͻÿ�.(join ~ using)
select sub_name, sub_prof
from subject join enrol using(sub_no) join student using(stu_no)
where stu_name = '������';

--11. ������ ������ �����ϴ� ������ �����ϴ� �л��� �̸��� �˻��Ͻÿ�.
--(equi join, join ~ using, natural join

select student.stu_name
from student, enrol, subject
where subject.sub_no = enrol.sub_no and student.stu_no = enrol.stu_no and sub_prof = '������';

select student.stu_name
from subject join enrol using(sub_no) join student using(stu_no)
where sub_prof = '������';

select student.stu_name
from subject natural join enrol natural join student
where sub_prof = '������';

--12. ��ǻ�Ͱ����� �����ϴ� �л����� �й��� �̸��� �˻��Ͻÿ�
--(equi join, join ~ using, natural join)

select student.stu_no, student.stu_name
from student, enrol, subject
where subject.sub_no = enrol.sub_no and student.stu_no = enrol.stu_no and sub_name = '��ǻ�Ͱ���';

select stu_no, stu_name
from enrol join subject using(sub_no) join student using(stu_no)
where sub_name = '��ǻ�Ͱ���';

select stu_no, stu_name
from subject natural join enrol natural join student
where sub_name = '��ǻ�Ͱ���';

--13. �ý��ۺм����質 ����Ʈ���� ������ �����ϴ� �л����� �й�, �̸�, ������
--���������� �˻��Ͻÿ�.(equi join, join ~ using, natural join)

select student.stu_no, student.stu_name, enr_grade
from student, enrol, subject
where subject.sub_no = enrol.sub_no and student.stu_no = enrol.stu_no and 
(sub_name = '�ý��ۺм�����' or sub_name = '����Ʈ�������')
order by enr_grade desc;

select stu_no, stu_name, enr_grade
from enrol join subject using(sub_no) join student using(stu_no)
where (sub_name = '�ý��ۺм�����' or sub_name = '����Ʈ�������') order by enr_grade desc;

select stu_no, stu_name, enr_grade
from subject natural join enrol natural join student
where (sub_name = '�ý��ۺм�����' or sub_name = '����Ʈ�������') order by enr_grade desc;

--14. ������ 1�г� �����̰ų� ��ǻ���������� ������ ������ ��� �� �������
--�����ϴ� �л����� �й��� �̸��� �˻��Ͻÿ�.(equi join)

select student.stu_no, student.stu_name
from student, enrol, subject
where subject.sub_no = enrol.sub_no and student.stu_no = enrol.stu_no and 
(sub_grade = 1 or sub_dept = '��ǻ������');

--15. �����۹��̳� �������ڽ����� �����ϴ� �л����� �й�, �̸�, ������
--���������� �˻��Ͻÿ�.(natural join)

select stu_no, stu_name, enr_grade 
from subject natural join enrol natural join student
where (sub_name = '�����۹�' or sub_name = '�������ڽ���')
order by enr_grade desc;

--16. ���¿� ������ ������ ������ �����ϴ� ������ �����ϴ�
--�л��� �̸��� �й��� �˻��Ͻÿ�(join ~ using)

select stu_no, stu_name, enr_grade 
from enrol join subject using(sub_no) join student using(stu_no)
where (sub_prof = '���¿�' or sub_prof= '������')
order by enr_grade desc;

--17. �л��� �̸��� ������ �˻��Ͻÿ�
--(1) equi join
select stu_name, enr_grade
from student, enrol
where student.stu_no = enrol.stu_no;

--(2)natual join
select stu_name, enr_grade
from student natural join enrol natural join subject;

--(3)join using
select stu_name, enr_grade
from student join enrol using(stu_no);

--18. �̸��� '���Ѻ�'�� �л��� �����ϴ� ������� �˻��Ͻÿ�.(equi join)
select sub_name
from student, enrol, subject
where student.stu_no = enrol.stu_no and enrol.sub_no = subject.sub_no and stu_name = '���Ѻ�';

--19. ���л��� �������� ������ ������� ��� �˻��Ͻÿ�.(natural join)
select distinct sub_name
from student natural join enrol natural join subject
where stu_gender = 'F';

--20. ü���� 60 �̻��� �л��� �����ϴ� ������ ������� ��� �˻��Ͻÿ�.(join ~ using)
select distinct sub_name
from student join enrol using(stu_no) join subject using(sub_no)
where stu_weight >= 60;

--21. ��ǻ���������� ������ ������ �����ϴ� ��� �л��� �й��� �̸� , �����̸���
--�˻��Ͻÿ�.(natural join)
select stu_no, stu_name, sub_name
from student natural join enrol natural join subject
where sub_dept = '��ǻ������';

--22. ���л��̸鼭 ������ ������ ������ �����ϴ� �л��� �̸��� �˻��Ͻÿ�.
--(equi join)
select stu_name
from student, enrol, subject
where (student.stu_no = enrol.stu_no and enrol.sub_no = subject.sub_no) and (stu_gender = 'F' and sub_prof = '������');

--23. ������ �л��� ��� �������� ���� ������ ���� �л��� �й��� �̸��� �˻��Ͻÿ�.(equi join, join ~ using, natural join)
--(1) equi
select student.stu_no, stu_name
from student, enrol, subject
where (student.stu_no = enrol.stu_no)
and enr_grade >
 (select avg(enr_grade) from student, enrol, subject where  (student.stu_no = enrol.stu_no and enrol.sub_no = subject.sub_no) and stu_name = '������') and stu_name <> '������';
--(2) join using
select stu_no, stu_name
from student join enrol using(stu_no)
where enr_grade >
 (select avg(enr_grade) from student, enrol, subject where  (student.stu_no = enrol.stu_no and enrol.sub_no = subject.sub_no) and stu_name = '������') and stu_name <> '������';

--(3) natural join
select stu_no, stu_name
from student natural join enrol
where enr_grade >
(select avg(enr_grade) from student, enrol, subject where  (student.stu_no = enrol.stu_no and enrol.sub_no = subject.sub_no) and stu_name = '������') and stu_name <> '������';

--24. ������ �л��� ������� ���� ���� ������ ���� �л��� �й��� �̸�, ������� �˻��Ͻÿ�
--(natural join)
select stu_no, stu_name, sub_name
from student natural join enrol natural join subject
where enr_grade <
(select avg(enr_grade) from student, enrol, subject where  (student.stu_no = enrol.stu_no and enrol.sub_no = subject.sub_no) and stu_name = '������') and stu_name <> '������';

--25. ��ü �л��� ��� �������� ������ ���� �л��� �й�, �̸�, �����, ������ �˻��Ͻÿ�
--(join ~ using)
select stu_no, stu_name, sub_name, enr_grade
from student join enrol using(stu_no) join subject using(sub_no)
where enr_grade >
(select avg(enr_grade) from enrol);

--26. ���� �ְ� ���� �л����� �ְ� ������ ���� �а��� �а���� ������ �˻��Ͻÿ�(join ~ using)

select stu_dept, enr_grade
from student join enrol using(stu_no) join subject using(sub_no)
where enr_grade >
(select max(enr_grade) from student join enrol using(stu_no) where stu_dept = '���');

--27. �������ڰ��� ���� �������� ���� ������ ���� �а��� �а���� ������ �˻��Ͻÿ�(join ~ using)
select stu_dept, min(enr_grade)
from student join enrol using(stu_no) group by stu_dept having min(enr_grade) >
(select min(enr_grade) from student join enrol using(stu_no) where stu_dept = '��������');

--28. ���� ���� �ο��� �����ȣ, ������ �Բ� �����ȣ������ �˻��Ͻÿ�.(natural join)
select sub_no, sub_name, count(*)
from student natural join enrol  natural join subject
group by sub_no, sub_name order by sub_no ;

--�� 5�� ������ ���Ű� Ʈ����� ����
-- ������ ���� (DML) : insert, update, delete
-- create(���̺� ����) : [create table ���̺�(�ʵ� �ʵ�Ÿ��);],
--[create table ���̺� 1: as select from ���̺�2 where ����;]

create table c_student(stu_no number, stu_name char(10));

create table a_enrol
as select * from enrol where stu_no<20150000;

desc a_enrol;

select * from a_enrol;

-- insert : [insert into ���̺�(�ʵ�) values (�Է°�);] > �⺻ Ÿ��
insert into a_enrol(sub_no, stu_no, enr_grade)
values(108, 20151062, 92);

select * from a_enrol;

insert into a_enrol
values (109, 20152088, 85);

insert into a_enrol(sub_no, stu_no)
values (110, 20152088);

select * from a_enrol;

insert into a_enrol
values (111, 20153075, null);

select * from a_enrol;

insert into a_enrol
select * from enrol
where stu_no like '2015%';

select * from a_enrol;

-- update : [update ���̺� set ������ ���� where ����;]
update a_enrol
set enr_grade = enr_grade + 5;

select * from a_enrol;

update a_enrol
set enr_grade = enr_grade + 10, sub_no = sub_no + 5
where sub_no = 104;

--'�ý��ۺм�����' ������ �����ȣ�� �˻�
select sub_no from subject where sub_name = '�ý��ۺм�����';

select * from a_enrol;

select * from subject;

--�����Ǹ� ���� update
update a_enrol
set enr_grade = enr_grade + 10
where sub_no = (select sub_no from subject where sub_name = '�ý��ۺм�����');

select * from a_enrol where sub_no = 104;

--delete : [delete from ���̺� where ����;]
-- (1) Ư�� ������ ����
select * from a_enrol where stu_no = 20131001;

delete from a_enrol
where stu_no = 20131001;

select * from a_enrol;

-- ���̺� ���� ��� ������ ����
delete from a_enrol;

select * from a_enrol;

-- ���̺� ����
drop table a_enrol;

-- ���� 

select * from a_student;

select * from b_student;

delete from b_student;

rollback;

select * from b_student;

delete from b_student;

commit;

-- ���� 

desc tmpa_emp;

select * from tmpa_emp;

insert into tmpa_emp(empno, ename, hiredate, sal, deptno)
values(1, 'kim', to_date('2013-01-01'),700,40);

insert into tmpa_emp(empno, ename, hiredate, sal, deptno)
values(2, 'kang', to_date('2013-01-01'),800,40);

insert into tmpa_emp(empno, ename, hiredate)
values(3, 'kho', to_date('2013-01-01'));

insert into tmpa_emp(empno, ename, hiredate, sal, deptno)
values(4, 'lee', null, null, null);

select * from tmpa_emp;

-- ��� ���̺� ���� (�ǽ��� ���� ���̺��̹Ƿ� ������ ����)
select * from dual;

-- ���� ����ڿ� �ð� �˻�
select user, sysdate from dual;

insert into tmpa_emp(empno, ename, hiredate, sal, deptno)
values(5, 'park', sysdate, 850, 20);

select * from tmpa_emp;

-- ���ǿ� �´� ������ ����
insert into tmpb_emp
select * from tmpa_emp
where empno < 10;

select * from tmpb_emp;

-- ���ǿ� �´� ������ ����
delete from tmpa_emp
where deptno = 10;

select * from tmpa_emp;

-- �����Ǹ�  ���� delete
delete tmpb_emp
where deptno = (select deptno
from dept where loc = 'DALLAS');

select * from tmpb_emp;

-- ���̺��� ������ ��� ����
delete from tmpa_emp;

select * from tmpa_emp;

rollback;

select * from tmpa_emp;

commit;

-- update ����
-- �����Ǹ� ���� update
select * from tmpb_emp;

update tmpb_emp
set sal = sal +500
where deptno = (select deptno
from dept where dname = 'SALES');

select * from tmpb_emp;

-- ����(���̺� �б� ���� ���)

create table t_readonly( no number, name varchar2(10));

insert into t_readonly values(1,'AAA');

select * from t_readonly;

commit;

-- �б� �������� �����մϴ�.

alter table t_readonly read only;

insert into t_readonly values(2, 'BBB');

select * from t_readonly;

-- �б� ���� �������� ����

alter table t_readonly read write;

insert into t_readonly values(2, 'BBB');

select * from t_readonly;

drop table t_readonly;

commit;

--5�� �ǽ����̺�

--�л����2

create table student1(
stu_no char(9),
stu_name varchar2(12),
stu_dept varchar2(20),
stu_year number(1),
stu_class char(1),
stu_gender char(1),
stu_height number(5,2),
stu_weight number(5,2),
constraint k_stu_no primary key(stu_no));

insert into student1 values('20093075', '���Ѻ�','���',1,'C','M',177,80);
insert into student1 values('20093088', '���¿�','���',1,'C','F',162,50);
insert into student1 values('20093054', '������','���',2,'C','F',154,47);
insert into student1 values('20072088', '���ο�','��������',1,'C','M',188,90);
insert into student1 values('20062021', '�ɼ���','��������',2,'A','F',168,45);
insert into student1 values('20061062', '������','��ǻ������',1,'B','M',166,67);
insert into student1 values('20061007', '������','��ǻ������',2,'C','M',174,64);

create table subject1(
sub_no char(3),
sub_name varchar2(30),
sub_prof varchar2(12),
sub_year number(1),
sub_dept varchar2(20),
constraint k_sub_no primary key(sub_no));

insert into subject1 values('111', '�����ͺ��̽�','���翵',2,'��ǻ������');
insert into subject1 values('110', '�ڵ�����','������',2,'��������');
insert into subject1 values('109', '�ڵ�ȭ����','�ڹο�',3,'���');
insert into subject1 values('101', '��ǻ�Ͱ���','������',3,'��ǻ������');
insert into subject1 values('102', '�����۹�','���¿�',1,'���');
insert into subject1 values('103', '�������ڽ���','������',1,'��������');
insert into subject1 values('104', '�ý��ۺм�����','������',3,'��ǻ������');
insert into subject1 values('105', '����Ҽ���','���',1,'���');
insert into subject1 values('106', '����ȸ�ν���','�ֿ���',3,'��������');
insert into subject1 values('107', 'CAD����ǽ�','������',2,'���');
insert into subject1 values('108', '����Ʈ�������','�ǹμ�',1,'��ǻ������');

create table enrol1(
sub_no char(3),
stu_no char(9),
enr_grade number(3),
constraint k_course primary key(sub_no,stu_no));

insert into enrol1 values('101','20071001',80);
insert into enrol1 values('104','20071001',56);
insert into enrol1 values('106','20052003',72);
insert into enrol1 values('103','20072088',45);
insert into enrol1 values('101','20071025',65);
insert into enrol1 values('104','20071025',65);
insert into enrol1 values('108','20061062',81);
insert into enrol1 values('107','20093054',41);
insert into enrol1 values('102','20093075',66);
insert into enrol1 values('105','20093075',56);
insert into enrol1 values('102','20093088',61);
insert into enrol1 values('105','20093088',78);

commit;
rollback;

select * from student1;
select * from student;
--[ 5�� �ǽ�����]

-- 1. �й� 20101059, �̸� ������, �а� ��ǻ������ ,�г� 1 �� B, Ű 164, ������ 70�� ���л��� �߰��Ͻÿ�
insert into student1 values(20101059, '������', '��ǻ������', 1, 'B', 'M', 164, 70);

-- 2. �й� 20092038, �̸� ������, �а� ��������, �г� 1, �� C, ���л��� �߰��Ͻÿ�.
insert into student1 values(20092038, '������', '��������', 1, 'C', 'F', null, null);

-- 3. �й� 20093009, �̸� �ڼҽ�, �а� ���, 20093075 �л��� ���� �г�, ���� ���� ���л��� �߰��Ͻÿ�.
insert into student1 values(20093009, '�ڼҽ�', '���', 
(select stu_year from student1 where stu_no =20093075) ,  
(select stu_class from student1 where stu_no =20093075), 'M', null, null);

-- 4. student1 ���̺� student ���̺� 3�г� �л��� �����͸� �Է��Ͻÿ�.
insert into student1
(select * from student
where stu_grade = 3);

-- 5. �й� 20072088�� ���� B�� �����Ͻÿ�.
update student1
set stu_class = 'B'
where stu_no = 20072088;

-- 6. 20061062 �й��� �л��� Ű�� 2cm �ڶ���. �̸� db�� �ݿ��Ͻÿ�.
update student1
set stu_height = stu_height +2
where stu_no = 20061062;

-- 7. ���г⵵�� �Ǿ� �г��� �� �г⾿ �÷��� �Ѵ�. �̸� DB�� �ݿ��Ͻÿ�.
update student1
set stu_year = stu_year + 1;

-- 8. �й��� 20062021�� �л��� �а��� ��ǻ�������� �ٲٽÿ�.
update student1
set stu_dept = '��ǻ������'
where stu_no = 20062021;

-- 9. �����۹� ������ ������ 10���� ���Ͻÿ�.
update enrol1
set enr_grade = enr_grade - 10
where sub_no = (select sub_no from subject1 where sub_name = '�����۹�');

-- 10. ������ �л��� ����Ʈ������� ������ ���������� �߰ߵǾ 0������ ó���Ͻÿ�.
update enrol1
set enr_grade = 0
where sub_no = 
(select sub_no from subject1 where sub_name = '����Ʈ�������')
and stu_no = 
(select stu_no from student1 where stu_name = '������');

-- 11. �й��� 20093088 �л��� �����Ͽ���. �л�(student1)���̺��� �����Ͻÿ�.
delete student1
where stu_no = 20093088;
select * from student1;

-- 12. �����ȣ 112, ����� �ڵ�ȭ�ý���, ������ ������, �г� 3, �а� ��踦 �߰��Ͻÿ�.
select * from subject1;
insert into subject1
values(112, '�ڵ�ȭ�ý���', '������', 3, '���');

-- 13. �����ȣ�� 110���� 501�� �����Ͻÿ�.
update subject1
set sub_no = 501
where sub_no = 110;

-- 14. �����ȣ 101�� ������ ó���Ͻÿ�. ����(subject)���̺��� �����Ͻÿ�.
delete subject1
where sub_no = 101;

-- 15. enrol1 ���̺��� subject1 ���̺� ���� �����ȣ�� 999�� �����Ͻÿ�.
select * from enrol1;
select * from subject1;

update enrol1
set sub_no = 999
where sub_no not in (select sub_no from subject1);
/*
(select sub_no from enrol1
minus
select sub_no from subject1);*/

-- 16. enrol1 ���̺��� �����ȣ 999�� �����Ͻÿ�.
delete enrol1
where sub_no = 999;

-- 17. enrol1 ���̺� ���� ������� �����Ͻÿ�.
delete subject1
where sub_no not in (select distinct sub_no from enrol1);

select * from subject1 order by sub_no;
select * from enrol1 order by sub_no;

select sub_no from subject1 minus select sub_no from enrol1;

-- 18. enrol1 ���̺��� ��ü �����͸� �����Ͻÿ�.
delete enrol1;

commit;

--MERGER(�պ�) ����
-- (1) ���̺� ����(charge_01, charge_02)
create table charge_01
(u_date varchar2(6), cust_no number, u_time number, charger number);

create table charge_02
(u_date varchar2(6), cust_no number, u_time number, charger number);

 -- ������ ����
insert into charge_01 values('141001',1000,2,1000);
insert into charge_01 values('141001',1001,2,1000);
insert into charge_01 values('141001',1002,1,500);
insert into charge_02 values('141002',1000,3,1500);
insert into charge_02 values('141002',1001,4,1500);
insert into charge_02 values('141002',1003,1,1500);

select * from charge_01;
select * from charge_02;

-- ���̺���� ���յǾ� ����� ���̺� ����(ch_total)
create table ch_total(u_date varchar2(6), cust_no number, u_time number, charger number);

merge into ch_total total
using charge_01 ch01
on(total.u_date = ch01.u_date)
when matched then
update set total.cust_no = ch01.cust_no
when not matched then
insert values(ch01.u_date,ch01.cust_no,ch01.u_time,ch01.charger);

select * from ch_total;

merge into ch_total total
using charge_02 ch02
on(total.u_date = ch02.u_date)
when matched then
update set total.cust_no = ch02.cust_no
when not matched then
insert values(ch02.u_date,ch02.cust_no,ch02.u_time,ch02.charger);

select * from ch_total;

-- (1) ���̺� ����
-- [create table ���̺� (�ʵ� �ʵ� �Ӽ� �⺻��, ...);]
create table testk
(u_id varchar2(10), u_date date); 

-- [create tanle ���̺� as ������;]
create table t_student
as
select * from student where stu_dept='���';
desc t_student;
select * from t_student;

-- (2) ���̺� ����
-- �� ���� : [alter table ���̺� add(�ʵ� �ʵ� �Ӽ�, ...;]
alter table t_student add(army char(1));
desc t_student;

-- �� ���� ����, ���� : [alter table ���̺� modify(�ʵ� �ʵ�Ӽ�, ...);]
desc t_student;
alter table t_student modify(army number);

--  �� ���� : [alter table ���̺� drop(�ʵ�1, �ʵ�2, ...);]
alter table t_student drop(army);

-- (3) ���̺� �̸� ���� : [rename ���̺� to ���̺�;]
select * from t_student;
rename t_student to test_student;
desc test_student;
select * from test_student;

-- (4) ���̺� �� ������, ���� ���� : [truncate table ���̺�;]
-- delete from�� ������ ����������, truncate�� ����+���� ����
truncate table test_student;
select * from test_student;

-- (5) ���̺� ���� : [drop table ���̺�;]
drop table test_student;

-- ����(���̺� ����, ���� ����, ����)
-- 1. ��� ������ �����ϱ� ���� ���̺� ���� �� Ȯ��
create table emp01(
empno number(4),
ename varchar2(14),
sal number(7,3));

desc emp01;

-- 2. ������̺� ��¥ Ÿ���� ������ birth �÷� �߰��� �� Ȯ��
alter table emp01 add(birth date);
desc emp01;

-- 3. ��� �̸� �÷� ũ��(30) ���� �� Ȯ��
alter table emp01
modify ename varchar2(30);

-- 4. ������̺��� ����̸� �÷� ������ �� Ȯ��
alter table emp01
drop (ename);

desc emp01;

-- 5. UNUSED ����
alter table emp01
set unused (empno);

desc emp01;

-- 6. UNUSED�� ǥ�õ� �ڵ� �÷��� �����ϱ�
select * from DBA_UNUSED_COL_TABS;

alter table emp01
drop unused columns;

desc emp01;

-- # ���� ���� (constraints) : �����ͺ��̽� ���°� �׻� �����ؾ� �� �⺻ ��Ģ

-- constraint name �ο� : 
-- [create table ���̺�(�ʵ� �ʵ�Ÿ�� constraint ���� ���Ǹ� ���� ����);]
--t_student ���̺� ����
create table t_student(
stu_no char(9), stu_name varchar2(12) constraint u_stu_name unique, 
stu_dept varchar2(20) constraint n_stu_dept not null,
stu_grade number(1), stu_class char(1),
stu_gender char(1) constraint c_stu_gender check (stu_gender in('M','F')),
stu_height number(5,2), stu_weight number(5,2), constraint p_stu_no primary key(stu_no));

drop table t_student;
desc t_student
select * from t_student;

-- t_enrol ���̺� ����
create table t_enrol(
sub_no char(3),
stu_no char(9),
enr_grade number(3),
constraint enr_stu_no foreign key(stu_no) references t_student(stu_no),
constraint p_enrol primary key(sub_no, stu_no));

desc t_enrol;

select * from user_constraints where table_name = 'T_STUDENT';
select * from user_constraints where table_name = 'T_ENROL';

-- �������� ���� : 
-- [alter table ���̺� drop constraint �����̸�(constraint_name) cascade;]

alter table t_enrol drop constraint enr_stu_no cascade;

-- �������� Ȱ��ȭ/��ȭ��ȭ
-- [alter table ���̺� disable/enable constraint ���� �̸�(constraint_name);]

alter table t_student disable constraint n_stu_dept;

alter table t_student enable constraint n_stu_dept;

select * from t_student;

desc user_constraints;

select constraint_name, constraint_type, table_name from user_constraints;

select constraint_name, table_name, column_name from user_cons_columns;

-- �ǽ�����

drop table emp01;

create table emp01(empno number(4), ename varchar2(10), job varchar2(9), deptno number(2));

insert into emp01 values(null, null, '���', 30);

select * from emp01;

create table emp02(empno number(4) not null, ename varchar2(10) not null, job varchar2(9), deptno number(2));

desc emp02;

insert into emp02 values(null, null, '���', 30);

insert into emp02 values(1000, '����', '���', 30);

select * from emp02;

select constraint_name, constraint_type, table_name
from user_constraints
where table_name = 'EMP02';

insert into emp02 values(1000, 'ȫ�浿', '����', 20);

create table emp03(
empno number(4) unique, ename varchar2(10) not null,
job varchar2(9),
deptno number(2));

insert into emp03 values(1000, '����', '���', 30);

insert into emp03 values(1000, 'ȫ�浿', '����', 20);

insert into emp03 values(null, '���߱�', '����', 20);

insert into emp03 values(null, '�̼���', '����', 10);

select * from emp03;

select constraint_name, constraint_type, table_name
from user_constraints
where table_name = 'EMP03';

create table emp04(
empno number(4) constraint emp04_empno_uk unique, ename varchar2(10) constraint emp04_ename_nn not null,
job varchar2(9),
deptno number(2));

select constraint_name, constraint_type, table_name
from user_constraints
where table_name = 'EMP04';

insert into emp04 values(1000, '����', '���', 30);

insert into emp04 values(1000, 'ȫ�浿', '����', 20);

select * from emp04;

create table emp05(
empno number(4) constraint emp05_empno_pk primary key, ename varchar2(10) constraint emp05_ename_nn not null,
job varchar2(9), deptno number(2));

insert into emp05 values(1000, '����', '���', 30);

insert into emp05 values(1000, 'ȫ�浿', '����', 20);

insert into emp05 values(null, '�̼���', '����', 10);

select constraint_name , constraint_type, table_name
from user_constraints
where table_name in('EMP05');

select constraint_name , table_name, column_name
from user_cons_columns
where table_name in('EMP05');

create table emp06(
empno number(4) constraint emp06_empno_pk primary key, ename varchar2(10) constraint emp06_ename_nn not null,
job varchar2(9), deptno number(2) constraint emp06_deptno_fk references dept(deptno));

insert into emp06 values(1010, 'ȫ�浿', '���', 50);
select * from dept;

insert into emp06 values(1010, 'ȫ�浿', '���', 30);
select * from dept;

create table emp07(
empno number(4) constraint emp07_empno_pk primary key, 
ename varchar2(10) constraint emp07_ename_nn not null,
sal number(7, 2) constraint emp07_sal_ck check(sal between 500 and 5000),
gender varchar2(1) constraint emp07_gender_ck check(gender in('M','F')));

insert into emp07 values(1000, '����', 200, 'M');
select * from emp07;

insert into emp07 values(1000, '����', 700, 'A');
select * from emp07;

insert into emp07 values(1000, '����', 700, 'M');
select * from emp07;

--[2022�� 6�� 20��(��) �ǽ�]

create table dept01(
deptno number(2) primary key, 
dname varchar2(14),
loc varchar2(13) default '����'
);

insert into dept01(deptno, dname) values(10, '�渮��');

select * from dept01;

-- �� : ������ ���̺� (virtual table)
-- create view �� (�ʵ�) as ������;]
-- �ܼ��� : ���� �����ͺ��̽� ���̺�κ��� ������ ��

-- �� ���� : [create or replace view ���̸� as ������;]
create or replace view v_student1
as 
select * from student where stu_dept = '��ǻ������';

-- �� Ȯ��
select * from v_student1;

--���� ��: 2�� �̻��� DB ���̺�κ��� ������ ��
-- (1) equi join �������� �� ����
create  or replace view v_enrol1
as
select sub_name, a.sub_no, stu_no, enr_grade
from enrol a, subject b
where a.sub_no = b.sub_no;

-- (2)�� Ȯ��
select * from v_enrol1;

-- �� ����

create or replace view v_emp1
as select * from emp
where deptno = 20;

select * from v_emp1;

-- ���κ� ���� 
create or replace view v_emp2
as 
select empno, ename, mgr, hiredate, sal, dept.dname
from emp, dept
where emp.deptno = dept.deptno;

select * from v_emp2;

 -- �� ���� 
select * from emp where deptno = 30;
 
 -- 30�� �μ��� �����͸� �̾Ƽ� v_emp3�� ���� ���̺��� ����ÿ�.
create or replace view v_emp3
as 
select * from emp
where deptno = 30;

select * from v_emp3;

-- �ζ��� �� : from ���� select ������ ���ǵ� ��
-- �а��� ��� ���庸�� ū �л����� �й�, �̸�, ���� �˻�(�ζ��� ��)
select stu_no, stu_name, a.stu_dept, stu_height
from student a, 
(select stu_dept, avg(stu_height) as avg_height
from student
group by stu_dept) b 
where a.stu_dept = b.stu_dept
and a.stu_height > b.avg_height;

-- �л� ���̺��� ������ ū ���� 5���� �й�, �̸�, ���� �˻�
select stu_no, stu_name, stu_height
from (select stu_no, stu_name, stu_height
from student where stu_height is not null
order by stu_height desc)
where rownum <= 5;

-- �ζ��� �� ����
-- �μ��� ��� �� �޿��� ���� ���� �޴� ����� ������ �˻��Ͻÿ�.
select a.empno, a.ename, a.sal, c.dname
from emp a, 
(select deptno, max(sal) maxsal from emp group by deptno) b, dept c
where a.deptno = b.deptno and a.sal = b.maxsal and a.deptno = c.deptno
order by a.deptno;

--emp ���̺��� �޿��� ���� ���� �޴� 5���� �����ȣ, �̸�, �޿��� �˻��Ͻÿ�.
select empno, ename, sal
from (select empno, ename, sal from emp order by sal desc)
where rownum <= 5;

--�ε��� : ���� �˻��� ���� ����
-- (1) �ε��� ���� : [create index �ε����� on ���̺�(�ʵ� �� ����);]
-- �л��� �̸����� �ε��� ����
create index i_stu_name on student(stu_name);

-- �й��� �̸��� ���ļ� �ε��� ����
create index i_stu_no_name on student(stu_no, stu_name);

-- ������ ���� �ε��� ����
-- ������ �ε��� ���� �� ����
create unique index k_stu_name on student(stu_name);

drop index i_stu_name;

select * from user_indexes
where table_name = 'STUDENT';

-- �Լ��� ������ �̿��� �ε��� ����
create index i_stu_weight on student(stu_weight-5);
 
create sequence seq1
increment by 2
start with 1000
maxvalue 10000;

-- ���� ��ȣ�� �Ѿ��. ���๮�� ������ ������ 2�� �����ϸ鼭 ���� �ٲ�.
select seq1.nextval from dual;
 
select seq1.nextval from dual;

-- ���� ��ȣ �˱�
select seq1.currval from dual;

 -- ������ ����
 -- ������ ����
create sequence seq2
increment by 1
start with 1
maxvalue 100;

-- ���� ��Ű��
select seq2.nextval from dual;

-- ���� ��ȣ Ȯ��
select seq2.currval from dual;

-- ������Ű��
select seq2.nextval from dual;

-- ������ ��ȯ
alter sequence seq2
increment by 2;

select seq2.nextval from dual;

-- ������ ����
drop sequence seq2;

-- ������ ���� Ȯ��
select sequence_name, min_value, max_value, increment_by
from user_sequences;

-- �ڵ����� ���� ��, �������� ���� ����� ���̺� ���� �����ϱ�
-- (1) ������ ����
create sequence emp_seq
start with 1
increment by 1
maxvalue 100000;

-- (2) ���̺� ����
create table emp13(
empno number(4) primary key, 
ename varchar(10) not null,
hiredate date
);

-- (3) ���� Ȯ��
select constraint_name, constraint_type, table_name
from user_constraints
where table_name in('EMP12');

-- (4)  ���̺� ������, ������ ����
insert into emp12
values(emp_seq.nextval, 'ȫ�浿', SYSDATE);

insert into emp12
values(emp_seq.nextval, '������', SYSDATE);

select * from emp12;

-- (5) ������, ������ Ȯ��

select sequence_name, min_value, max_value, increment_by
from user_sequences;

-- [6�� �ǽ�����]

-- 1. ��ǰ(product) ���̺��� �����Ͻÿ�.
create table product
(p_code char(3) not null,
p_name varchar2(30),
p_cost number,
p_group varchar2(30),
constraint p_code_pk primary key(p_code));


SELECT p_code_pk, primary key, product
FROM USER_CONSTRAINTS
WHERE product=product;

select * from product;

-- 2. ��ǰ(product) ���̺��� ������ �˻��Ͻÿ�.
desc product;

-- 3. ��ǰ(product) ���̺� ��ǰ� ���� ��ǰ ������ �����Ͻÿ�.
insert into product values('101', '19��ġ �����', 150000, '�����');
insert into product values('102', '22��ġ �����', 200000, '�����');
insert into product values('103', '25��ġ �����', 260000, '�����');
insert into product values('201', '�������콺', 7000, '���콺');
insert into product values('202', '�������콺', 18000, '���콺');
insert into product values('301', '����Ű����', 8000, 'Ű����');
insert into product values('302', '����Ű����', 22000, 'Ű����');
insert into product values('401', '2ä�� ����Ŀ', 10000, '����Ŀ');
insert into product values('402', '5.1ä�� ����Ŀ', 120000, '����Ŀ');

-- 4. ��ǰ(product) ���̺��� ��� �����͸� �˻��Ͻÿ�.
select * from product;

-- 5. ��ǰ(product) ���̺��� ���(bigo) ���� �����Ͻÿ�(varchar2(10))
alter table product add(bigo varchar2(10));

-- 6. ���ο� ���� ��ǰ(prouduct) ���̺� ���ԵǾ����� Ȯ���Ͻÿ�.
desc product;

-- 7. ��ǰ(product)  ���̺� ���( bigo)  ���� ������ �ִ� 20�ڷ� �����Ͻÿ�.
alter table product modify(bigo varchar2(20));

-- 8. ��ǰ(product)  ���̺� ����� ���( bigo)  ���� ������ �˻��Ͻÿ�.
desc product;

-- 9. ��ǰ(product) ���̺� ���(bigo) ���� �����Ͻÿ�.
alter table product drop(bigo);

-- 10. ��ǰ(product) ���̺� ���(bigo) ���� �����Ǿ����� Ȯ���Ͻÿ�.
select * from product;

-- 11. ��ǰ(product) ���̺��� product1���� �̸��� �����Ͻÿ�.
select * from product;
rename product to product1;

-- 12. ��ǰ(product) ���̺� ���� ����Ǿ����� Ȯ���Ͻÿ�.
select * from product1;
desc product1;

-- 13. product1 ���̺� ���� ��� �����͸� �����Ͻÿ�.(truncate �̿�)
truncate table product1;

-- 14. ���� Ȯ���� ���� product1 ���̺��� ������ �˻��Ͻÿ�.
select * from product1;

-- 15. product1 ���̺��� �����Ͻÿ�.
drop table product1;

-- 16. emp ���̺�� dept ���̺��� ��ȸ�Ͽ� ����� �̸��� �μ� �̸��� ����ϴ�
-- view�� �����Ͻÿ�.(���̸�:v_emp)
create or replace view v_emp
as 
select ename, dname
from emp a, dept b
where a.deptno = b.deptno;
select * from v_emp;

-- 17. emp ���̺�� dept ���̺��� ��ȸ�Ͽ� �μ� ��ȣ�� �μ��� �ִ� �޿� ��
-- �μ����� ����Ͻÿ�.
select e.deptno, d.dname, e.sal
from (select deptno, MAX(sal) sal from emp group by deptno) e, dept d
where e.deptno = d.deptno;

-- �� 7�� PL/SQL

-- ����1
-- set serveroutput on; �� ���α׷��� ���� �� �� ���� �����ϸ��
-- begin�� end ������ ��ɾ ��ũ��Ʈ�� ���
-- (�ڹٿ��� �ֿܼ� ����ϴ� �Ͱ� ���� ����)
-- / �� ���� ����

set serveroutput on;

begin
dbms_output.put_line('Hello World');
end;
/
-- ���� 2
declare
    vempno number(4);
    vename varchar2(10);
begin
    vempno := 1001;
    vename := '����';
    dbms_output.put_line('��� �̸�');
    dbms_output.put_line('-----------------');
    dbms_output.put_line(' '||vempno||' '||vename);
end;
/

-- ����3 (�μ���ȣ�� �μ��� �˾Ƴ���)
declare
    vempno emp.empno%type;
    vename emp.ename%type;
begin
    select empno, ename
    into vempno, vename
    from emp
    where ename = 'SCOTT';
    dbms_output.put_line('��� �̸�');
    dbms_output.put_line('-----------------');
    dbms_output.put_line(' '||vempno||' '||vename);
end;
/

-- ���� 4
declare
    vempno emp.empno%type;
    vename emp.ename%type;
    vdeptno emp.deptno%type;
    vdname varchar2(20) := null;
begin
    select empno, ename, deptno
    into vempno, vename, vdeptno
    from emp
    where empno = 7788;
    
    if(vdeptno = 10) then
        vdname := 'ACCOUNTING';
    end if;
    if(vdeptno = 20) then
        vdname := 'RESEARCH';
    end if;
    if(vdeptno = 30) then
        vdname := 'SALES';
    end if;
    if(vdeptno = 40) then
        vdname := 'OPERATIONS';
    end if;
    
    dbms_output.put_line('���     �̸�      �μ���');
    dbms_output.put_line('----------------------------');
    dbms_output.put_line(' '||vempno||' '||vename||' '||vdname);
end;
/

--[2022�� 6�� 21��(ȭ) �ǽ�]

set serveroutput on;

-- ���� 5
declare
    vemp emp%rowtype;
    annsal number(7,2);
begin
    select * 
    into vemp
    from emp
    where ename = 'WARD';
if(vemp.comm is null) then
    annsal := vemp.sal * 12;
else
    annsal := vemp.sal * 12 + vemp.comm;
end if;
    dbms_output.put_line('���    �̸�      ����');
    dbms_output.put_line('------------------------');
    dbms_output.put_line(' '||vemp.empno||' '||vemp.ename||' '||annsal);
end;
/


-- ����ó����
-- (1) if ~ endif

declare
    v_condition number := 1;
begin
    if v_condition = 1 then
    dbms_output.put_line('����');
    end if;
end;
/

-- (2) if ~ else ~ end if
declare
    v_condition number := 1;
    begin
    if v_condition > 1 then
        dbms_output.put_line('����');
    else
        dbms_output.put_line('�츮');
    end if;
end;
/

-- (3) if ~ elseif ~ else ~ end if
declare
    v_condition number := 2;
    begin
    if v_condition < 1 then
        dbms_output.put_line('����');
    elsif v_condition = 1 then
        dbms_output.put_line('�α�');
    else
        dbms_output.put_line('����');
    end if;
end;
/

-- �ݺ�ó����
-- (1) loop ~ end loop

declare
    v_cnt number := 0;
    v_sum number := 0;
begin
    loop
        v_cnt := v_cnt + 1;
        v_sum := v_sum + v_cnt;
        dbms_output.put_line(v_cnt || ' ' || v_sum);
        exit when v_cnt = 10;
    end loop;
end;
/

-- (2) for ~ end loop

declare
    v_cnt number := 0;
    v_sum number := 0;
begin
   for v_cnt in 1..10 loop
        v_sum := v_sum + v_cnt;
        dbms_output.put_line(v_cnt || ' ' || v_sum);
        exit when v_cnt = 10;
    end loop;
end;
/

-- (2) for ~ end loop

declare
    v_cnt number := 0;
    v_sum number := 0;
begin
   while v_cnt < 10 loop 
        v_cnt := v_cnt + 1;
        v_sum := v_sum + v_cnt;
        dbms_output.put_line(v_cnt || ' ' || v_sum);
        exit when v_cnt = 10;
    end loop;
end;
/

-- BASIC LOOP ��(1���� 5���� ����ϱ�)
declare
    n number := 1;
begin
        loop
        dbms_output.put_line(n);
        n := n + 1;
        if n > 5 then
            exit;
        end if;
    end loop;
end;
/

-- FOR LOOP ��(1���� 5���� ����ϱ�)
declare
    n number := 1;
begin
        for n in 1..5 loop
        dbms_output.put_line(n);
    end loop;
end;
/

-- FOR LOOP ��(1���� 5���� ����ϱ�)
declare
    n number := 1;
begin
        while n < 6 loop
        dbms_output.put_line(n);
        n := n + 1;
    end loop;
end;
/

-- ����1 (������ 5�� ���ϱ�)
declare
    dan number := 5;
    i number := 1;
begin
        loop
        dbms_output.put_line(dan || ' * ' || i || ' = ' || (dan*i));
        i := i + 1;
        if i > 9 then
            exit;
        end if;
    end loop;
end;
/

-- ����1 FOR (������ 5�� ���ϱ�)
declare
    dan number := 5;
    i number := 1;
begin
        for i in 1..9 loop
        dbms_output.put_line(dan || ' * ' || i || ' = ' || (dan*i));
    end loop;
end;
/

-- ����1 WHILE (������ 5�� ���ϱ�)
declare
    dan number := 5;
    i number := 1;
begin
         while i < 10 loop
        dbms_output.put_line(dan || ' * ' || i || ' = ' || (dan*i));
        i := i + 1;
    end loop;
end;
/

-- ���� 2
declare 
    v_cnt number := 1;
    v_str varchar2(10) := null;
begin
    while v_cnt <= 5 loop
        v_str := v_str || '*';
        dbms_output.put_line(v_str);
        v_cnt := v_cnt + 1;
    end loop;
end;
/

-- ���� 3
select &list
from &tab
where rownum < 5;

--���� 4
create table pl_test2
(no number, 
name varchar2(10),
addr varchar2(10)
);

-- ������ 3�� ���� (���� �� �Է� ������ : 1, a, a     2, b, b     3, c, c)
declare
    v_no number := '&no';
    v_name varchar(10) := '&name';
    v_addr varchar(10) := '&addr';
begin
    insert into pl_test2
    values(v_no, v_name, v_addr);
end;
/

select * from pl_test2;

-- ������ ����
begin
    update pl_test2
    set name = 'KKK'
    where no = 1;
end;
/

select * from pl_test2;

-- ������ ����
begin
    delete from pl_test2
    where no = 3;
end;
/
select * from pl_test2;

--pl_test2 ���̺��� no = 2 �� �̸�('ȫ�浿')�� �ּ�('�սʸ�')�� �����Ͻÿ�.
begin
    update pl_test2
    set name = 'ȫ�浿'
    , addr = '�սʸ�'
    where no = 2;
end;
/
select * from pl_test2;
 

-- test1 : subject�� ������ �Է��ϱ�
-- �Է��� �����, ����, �г�, �а�, ������ ������ �����ȣ ������ȣ�� �Է��ϴ�
-- ���ν��� ����
create procedure test1 
(v_sub_name in subject.sub_name%type,
v_sub_prof in subject.sub_prof%type,
v_sub_grade in subject.sub_grade%type,
v_sub_dept in subject.sub_dept%type)
is
v_sub_no subject.sub_no%type;
begin
select max(sub_no)
into v_sub_no
from subject;
v_sub_no := to_number
(v_sub_no)+1;
insert
into subject
values(v_sub_no,v_sub_name,v_sub_prof,v_sub_grade,v_sub_dept);
commit;
end test1; 
/

select * from subject;

execute test1('��ǻ�ͱ���','���ֺ�',2,'��ǻ������');

select * from test1;

-- ����
select * from emp12;

create or replace procedure del_all
is
begin
    delete from emp12;
    commit;
end;
/

execute del_all;

select * from emp12;

--test2 : �й�, �г��� �Է����� �л��� �г��� ����
create or replace procedure test2
(v_stu_no in student.stu_no%type,v_stu_grade in student.stu_grade%type)
is 
begin
    update student 
    set stu_grade = v_stu_grade
    where stu_no = v_stu_no;
end test2;
/
select * from student where stu_no = 20153075;

execute test2(20153075,2);

select * from student where stu_no = 20153075;


--test3 : �й��� �Է����� �л��� �̸��� �˻�
create or replace procedure test3
(v_stu_no in student.stu_no%type,
v_stu_name out student.stu_name%type)
is
begin
    select stu_name
    into v_stu_name
    from student
    where stu_no = v_stu_no;
end test3;
/

select * from student;

variable d_stu_name varchar2(12);

execute test3(20153075,:d_stu_name);
execute test3(20132003,:d_stu_name);

print d_stu_name;

--test4 : �л��� ������ ���� ������ƴ �÷��ִ� ���ν���

create or replace procedure test4
(v_sub_no in enrol.sub_no%type,
v_stu_no in enrol.stu_no%type,
v_enr_grade in out enrol.enr_grade%type)
is
begin
    update enrol
    set enr_grade = enr_grade + v_enr_grade
    where stu_no = v_stu_no and sub_no = v_sub_no;
    select enr_grade
    into v_enr_grade
    from enrol
    where stu_no = v_stu_no and sub_no = v_sub_no;
end test4;
/

select * from enrol where stu_no = 20131001 and sub_no = 101;

--�ϳ��� ��� ����
variable d_enr_grade number
begin 
    :d_enr_grade := 10;
end;
/


execute test4(101,20131001,:d_enr_grade);

print d_enr_grade;

-- test5 : ���� �߰�, ���� ��ȣ�� ������ �ԷµǴ� ������� �ο�
drop sequence seq1;

create sequence seq1
increment by 1
start with 201
maxvalue 999;

create or replace procedure test5
(v_sub_name in subject.sub_name%type,
v_sub_prof in subject.sub_prof%type,
v_sub_grade in subject.sub_grade%type,
v_sub_dept in subject.sub_dept%type)
is
begin
    insert into subject
    values(seq1.nextval, v_sub_name, v_sub_prof, v_sub_grade, v_sub_dept);
commit;
end test5;
/

select * from subject order by 1;

execute test5('��', 'ȫ�浿', 3, '��ǻ������');
execute test5('�ڹ����α׷���','��ö��',3,'��ǻ������');

select * from subject order by 1;

-- test6 : ����Ȯ��
-- ������ ���� ����� �ű�� �ش� ���� ��ȯ�ϴ� �Լ� ����
create or replace function test6
(v_enr_grade in number)
return char
is 
    enr_score char;
begin
    if  v_enr_grade >= 90 then enr_score := 'A';
    elsif  v_enr_grade >= 80 then enr_score := 'B';
    elsif  v_enr_grade >= 70 then enr_score := 'C';
    elsif  v_enr_grade >= 60 then enr_score := 'D';
    else enr_score := 'F';
    end if;
    return (enr_score);
end test6;
/

variable d_score char;

execute :d_score := test6(95);

print d_score;

select enr_grade, test6(enr_grade) as score
from enrol
where stu_no = '20131001';


-- test7 : ���� ������(�й�)�� ���� �˻�
create or replace procedure test7
(v_stu_no in student.stu_no%type)
is
v_stu_name student.stu_name%type;
begin
    select stu_name
    into v_stu_name
    from student
    where stu_no = v_stu_no;
    dbms_output.put_line(v_stu_name);
exception
    when no_data_found then
    dbms_output.put_line('�ش� �����Ͱ� �����ϴ�.');
end test7;
/

execute test7(20153088);
execute test7(20153089);

-- test8 : ���� ������ �� �˻�
create or replace procedure test8
(v_sub_no in enrol.sub_no%type)
is
v_cnt number;
cnt_error exception;
begin
    select count(stu_no)
    into v_cnt
    from enrol
    where sub_no = v_sub_no;
    dbms_output.put_line(v_sub_no || ' ���� �����ڴ� ' ||  v_cnt || '���Դϴ�.');
if v_cnt = 0 then
    raise cnt_error;
end if;
exception
    when cnt_error then
        dbms_output.put_line('�����ڰ� �����ϴ�');
end test8;
/

execute test8(102);

execute test8(120);

-- test9 : ����� �Է� �޾Ƽ� ename, sal, job ����ϱ�
create or replace procedure test9
(v_empno in emp.empno%type,
v_ename out emp.ename%type,
v_sal out emp.sal%type,
v_job out emp.job%type)
is
begin
    select ename, sal, job
    into v_ename, v_sal, v_job
    from emp
    where empno = v_empno;
end test9;
/

variable var_ename varchar2(15);
variable var_sal number;
variable var_job varchar2(9);

execute test9(7369, :var_ename, :var_sal, :var_job);

print var_ename;
print var_sal;
print var_job;

-- ���� (Ư�����ʽ� �����ϱ� ���� �Լ� �ۼ�, ���ʽ��� �޿��� 200%�� �����Ѵ�.)
create or replace function cal_bonus
(v_empno in emp.empno%type)
return number
is
v_sal number(7,2);
begin
    select sal
    into v_sal
    from emp
    where empno = v_empno;
    
    return (v_sal*2);
end;
/

select sal from emp where empno = '7369';

variable var_res number;
execute :var_res := cal_bonus(7369);
print var_res;

select sal, cal_bonus(7369)
from emp
where empno = 7369;

create table student2
as
select * from student;

select * from student2;

create or replace procedure del_name
(v_stu_name student2.stu_name%type)
is
begin
    delete from student2
    where stu_name like v_stu_name;
    commit;
end;
/

select * from student2;
execute del_name('��%');
select * from student2;


-- [2022�� 6�� 22�� (��) �ǽ�]

set serveroutput on;

-- ���� ���̺��� �߰��ϴ� ���ν����� �����Ͻÿ�.

create or replace procedure p_insert_enrol
(v_sub_no in enrol.sub_no%type,
v_stu_no in enrol.stu_no%type,
v_enr_grade in enrol.enr_grade%type)
is
v_sub_no1 enrol.sub_no%type;
v_stu_no1 enrol.stu_no%type;
begin
    select sub_no
    into v_sub_no1
    from subject
    where sub_no = v_sub_no;
    
    select stu_no
    into v_stu_no1
    from student
    where stu_no = v_stu_no;

insert into enrol(sub_no, stu_no, enr_grade)
values(v_sub_no, v_stu_no, v_enr_grade);
commit;

dbms_output.put_line('�й� ' || v_stu_no || '���� ' ||
v_sub_no || '�� ������ ' || v_enr_grade || '������ �߰��Ǿ����ϴ�.');

exception
    when no_data_found then
    dbms_output.put_line('���Ἲ�� ����˴ϴ�.');
    when dup_val_on_index then
    dbms_output.put_line('�����Ͱ� �����մϴ�.');
    when others then
    dbms_output.put_line('�����Դϴ�.');
    rollback;
end p_insert_enrol;
/

select * from enrol;

execute p_insert_enrol('111',20153088,70);


-- ��ǰ(product) ���̺��� ����
create table product
(p_code char(3) not null,
p_name varchar2(30),
p_cost number,
p_group varchar2(30),
constraint p_code_pk primary key(p_code));

-- ��ǰ�� �����ϴ� ���ν����� �����Ͻÿ�.

create or replace procedure p_product_insert
(v_p_code in product.p_code%type,
v_p_name in product.p_name%type,
v_p_cost in product.p_cost%type,
v_p_group in product.p_group%type)
is
v_cnt number(9);
p_code_error exception;
begin
    select count(*)
    into v_cnt
    from product
    where p_code = v_p_code;
    
    -- ���� ��ǰ�ڵ尡 �ִ��� Ȯ��
if v_cnt > 0 then
    raise p_code_error;
end if;

insert into product(p_code, p_name, p_cost, p_group)
values(v_p_code, v_p_name, v_p_cost, v_p_group);
commit;
dbms_output.put_line('�Ϸ�Ǿ����ϴ�.');

exception
    when p_code_error then
    dbms_output.put_line('���� ��ǰ �ڵ尡 �����մϴ�.');
    when others then
    dbms_output.put_line('�����Դϴ�.');
    rollback;
end p_product_insert;
/

execute p_product_insert('403', '7.1ä�� ����Ŀ', 180000, '����Ŀ');
execute p_product_insert('404', '30��ġ �����', 280000, '�����');
select * from product;
select * from tabs;
select * from DBA_TABLES;
select * from DBA_VIEWS;

-- [2022�� 6�� 23�� (��) �ǽ�] 
select * from test;

create table EVENT(
UNAME varchar2(30),
EMAIL varchar2(50)
);
select * from event;

--�ڹٿ� ����(BOOKS ���̺�)
create table BOOKS(
BOOK_ID number not null primary key,
TITLE varchar2(50),
PUBLISHER varchar2(30),
YEAR varchar2(10),
PRICE number
);

create sequence book_no_seq increment by 1 start with 1;

insert into books(book_id,title,publisher,year,price)
values(book_no_seq.nextval, 'Operating System Concepts','Wiley','2003',30700);
insert into books(book_id,title,publisher,year,price)
values(book_no_seq.nextval, 'Head First PHP and MYSQL','Oreilly','2009',58000);
insert into books(book_id,title,publisher,year,price)
values(book_no_seq.nextval, 'C Programming Language','Prentice-Hall','1989',35000);
insert into books(book_id,title,publisher,year,price)
values(book_no_seq.nextval, 'Head First SQL','Oreilly','2007',43000);

-- �ݵ�� ����
commit;

select * from books;
  
delete from books;


--�ڹٿ� SCORES ���̺� ����
CREATE TABLE SCORES(
NAME VARCHAR2(10),
SCORE NUMBER
);

select * from scores;

-- �ڹٿ� PRODUCT ���̺� ����

create table product(
prcode number(11,0) not null primary key,
prname varchar2(45) not null,
price number(11,0) not null,
manufacture varchar2(20) not null
);

create sequence prcode_seq increment by 1 start with 1;

select * from product;

insert into product(prcode, prname, price, manufacture) values(prcode_seq.nextval,'1',1,'4');

insert into books(book_id,title,publisher,year,price) values(book_no_seq.nextval, 'Head First SQL','Oreilly','2007',43000);
































