package com.pi.CitoyenWebService;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface  CitoyenRepositry extends JpaRepository<Citoyen , Long> {
    Citoyen findByCin(String cin);

    List<Citoyen> findByPrenom(String prenom);


}
