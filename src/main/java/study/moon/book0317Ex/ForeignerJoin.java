package study.moon.book0317Ex;

import study.moon.user.UserEntity;
import study.moon.user.joinDto.JoinDto;

public class ForeignerJoin implements Join{

    @Override
    public void joinWeb(JoinDto joinDto) {
        System.out.println("외국인이 가입함");
        new UserEntity().typeJoin(joinDto);
    }
}
