package com.br.springbootparty.entiteis;

import com.br.springbootparty.constants.PoliticalOfficeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "ASSOCIATE")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssociateEntity {

    @Id
    @Column(name = "ID_ASSOCIATE", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String idAssociate;

    @Column(name = "POLITICAL_OFFICE", nullable = false)
    private PoliticalOfficeEnum politicalOffice;

    @Column(name = "FULL_NAME", nullable = false)
    private String fullName;

    @Column(name = "SEX", nullable = false)
    private String sex;

    @Column(name = "BIRTHDAY", nullable = false)
    private LocalDate birthday;

    public AssociateEntity(String idAssociate, PoliticalOfficeEnum politicalOffice,
                           String fullName, String sex, LocalDate birthday) {
        this.idAssociate = idAssociate;
        this.politicalOffice = politicalOffice;
        this.fullName = fullName;
        this.sex = sex;
        this.birthday = birthday;
    }

    public String getIdAssociate() {
        return idAssociate;
    }

    public void setIdAssociate(String idAssociate) {
        this.idAssociate = idAssociate;
    }

    public PoliticalOfficeEnum getPoliticalOffice() {
        return politicalOffice;
    }

    public void setPoliticalOffice(PoliticalOfficeEnum politicalOffice) {
        this.politicalOffice = politicalOffice;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AssociateEntity that)) return false;
        return idAssociate.equals(that.idAssociate)
                && politicalOffice == that.politicalOffice
                && fullName.equals(that.fullName)
                && sex.equals(that.sex)
                && birthday.equals(that.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAssociate, politicalOffice, fullName, sex, birthday);
    }
}
