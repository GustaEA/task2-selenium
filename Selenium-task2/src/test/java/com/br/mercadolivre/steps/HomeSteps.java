package com.br.mercadolivre.steps;

import com.br.mercadolivre.pages.BasePage;
import com.br.mercadolivre.pages.HomePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class HomeSteps extends BaseSteps{
    HomePage homePage = new HomePage();

    @Test
    public void testBuscarMercadoria(){
        homePage.digitarCampoBusca("kit xeon");
        homePage.clicarBuscaBtn();

        String buscaTitle = BasePage.getText(By.cssSelector("#root-app > div > div.ui-search-main.ui-search-main--exhibitor.ui-search-main--only-products.ui-search-main--with-topkeywords.shops__search-main > aside > div.ui-search-breadcrumb.shops__breadcrumb > h1"));
        Assert.assertEquals("Kit xeon", buscaTitle);
    }

    @Test
    public void testIrParaCategoriaVeiculos(){
        homePage.clicaCategoriaBtn();
        homePage.clicaVeiculosDropdown();

        String url = driver.getCurrentUrl();
        Assert.assertEquals("https://www.mercadolivre.com.br/c/carros-motos-e-outros#menu=categories", url);
    }

    @Test
    public void testIrParaCategoriaEsportes(){
        homePage.clicaCategoriaBtn();
        homePage.clicaEsportesDropdown();

        String url = driver.getCurrentUrl();
        Assert.assertEquals("https://www.mercadolivre.com.br/c/esportes-e-fitness#menu=categories", url);
    }

    @Test
    public void testIrParaCarrinhoSemEstarLogado(){
        homePage.clicaCart();

        String alertMsg = BasePage.getText(By.cssSelector("#root-app > div > div.wrap > div > div.andes-card.andes-card--flat.andes-card--default.center-card__body.center-card__body--reduced.center-card__body--centered.center-card__body--footerless.andes-card--padding-default > div.center-card__header > h1"));
        Assert.assertEquals("Olá! Para adicionar ao carrinho, acesse a sua conta", alertMsg);
    }

    @Test
    public void testIrParaHistorico(){
        homePage.clicaHistorico();

        String url = driver.getCurrentUrl();
        Assert.assertEquals("https://www.mercadolivre.com.br/gz/home/navigation#nav-header", url);
    }

    @Test
    public void testIrParaContato(){
        homePage.clicaContato();

        String url = driver.getCurrentUrl();
        Assert.assertEquals("https://www.mercadolivre.com.br/ajuda#nav-header", url);
    }

    @Test
    public void testIrParaModa(){
        homePage.clicaModa();

        String url = driver.getCurrentUrl();
        Assert.assertEquals("https://www.mercadolivre.com.br/c/calcados-roupas-e-bolsas#nav-header", url);
    }

    @Test
    public void testIrParaVender(){
        homePage.clicaVender();

        String alertMsg = BasePage.getText(By.cssSelector("#root-app > div > div.wrap > div > div.andes-card.andes-card--flat.andes-card--default.center-card__body.center-card__body--reduced.center-card__body--centered.center-card__body--footerless.andes-card--padding-default > div.center-card__header > h1"));
        Assert.assertEquals("Olá! Para vender, acesse a sua conta", alertMsg);
    }

    @Test
    public void testIrParaMercadoria(){
        String nameItem = BasePage.getText(By.cssSelector("#root-app > div > div:nth-child(8) > section > section > div.carousel-container > div > div > div > div:nth-child(2) > div > div > a > div > div > h3"));
        BasePage.click(By.cssSelector("#root-app > div > div:nth-child(8) > section > section > div.carousel-container > div > div > div > div:nth-child(2)"));

        String itemSelectedPageTitle = BasePage.getText(By.cssSelector("#ui-pdp-main-container > div.ui-pdp-container__col.col-3.ui-pdp-container--column-center.pb-40 > div > div.ui-pdp-container__row.ui-pdp-with--separator--fluid.ui-pdp-with--separator--40 > div.ui-pdp-container__col.col-2.mr-32 > div.ui-pdp-container__top-wrapper.mt-40 > div > div.ui-pdp-header__title-container > h1"));

        Assert.assertEquals(nameItem, itemSelectedPageTitle);
    }
}
