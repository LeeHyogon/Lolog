package gg.Lolog.api;

import gg.Lolog.domain.Summoner.dto.SummonerInform;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import java.net.URLEncoder;


@RequiredArgsConstructor
@Service
public class SummonerApiClient {

    private final RiotApiKey riotApiKey;


    SummonerInform SummonerSearch(String name){
        String encryptName= URLEncoder.encode(name);
        String APIURL = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/"+encryptName;

        String riotKey=riotApiKey.getRiotKey();
        final HttpHeaders headers= new HttpHeaders();
        headers.set("User-Agent",
                "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.0.0 Safari/537.36");

        headers.set("Accept-Language","ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7");
        headers.set("Origin","https://developer.riotgames.com");
        headers.set("X-Riot-Token",riotKey);

        final HttpEntity<String> entity = new HttpEntity<>(headers);
        
    }
