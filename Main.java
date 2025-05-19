
import java.util.Scanner;
import java.util.concurrent.PriorityBlockingQueue;
import java.time.LocalDateTime;

public class Main {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    TicketQueueManager manager = new TicketQueueManager();

while (true) {
    System.out.println("\n1. Add Ticket");
    System.out.println("2. View Queue");
    System.out.println("3. Process Next Ticket");
    System.out.println("4. Update ticket status");
    System.out.println("5. Exit");

    int choice = -1;
    while (true) {
        System.out.print("Choose option: ");
        String input = sc.nextLine();
        try {
            choice = Integer.parseInt(input);
            break;
        } catch (NumberFormatException e) {
            System.out.println("❌ Please enter a valid number (1–5).");
        }
    }

        switch (choice) {
            case 1:
            System.out.print("Enter ticket description: ");
            String desc = sc.nextLine();
            System.out.print("Is this a priority ticket? (yes/no): ");
            String priority = sc.nextLine();
            boolean isPriority = priority.equalsIgnoreCase("yes");
            Ticket ticket = new Ticket(desc, isPriority);
            manager.addTicket(ticket);
            System.out.println("Ticket added: " + ticket);
            break;

            case 2:
            manager.viewQueue();
            break;

            case 3:
            Ticket next = manager.processTicket();
            if(next !=null) {
                System.out.println("Processing ticket: " + next);
            } else {
                System.out.println(" No tickets to process.");
            }
            break;

            case 4:
            
            System.out.println("Here are the current tickets:");
            manager.displayTickets();
            System.out.print("Enter Ticket ID to update: ");
            int ticketId = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline
            System.out.print("Enter new status (e.g., IN_PROGRESS, RESOLVED, UPDATED): ");
            String newStatus = scanner.nextLine();
            manager.updateTicketStatus(ticketId, newStatus);
            break;

            case 5:
            System.out.println("Exiting.. Goodbye!👋");
            sc.close();
            return;

            default:
            System.out.println("Invalid Option.Try again.❗❗");
        }
     }
   } 
}