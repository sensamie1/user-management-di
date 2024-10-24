package user.management.dependency_injection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import user.management.dependency_injection.entity.User;
import user.management.dependency_injection.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

  // Field-based injection
  @Autowired
  private UserRepository fieldInjectedRepository;

  private UserRepository constructorInjectedRepository;
  private UserRepository setterInjectedRepository;

  // Constructor-based injection (one constructore @Autowired unecessary)
  public UserService(UserRepository constructorInjectedRepository) {
    this.constructorInjectedRepository = constructorInjectedRepository;
  }

  // Setter-based injection
  @Autowired
  public void setUserRepository(UserRepository setterInjectedRepository) {
    this.setterInjectedRepository = setterInjectedRepository;
  }

  // Methods for the different injections (findAll)

  public List<User> getAllUsersFieldInjected() {
    return fieldInjectedRepository.findAll();
  }

  public List<User> getAllUsersConstructorInjected() {
    return constructorInjectedRepository.findAll();
  }

  public List<User> getAllUsersSetterInjected() {
    return setterInjectedRepository.findAll();
  }

  // Find user by ID using field-based injection
  public Optional<User> getUserByIdFieldInjected(Long id) {
    return fieldInjectedRepository.findById(id);
  }

  // Find user by ID using constructor-based injection
  public Optional<User> getUserByIdConstructorInjected(Long id) {
    return constructorInjectedRepository.findById(id);
  }

  // Find user by ID using setter-based injection
  public Optional<User> getUserByIdSetterInjected(Long id) {
    return setterInjectedRepository.findById(id);
  }

  // Saving a user

  public void saveUserFieldInjected(User user) {
    fieldInjectedRepository.save(user);
  }

  public void saveUserConstructorInjected(User user) {
    constructorInjectedRepository.save(user);
  }

  public void saveUserSetterInjected(User user) {
    setterInjectedRepository.save(user);
  }
}
