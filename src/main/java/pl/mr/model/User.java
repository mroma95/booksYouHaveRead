package pl.mr.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String username;
    @Email
    @NotBlank
    private String email;
    @NotBlank
    private String password;
    @NotBlank
    @Transient
    private String matchPassword;
    @OneToMany
    private Set<Book> books;
    @ManyToMany
    Set<UserRole> userRoles = new HashSet<>();

    public User() {

    }

    public User(@NotBlank String username, @Email @NotBlank String email, @NotBlank String password, @NotBlank String matchPassword) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.matchPassword = matchPassword;
    }
}
