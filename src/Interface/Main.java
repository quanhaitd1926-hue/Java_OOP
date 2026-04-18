package Interface;

public class Main {
	public static void main(String[] args) {
		Song mySong = new Song("Love Story", "Taylor Swift");
		Video myVideo = new Video("Interface", 1200);

		Playable[] play = { mySong, myVideo };
		for (Playable playable : play) {
			playable.play();
			playable.pause();
		}
	}

}
