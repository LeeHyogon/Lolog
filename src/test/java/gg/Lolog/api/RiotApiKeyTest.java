package gg.Lolog.api;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class RiotApiKeyTest {


    @Resource
    RiotApiKey riotApiKey;

    @Test
    public void api_key_test() throws Exception {
        //give
        System.out.print(riotApiKey.getRiotKey()+"------------------------------------");
        //then
    }

}