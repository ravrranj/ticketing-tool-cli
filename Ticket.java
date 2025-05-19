
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ticket {
    private static int counter = 1;
    private final int id;
    private final String description;
    private final boolean isPriority;
    private String status;
    private final java.time.LocalDateTime timestamp;

    public Ticket (String description, boolean isPriority) {
        this.id = counter++;
        this.description = description;
        this.isPriority = isPriority;
        this.status = "OPEN";
        this.timestamp = LocalDateTime.now();
    }
    
    public void setStatus (String status) {
        this.status = status;
    }

    public boolean isPriority() {
        return isPriority;
    }

    public int getId() {
    return id;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getTimeStamp() {
        retrun timestamp;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return "[Ticket ID: " + id+ 
        ", Priority: " + (isPriority ? "YES" : "NO") + 
        ", Status: " + status +
        ", Created At: " + timestamp.format(formatter) +
        ",Description: " + description + "]";
    }
}
