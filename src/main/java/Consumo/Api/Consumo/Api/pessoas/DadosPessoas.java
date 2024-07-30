package Consumo.Api.Consumo.Api.pessoas;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DadosPessoas {

    private @JsonAlias("name") String nome;
    private @JsonAlias("height")String altura;
    private @JsonAlias("mass")String massa;
    private @JsonAlias("hair_color")String cor_cabelo;
    private @JsonAlias("skin_color")String cor_pele;
    private @JsonAlias("eye_color")String cor_olho;
    private @JsonAlias("birth_year")String ano_nascimento;
    private @JsonAlias("gender")String genero;
    private @JsonAlias("homeworld")String planeta_natal;
    private @JsonAlias("created")String criado;
    private @JsonAlias("edited")String editado;
    private @JsonAlias("url")String url;



}
