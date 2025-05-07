package com.augustojbe.lojaVirtual.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "produto")
@SequenceGenerator(name = "seq_produto", sequenceName = "seq_produto", allocationSize = 1, initialValue = 1)
@Entity
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_produto" )
    private Long id;

    @Column(name = "tipo_unidade", nullable = false)
    private String tipoUnidade;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private Boolean ativo = Boolean.TRUE;

    @Column(columnDefinition = "text", length = 2000, nullable = false)
    private String descricao;

    /* nota itm produto associar*/

    @Column(nullable = false)
    private Double peso;

    @Column(nullable = false)
    private Double altura;

    @Column(nullable = false)
    private Double profundidade;

    @Column(nullable = false)
    private BigDecimal valorVenda;

    @Column(name = "qtd_estoque", nullable = false)
    private Integer qtdEstoque = 0;

    @Column(name = "qtd_alerta_estoque")
    private Integer qtdAlertaEstoque = 0;

    private String linkYoutube;

    @Column(name = "alerta_qtd_estoque")
    private Boolean alertaQtdEstoque = Boolean.FALSE;

    @Column(name = "qtd_clique")
    private Integer qtdClique = 0;


}
