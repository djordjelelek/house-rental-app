package house_rental.entities.home;


import java.util.UUID;


import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonIgnore;

import house_rental.entities.user.Landlord;
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
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "landlord_id")
	private Landlord landlord;
	

}
