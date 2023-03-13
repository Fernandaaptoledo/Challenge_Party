package com.br.springbootparty.entiteis;

import com.br.springbootparty.constants.PoliticalOfficeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "ASSOCIATE")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssociateEntity {

    @Id
    @Column(name = "ID_ASSOCIATE", updatable = false, unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idAssociate = UUID.randomUUID();

    @Column(name = "POLITICAL_OFFICE", nullable = false)
    private PoliticalOfficeEnum politicalOffice;

    @Column(name = "FULL_NAME", nullable = false)
    private String fullName;

    @Column(name = "SEX", nullable = false)
    private String sex;

    @Column(name = "BIRTHDAY", nullable = false)
    private LocalDate birthday;


}
