package simeon;

public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV t1 = new TV();
		System.out.println("Channel: " + t1.channel + " Volume: " + t1.volume + " On: " + t1.on);
		t1.switchOn();
		t1.channelUp();
		t1.volumeDown();
		System.out.println("Channel: " + t1.channel + " Volume: " + t1.volume + " On: " + t1.on);
	}

}