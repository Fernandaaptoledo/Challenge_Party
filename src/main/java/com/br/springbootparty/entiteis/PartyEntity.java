package com.br.springbootparty.entiteis;


import com.br.springbootparty.constants.IdeologyEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "PARTY")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PartyEntity {

         @Id
         @Column(name = "ID_PARTY", updatable = false, unique = true, nullable = false)
         @GeneratedValue(strategy = GenerationType.AUTO)
         private UUID idParty = UUID.randomUUID();

        @Column(name = "IDEOLOGY", nullable = false)
        private IdeologyEnum ideology;

        @Column(name = "PARTY_NAME", nullable = false)
        private String partyName;

        @Column(name = "ACRONYM", nullable = false)
        private String acronym;

        @Column(name = "FOUNDATION_DATE", nullable = false)
        private LocalDate foundationDate;

        @OneToMany(mappedBy = "party")
        private List<AssociateEntity> associate;

}
