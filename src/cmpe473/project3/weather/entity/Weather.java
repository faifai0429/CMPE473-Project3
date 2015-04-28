package cmpe473.project3.weather.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Weather 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String location;
	private String dateTime;
	private double temperature_c;
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocation() {
		return this.location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getDateTime() {
		return this.dateTime;
	}
	
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public double getTemperature() {
		return this.temperature_c;
	}
	public void setTemperature(double temperature_c) {
		this.temperature_c = temperature_c;
	}
}
