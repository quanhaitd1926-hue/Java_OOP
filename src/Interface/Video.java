package Interface;

public class Video implements Playable {

	private String title;
	private int duration;

	public Video(String title, int duration) {
		super();
		this.title = title;
		this.duration = duration;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing video: " + this.title + "[" + this.duration + "] seconds");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("Pausing title: " + this.title);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

}
