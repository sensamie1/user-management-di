package user.management.dependency_injection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import user.management.dependency_injection.entity.User;
import user.management.dependency_injection.repository.UserRepository;

@Configuration
public class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(UserRepository userRepository) {
    return args -> {
      User user1 = userRepository.save(new User("Alice", "Smith", "alice.smith@example.com"));
      log.info("Preloading " + user1.getId() + " - " + user1);

      User user2 = userRepository.save(new User("Bob", "Johnson", "bob.johnson@example.com"));
      log.info("Preloading " + user2.getId() + " - " + user2);

      User user3 = userRepository.save(new User("Charlie", "Brown", "charlie.brown@example.com"));
      log.info("Preloading " + user3.getId() + " - " + user3);

      User user4 = userRepository.save(new User("Diana", "Prince", "diana.prince@example.com"));
      log.info("Preloading " + user4.getId() + " - " + user4);

      User user5 = userRepository.save(new User("Eve", "Davis", "eve.davis@example.com"));
      log.info("Preloading " + user5.getId() + " - " + user5);
  };
  }
}
