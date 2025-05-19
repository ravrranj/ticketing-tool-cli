
import java.util.LinkedList;
import java.util.Queue;

public class TicketQueueManager {
    private final Queue<Ticket> priorityQueue = new LinkedList<>();
    private final Queue<Ticket> normalQueue = new LinkedList<>();

    public void addTicket(Ticket ticket) {
        if (ticket.isPriority()) {
            priorityQueue.add(ticket);
        } else {
            normalQueue.add(ticket);
        }
    }

    public void updateTicketStatus(int ticketId, String newStatus) {

        boolean found = false;
        String normalizedStatus = newStatus.toUpperCase();

        //Search for priority queue
        for (Ticket ticket : priorityQueue) {
            if (ticket.getId() == ticketId) {
                ticket.setStatus(newStatus.toUpperCase());
                System.out.println("Ticket " + ticketId + " status updated to " + newStatus);
                found = true;
                break;
            }
        }

        // If not found , search in normal queue
        if(!found) {
        for (Ticket ticket : normalQueue) {
            if(ticket.getId() == ticketId) {
                ticket.setStatus(newStatus.toUpperCase());
                System.out.println("Ticket " + ticketId + " status updated to " + newStatus);
                found = true;
                break;
            }
        }
    }
        if(!found) {
        System.out.println("Ticket ID not found. Please enter a valid ID. Use 'View Queue' to check existing ticket IDs.");
    }
}

    public Ticket processTicket() {
        if (!priorityQueue.isEmpty()) {
            return priorityQueue.poll();
        } else if (!normalQueue.isEmpty()) {
             return normalQueue.poll();
        } else {
            return null;
        }
    }

    public void viewQueue() {
        System.out.println("---- Priority Tickets ----");
        if(priorityQueue.isEmpty()) {
            System.out.println("No priority tickets.");
        } else {
            for (Ticket ticket : priorityQueue){
                System.out.println(ticket);
            }
        }
        System.out.println("---- Normal Tickets ----");
        if(normalQueue.isEmpty()){
            System.out.println("No normal tickets.");
        } else {
            for (Ticket ticket : normalQueue) {
            System.out.println(ticket);

            }
        }
    }
}