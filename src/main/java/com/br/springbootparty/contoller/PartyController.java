package com.br.springbootparty.contoller;


import com.br.springbootparty.dto.request.PartyRequestDTO;
import com.br.springbootparty.dto.response.PartyResponseDTO;
import com.br.springbootparty.entiteis.PartyEntity;
import com.br.springbootparty.service.PartyService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/parties")
@RequiredArgsConstructor
public class PartyController {


    @Autowired
    private final PartyService partyService;

    @PostMapping
    public ResponseEntity<PartyResponseDTO> save(@RequestBody PartyRequestDTO partyRequestDTO) {
        PartyResponseDTO partyResponseDTO = partyService.save(partyRequestDTO);
        return ResponseEntity.ok(partyResponseDTO);
    }
    @GetMapping
    public ResponseEntity<List<PartyEntity>> getIdParty() {
        List<PartyEntity> IdParty = new ArrayList<>();
        return ResponseEntity.ok(IdParty);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PartyEntity> idPartyPathvariable(@PathVariable("id") Long idParty) {
        return null;
    }



}
