package interfacePrograms;

public class VideoPlayer implements AdvancedmediaPlayer
{
	String video;
	VideoPlayer(String video)
	{
		if(video.isEmpty())
		{
			System.err.println("Invalid");
			System.exit(0);
		}
		this.video=video;
	}
	@Override
	public void play() 
	{
		System.out.println("Palying Video: "+video);
	}

	@Override
	public void stop() 
	{
		System.out.println("Stopping Video: "+video);
	}

	@Override
	public void pause() 
	{
		System.out.println("Pausing Video: "+video);
	}
}
