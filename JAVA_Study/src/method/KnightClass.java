package method;

public class KnightClass {
	public void skill(int level)
	{
		CharClass charClass = new CharClass();
		
		boolean islevel = false;
		if(charClass.userLevel(level) >= 5) {
			islevel = true;
		}
		else islevel = false;
		if(islevel == true) {
			System.out.println("���ݽ�ų �ߵ�!!!");
		}
		else System.out.println("������ ���ڶ��ϴ�!!!");
	}
}
