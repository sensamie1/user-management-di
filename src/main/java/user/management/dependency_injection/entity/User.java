package user.management.dependency_injection.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users", uniqueConstraints = {@UniqueConstraint(columnNames = "email")})
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank(message = "First name is mandatory")
  @Size(max = 50)
  @Column(name = "first_name", nullable = false, length = 50)
  private String firstName;

  @NotBlank(message = "Last name is mandatory")
  @Size(max = 50)
  @Column(name = "last_name", nullable = false, length = 50)
  private String lastName;

  @NotBlank(message = "Email is mandatory")
  @Email(message = "Email should be valid")
  @Size(max = 100)
  @Column(name = "email", nullable = false, unique = true, length = 100)
  private String email;

  public User(String firstName, String lastName, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }
}
