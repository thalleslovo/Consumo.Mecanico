package Consumo.Api.Consumo.Api.Controller.planetas;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DadosPlanetas {

    private @JsonAlias("name") String nome;
    private @JsonAlias("rotation_period")String periodo_rotacao;
    private @JsonAlias("orbital_period")String periodo_orbital;
    private @JsonAlias("diameter")String diametro;
    private @JsonAlias("climate")String clima;
    private @JsonAlias("gravity")String gravidade;
    private @JsonAlias("terrain")String chao;
    private @JsonAlias("surface_water")String agua_superfice;
    private @JsonAlias("population")String populacao;
    private @JsonAlias("created")String criado;
    private @JsonAlias("edited")String editado;
    private @JsonAlias("url")String url;


}
