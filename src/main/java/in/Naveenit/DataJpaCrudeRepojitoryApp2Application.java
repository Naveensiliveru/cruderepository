package in.Naveenit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.Naveenit.entity.Book;
import in.Naveenit.repo.BookRepository;

@SpringBootApplication
public class DataJpaCrudeRepojitoryApp2Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext   ctxt=SpringApplication.run(DataJpaCrudeRepojitoryApp2Application.class, args);
		 BookRepository  repo = ctxt.getBean(BookRepository.class);
		 Book  b1 = new Book();
		
		  b1.setBookId(103);
		   b1.setBookName(" DevOps");
		 b1.setBookPrice(10000.00);
		 
		 Book  b2 = new Book();
		 b2.setBookId(104);
		 b2.setBookName("Rest Api");
		 b2.setBookPrice(6000.00);
		 List<Book> bookList= new ArrayList<>();
		 
		  repo.saveAll(Arrays.asList(b1,b2));
		  System.out.println("Record is count" +  repo.count());
		  boolean  status = repo.existsById(105);
		  System.out.println("Record Presence::"+status);
		   Optional<Book> s1=repo.findById(102);
		   if(s1.isPresent())
		  System.out.println(s1.get());
	}

}
