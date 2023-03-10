package com.br.springbootparty.dto.response;


import com.br.springbootparty.constants.IdeologyEnum;
import lombok.Builder;
import lombok.Data;
import java.time.LocalDate;
import java.util.UUID;


@Data
@Builder
public class PartyResponseDTO {
    private UUID idParty;

    private IdeologyEnum ideology;

    private String partyName;

    private String acronym;

    private LocalDate foundationDate;

}
