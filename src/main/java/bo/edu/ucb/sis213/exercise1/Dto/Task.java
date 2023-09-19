package bo.edu.ucb.sis213.exercise1.Dto;
import java.util.Date;
public record Task(
        Integer taskId,
        String name,
        Date dueDate,
        String status) {}
