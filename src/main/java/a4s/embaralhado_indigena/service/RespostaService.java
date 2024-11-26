package a4s.embaralhado_indigena.service;

import a4s.embaralhado_indigena.model.Resposta;
import a4s.embaralhado_indigena.repository.RespostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class RespostaService {

    @Autowired
    private RespostaRepository respostaRepository;

    public Resposta salvarResposta(Resposta resposta) {
        resposta.setDateResponse(LocalDateTime.now());
        return respostaRepository.save(resposta);
    }

    public List<Resposta> salvarRespostas(List<Resposta> respostas) {
        respostas.forEach(resposta -> resposta.setDateResponse(LocalDateTime.now()));
        return respostaRepository.saveAll(respostas);
    }
}

