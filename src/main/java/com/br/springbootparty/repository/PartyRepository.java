package com.br.springbootparty.repository;

import com.br.springbootparty.entiteis.PartyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyRepository extends JpaRepository<PartyEntity, String>{

}
