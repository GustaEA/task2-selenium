package com.br.mercadolivre.pages;

import org.openqa.selenium.By;

public class SignInPage extends BasePage{
    private static final By termosCheckbox = By.cssSelector("#terms-and-conds");
    private static final By criarContaPessoalBtn = By.cssSelector("#landing > div.andes-card.andes-card--flat.andes-card--default.center-card__body.center-card__body--padding-0.card.andes-card--padding-0 > div.buttons-container > a.andes-button.andes-button--large.andes-button--loud");
    private static final By criarContaEmpresaBtn = By.cssSelector("#landing > div.andes-card.andes-card--flat.andes-card--default.center-card__body.center-card__body--padding-0.card.andes-card--padding-0 > div.buttons-container > a.andes-button.andes-button--large.andes-button--quiet");
    private static final By inserirEmailBtn = By.cssSelector("#hub > div.andes-card.andes-card--flat.andes-card--default.center-card__body.center-card__body--padding-48.hub-card.andes-card--padding-0 > div > ul > div > li > div.andes-list__item-second-column > span > button");
    private static final By campoEmail = By.cssSelector("#enter-email > div.andes-card.andes-card--flat.andes-card--default.center-card__body.center-card__body--padding-64.enter-email-card.andes-card--padding-0 > form > div > div.andes-form-control.andes-form-control--textfield.andes-form-control--default.enter-email-card__input > label > div > input");
    private static final By continuarBtn = By.cssSelector("#steps > div.andes-card.andes-card--flat.andes-card--default.center-card__body.center-card__body--padding-48.step-congrats-card.andes-card--padding-0 > button");
    private static final By confirmarIdentidadeBtn = By.cssSelector("#hub > div.andes-card.andes-card--flat.andes-card--default.center-card__body.center-card__body--padding-48.hub-card.andes-card--padding-0 > div > ul > div > li > div.andes-list__item-second-column > span > button");

}
