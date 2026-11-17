package io.github.vitorgcouto.cinemaingresso.repository;

import io.github.vitorgcouto.cinemaingresso.model.Assento;
import io.github.vitorgcouto.cinemaingresso.model.Sala;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssentoRepository extends JpaRepository<Assento, Long> {
    boolean existsByFileiraAndNumeroAndSala(String fileira, Integer numero, Sala sala);


}
