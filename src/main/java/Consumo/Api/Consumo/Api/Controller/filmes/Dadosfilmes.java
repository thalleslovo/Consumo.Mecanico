package Consumo.Api.Consumo.Api.Controller.filmes;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Dadosfilmes {

    private @JsonAlias("title") String titulo;
    private @JsonAlias("episode_id")String episodio;
    private @JsonAlias("opening_crawl")String abertura;
    private @JsonAlias("director")String diretor;
    private @JsonAlias("producer")String produtor;
    private @JsonAlias("release_date")String data_lancamento;
    private @JsonAlias("created")String criada;
    private @JsonAlias("edited")String editado;
    private @JsonAlias("url")String url;
}
