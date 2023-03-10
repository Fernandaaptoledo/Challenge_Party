package com.br.springbootparty.repository;

import com.br.springbootparty.entiteis.PartyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PartyRepository extends JpaRepository<PartyEntity, UUID>{
}
