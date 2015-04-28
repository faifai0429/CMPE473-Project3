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
		
		// New entity 
		Weather weather = new Weather();
		weather.setLocation("United State");
		weather.setDateTime("2015-02/03 00:00:00");
		weather.setTemperature(25);
		
		em.getTransaction().begin();
		em.persist(weather);
		em.flush();
		System.out.println(weather.getId());
		em.getTransaction().commit();
		
		// Update entity
//		Weather weather = em.find(Weather.class, 1);	//get entity by id;
//		em.getTransaction().begin();
//		/* Do the changes here */
//		weather.setTemperature(25.0);
//		/* Do the changes here */
//		em.getTransaction().commit();
		 
		// Remove entity
//		Weather weather = em.find(Weather.class, 1);	//get entity by id;
//		em.getTransaction().begin();
//		em.remove(weather);	//remove the entity
//		em.getTransaction().commit();
		 
		// query entity
//		TypedQuery<Weather> query = em.createQuery("SELECT w FROM Weather w", Weather.class);
//		for(Weather result : query.getResultList()) {
//			System.out.println(result.getId());
//		};
		
	}
}
