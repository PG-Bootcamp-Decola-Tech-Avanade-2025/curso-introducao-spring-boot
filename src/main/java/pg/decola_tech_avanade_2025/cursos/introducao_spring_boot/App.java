package pg.decola_tech_avanade_2025.cursos.introducao_spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class App implements CommandLineRunner {
    @Autowired
    private Calculator calculator;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(calculator.Add(5, 10, 15));
    }
}
