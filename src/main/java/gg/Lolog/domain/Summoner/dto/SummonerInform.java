package gg.Lolog.domain.Summoner.dto;


import lombok.Data;

@Data
public class SummonerInform {

    private String id;

    private String accountId;

    private int profileIconId;

    private long revisionDate;

    private String name;

    private String puuid;

    private long summonerLevel;

}
