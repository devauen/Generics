package com.proartz;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        LeageTable<Team<FootballPlayer>> table = new LeageTable<>();
        Team<FootballPlayer> Arsenal = new Team<>("Arsenal", 24);
        Team<FootballPlayer> Manchester = new Team<>("Manchester United", 15);
        Team<FootballPlayer> Chelsea = new Team<>("Chelsea", 10);
        Team<FootballPlayer> Liverpool = new Team<>("Liverpool", 35);

        Team<RugbyPlayer> Hanna = new Team<>("Hanna", 38);

        table.addTeam(Arsenal);
        table.addTeam(Manchester);
        table.addTeam(Chelsea);
        table.addTeam(Liverpool);
//        table.addTeam(Hanna);

        table.printTable();

    }
}
