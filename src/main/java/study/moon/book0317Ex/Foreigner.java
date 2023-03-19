package study.moon.book0317Ex;

import study.moon.book0317Ex.join.ForeignerJoin;

public class Foreigner extends User{

    public Foreigner(){
        join = new ForeignerJoin();
    }

}
