package com.br.mercadolivre.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
    private static final By campoEmail = By.cssSelector("#user_id");
    private static final By continuarBtn = By.cssSelector("#login_user_form > div.login-form__actions > button");
    private static final By campoSenha = By.cssSelector("#password");
    private static final By iniciarSessaoBtn = By.cssSelector("#action-complete");
    private static final By continuarLoginTwoStepsBtn = By.cssSelector("#enrollment-greeting > div.andes-card.andes-card--flat.andes-card--default.enrollment-greeting__body.andes-card--padding-default > a");
    private static final By campoTelefone = By.cssSelector("#input-phone-form > div.andes-card.andes-card--flat.andes-card--default.center-card__body.andes-card--padding-default > div > div > div.andes-form-control.andes-form-control--textfield.andes-form-control--default.dropdown-input__textfield > label > div > input");
    private static final By continuarTelefoneBtn = By.cssSelector("#input-phone-form > div.andes-card.andes-card--flat.andes-card--default.center-card__body.andes-card--padding-default > div > button");

}
