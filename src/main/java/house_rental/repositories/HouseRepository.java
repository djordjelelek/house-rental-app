package house_rental.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import house_rental.entities.home.House;

@Repository
public interface HouseRepository  extends JpaRepository<House, UUID>{

}
