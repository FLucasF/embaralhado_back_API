package a4s.embaralhado_indigena.controller;

import a4s.embaralhado_indigena.model.Resposta;
import a4s.embaralhado_indigena.service.RespostaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/response")
public class RespostaController {

    @Autowired
    private RespostaService respostaService;

    @PostMapping
    public Resposta salvarResposta(@RequestBody Resposta resposta) {
        return respostaService.salvarResposta(resposta);
    }

    @PostMapping("/batch")
    public List<Resposta> salvarRespostas(@RequestBody List<Resposta> respostas) {
        return respostaService.salvarRespostas(respostas);
    }
}
