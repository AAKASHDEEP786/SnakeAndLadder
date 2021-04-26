package SnakeAndLadder;
import java.util.*;

public class SnakeAndLadder {

    public static void main(String[] args) {
        SnakeNLadder s = new SnakeNLadder();
    }

}

//Created another class for operation
class SnakeNLadder {
    //Initialize static variable for wining position
    final static int WINPOINT = 100;

    public int rollDice()
    {
        int n = 0;
        Random r = new Random();
        n=r.nextInt(7);
        return (n==0?1:n);
    }}
