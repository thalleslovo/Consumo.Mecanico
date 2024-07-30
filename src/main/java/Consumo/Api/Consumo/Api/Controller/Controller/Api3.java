package Consumo.Api.Consumo.Api.Controller.Controller;

import Consumo.Api.Consumo.Api.Controller.planetas.DadosPlanetas;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("planetas")
public class Api3 {

    @GetMapping("{id}")
    private DadosPlanetas consumoplanetas(@PathVariable("id") String id){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<DadosPlanetas> resp =
                restTemplate
                        .getForEntity(
                                String.format("https://swapi.dev/api/planets/%s/",id),
                                DadosPlanetas.class);

        return resp.getBody();
    }
}
