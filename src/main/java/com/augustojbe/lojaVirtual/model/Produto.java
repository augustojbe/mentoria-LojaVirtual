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

    @Column(name = "tipo_unidade")
    private String tipoUnidade;

    private String nome;

    private Boolean ativo = Boolean.TRUE;

    @Column(columnDefinition = "text", length = 2000)
    private String descricao;

    /* nota itm produto associar*/

    private Double peso;

    private Double altura;

    private Double profundidade;

    private BigDecimal valorVenda;

    @Column(name = "atd_estoque")
    private Integer qtdEstoque;

    @Column(name = "qtd_alerta_estoque")
    private Integer qtdAlertaEstoque;

    private String linkYoutube;

    @Column(name = "alerta_qtd_estoque")
    private Boolean alertaQtdEstoque = Boolean.FALSE;

    @Column(name = "qtd_clique")
    private Integer qtdClique = 0;


}
