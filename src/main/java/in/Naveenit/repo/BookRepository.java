package in.Naveenit.repo;



import org.springframework.data.repository.CrudRepository;

import in.Naveenit.entity.Book;



public interface BookRepository<BookRepository> extends  CrudRepository<Book,Integer> {

	
}
