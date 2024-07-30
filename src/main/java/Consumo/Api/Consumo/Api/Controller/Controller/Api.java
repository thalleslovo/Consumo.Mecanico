package Consumo.Api.Consumo.Api.Controller.Controller;


import Consumo.Api.Consumo.Api.pessoas.DadosPessoas;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("pessoas")
public class Api {

    @GetMapping("{id}")
    private DadosPessoas consumoapi(@PathVariable ("id") String id){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<DadosPessoas> resp =
                restTemplate
                .getForEntity(
                        String.format("https://swapi.dev/api/people/%s/", id),
                         DadosPessoas.class);

        return resp.getBody();

    }
}
