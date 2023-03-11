package com.br.springbootparty.service;

import com.br.springbootparty.constants.PoliticalOfficeEnum;
import com.br.springbootparty.dto.request.AssociateRequestDTO;
import com.br.springbootparty.dto.response.AssociateResponseDTO;
import com.br.springbootparty.entiteis.AssociateEntity;
import com.br.springbootparty.exception.PoliticalOfficeException;
import com.br.springbootparty.repository.AssociateRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AssociateService {

    private final AssociateRepository associateRepository;

    private final ModelMapper modelMapper;

    public AssociateResponseDTO save(AssociateRequestDTO associateRequestDTO) throws PoliticalOfficeException {
        if (!PoliticalOfficeEnum.ALDERMAN.value().equalsIgnoreCase(associateRequestDTO.getPoliticalOffice().value()) &&
                !PoliticalOfficeEnum.MAYOR.value().equalsIgnoreCase(associateRequestDTO.getPoliticalOffice().value()) &&
                !PoliticalOfficeEnum.STATE_DEPUTY.value().equalsIgnoreCase(associateRequestDTO.getPoliticalOffice().value()) &&
                !PoliticalOfficeEnum.FEDERAL_DEPUTY.value().equalsIgnoreCase(associateRequestDTO.getPoliticalOffice().value()) &&
                !PoliticalOfficeEnum.SENATOR.value().equalsIgnoreCase(associateRequestDTO.getPoliticalOffice().value()) &&
                !PoliticalOfficeEnum.GOVERNOR.value().equalsIgnoreCase(associateRequestDTO.getPoliticalOffice().value()) &&
                !PoliticalOfficeEnum.PRESIDENT.value().equalsIgnoreCase(associateRequestDTO.getPoliticalOffice().value()) &&
                !PoliticalOfficeEnum.NONE.value().equalsIgnoreCase(associateRequestDTO.getPoliticalOffice().value())
        ) {
            throw new PoliticalOfficeException("PoliticalOffice" + associateRequestDTO.getPoliticalOffice() + "should to bem Rigth, Center or Left");
        }
        AssociateEntity associateEntity= modelMapper.map(associateRequestDTO, AssociateEntity.class);
        associateRepository.save(associateEntity);
        return modelMapper.map(associateEntity, AssociateResponseDTO.class);
    }

}

