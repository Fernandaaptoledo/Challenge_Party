package com.br.springbootparty.entiteis;


import com.br.springbootparty.constants.IdeologyEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "PARTY")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PartyEntity {

         @Id
         @Column(name = "ID_PARTY", nullable = false)
         @GeneratedValue()
         private UUID idParty = UUID.randomUUID();

        @Column(name = "IDEOLOGY", nullable = false)
        private IdeologyEnum ideology;

        @Column(name = "PARTY_NAME", nullable = false)
        private String partyName;

        @Column(name = "ACRONYM", nullable = false)
        private String acronym;

        @Column(name = "FOUNDATION_DATE", nullable = false)
        private LocalDate foundationDate;


}
