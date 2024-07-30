package Consumo.Api.Consumo.Api.Controller.Controller;


import Consumo.Api.Consumo.Api.Controller.filmes.Dadosfilmes;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("filmes")
public class Api2 {

    @GetMapping("{id}")
    private Dadosfilmes consumofilmes(@PathVariable("id") String id){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Dadosfilmes> resp =
                         restTemplate
                        .getForEntity(
                                String.format("https://swapi.dev/api/films/%s/",id),
                                Dadosfilmes.class);


                            return resp.getBody();
    }
}
