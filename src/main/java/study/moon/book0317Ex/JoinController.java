package study.moon.book0317Ex;

import study.moon.user.UserEntity;
import study.moon.user.joinDto.JoinDto;
import study.moon.user.joinDto.Type;

public class JoinController extends User{

    public void join(JoinDto joinDto){

        if(joinDto.getType().equals(Type.children)){
            new Children().getJoin(joinDto);
        }else if(joinDto.getType().equals(Type.adult)){
            new Adult().getJoin(joinDto);
        }else if(joinDto.getType().equals(Type.foreigner)){
            new Foreigner().getJoin(joinDto);
        }
    }

    public void childJoin(JoinDto joinDto){
        new Children().getJoin(joinDto);
    }

    public void adultJoin(JoinDto joinDto){
        new Adult().getJoin(joinDto);
    }

    public void foreignerJoin(JoinDto joinDto){
        new Foreigner().getJoin(joinDto);
    }

}


