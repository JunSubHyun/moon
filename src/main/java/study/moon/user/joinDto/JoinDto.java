package study.moon.user.joinDto;

import lombok.Data;

@Data
public class JoinDto {
    private String name;

    private String cell;

    private String parentsAgree;

    private String foreignerNumber;

    private Type type;

    public JoinDto(String name, String cell, String parentsAgree, String foreignerNumber, Type type) {
        this.name = name;
        this.cell = cell;
        this.parentsAgree = parentsAgree;
        this.foreignerNumber = foreignerNumber;
        this.type = type;
    }
}
