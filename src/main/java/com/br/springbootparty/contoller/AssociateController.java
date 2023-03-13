package com.br.springbootparty.contoller;


import com.br.springbootparty.dto.request.AssociateRequestDTO;
import com.br.springbootparty.dto.response.AssociateResponseDTO;
import com.br.springbootparty.service.AssociateService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/associates")
@RequiredArgsConstructor
public class AssociateController {

    @Autowired
    private final AssociateService associateService;

    @PostMapping
    public ResponseEntity<AssociateResponseDTO> save(@RequestBody AssociateRequestDTO associateRequestDTO){
        AssociateResponseDTO associateResponseDTO = associateService.save(associateRequestDTO);
        return ResponseEntity.ok(associateResponseDTO);
    }
    @PostMapping("/parties")
    public ResponseEntity<AssociateResponseDTO> registerIdParty(@PathVariable ){

    }

}
