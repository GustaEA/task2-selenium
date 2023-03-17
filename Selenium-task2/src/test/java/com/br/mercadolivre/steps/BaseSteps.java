package com.br.mercadolivre.steps;

import com.br.mercadolivre.utils.Browser;
import org.junit.After;
import org.junit.Before;

public class BaseSteps extends Browser {
    @Before
    public void abrirNavegador(){
        abrirNavegadorB("https://www.mercadolivre.com.br");
        driver.navigate().refresh();
    }


    public void fecharNavegador(){
        fecharNavegadorB();
    }
}
