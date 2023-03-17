package com.br.mercadolivre.pages;

import org.junit.Test;
import org.openqa.selenium.By;

public class HomePage extends BasePage{
    private static final By campoBusca = By.cssSelector("#cb1-edit");
    private static final By buscaBtn = By.cssSelector("body > header > div > div.nav-area.nav-top-area.nav-center-area > form > button");
    private static final By categoriaDropdownBtn = By.cssSelector("body > header > div > div.nav-area.nav-bottom-area.nav-center-area > div > ul > li:nth-child(1) > a");
    private static final By veiculosDropdownCategoriaBtn = By.cssSelector("body > header > div > div.nav-area.nav-bottom-area.nav-center-area > div > ul > li:nth-child(1) > div > ul > li:nth-child(1) > a");
    private static final By supermercadoDropdownCategoriaBtn = By.cssSelector("body > header > div > div.nav-area.nav-bottom-area.nav-center-area > div > ul > li:nth-child(1) > div > ul > li:nth-child(2) > a");
    private static final By tecnologiaDropdownCategoriaBtn = By.cssSelector("body > header > div > div.nav-area.nav-bottom-area.nav-center-area > div > ul > li:nth-child(1) > div > ul > li.nav-categs-departments__list.nav-categs-departments__list--dynamic > a");
    private static final By casaEMoveisDropdownCategoriaBtn = By.cssSelector("body > header > div > div.nav-area.nav-bottom-area.nav-center-area > div > ul > li:nth-child(1) > div > ul > li:nth-child(4) > a");
    private static final By eletrodomesticosDropdownCategoriaBtn = By.cssSelector("body > header > div > div.nav-area.nav-bottom-area.nav-center-area > div > ul > li:nth-child(1) > div > ul > li:nth-child(5) > a");
    private static final By esportesEFitnesDropdownCategoriaBtn = By.cssSelector("body > header > div > div.nav-area.nav-bottom-area.nav-center-area > div > ul > li:nth-child(1) > div > ul > li:nth-child(6) > a");
    private static final By ferramentasDropdownCategoriaBtn = By.cssSelector("body > header > div > div.nav-area.nav-bottom-area.nav-center-area > div > ul > li:nth-child(1) > div > ul > li:nth-child(7) > a");
    private static final By construcaoDropdownCategoriaBtn = By.cssSelector("body > header > div > div.nav-area.nav-bottom-area.nav-center-area > div > ul > li:nth-child(1) > div > ul > li:nth-child(8) > a");
    private static final By industriaEComercioDropdownCategoriaBtn = By.cssSelector("body > header > div > div.nav-area.nav-bottom-area.nav-center-area > div > ul > li:nth-child(1) > div > ul > li:nth-child(9) > a");
    private static final By saudeDropdownCategoriaBtn = By.cssSelector("body > header > div > div.nav-area.nav-bottom-area.nav-center-area > div > ul > li:nth-child(1) > div > ul > li:nth-child(10) > a");
    private static final By acessoriosVeiculosDropdownCategoriaBtn = By.cssSelector("body > header > div > div.nav-area.nav-bottom-area.nav-center-area > div > ul > li:nth-child(1) > div > ul > li:nth-child(11) > a");
    private static final By belezaPessoalDropdownCategoriaBtn = By.cssSelector("body > header > div > div.nav-area.nav-bottom-area.nav-center-area > div > ul > li:nth-child(1) > div > ul > li:nth-child(12) > a");
    private static final By modaDropdownCategoriaBtn = By.cssSelector("body > header > div > div.nav-area.nav-bottom-area.nav-center-area > div > ul > li:nth-child(1) > div > ul > li:nth-child(13) > a");
    private static final By bebesDropdownCategoriaBtn = By.cssSelector("body > header > div > div.nav-area.nav-bottom-area.nav-center-area > div > ul > li:nth-child(1) > div > ul > li:nth-child(14) > a");
    private static final By brinquedosDropdownCategoriaBtn = By.cssSelector("body > header > div > div.nav-area.nav-bottom-area.nav-center-area > div > ul > li:nth-child(1) > div > ul > li:nth-child(15) > a");
    private static final By imoveisDropdownCategoriaBtn = By.cssSelector("body > header > div > div.nav-area.nav-bottom-area.nav-center-area > div > ul > li:nth-child(1) > div > ul > li:nth-child(16) > a");
    private static final By compraInternacionalDropdownCategoriaBtn = By.cssSelector("body > header > div > div.nav-area.nav-bottom-area.nav-center-area > div > ul > li:nth-child(1) > div > ul > li:nth-child(17) > a");
    private static final By produtosSustentaveisDropdownCategoriaBtn = By.cssSelector("body > header > div > div.nav-area.nav-bottom-area.nav-center-area > div > ul > li:nth-child(1) > div > ul > li:nth-child(18) > a");
    private static final By maisVendidosDropdownCategoriaBtn = By.cssSelector("body > header > div > div.nav-area.nav-bottom-area.nav-center-area > div > ul > li:nth-child(1) > div > ul > li:nth-child(19) > a");
    private static final By lojasOficiaisDropdownCategoriaBtn = By.cssSelector("body > header > div > div.nav-area.nav-bottom-area.nav-center-area > div > ul > li:nth-child(1) > div > ul > li:nth-child(20) > a");
    private static final By maisCategoriasDropdownCategoriasBtn = By.cssSelector("body > header > div > div.nav-area.nav-bottom-area.nav-center-area > div > ul > li:nth-child(1) > div > ul > li:nth-child(21) > a");
    private static final By ofertaDoDiaBtn = By.cssSelector("body > header > div > div.nav-area.nav-bottom-area.nav-center-area > div > ul > li:nth-child(2) > a");
    private static final By historicoBtn = By.cssSelector("body > header > div > div.nav-area.nav-bottom-area.nav-center-area > div > ul > li:nth-child(3) > a");
    private static final By modaBtn = By.cssSelector("body > header > div > div.nav-area.nav-bottom-area.nav-center-area > div > ul > li:nth-child(4) > a");
    private static final By venderBtn = By.cssSelector("body > header > div > div.nav-area.nav-bottom-area.nav-center-area > div > ul > li:nth-child(5) > a");
    private static final By contatoBtn = By.cssSelector("body > header > div > div.nav-area.nav-bottom-area.nav-center-area > div > ul > li:nth-child(6) > a");
    private static final By signInBtn = By.cssSelector("#nav-header-menu > a:nth-child(1)");
    private static final By loginBtn = By.cssSelector("#nav-header-menu > a:nth-child(2)");
    private static final By cartBtn = By.cssSelector("#nav-cart");

