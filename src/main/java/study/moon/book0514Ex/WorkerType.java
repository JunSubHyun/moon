package study.moon.book0514Ex;

public enum WorkerType {
    DEVELOPER("DEVELOPER", "개발자"),
    QA("QA", "QA"),
    PLANNER("PLANNER", "기획자");
    private final String code;
    private final String value;


    WorkerType(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }
}
