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
			System.out.println("공격스킬 발동!!!");
		}
		else System.out.println("레벨이 모자랍니다!!!");
	}
}
