package one.digitalinnovation.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import one.digitalinnovation.pessoa.Pessoa;

public class AssertJTest {
    
    @Test
    public void checkEquality() {
        Pessoa pessoa = new Pessoa("Uncle", "Bob");
        Pessoa pessoaClone = pessoa;

        assertThat(pessoa).isEqualTo(pessoaClone);
    }
}
