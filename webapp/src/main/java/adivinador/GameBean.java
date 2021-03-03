package adivinador;
import java.io.Serializable;
import  java.util.Random;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ApplicationScoped;

@ManagedBean(name = "guessBean")
@SessionScoped
public class GameBean {
    int number;
    int attemps;
    int award;
    String status;
    boolean hasWin;
    
    public GameBean() {
        restart();
    }

    public void guess(int intento){
        if (award>0){
            attemps+=1;
            if (number == intento){
                hasWin = true;
                status = "Has ganado !";
                if ( attemps == 1){
                    award = 100000;
                }
            }
            if (!hasWin){
            award -= (10000);
            }
        }else{
            status ="Game Over!!";
        }
    }

    public void restart(){
        number = new Random().nextInt(10);
        attemps = 0;
        award = 100000;
        status = "Jugando...";
        hasWin= false;
    }



    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAttemps() {
        return attemps;
    }

    public void setAttemps(int attemps) {
        this.attemps = attemps;
    }

    public int getAward() {
        return award;
    }

    public void setAward(int award) {
        this.award = award;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isHasWin() {
        return hasWin;
    }

    public void setHasWin(boolean hasWin) {
        this.hasWin = hasWin;
    }
    
}
