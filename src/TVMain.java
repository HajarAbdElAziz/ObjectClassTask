
class TV {

	int channel = 1;
	int volumeLevel = 1;
	boolean on;

	public TV() {
	}

	public void turnOn() {
		on = true;
	}

	public void turnOff() {
		on = false;
	}

	public void setChannel(int newChannel) {
		if (on && newChannel >= 1 && newChannel <= 120) {
			channel = newChannel;
		}
	}

	public void setVolume(int newVolumeLevel) {
		if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7) {
			volumeLevel = newVolumeLevel;
		}
	}

	public void channelUp() {
		if (on && channel < 120) {
			channel++;
		}
	}

	public void channelDown() {
		if (on && channel > 1) {
			channel--;
		}
	}

	public void volumeUp() {
		if (on && volumeLevel < 7) {
			volumeLevel++;
		}
	}

	public void volumeDown() {
		if (on && volumeLevel > 1) {
			volumeLevel--;
		}
	}

	public boolean isTVOn() {
		return on;
	}

	public int getTVChannel() {
		return channel;
	}

	public int getTVVolume() {
		return volumeLevel;
	}
}

public class TVMain {
	public static void main(String[] args) {
		TV homeTV = new TV();
		homeTV.turnOn();
		homeTV.setChannel(100);
		homeTV.setChannel(1000);
		homeTV.setVolume(3);
		homeTV.setVolume(8);
		homeTV.volumeUp();
		System.out.println("Home TV is: " + homeTV.isTVOn());
		System.out.println("Home TV channel is: " + homeTV.getTVChannel());
		System.out.println("Home TV volume is: " + homeTV.getTVVolume());

		TV workTV = new TV();
		workTV.turnOn();
		workTV.setChannel(10);
		workTV.setChannel(1000);
		workTV.channelUp();
		workTV.setVolume(6);
		workTV.setVolume(4);
		workTV.volumeDown();
		System.out.println("Work TV is: " + workTV.isTVOn());
		System.out.println("Work TV channel is: " + workTV.getTVChannel());
		System.out.println("Work TV volume is: " + workTV.getTVVolume());
		workTV.turnOff();
		workTV.channelUp();
		workTV.volumeDown();
		System.out.println("Work TV is: " + workTV.isTVOn());
		System.out.println("Work TV channel is: " + workTV.getTVChannel());
		System.out.println("Work TV volume is: " + workTV.getTVVolume());
	}
}