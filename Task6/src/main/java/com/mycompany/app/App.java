package com.mycompany.app;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mycompany.app.embeddables.NewsId;
import com.mycompany.app.entities.*;
import com.mycompany.app.enums.CreditCardType;
import com.mycompany.app.workers.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");

		/*
		App.testLectures(context);
		App.testBook(context);
		App.testCd(context);

		App.testNews(context);

		Address adrs = App.testAddress(context);
		App.testCustomer(context,adrs);

		App.testTrack(context);
		App.testCreditCard(context);*/
		App.testOneToMany(context);
		App.testManyToMany(context);
	}


	private static void testLectures(ApplicationContext context){
		Lecture lecture = new Lecture();
		lecture.setName("Introduction to Spring KMA");
		lecture.setCredits(2.5);

		LecturesWorker worker = (LecturesWorker)context.getBean("lecturesWorker");
		worker.addLecture(lecture);
	}

	private static void testBook(ApplicationContext context){
		Book book = new Book();
		book.setTitle("C++");
		book.setPrice(2.5f);
		book.setDescription("Awesome Book");

		BookWorker worker = (BookWorker)context.getBean("bookWorker");
		worker.addBook(book);
	}

	private static void testCd(ApplicationContext context){
		CD cd = new CD();
		cd.setPrice(2.5f);
		cd.setDescription("Awesome CD");
		cd.setCover("Cover".getBytes());
		cd.setTitle("Super-puper");

		CdWorker worker = (CdWorker) context.getBean("cdWorker");
		worker.addCD(cd);
	}

	private static void testNews(ApplicationContext context){
		News news = new News(new NewsId("Breaking News" + new Date().toString(),"eng"), "Dog became president");
		NewsWorker worker = (NewsWorker) context.getBean("newsWorker");

		worker.addNews(news);
	}

	private static Address testAddress(ApplicationContext context){
		Address adrs = new Address("first","second","Kiev","Kiev State", "21520", "Ukraine");
		adrs.setId((long) 125 + new Date().getTime());
		AddressWorker worker = (AddressWorker) context.getBean("addressWorker");

		worker.addAddress(adrs);
		return adrs;
	}

	private static void testCustomer(ApplicationContext context, Address adrs){
		Customer cts = new Customer("Dan", "Tsk", "dan@dan.com", "380987654321", new Date(1998,6,3));
		cts.setAddress(adrs);

		CustomerWorker worker = (CustomerWorker) context.getBean("customerWorker");

		worker.addCustomer(cts);
	}

	private static void testTrack(ApplicationContext context){
		Track track = new Track("Awesome","Amazing",2.5f,"La la la".getBytes());
		TrackWorker worker = (TrackWorker) context.getBean("trackWorker");

		worker.addTrack(track);
	}

	private static void testCreditCard(ApplicationContext context){
		CreditCard ccd = new CreditCard("123","123",123, CreditCardType.AMERICAN_EXPRESS );
		CreditCardWorker worker = (CreditCardWorker) context.getBean("cardWorker");

		worker.addCustomer(ccd);
	}

	private static void testOneToMany(ApplicationContext context){
		List<OrderLine> ordLine  = new ArrayList<OrderLine>();
		ordLine.add(new OrderLine("dog", 1, 200.2));
		ordLine.add(new OrderLine("cat", 2, 111.1));

		OrderLineWorker orderLineWorker = (OrderLineWorker) context.getBean("orderLineWorker");
		orderLineWorker.addOrder(ordLine.get(0));
		orderLineWorker.addOrder(ordLine.get(1));

		Order ord = new Order();
		ord.setTitle("Awesome order");
		ord.setOrderLines(ordLine);

		OrderWorker orderWorker = (OrderWorker) context.getBean("orderWorker");
		orderWorker.addOrder(ord);
	}

	private static void testManyToMany(ApplicationContext context){
		Artist art = new Artist();
		art.setFirstName("Dan");
		art.setLastName("Tsk");

		ArtistsWorker worker = (ArtistsWorker) context.getBean("artistsWorker");
		worker.addArtist(art);

		List<Artist> arts = new ArrayList<Artist>();
		arts.add(art);

		CD cd = new CD();
		cd.setPrice(2.5f);
		cd.setDescription("Awesome CD");
		cd.setCover("Cover".getBytes());
		cd.setTitle("Super-puper-artists");
		cd.setCreatedByArtists(arts);

		CdWorker worker1 = (CdWorker) context.getBean("cdWorker");
		worker1.addCD(cd);
	}
}
