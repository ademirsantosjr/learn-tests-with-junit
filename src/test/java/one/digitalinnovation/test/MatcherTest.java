package one.digitalinnovation.test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.text.IsEmptyString.emptyOrNullString;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matchers;
import org.hamcrest.beans.HasProperty;
import org.hamcrest.object.HasToString;
import org.junit.Test;

import one.digitalinnovation.pessoa.Pessoa;

public class MatcherTest {
    
    @Test
    public void givenBean_checkToString() {
        Pessoa pessoa = new Pessoa("Mary", "Jane");
        String str = pessoa.toString();
        assertThat(pessoa, HasToString.hasToString(str));
    }

    @Test
    public void givenBean_checkPropertyExists() {
        Pessoa pessoa = new Pessoa("John", "Doe");
        assertThat(pessoa, HasProperty.hasProperty("nome"));
    }

    @Test
    public void givenCollection_checkEmpty() {
        List<String> emptyList = new ArrayList<>();
        assertThat(emptyList, Matchers.empty());
    }

    @Test
    public void givenAnInteger_checkGreater() {
        assertThat(1, Matchers.greaterThan(0));
    }

    @Test
    public void givenString_checkNull() {
        String str = null;
        assertThat(str, emptyOrNullString());
    }
 }
