package com.br.springbootparty.dto.response;

import com.br.springbootparty.constants.PoliticalOfficeEnum;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Builder
public class AssociateResponseDTO {
    private UUID idAssociate;

    private PoliticalOfficeEnum politicalOffice;

    private String fullName;

    private String sex;

    private LocalDate birthday;

}
