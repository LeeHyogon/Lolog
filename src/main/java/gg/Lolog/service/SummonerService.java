package gg.Lolog.service;


import gg.Lolog.api.RiotApiKey;
import gg.Lolog.domain.Summoner.dto.SummonerInformDto;
import gg.Lolog.vo.ResponseVo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.Map;


@Service
@RequiredArgsConstructor
public class SummonerService {


    @Value("${riot.endpoint.summoner}")
    String summonerurl;

    @Autowired
    RiotApiKey riotApiKey;
    RestTemplate restTemplate = new RestTemplate();


    public ResponseVo findByName(String summonerName) {

        ResponseVo responseVo = new ResponseVo();

        Map<String,String> param = new HashMap<>();
        param.put("summonerName",summonerName);
        try {

            UriComponents builder = UriComponentsBuilder.fromHttpUrl(summonerurl)
                    .path("/{summonerName}")
                    .queryParam("api_key",riotApiKey.getRiotKey())
                    .encode() //UTF-8 encoding해줌 toUri()로 URI타입을 넘기는 경우 사용
                    .buildAndExpand(param);

            SummonerInformDto summonerInformDto = restTemplate.getForObject(builder.toUri(),SummonerInformDto.class);

            responseVo.setData(summonerInformDto);

        } catch (Exception e) {
            e.printStackTrace();
        }
        responseVo.setResponseCode(200);
        responseVo.setResponseMsg("Success");

        return responseVo;
    }

}
