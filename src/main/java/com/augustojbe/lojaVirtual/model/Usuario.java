package com.augustojbe.lojaVirtual.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@SequenceGenerator(name = "seq_usuario", sequenceName = "seq_usuario", initialValue = 1, allocationSize = 1)
public class Usuario implements UserDetails {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_usuario")
    private Long id;

    @Column(nullable = false)
    private String login;

    @Column(nullable = false)
    private String senha;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataAtualSenha;

    @ManyToOne(targetEntity = Pessoa.class)
    @JoinColumn(name = "pessoa_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_fk"))
    private Pessoa pessoa;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "usuario_acesso",
            uniqueConstraints = @UniqueConstraint(
                    columnNames = {"usuario_id", "acesso_id"},
                    name = "unique_acesso_user"),
            joinColumns = @JoinColumn(name = "usuario_id", referencedColumnName = "id", table = "usuario",
                    unique = false, foreignKey = @ForeignKey(name = "usuario_fk", value = ConstraintMode.CONSTRAINT)),
            inverseJoinColumns = @JoinColumn(name = "acesso_id", unique = false, referencedColumnName = "id", table = "acesso",
                    foreignKey = @ForeignKey(name = "acesso_fk", value = ConstraintMode.CONSTRAINT) ))
    private List<Acesso> acessos;

    /* são os acessos, ou seja ROLE_ADMIN, ROLE_SECRETARIO, ROLE_FINANCEIRO */
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.acessos;
    }

    @Override
    public String getPassword() {
        return this.senha;
    }

    @Override
    public String getUsername() {
        return this.login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return UserDetails.super.isAccountNonExpired();
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
