package method;

public class CharClass {		
	public void userName(String userName) {
		System.out.println("어서오세요"+userName+"님.");
 
	}
	public void userName() {
		this.userName("이름없음");
	}
	public void userName(int userName) {
		this.userName("잘못된값");
	}
	
	
	public int userLevel(int level) {
		return level;
	}
}
