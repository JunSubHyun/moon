package study.moon.book0317Ex;

import study.moon.book0317Ex.join.Join;
import study.moon.book0317Ex.user.joinDto.JoinDto;

public abstract class User {

    Join join;

    public void getJoin(JoinDto joinDto){
        join.joinWeb(joinDto);
    }

}
