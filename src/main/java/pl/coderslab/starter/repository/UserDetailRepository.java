package pl.coderslab.starter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.starter.edtityes.User;
import pl.coderslab.starter.edtityes.UserDetail;


public interface UserDetailRepository extends JpaRepository<UserDetail, Long> {


}
