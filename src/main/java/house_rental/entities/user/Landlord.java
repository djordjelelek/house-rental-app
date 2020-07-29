package house_rental.entities.user;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import house_rental.entities.home.Flat;
import house_rental.entities.home.House;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table (name = "landlord")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Landlord extends User{
	@JsonIgnore
	@OneToMany(mappedBy = "landlord", fetch = FetchType.LAZY)
	private List<House> houses;
	@JsonIgnore
	@OneToMany(mappedBy = "landlord", fetch = FetchType.LAZY)
	private List<Flat> flats;
	@Column
	private int phoneNumber;
}
