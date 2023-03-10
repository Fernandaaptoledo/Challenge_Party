package com.br.springbootparty.dto.request;


import com.br.springbootparty.constants.IdeologyEnum;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class PartyRequestDTO {

    private IdeologyEnum ideology;

    private String partyName;

    private String acronym;

    private LocalDate foundationDate;

}
