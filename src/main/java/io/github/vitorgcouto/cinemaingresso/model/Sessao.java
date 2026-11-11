package io.github.vitorgcouto.cinemaingresso.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Sessao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private LocalDateTime horario;
    @Column(nullable = false, precision = 5, scale = 2)
    private BigDecimal valorIngresso;
    @ManyToOne
    @JoinColumn(name = "filme_id", nullable = false)
    private Filme filme;
    @ManyToOne
    @JoinColumn(name = "sala_id", nullable = false)
    private Sala sala;
}