    public void digitarCampoBusca(String str){
        sendKeys(campoBusca, str);
    }

    public void clicarBuscaBtn(){
        click(buscaBtn);
    }

    public void clicaCategoriaBtn(){
        click(categoriaDropdownBtn);
    }

    public void clicaVeiculosDropdown(){
        click(veiculosDropdownCategoriaBtn);
    }

    public void clicaSupermercadoDropdown(){
        click(supermercadoDropdownCategoriaBtn);
    }

    public void clicaTecnologiaDropdown(){
        click(tecnologiaDropdownCategoriaBtn);
    }

    public void clicaCasaDropdown(){
        click(casaEMoveisDropdownCategoriaBtn);
    }

    public void clicaEletrodomesticosDropdown(){
        click(eletrodomesticosDropdownCategoriaBtn);
    }

    public void clicaEsportesDropdown(){
        click(esportesEFitnesDropdownCategoriaBtn);
    }

    public void clicaFerramentasDropdown(){
        click(ferramentasDropdownCategoriaBtn);
    }

    public void clicaContrucaoDropdown(){
        click(construcaoDropdownCategoriaBtn);
    }

    public void clicaIndustriaDropdown(){
        click(industriaEComercioDropdownCategoriaBtn);
    }

    public void clicarSaudeDropdown(){
        click(saudeDropdownCategoriaBtn);
    }

    public void clicaAcessoriosDropdown(){
        click(acessoriosVeiculosDropdownCategoriaBtn);
    }

    public void clicaBelezaDropdown(){
        click(belezaPessoalDropdownCategoriaBtn);
    }

    public void clicaModaDropdown(){
        click(modaDropdownCategoriaBtn);
    }

    public void clicaBebesDropdown(){
        click(bebesDropdownCategoriaBtn);
    }

    public void clicaBrinquedosDropdown(){
        click(brinquedosDropdownCategoriaBtn);
    }

    public void clicaImoveisDropdown(){
        click(imoveisDropdownCategoriaBtn);
    }

    public void clicaCompraInternacionaisDropdown(){
        click(compraInternacionalDropdownCategoriaBtn);
    }

    public void clicaProdutosSustentaveisDropdown(){
        click(produtosSustentaveisDropdownCategoriaBtn);
    }

    public void clicaMaisVendidosDropdown(){
        click(maisVendidosDropdownCategoriaBtn);
    }

    public void clicaLojasOficiaisDropdown(){
        click(lojasOficiaisDropdownCategoriaBtn);
    }

    public void clicaMaisCategoriasDropdown(){
        click(maisCategoriasDropdownCategoriasBtn);
    }

    public void clicaOfertaDoDia(){
        click(ofertaDoDiaBtn);
    }

    public void clicaHistorico(){
        click(historicoBtn);
    }

    public void clicaModa(){
        click(modaBtn);
    }

    public void clicaVender(){
        click(venderBtn);
    }

    public void clicaContato(){
        click(contatoBtn);
    }

    public void clicaSignIn(){
        click(signInBtn);
    }

    public void clicaLogin(){
        click(loginBtn);
    }

    public void clicaCart(){
        click(cartBtn);
    }
}
