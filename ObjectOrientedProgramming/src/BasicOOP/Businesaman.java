package BasicOOP;

public class Businesaman implements Richman, SocialWorker {
	int saving=0;

	@Override
	public void earnmony(int earn) {
		saving =saving+earn;
		System.out.println(saving);

	}

	@Override
	public void donation(int donation) {
		saving =saving-donation;
		System.out.println(saving );

	}

	@Override
	public void party(int party) {
		saving=saving-party;
		System.out.println(saving);

	}

	public static void main(String[] args) {
		Richman bm = new Businesaman();
		SocialWorker sw = new Businesaman();
		bm.donation(200);
		bm.earnmony(5000);
		bm.party(300);
		sw.helpToOthers(1000);
	}

	@Override
	public void helpToOthers(int help) {
		saving =saving-help;
		System.out.println(saving);
	

	}

	

}
