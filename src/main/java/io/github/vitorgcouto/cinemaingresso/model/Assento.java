package io.github.vitorgcouto.cinemaingresso.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"fileira","numero","sala_id"}))
@Getter
@Setter
@NoArgsConstructor
public class Assento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String fileira;
    @Column(nullable = false)
    private Integer numero;
    @ManyToOne
    @JoinColumn(name = "sala_id", nullable = false)
    private Sala sala;
}
