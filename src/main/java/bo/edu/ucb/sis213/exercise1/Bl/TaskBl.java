package bo.edu.ucb.sis213.exercise1.Bl;

import bo.edu.ucb.sis213.exercise1.Dto.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskBl {
    List<Task> database = new ArrayList();

    public void create(Task task){
        database.add(task);
    }

    public List<Task> listAll(){
        return database;
    }

    public void delete(int taskId){
        for (int i=0; i<database.size(); i++){
            Task t = database.get(i);
            if (t.taskId() == taskId){
                database.remove(i);
            }
        }
    }
}
