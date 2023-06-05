package com.automationacid.co.stepsdefinition;

import com.automationacid.co.questions.*;
import com.automationacid.co.tasks.CredencialesConduit;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static com.automationacid.co.ui.HomeConduitPage.BTN_GO_LOGIN;
import static com.automationacid.co.ui.LoginConduitPage.BTB_SIGN_IN;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;


public class LoginAppStepsDefinition {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("como {string} deseo loguearme")
    public void comoDeseoLoguearme(String actor) {
        OnStage.theActorCalled(actor).
                should(
                        seeThat(LogueoConduit.veoElHome(), equalTo(true)));
    }
    @When("las credenciales email {string} y password {string}")
    public void lasCredencialesUsuarioYContrasena(String email, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(BTN_GO_LOGIN)
        );
        OnStage.theActorInTheSpotlight().attemptsTo(
                new CredencialesConduit(email,password)
        );

    }
    @Then("valido inicio de sesion correcto")
    public void validoInicioDeSesionCorrecto() {
          OnStage.theActorInTheSpotlight().should(
                  GivenWhenThen.seeThat(IngresaCorrectamente.aLaSesion(),
                          equalTo(true))
          );
    }
    @When("no se ingresan las credenciales")
    public void noSeIngresanLasCredenciales() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(BTN_GO_LOGIN),
                Click.on(BTB_SIGN_IN)
        );

    }
    @Then("valido la excepcion del email")
    public void validoLaExcepcionDelEmail() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(CampoEmaildVacio.alLoguear(),
                        equalTo(true))
        );
    }
    @Then("valido la excepcion del password")
    public void validoLaExcepcionDelPassword() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(CampoPasswordVacio.alLoguear(),
                        equalTo(true))
        );
    }
    @Then("Valido mensaje del sistema cuando el usuario es inexistente")
    public void ValidoMensajeDelSistemaCuandoElUsuarioEsInexistente() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(LogueoUsuarioInexistente.enLaAplicacion(),
                        equalTo(true))
        );
    }
}
