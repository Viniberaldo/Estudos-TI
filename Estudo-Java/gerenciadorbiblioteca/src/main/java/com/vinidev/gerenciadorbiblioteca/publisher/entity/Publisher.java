package com.vinidev.gerenciadorbiblioteca.publisher.entity;

import com.vinidev.gerenciadorbiblioteca.books.entity.Book;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author viniberaldo
 */
@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false, unique = true, length = 100)
    private String code;

    @Column(nullable = false, columnDefinition = "timestamp")
    private LocalDate foundationDate;

    @OneToMany(mappedBy = "publisher", fetch = FetchType.LAZY)
    private List<Book> books;

}
