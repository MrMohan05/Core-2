package practice;

import java.util.function.Function;

public class SensorData 
{
	private double temp;
	private double humidity;
	public SensorData(double temp, double humidity) 
	{
		this.temp = temp;
		this.humidity = humidity;
	}
	public double getTemp()
	{
		return temp;
	}
	public void setTemp(double temp) 
	{
		this.temp = temp;
	}
	public double getHumidity() 
	{
		return humidity;
	}
	public void setHumidity(double humidity) 
	{
		this.humidity = humidity;
	}
	public static void main(String[] args) 
	{
		Function<SensorData, Double> f1=(obj)->
		{
			System.out.println("Tempreture :"+obj.getTemp());
			return obj.getTemp();
		};
		int t=25;
		Function<Double,Boolean> f2=(tp)->
		{
			if(tp>t)
			{
				return true;
			}
			return false;
		};
		System.out.println("Temp :"+f1.apply(new SensorData(50, 60)));
		System.out.println("True or False :"+f2.apply(50D));
	}
}
