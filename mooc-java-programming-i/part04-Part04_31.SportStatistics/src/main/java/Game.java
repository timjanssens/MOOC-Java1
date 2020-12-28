/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timja
 */
public class Game {

    private String homeTeam;
    private String awayTeam;
    private int homeScore;
    private int awayScore;

    public Game(String homeTeam, String awayTeam, int homeScore, int awayScore) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }
    
    public String getHomeTeam(){
        return this.homeTeam;
    }
    
    public String getAwayTeam(){
        return this.awayTeam;
    }

    public String winningTeam() {
        if (this.homeScore > this.awayScore) {
            return this.homeTeam;
        } else {
            return this.awayTeam;
        }
    }

    public String losingTeam() {
        if (this.homeScore < this.awayScore) {
            return this.homeTeam;
        } else {
            return this.awayTeam;
        }
    }
}
