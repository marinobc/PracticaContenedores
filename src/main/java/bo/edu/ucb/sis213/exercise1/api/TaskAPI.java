package bo.edu.ucb.sis213.exercise1.api;

import bo.edu.ucb.sis213.exercise1.Bl.TaskBl;
import bo.edu.ucb.sis213.exercise1.Dto.Task;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.HashMap;

@RestController
class TaskAPI {
    private TaskBl taskBl;

    public TaskAPI(){
        taskBl = new TaskBl();
    }

    @GetMapping("/api/v1/task")
    public Map create(Task task){
        taskBl.create(task);
        Map result = new HashMap();
        result.put("code","TASK-0000");
        result.put("result","Task created succesfully");
        result.put("errorMessage","");
        return result;
    }
}
