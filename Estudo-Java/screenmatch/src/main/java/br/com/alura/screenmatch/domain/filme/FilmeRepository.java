package br.com.alura.screenmatch.domain.filme;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author viniberaldo
 */
public interface FilmeRepository extends JpaRepository<Filme, Long> {
}
