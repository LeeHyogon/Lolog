package gg.Lolog.api;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Component
@Getter
@NoArgsConstructor
public class RiotApiKey {


    @Value("${RIOT_KEY}")
    private String RiotKey;

//    private static RiotApiKey riotApiKey=new RiotApiKey();

    //참고: https://nam-ki-bok.github.io/spring/HideAPI/

    //@Autowired와 @Resource는 싱글톤 패턴이 자동적용 되므로 밑의 코드가 필요없다.
    //기록용으로 지우지 않음.
//
//    public static RiotApiKey getRiotApiKey(){
//        if(riotApiKey==null){
//            riotApiKey=new RiotApiKey();
//        }
//        return riotApiKey;
//    }
}
