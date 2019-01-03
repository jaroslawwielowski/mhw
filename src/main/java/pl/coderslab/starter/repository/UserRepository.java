package pl.coderslab.starter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.starter.edtityes.User;


public interface UserRepository extends JpaRepository<User, Long> {

    public User getUserByConfirmationId(String confirmationId);

    public User getUserByEmail(String email);

    public User getUserByConfirmationOnlineId(String confirmationOnlineId);

    public User getUserById(Long id);

}
