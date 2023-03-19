package study.moon.book0317Ex.join;

import study.moon.book0317Ex.user.UserEntity;
import study.moon.book0317Ex.user.joinDto.JoinDto;

public class AdultJoin implements Join {

    @Override
    public void joinWeb(JoinDto joinDto) {
        System.out.println("어른이 가입함");
        new UserEntity().typeJoin(joinDto);
    }
}
