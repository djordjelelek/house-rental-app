package house_rental.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import house_rental.entities.home.Flat;

@Repository
public interface FlatRepository extends JpaRepository<Flat, UUID>{

}
