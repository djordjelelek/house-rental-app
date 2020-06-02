package house_rental.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import house_rental.entities.user.Landlord;

@Repository
public interface LandlordRepository extends JpaRepository<Landlord, UUID>{

}
