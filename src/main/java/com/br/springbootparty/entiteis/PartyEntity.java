package com.br.springbootparty.entiteis;


import com.br.springbootparty.constants.IdeologyEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "PARTY")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PartyEntity {

         @Id
         @Column(name = "ID_PARTY", nullable = false)
         @GeneratedValue(strategy = GenerationType.AUTO)
         private Long idParty;

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

    public PartyEntity(IdeologyEnum ideology, String partyName,
                       String acronym, LocalDate foundationDate,
                       List<AssociateEntity> associate) {
        this.ideology = ideology;
        this.partyName = partyName;
        this.acronym = acronym;
        this.foundationDate = foundationDate;
        this.associate = associate;
    }

    public PartyEntity(Long idParty) {
        char initial ='p';
        long Party = 12345L;
    }

    public IdeologyEnum getIdeology() {
        return ideology;
    }

    public String getPartyName() {
        return partyName;
    }

    public String getAcronym() {
        return acronym;
    }

    public LocalDate getFoundationDate() {
        return foundationDate;
    }

    public List<AssociateEntity> getAssociate() {
        return associate;
    }

    public void setIdParty(Long idParty) {
        this.idParty = idParty;
    }

    public void setIdeology(IdeologyEnum ideology) {
        this.ideology = ideology;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public void setFoundationDate(LocalDate foundationDate) {
        this.foundationDate = foundationDate;
    }

    public void setAssociate(List<AssociateEntity> associate) {
        this.associate = associate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PartyEntity that)) return false;
        return idParty.equals(that.idParty) && ideology == that.ideology
                && partyName.equals(that.partyName)
                && acronym.equals(that.acronym)
                && foundationDate.equals(that.foundationDate)
                && associate.equals(that.associate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idParty, ideology, partyName, acronym, foundationDate, associate);
    }
}
