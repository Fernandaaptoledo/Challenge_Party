package com.br.springbootparty.service;

import com.br.springbootparty.constants.IdeologyEnum;
import com.br.springbootparty.dto.request.PartyRequestDTO;
import com.br.springbootparty.dto.response.PartyResponseDTO;
import com.br.springbootparty.entiteis.PartyEntity;
import com.br.springbootparty.hanlde.exception.IdeologyException;
import com.br.springbootparty.repository.PartyRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PartyService{

    private final PartyRepository partyRepository;

    private final ModelMapper modelMapper;

    public PartyResponseDTO save(PartyRequestDTO partyRequestDTO) throws  IdeologyException {
        if (!IdeologyEnum.RIGTH.value().equalsIgnoreCase(partyRequestDTO.getIdeology().value()) &&
                !IdeologyEnum.CENTER.value().equalsIgnoreCase(partyRequestDTO.getIdeology().value()) &&
                !IdeologyEnum.LEFT.value().equalsIgnoreCase(partyRequestDTO.getIdeology().value())
        ) {
            throw new IdeologyException("Ideology" + partyRequestDTO.getIdeology() + "should to bem Rigth, Center or Left");
        }
        PartyEntity partyEntity = modelMapper.map(partyRequestDTO, PartyEntity.class);
        partyRepository.save(partyEntity);
        return modelMapper.map(partyEntity, PartyResponseDTO.class);
    }
}