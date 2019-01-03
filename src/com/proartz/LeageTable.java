package com.proartz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeageTable<T extends Team> {
    private ArrayList<T> teams;

    public LeageTable() {
        this.teams = new ArrayList<>();
    }

    public void printTable(){
        Collections.sort(teams);

        printLine(1 + 20 + 3 + 7, '-');

        System.out.format("\n|%20s | %7s|\n", "Name", "Points");

        printLine(1 + 20 + 3 + 7, '-');

        System.out.println();

        for(T team : teams){
            System.out.format("|%20s | %7d|\n", team.getName(), team.getScore());
        }

        printLine(1 + 20 + 3 + 7, '-');
    }

    private void printLine(int quantity, char sign){
        for(int i = 0; i < quantity +1; i++){
            System.out.print(sign);
        }
    }

    public boolean addTeam(T team) {
        return this.teams.add(team);
    }
}
