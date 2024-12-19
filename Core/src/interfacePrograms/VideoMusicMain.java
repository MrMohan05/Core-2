package interfacePrograms;

public class VideoMusicMain 
{
	public static void main(String[] args) 
	{
		MusicPlayer m=new MusicPlayer("Life Song");
		m.play();
		m.pause();
		m.stop();
		System.out.println();
		VideoPlayer v=new VideoPlayer("Life Video");
		v.play();
		v.pause();
		v.stop();
	}
}
