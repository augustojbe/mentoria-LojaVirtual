package com.augustojbe.lojaVirtual.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "cup_desc")
@SequenceGenerator(name = "seq_cup_desc", sequenceName = "seq_cup_desc", allocationSize = 1, initialValue = 1)
@Entity
public class CupDesc  implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cup_desc" )
    private Long id;

    @Column(name = "cod_desc", nullable = false)
    private String codDesc;

    @Column(name = "valor_real_desc")
    private BigDecimal valorRealDesc;

    @Column(name = "valor_porcent_desc")
    private BigDecimal valorPorcentDesc;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_validade_cupom", nullable = false)
    private Date dataValidadeCupom;





}
