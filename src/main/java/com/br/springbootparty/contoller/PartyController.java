package com.br.springbootparty.contoller;


import com.br.springbootparty.dto.request.PartyRequestDTO;
import com.br.springbootparty.dto.response.PartyResponseDTO;
import com.br.springbootparty.service.PartyService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


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
//    @GetMapping
//    public ResponseEntity<Ideology<PartyRequestDTO>> fundAll() {
//        return partyService.findAllParty();
//    }
//
//    @GetMapping(path = "/{id}")
//    public  PartyRequestDTO findByIdParty(@PathVariable("id")UUID idParty) {
//        return (PartyRequestDTO) partyService.findAllParty(); }
//

}
