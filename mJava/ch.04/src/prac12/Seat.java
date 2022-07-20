package prac12;
//예약 목록 클래스
public class Seat {
	private String name;
	public Seat() {
		name = null;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) { 
		this.name = name;
	}
	public void cancel() { //예약 취소 했을 경우 초기화
		name = null;
	}
	public void reserve(String name) { //예약한 경우 이름 출력
		this.name = name;
	}
	public boolean isOccupied() { //예약한 사람이 존재하는지 판별
		if(name == null)
			return false;
		else {
			return true;
		}
	}
	public boolean match(String name) { //예약된 이름과 취소하려는 이름이 같은지 판별
		return(name.equals(this.name));
	}

}
