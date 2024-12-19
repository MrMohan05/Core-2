package interfacePrograms;

public class MusicPlayer implements AdvancedmediaPlayer
{

	String song;
	MusicPlayer(String song)
	{
		if(song.isEmpty())
		{
			System.err.println("Invalid");
			System.exit(0);
		}this.song=song;
		
	}
	@Override
	public void play() 
	{
		System.out.println("Palying Music: "+song);
	}

	@Override
	public void stop() 
	{
		System.out.println("Stopping Music: "+song);
	}

	@Override
	public void pause() 
	{
		System.out.println("Pausing music: "+song);
	}
	
}
