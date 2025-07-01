package com.Student.Library.Management.System.Repository;

import com.Student.Library.Management.System.Model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface BookRepository extends JpaRepository<Books,Integer> {
public Books findBybookId(int bookId);
}
