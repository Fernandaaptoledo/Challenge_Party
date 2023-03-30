package com.br.springbootparty.dto.request;

import com.br.springbootparty.constants.PoliticalOfficeEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
public class AssociateRequestDTO {

    private PoliticalOfficeEnum politicalOffice;

    private String fullName;

    private String sex;

    @JsonFormat(pattern = "yyyy/MM/dd")
    private LocalDate birthday;
}
