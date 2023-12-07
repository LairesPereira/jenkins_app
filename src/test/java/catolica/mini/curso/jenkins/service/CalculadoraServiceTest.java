package catolica.mini.curso.jenkins.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraServiceTest {
    private CalculadoraService calculadoraService;

    @BeforeEach
    public void init() {
        calculadoraService = new CalculadoraService();
    }

    @Test
    public void deveriaRetornarUmaMensagemm() {
        String hello = "Bem-vindo ao curos de Jenkins";
        Assertions.assertEquals(hello, calculadoraService.hello());
    }

    @Test
    public void deveriaSomarDoisValores() {
        int a = 2;
        int b = 1;
        int result = 4;
        Assertions.assertEquals(result, calculadoraService.somar(a, b));
    }

    @Test
    public void deveriaSubtrairDoisValores() {
        int a = 2;
        int b = 2;
        int result = 0;
        Assertions.assertEquals(result, calculadoraService.subtrair(a, b));
    }
}
