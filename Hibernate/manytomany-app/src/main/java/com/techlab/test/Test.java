package com.techlab.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlab.entity.Actor;
import com.techlab.entity.Movie;

public class Test {
	public static void main(String args[]) {
//		Movie movieOne= new Movie();
//		movieOne.setId(1);
//		movieOne.setMovieName("Movie One");
//		
//		Movie movieTwo= new Movie();
//		movieTwo.setId(2);
//		movieTwo.setMovieName("Movie Two");
//		
//		Actor pawan = new Actor();
//		pawan.setId(1);
//		pawan.setActorName("Pawan");
//		
//		Actor karan = new Actor();
//		karan.setId(2);
//		karan.setActorName("Karan");
//		
//		Actor tanishq = new Actor();
//		tanishq.setActorName("Tanishq");
//		tanishq.setId(3);
//		
//		Set<Actor> movieOneActors= new HashSet<Actor>();
//		movieOneActors.add(pawan);
//		movieOneActors.add(karan);
//		
//		Set<Actor> movieTwoActors= new HashSet<Actor>();
//		movieTwoActors.add(pawan);
//		movieTwoActors.add(tanishq);
//		
//		movieOne.setActors(movieOneActors);
//		movieTwo.setActors(movieTwoActors);
//		
//		Set<Movie> pawanMovies= new HashSet<Movie>();
//		pawanMovies.add(movieOne);
//		pawanMovies.add(movieTwo);
//		
//		Set<Movie> karanMovies = new HashSet<>();
//		karanMovies.add(movieOne);
//		
//		Set<Movie> tanishqMovies= new HashSet<Movie>();
//		tanishqMovies.add(movieTwo);
//		
//		pawan.setMovies(pawanMovies);
//		karan.setMovies(karanMovies);
//		tanishq.setMovies(tanishqMovies);
//		
		Configuration cfg = new Configuration();
		SessionFactory sessionFactory = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
		Session session= sessionFactory.openSession();
		Transaction transaction =null;
		
		System.out.println("Read all:-");
		try {
			List<Actor> actors = new ArrayList<Actor>();
			List<Movie> movies = new ArrayList<Movie>();
			
			transaction = session.beginTransaction();
//			session.save(pawan);
//			session.save(karan);
//			session.save(tanishq);
//			session.save(movieOne);
//			session.save(movieTwo);
			actors = session.createQuery("from Actor").list();
			movies= session.createQuery("from Movie").list();
			printData(actors);
			printData(movies);
			transaction.commit();
			System.out.println("commit");
		} catch (HibernateException ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
			transaction.rollback();
		} finally {
			session.close();
		}
		
	}
	public static void  printData(List<?> list) {
		for (Object object : list) {
			System.out.println(object.toString());
		}
	}

}
