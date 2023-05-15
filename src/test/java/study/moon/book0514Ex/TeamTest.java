package study.moon.book0514Ex;

import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class TeamTest {

    @Test
    void test() {
        Team team = new Team("MoonTF팀", 4);

        team.addTeamMember(new Worker("박보검", WorkerType.DEVELOPER));
        team.addTeamMember(new Worker("박서준", WorkerType.DEVELOPER));
        team.addTeamMember(new Worker("아이유", WorkerType.PLANNER));
        team.addTeamMember(new Worker("너구리", WorkerType.QA));

        System.out.println("팀 이름: " + team.getName());

        Iterator<Worker> iterator = team.iterator();
        while (iterator.hasNext()) {
            Worker worker = iterator.next();
            System.out.println("-------------");
            System.out.println("이름: " + worker.getName());
            System.out.println("직업: " + worker.getType().getValue());
        }
    }
}