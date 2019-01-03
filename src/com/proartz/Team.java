package com.proartz;

public class Team<T extends Player> implements Comparable<Team<T>>{
    private String name;
    private int score;

    public Team(String name) {
        this(name, 0);
    }

    public Team(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Team team) {
        return ((Integer)this.getScore()).compareTo(team.getScore());
    }
}
