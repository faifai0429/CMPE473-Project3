package cmpe473.project3.weather;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import cmpe473.project3.weather.entity.Weather;

public class WeatherMain 
{
	public static void main(String[] args)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("WeatherService");
		EntityManager em = emf.createEntityManager();
		
		Weather weather = new Weather();
		weather.setLocation("United State");
		weather.setDateTime("2015-02/03 00:00:00");
		weather.setTemperature(25);
		
		em.getTransaction().begin();
		em.persist(weather);
		em.getTransaction().commit();
		
//		TypedQuery<Weather> query = em.createQuery("SELECT w FROM Weather w", Weather.class);
//		for(Weather result : query.getResultList()) {
//			System.out.println(result.getId());
//		};
	}
}
