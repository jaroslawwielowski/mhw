package pl.coderslab.starter.dto;

import org.hibernate.annotations.CreationTimestamp;
import pl.coderslab.starter.edtityes.User;
import pl.coderslab.starter.edtityes.UserDetail;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

import static javax.persistence.CascadeType.ALL;

public class UserDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    private LocalDateTime createDateTime;

    @NotBlank
    @NotEmpty
    private String firstName;

    @NotBlank
    @NotEmpty
    private String lastName;

    @NotBlank
    @NotEmpty
    @Email(regexp = ".+")
    @Column(unique=true)
    private String email;


    @NotEmpty
//    @Size(min = 2, max = 30, message = "hasło musi posiadac od 2 do 30 znaków")
    private String password;

    @OneToOne(fetch = FetchType.EAGER, cascade = ALL)
    @JoinColumn(name = "id_userDetails")
    private UserDetail userDetail;

    public UserDto(LocalDateTime createDateTime, @NotBlank @NotEmpty String firstName, @NotBlank @NotEmpty String lastName, @NotBlank @NotEmpty @Email(regexp = ".+") String email, @NotEmpty String password, UserDetail userDetail) {
        this.createDateTime = createDateTime;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.userDetail = userDetail;
    }

    public UserDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(LocalDateTime createDateTime) {
        this.createDateTime = createDateTime;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserDetail getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(UserDetail userDetail) {
        this.userDetail = userDetail;
    }

    public User toUser(){
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return user;
    }
}
