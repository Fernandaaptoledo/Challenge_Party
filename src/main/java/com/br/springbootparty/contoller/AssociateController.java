package com.br.springbootparty.contoller;


import com.br.springbootparty.dto.request.AssociateRequestDTO;
import com.br.springbootparty.dto.response.AssociateResponseDTO;
import com.br.springbootparty.service.AssociateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AssociateController {

    private final AssociateService associateService;

    @PostMapping("/associates")
    public ResponseEntity<AssociateResponseDTO> save(@RequestBody AssociateRequestDTO associateRequestDTO){
        AssociateResponseDTO associateResponseDTO = associateService.save(associateRequestDTO);
        return ResponseEntity.ok(associateResponseDTO);
    }
//    @PostMapping("/associates/parties")
//    public ResponseEntity<AssociateResponseDTO> save(@RequestBody AssociateRequestDTO associateRequestDTO){
//        AssociateResponseDTO associateResponseDTO = associateService.save(associateRequestDTO);
//        return ResponseEntity.ok(associateResponseDTO);
//    }

}
