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
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"sessao_id", "assento_id"}))
public class Ingresso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Assento assento;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusIngresso status;
    @ManyToOne
    private Usuario usuario;
    @Column(nullable = false, precision = 5, scale = 2)
    private BigDecimal valorPago;
    private LocalDateTime dataCompra;
    @JoinColumn(nullable = false)
    @ManyToOne
    private Sessao sessao;

}
