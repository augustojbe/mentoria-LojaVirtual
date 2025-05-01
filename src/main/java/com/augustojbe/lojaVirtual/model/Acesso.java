package com.augustojbe.lojaVirtual.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "acesso")
@SequenceGenerator(name = "seq_acesso", sequenceName = "seq_acesso", allocationSize = 1, initialValue = 1)
@Entity
public class Acesso implements GrantedAuthority {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_acesso" )
    private Long id;

    @Column(nullable = false)
    private String descricao;


    @Override
    public String getAuthority() {
        return this.descricao;
    }
}
