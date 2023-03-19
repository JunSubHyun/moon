package study.moon.book0317Ex.join;

import study.moon.book0317Ex.join.Join;
import study.moon.user.UserEntity;
import study.moon.user.joinDto.JoinDto;

public class ChildrenJoin implements Join {

    @Override
    public void joinWeb(JoinDto joinDto) {
        System.out.println("어린이가 가입함");
        new UserEntity().typeJoin(joinDto);
    }
}
