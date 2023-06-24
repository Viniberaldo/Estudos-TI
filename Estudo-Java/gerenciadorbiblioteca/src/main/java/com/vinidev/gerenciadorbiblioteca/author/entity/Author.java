package com.vinidev.gerenciadorbiblioteca.author.entity;

import com.vinidev.gerenciadorbiblioteca.books.entity.Book;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

/**
 *
 * @author viniberaldo
 */
@Entity
public class Author {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    
    @Column(nullable = false, unique = true)
    private String name;
    
    @Column
    private int age;
    
    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY)
    private List<Book> books;
}
