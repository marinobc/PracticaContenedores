package bo.edu.ucb.sis213.exercise1.Dto;
import java.util.Date;
public record Task(
        int taskId,
        String name,
        Date dueDate,
        String status) {}
