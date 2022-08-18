package gg.Lolog.api;

import gg.Lolog.domain.Summoner.dto.SummonerInformDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SummonerApiClientTest {

    @Autowired
    SummonerApiClient summonerApiClient;

    SummonerInformDto summonerInformDto;
    @Test
    public void summonerSearch_출력확인() {

//        summonerInformDto=summonerApiClient.SummonerSearch("깝치면달린다");
//        System.out.println(summonerInformDto.getId()+"+++++++++++++++++++++++++");
//        System.out.println(summonerInformDto.getName()+"+++++++++++++++++++++++++");
//        System.out.println(summonerInformDto.getAccountId()+"+++++++++++++++++++++++++");
//        System.out.println(summonerInformDto.getPuuid()+"+++++++++++++++++++++++++");
//        System.out.println(summonerInformDto.getSummonerLevel()+"+++++++++++++++++++++++++");

    }
}