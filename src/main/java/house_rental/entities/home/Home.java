package house_rental.entities.home;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


import lombok.Data;

@MappedSuperclass
@Data
public abstract class Home {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	@Column
	private String country, city, neighborhood;
	@Column
	private int price;
	@Column
	private int sqm, numberOfRooms;
	@Column
	private boolean parking, airConditions;

}
