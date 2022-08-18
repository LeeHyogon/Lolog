package gg.Lolog.domain.Summoner.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SummonerInformDto {

    private String id;
    private String accountId;
    private int profileIconId;
    private long revisionDate;
    private String name;
    private String puuid;
    private long summonerLevel;

}
