package com.br.springbootparty.repository;


import com.br.springbootparty.entiteis.AssociateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AssociateRepository extends JpaRepository<AssociateEntity, UUID>{


}
