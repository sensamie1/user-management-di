package user.management.dependency_injection.repository;

import org.springframework.stereotype.Repository;
import user.management.dependency_injection.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;


// import java.util.ArrayList;
// import java.util.List;
// import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
