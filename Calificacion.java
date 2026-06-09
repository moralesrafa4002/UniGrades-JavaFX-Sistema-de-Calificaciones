package com.rafa.unigrades;

import com.rafa.unigrades.model.Calificacion;
import com.rafa.unigrades.model.ConfiguracionEvaluacion;
import com.rafa.unigrades.pattern.WeightedGradeCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WeightedGradeCalculatorTest {

    @Test
    void calculaPromedioPonderadoCorrectamente() {
        WeightedGradeCalculator calculator = new WeightedGradeCalculator();
        Calificacion calificacion = new Calificacion(1, 1, 8, 9, 7, 10, 0, 0, "");
        ConfiguracionEvaluacion configuracion = new ConfiguracionEvaluacion(1, 1, 70, 30, 6, 5);
        double finalGrade = calculator.calcularPromedioFinal(calificacion, configuracion);
        assertEquals(8.6, finalGrade, 0.01);
    }

    @Test
    void repruebaPorFaltas() {
        WeightedGradeCalculator calculator = new WeightedGradeCalculator();
        Calificacion calificacion = new Calificacion(1, 1, 10, 10, 10, 10, 7, 10, "");
        ConfiguracionEvaluacion configuracion = new ConfiguracionEvaluacion(1, 1, 70, 30, 6, 5);
        assertEquals("REPROBADO POR FALTAS", calculator.determinarEstatus(calificacion, configuracion));
    }
}
