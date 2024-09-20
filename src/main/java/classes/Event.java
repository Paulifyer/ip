package classes;

public class Event extends Task {
    private String from;
    private String to;

    public Event(String description, String from, String to) {
        super(description);
        this.from = from;
        this.to = to;
    }

    public Event(String input) {
        super(input.substring(input.indexOf(" ") + 1, input.indexOf("/from") - 1));
        this.from = input.substring(input.indexOf("/from") + 6, input.indexOf("/to") - 1);
        this.to = input.substring(input.indexOf("/to") + 4);
    }

    public Event(String task, boolean isDone, String to, String from) {
        super(task, isDone);
        this.to = to;
        this.from = from;
    }

    public String getTypeMarker() {
        return "[E]";
    }

    @Override
    public void print() {
        System.out.print(getTypeMarker());
        System.out.print(getDoneMarker() + " " + this.task);
        System.out.printf(" (from: %s to: %s)\n", this.from, this.to);
    }
    @Override
    public String toString() {
        return String.format("%s | %b | %s | %s | %s)", getTypeMarker(), this.isDone,
                this.task, this.from, this.to);
    }
}
