package com.br.springbootparty.contoller;


import com.br.springbootparty.dto.request.PartyRequestDTO;
import com.br.springbootparty.dto.response.PartyResponseDTO;
import com.br.springbootparty.service.PartyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PartyController {

    private final PartyService partyService;

    @PostMapping("/associates")
    public ResponseEntity<PartyResponseDTO> save(@RequestBody PartyRequestDTO partyRequestDTO){
        PartyResponseDTO partyResponseDTO = partyService.save(partyRequestDTO);
        return ResponseEntity.ok(partyResponseDTO);
    }

}
