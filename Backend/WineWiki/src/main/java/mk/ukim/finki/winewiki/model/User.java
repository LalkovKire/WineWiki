package mk.ukim.finki.winewiki.model;

import jakarta.persistence.*;
import lombok.*;
import mk.ukim.finki.winewiki.model.enumerations.Role;
import org.hibernate.Hibernate;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "wine_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String first_name;

    private String last_name;

    private String username;

    private String password;

    private String email;

    @Enumerated(EnumType.STRING)
    private Role role;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDateTime date;

    public User(String first_name, String last_name, String username, String password, String email, LocalDateTime date) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.date = date;
    }

}
