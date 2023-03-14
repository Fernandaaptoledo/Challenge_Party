package com.br.springbootparty.dto.response;


import com.br.springbootparty.constants.IdeologyEnum;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;


@Data
@Builder
public class PartyResponseDTO {
    private Long idParty;

    private IdeologyEnum ideology;

    private String partyName;

    private String acronym;

    private LocalDate foundationDate;



}
