package coisas.example.coisinhas;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CoisasRepository extends JpaRepository<CoisasModel, UUID> {

}
