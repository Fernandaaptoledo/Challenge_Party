package com.br.springbootparty.dto.request;

import com.br.springbootparty.constants.PoliticalOfficeEnum;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class AssociateRequestDTO {

    private PoliticalOfficeEnum politicalOffice;

    private String fullName;

    private String sex;

    private LocalDate birthday;
}
