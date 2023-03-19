package study.moon.book0317Ex;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import study.moon.book0317Ex.user.joinDto.JoinDto;
import study.moon.book0317Ex.user.joinDto.Type;

@SpringBootTest
class UserTest {

    @AfterEach
    void init(){
        System.out.println("=================================");
    }

    @Test
    void Test(){
        JoinDto joinDto = new JoinDto("어른테스트","010-0000-0000","yes","12345",Type.adult);
        new JoinController().join(joinDto);
    }

    @Test
    void childrenJoin(){
        JoinDto joinDto
                = new JoinDto("test","010-0000-0000","yes","12345", Type.children);
        new JoinController().childJoin(joinDto);
    }

    @Test
    void adultJoin(){
        JoinDto joinDto
                = new JoinDto("test","010-0000-0000","yes","12345", Type.children);
        new JoinController().adultJoin(joinDto);
    }

    @Test
    void foreignerJoin(){
        JoinDto joinDto
                = new JoinDto("test","010-0000-0000","yes","12345", Type.children);
        new JoinController().foreignerJoin(joinDto);
    }




}