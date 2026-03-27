package labwork3.problem1;

public class Document implements Printable {
    private String title;
    private String body;

    public Document(String title, String body) {
        this.title = title;
        this.body = body;
    }

    @Override
    public void print() {
        System.out.println("--- " + title + " ---");
        System.out.println(body);
    }

    @Override
    public String getContent() {
        return title + ": " + body;
    }
}
