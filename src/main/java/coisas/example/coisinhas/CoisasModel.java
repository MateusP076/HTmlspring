package coisas.example.coisinhas;

import java.util.UUID;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CoisasModel {
    @Id
    @GeneratedValue(generator="UUID")
    private UUID Id_user;
    private String nome;
    private String email;
    private String usuario;


}
