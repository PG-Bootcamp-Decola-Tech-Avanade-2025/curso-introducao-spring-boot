package pg.decola_tech_avanade_2025.cursos.introducao_spring_boot;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Calculator {
    public int Add(int... values) {
        return Arrays.stream(values).sum();
    }
}
