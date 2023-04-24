package study.moon.book0424;

import lombok.Data;

@Data
public class User {

    private String name;

    private String cell;

    public User(String name, String cell) {
        this.name = name;
        this.cell = cell;
    }
}
