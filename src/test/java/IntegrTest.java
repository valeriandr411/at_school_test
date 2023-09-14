import org.example.dao.TaskRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

public class IntegrTest {
    @Autowired
    private TaskRepository personRepository;

    @Test
    public void findByEmailWhenPersonExistsShouldReturnIt() {
        //List<Task> persons = personRepository.findByName("first");
       // assertEquals(2, persons.size());
    }
}