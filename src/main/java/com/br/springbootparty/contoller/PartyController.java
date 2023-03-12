package com.br.springbootparty.contoller;


import com.br.springbootparty.dto.request.PartyRequestDTO;
import com.br.springbootparty.dto.response.PartyResponseDTO;
import com.br.springbootparty.service.PartyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


@RestController
@RequiredArgsConstructor
public class PartyController {

    private final PartyService partyService;

    @PostMapping("/parties")
    public ResponseEntity<PartyResponseDTO> save(@RequestBody PartyRequestDTO partyRequestDTO) {
        PartyResponseDTO partyResponseDTO = partyService.save(partyRequestDTO);
        return ResponseEntity.ok(partyResponseDTO);
    }
    @GetMapping("/parties")
    public List <PartyResponseDTO> list() {
        return partyService.findAllParty();
    }

    @GetMapping(path = {"/parties/{id}"})
    public  PartyRequestDTO findByIdParty(@PathVariable("id")UUID idParty) {
        return (PartyRequestDTO) partyService.findAllParty(); }


}
