package method;

public class CharClass {		
	public void userName(String userName) {
		System.out.println("�������"+userName+"��.");
 
	}
	public void userName() {
		this.userName("�̸�����");
	}
	public void userName(int userName) {
		this.userName("�߸��Ȱ�");
	}
	
	
	public int userLevel(int level) {
		return level;
	}
}
