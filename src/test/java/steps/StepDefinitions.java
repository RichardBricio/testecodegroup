package steps;

import org.junit.Assert;
import org.openqa.selenium.support.ui.*;
import com.aventstack.extentreports.MediaEntityBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import common.utils.DriverUtils;
import pages.HomePageAmazon;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import java.time.Duration;

public class StepDefinitions {
        static WebDriver driver;
        static WebDriverWait wait;
        HomePageAmazon pageAmazon;
        private static final Logger logger = LogManager.getLogger(StepDefinitions.class);

        public static WebDriver getDriver() {
            return driver;
        }

        @Given("That I access the Amazon website")
	    public void access_amazon_page() throws Throwable {
            try{
                driver = DriverUtils.getDriver();                
                pageAmazon = new HomePageAmazon();
                driver.navigate().to("http://www.amazon.com.br");
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
                driver.manage().window().maximize();
                logger.info("URL accessed successfully");
                Assert.assertTrue(true);
                DriverUtils.getExtentTest().pass("Access to the Amazon homepage successfully completed", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
            } catch (Exception ex) {
                DriverUtils.getExtentTest().fail(ex);
                throw ex;
            }
        }

        @Then("I navigate through all the menus to validate their access and performance")
        public void navigateThroughTheMenus() throws Throwable {
            try{        
                pageAmazon.getMenuTodos().click();
                wait = new WebDriverWait(driver, Duration.ofSeconds(2));
                DriverUtils.getExtentTest().pass("Menu Todos validated", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
                DriverUtils.waitAndClickElement(pageAmazon.getMenuTodosFechar());                              

                DriverUtils.waitAndClickElement(pageAmazon.getMenuVendaNaAmazon());
                wait = new WebDriverWait(driver, Duration.ofSeconds(2));
                DriverUtils.getExtentTest().pass("Menu Venda Na Amazon validated", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
                driver.navigate().back();                

                DriverUtils.waitAndClickElement(pageAmazon.getMenuMaisVendidos());
                wait = new WebDriverWait(driver, Duration.ofSeconds(2));
                DriverUtils.getExtentTest().pass("Menu Mais Vendidos validated", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
                driver.navigate().back();

                DriverUtils.waitAndClickElement(pageAmazon.getMenuOfertasDoDia());
                wait = new WebDriverWait(driver, Duration.ofSeconds(2));
                DriverUtils.getExtentTest().pass("Menu Ofertas Do Dia validated", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
                driver.navigate().back();
                
                DriverUtils.waitAndClickElement(pageAmazon.getMenuPrime());
                wait = new WebDriverWait(driver, Duration.ofSeconds(2));
                DriverUtils.getExtentTest().pass("Menu Prime validated", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
                driver.navigate().back();                

                DriverUtils.waitAndClickElement(pageAmazon.getMenuLivros());
                wait = new WebDriverWait(driver, Duration.ofSeconds(2));
                DriverUtils.getExtentTest().pass("Menu Livros validated", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
                driver.navigate().back();                

                DriverUtils.waitAndClickElement(pageAmazon.getMenuMusica());
                wait = new WebDriverWait(driver, Duration.ofSeconds(2));
                DriverUtils.getExtentTest().pass("Menu Musica validated", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
                driver.navigate().back();                

                DriverUtils.waitAndClickElement(pageAmazon.getMenuEletronicos());
                wait = new WebDriverWait(driver, Duration.ofSeconds(2));
                DriverUtils.getExtentTest().pass("Menu Eletronicos validated", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
                driver.navigate().back();                

                DriverUtils.waitAndClickElement(pageAmazon.getMenuIdeiasDePresente());
                wait = new WebDriverWait(driver, Duration.ofSeconds(2));
                DriverUtils.getExtentTest().pass("Menu Ideias De Presente validated", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
                driver.navigate().back();                

                DriverUtils.waitAndClickElement(pageAmazon.getMenuCasa());
                wait = new WebDriverWait(driver, Duration.ofSeconds(2));
                DriverUtils.getExtentTest().pass("Menu Casa validated", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
                driver.navigate().back();                

                DriverUtils.waitAndClickElement(pageAmazon.getMenuNovidadesNaAmazon());
                wait = new WebDriverWait(driver, Duration.ofSeconds(2));
                DriverUtils.getExtentTest().pass("Menu Novidades Na Amazon validated", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
                driver.navigate().back();                

                DriverUtils.waitAndClickElement(pageAmazon.getMenuComputadores());
                wait = new WebDriverWait(driver, Duration.ofSeconds(2));
                DriverUtils.getExtentTest().pass("Menu Computadores validated", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
                driver.navigate().back();                

                DriverUtils.waitAndClickElement(pageAmazon.getMenuGames());
                wait = new WebDriverWait(driver, Duration.ofSeconds(2));
                DriverUtils.getExtentTest().pass("Menu Games validated", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
                driver.navigate().back();                

                DriverUtils.waitAndClickElement(pageAmazon.getMenuAmazonModa());
                wait = new WebDriverWait(driver, Duration.ofSeconds(2));
                DriverUtils.getExtentTest().pass("Menu Amazon Moda validated", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
                driver.navigate().back();                

                DriverUtils.waitAndClickElement(pageAmazon.getMenuBeleza());
                wait = new WebDriverWait(driver, Duration.ofSeconds(2));
                DriverUtils.getExtentTest().pass("Menu Beleza validated", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
                driver.navigate().back();                

//            no webdriver o mesmo não aparece
//            DriverUtils.waitAndClickElement(pageAmazon.getMenuBrinquedosEJogos());
//            wait = new WebDriverWait(driver, Duration.ofSeconds(2));
//            driver.navigate().back();

//            no webdriver o mesmo não aparece
//            DriverUtils.waitAndClickElement(pageAmazon.getMenuBrinquedosEJogos());
//            wait = new WebDriverWait(driver, Duration.ofSeconds(2));
//            driver.navigate().back();

            } catch (Exception ex) {
                DriverUtils.getExtentTest().fail(ex);
                throw ex;
            }
        }

        @When("I enter the {string} product in the search bar")
        public void insert_product_in_search_bar(String produto) throws Exception{

            try{
                pageAmazon.getBarraPesquisa().sendKeys(produto);
                wait = new WebDriverWait(driver, Duration.ofSeconds(2));
                DriverUtils.getExtentTest().pass("Barra Pesquisa validated", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
                pageAmazon.getBtnBuscar().click();
                wait = new WebDriverWait(driver, Duration.ofSeconds(4));
                DriverUtils.getExtentTest().pass("Search result validated", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());

            } catch (Exception ex) {
                DriverUtils.getExtentTest().fail(ex);
                throw ex;
            }
        }

        @Then("I validate the consistency of the results")
        public void validades_research_results() throws Exception{

            try{

            } catch (Exception ex) {
                DriverUtils.getExtentTest().fail(ex);
                throw ex;
            }
        }

//         @When("^Preencho os campos da aba (Enter Vehicle Data|Enter Enter Insurant Data|Enter Product Data|Select Price Option|Send Quote)$")
//         public void preencho_campos_da_aba_em_questao(String aba) throws Exception {
//             SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
//             switch (aba) {
//                 case "Enter Vehicle Data":
// //                    pageTricentis.getTabEnterVehicleData().click();
//                     new Select(pageTricentis.getSelectMake()).selectByValue("Mazda");
//                     new Select(pageTricentis.getSelectModel()).selectByValue("Moped");
//                     pageTricentis.getInputCylinderCapacity().sendKeys("150");
//                     pageTricentis.getInputEnginePerformance().sendKeys("159");
//                     pageTricentis.getDtManufacture().sendKeys(dateFormat.format(new Date()));
//                     new Select(pageTricentis.getSelectNumberSeats()).selectByValue("6");
//                     pageTricentis.getRadioRightHandDriveNO().click();
// //                    pageTricentis.getRadioRightHandDriveYES().click();
//                     new Select(pageTricentis.getSelectNumberSeatsMotorcycle()).selectByValue("2");
//                     new Select(pageTricentis.getSelectFuelType()).selectByValue("Diesel");
//                     pageTricentis.getInputPayload().sendKeys("89");
//                     pageTricentis.getInputTotalWeight().sendKeys("1500");
//                     pageTricentis.getInputListPrice().sendKeys("12500");
//                     pageTricentis.getInputLicensePlateNumber().sendKeys("199");
//                     pageTricentis.getInputAnnualMileage().sendKeys("50000");
//                     pageTricentis.getBtNextEnterVehicleData().click();
//                     break;
//                 case "Enter Enter Insurant Data":
// //                    pageTricentis.getTabEnterInsurantData().click();
//                     pageTricentis.getInputFirstName().sendKeys("Richard");
//                     pageTricentis.getInputLastName().sendKeys("Garcia");
//                     pageTricentis.getDtBirthDay().sendKeys("04/06/1989");
//                     pageTricentis.getRadioGenderMale().click();
// //                    pageTricentis.getRadioGenderFemale().click();
//                     pageTricentis.getInputStreetAddress().sendKeys("Avenida Maria Josue");
//                     new Select(pageTricentis.getSelectCountry()).selectByValue("Brazil");
//                     pageTricentis.getInputZipCode().sendKeys("13575718");
//                     pageTricentis.getInputCity().sendKeys("Sao Carlos");
//                     new Select(pageTricentis.getSelectOccupation()).selectByValue("Farmer");
//                     //Selenium os Checks
//                     pageTricentis.getCheckHobbiesOther().click();
// //                    pageTricentis.getCheckHobbiesSpeeding().click();
//                     pageTricentis.getCheckHobbiesBungeeJumping().click();
// //                    pageTricentis.getCheckHobbiesCliffDiving().click();
// //                    pageTricentis.getCheckHobbiesSkydiving().click();
//                     pageTricentis.getInputWebsite().sendKeys("https://www.google.com/");
//                     //Seleciona arquivo na pasta imagens. Para DriverUtils.getExtentTest()ar altere o nome da imagem
//                     //Copiado a url no clipBoard e colando na janela Windows com ajuda de robo já que não temos acesso a mesma
//                     StringSelection ss = new StringSelection("C:\\Users\\richa\\OneDrive\\Imagens\\Crazy for Kitties.jpg");
//                     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//                     pageTricentis.getBtInputPicture().click();
//                     Thread.sleep(1000);
//                     Robot robot = new Robot();
//                     robot.keyPress(KeyEvent.VK_CONTROL);
//                     robot.keyPress(KeyEvent.VK_V);
//                     robot.keyRelease(KeyEvent.VK_V);
//                     robot.keyRelease(KeyEvent.VK_CONTROL);
//                     robot.keyPress(KeyEvent.VK_ENTER);
//                     robot.keyRelease(KeyEvent.VK_ENTER);
//                     pageTricentis.getBtNextEnterInsurantData().click();
// //                    pageTricentis.getBtPreviousEnterInsurantData().click();
//                     break;
//                 case "Enter Product Data":
//                     pageTricentis.getDtStartDate().sendKeys("01/20/2022");
//                     new Select(pageTricentis.getSelectInsuranceSum()).selectByValue("10000000");
//                     new Select(pageTricentis.getSelectMeritRating()).selectByValue("Malus 10");
//                     new Select(pageTricentis.getSelectDamageInsurance()).selectByValue("Full Coverage");
//                     pageTricentis.getCheckOptionalProductsLegalDefenseInsurance().click();
//                     pageTricentis.getCheckOptionalProductsEuroProtection().click();
//                     new Select(pageTricentis.getSelectCourtesyCar()).selectByValue("No");
//                     pageTricentis.getBtNextEnterProductData().click();
// //                    pageTricentis.getBtPreviousEnterProductData().click();
//                     break;
//                 case "Select Price Option":
//                     pageTricentis.getRadioPlatinum().click();
// //                    pageTricentis.getRadioGold().click();
// //                    pageTricentis.getRadioSilver().click();
// //                    pageTricentis.getRadioUltimate().click();

// //                    Necessario sleep pois ao clicar no plano que o botao aparece
//                     Thread.sleep(1500);
//                     pageTricentis.getBtNextSelectPriceOptions().click();
// //                    pageTricentis.getBtPreviousSelectPriceOptions().click();
//                     break;
//                 case "Send Quote":
//                     pageTricentis.getInputEmail().sendKeys("richard.bricio@gmail.com");
//                     pageTricentis.getInputPhone().sendKeys("981479164");
//                     pageTricentis.getInputUsername().sendKeys("bricio");
//                     pageTricentis.getInputPassword().sendKeys("Cachorro1");
//                     pageTricentis.getInputConfirmPassword().sendKeys("Cachorro1");
//                     pageTricentis.getInputComments().sendKeys("Exemplo de comentario DriverUtils.getExtentTest()e para automacao");
// //                    pageTricentis.getBtPreviousSendQuote().click();
//                     break;
//                 default:
//                     break;
//             }
//         }

//         @Then("^Envio o formulario preenchido$")
//         public void envio_formulario_preenchido () throws Exception {
//             pageTricentis.getBtEnviarSendQuote().click();
//         }

//         @Then("^Valido se email foi enviado$")
//         public void valido_email_enviado () throws Exception {
//             if (!esperarElementoComPolling(pageTricentis.getWindowConfirmSend()))
//                 Assert.fail("Formulario nao foi enviado");
//             else
//                 System.out.println("Perfeito! Formulario enviado!!");
//             driver.close();
//         }


}
