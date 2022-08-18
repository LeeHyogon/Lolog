package gg.Lolog.service;

import gg.Lolog.api.RiotApiKey;
import gg.Lolog.vo.ResponseVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URLEncoder;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SummonerServiceTest {

    @Autowired
    SummonerService summonerService;

    @Autowired
    RiotApiKey riotApiKey;



    String name="깝치면달린다";


//    @Test
//    public void findByName_확인() {
//        String encryptName = URLEncoder.encode(name);
//        String apiUrl = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/" + encryptName;
//
//        String riotKey=riotApiKey.getRiotKey();
//
//        final HttpHeaders headers = new HttpHeaders();
//        headers.set("User-Agent",
//                "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.0.0 Safari/537.36");
//
//        headers.set("Accept-Language", "ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7");
//        headers.set("Origin", "https://developer.riotgames.com");
//        headers.set("X-Riot-Token", riotKey);
//
//        final HttpEntity<String> entity = new HttpEntity<>(headers);
//        System.out.println(entity);
//    }
    @Test
    public void findByName_확인() throws Exception {

        //given
        ResponseVo responseVo=summonerService.findByName("Hide on bush");
        //when
        System.out.println(responseVo);
        //then
    }
}