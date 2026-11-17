package io.github.vitorgcouto.cinemaingresso.repository;

import io.github.vitorgcouto.cinemaingresso.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {

}
