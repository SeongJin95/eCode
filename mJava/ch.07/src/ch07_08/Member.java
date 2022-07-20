package ch07_08;

import java.util.ArrayList;

public class Member {
	private String userid;
	private String passwd;
	private String name;
	private String tel;
	private String email;
	
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Member [userid=" + userid + ", passwd=" + passwd + ", name=" + name + ", tel=" + tel + ", email=" + email + "]";
	}

	public static void main(String[] args) {
		ArrayList<Member> list = new ArrayList<>();
		//List<Member> list = new ArrayList<>();
		Member m1 = new Member();
		m1.setName("김철수");
		m1.setUserid("Kim");
		m1.setPasswd("1234");
		m1.setTel("02-999-8888");
		m1.setEmail("kim@gmail.com");
		list.add(m1);
		
		Member m2 = new Member();
		m2.setName("홍길동");
		m2.setUserid("hong");
		m2.setPasswd("2222");
		m2.setTel("02-988-5555");
		m2.setEmail("hong@daum.net");
		list.add(m2);
		
		System.out.println("이름\t아이디\t비번\t전화번호\t\t이메일");
		for(int i=0;i<list.size();i++) {
			Member m =list.get(i);
			System.out.println(m.getName()+"\t"+m.getUserid()+"\t"+m.getPasswd() + "\t" + m.getTel() + "\t" +m.getEmail());
		}
	}

	

}
