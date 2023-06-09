package study.moon.book0317Ex.user;

import study.moon.book0317Ex.user.joinDto.JoinDto;
import study.moon.book0317Ex.user.joinDto.Type;

public class UserEntity {

    private String name;

    private String cell;

    private String parentsAgree;

    private String foreignerNumber;

    public void typeJoin(JoinDto joinDto){
        if(joinDto.getType().equals(Type.children)){
            childrenEntity(joinDto);
        }else if(joinDto.getType().equals(Type.adult)){
            adultEntity(joinDto);
        }else if(joinDto.getType().equals(Type.foreigner)){
            foreignerEntity(joinDto);
        }
    }

    public void childrenEntity(JoinDto joinDto){
        this.name = joinDto.getName();
        this.cell = joinDto.getCell();
        this.parentsAgree = joinDto.getParentsAgree();
        System.out.println("name = " + name);
        System.out.println("cell = " + cell);
        System.out.println("parentsAgree = " + parentsAgree);
    }

    public void adultEntity(JoinDto joinDto){
        this.name = joinDto.getName();
        this.cell = joinDto.getCell();
        System.out.println("name = " + name);
        System.out.println("cell = " + cell);
    }

    public void foreignerEntity(JoinDto joinDto){
        this.name = joinDto.getName();
        this.cell = joinDto.getCell();
        this.foreignerNumber = joinDto.getForeignerNumber();
        System.out.println("name = " + name);
        System.out.println("cell = " + cell);
        System.out.println("foreignerNumber = " + foreignerNumber);
    }

}
