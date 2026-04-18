package Interface;

public class Song implements Playable {
	private String title, artist;

	public Song(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Play song: " + this.title + " by: " + this.artist);
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("Pausing song: " + this.title);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

}
