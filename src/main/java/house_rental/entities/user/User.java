package house_rental.entities.user;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;

import lombok.Data;


@MappedSuperclass
@Data
public abstract class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	@Column 
	private String name, surname;
	@Column 
	@Email
	private String email;
	@Column
	@Min(value = 6)
	private String password;
	
}
