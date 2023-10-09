package com.luv2code.springbootlibrary.DAO;

import com.luv2code.springbootlibrary.entity.Book;
import com.luv2code.springbootlibrary.entity.Review;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.data.domain.Page;

public interface ReviewRepository extends JpaRepository<Review, Long>{
    Page<Review> findByBookId(@RequestParam("book_id") Long bookId,
                              Pageable pageable);
}
