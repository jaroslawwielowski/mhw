package pl.coderslab.starter.edtityes;

import org.hibernate.validator.constraints.URL;
import pl.coderslab.starter.enums.Sex;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@Table(name = "userDetails")
public class UserDetail {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @NotEmpty
    private int dayOfBirth;

//    @NotEmpty
    private String monthOfBirth;

//    @NotEmpty
    private int yearsOfBirth;

//    @OneToMany()
//    @URL(regexp = "^(http:\\/\\/www\\.|https:\\/\\/www\\.|http:\\/\\/|https:\\/\\/)?[a-z0-9]+([\\-\\.]{1}[a-z0-9]+)*\\.[a-z]{2,5}(:[0-9]{1,5})?(\\/.*)?$")
//    private List<Website> website;

    private String workplace;

    private String sex;

    private String developer;

    private String language;

    private String programmingLanguages;

    @Max(600)
    @Column(columnDefinition = "TEXT")
    private String description;

//    @ManyToMany(mappedBy = "user")
//    private String userFriends;

    private String country;

    private String city;


    public UserDetail() {
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(String programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(String monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getYearsOfBirth() {
        return yearsOfBirth;
    }

    public void setYearsOfBirth(int yearsOfBirth) {
        this.yearsOfBirth = yearsOfBirth;
    }

//    public List<Website> getWebsite() {
//        return website;
//    }
//
//    public void setWebsite(List<Website> website) {
//        this.website = website;
//    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }
}
