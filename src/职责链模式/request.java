package 职责链模式;

public class request {
    String detail;

    public request(String detail, int level) {
        this.detail = detail;
        this.level = level;
    }

    int level;
}
