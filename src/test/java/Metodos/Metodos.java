package Metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Metodos extends Browsers {

	/**
	 * Metodo para clicar em um elemento
	 * 
	 * @author Monica
	 * @param elemento
	 * @param passo
	 */
	public void clicar(By elemento, String passo) {
		try {
			Thread.sleep(3000);
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.err.println("----- Error ao clicar no passo -----" + passo + " " + e.getMessage());
		}

	}

	/**
	 * Metodo clicar por texto
	 * 
	 * @param tag
	 * @param texto
	 * @param passo
	 */
	public void clicarPorTexto(String tag, String texto, String passo) {
		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//" + tag + "[text()=\"" + texto + "\"]")).click();
		} catch (Exception e) {
			System.err.println("----- Error ao clicar por texto no passo -----" + passo + " " + e.getMessage());
		}

	}

	/**
	 * Metodo escrever
	 * 
	 * @param elemento
	 * @param texto
	 * @param passo
	 */
	public void escrever(By elemento, String texto, String passo) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.err.println("----- Error ao escrever no passo -----" + passo + " " + e.getMessage());
		}

	}

	public String getNome() {
		String generatedString = RandomStringUtils.randomAlphabetic(4);
		return ("Keeggo" + generatedString);
	}


    /**
    * Metodo para gerar email aleatorio usando Keeggo com mais 4 letras
    * @return
    */
   public String getEmail() {
	    String generatedString = RandomStringUtils.randomAlphabetic(3);
	    return (generatedString + "@keeggo.com");
}

		public void validarTexto(By elemento, String textoEsperado, String passo) {
			try {
				Thread.sleep(3000);
				String textoTela = driver.findElement(elemento).getText();
				assertEquals(textoEsperado, textoTela);
			} catch (Exception e) {
				System.err.println("----- Error ao validar texto no passo -----" + passo + " " + e.getMessage());
			}
		}
		
		 /* Metodo para tirar screenshot da tela
		 * 
		 * @author Monica
		 * @param nome
		 */
		public void screenShot(String nome, String passo) {
			try {
				TakesScreenshot scrShot = ((TakesScreenshot) driver);
				File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
				File destFile = new File("./Evidencias/" + nome + ".png");
				FileUtils.copyFile(scrFile, destFile);
			} catch (Exception e) {
				System.out.println("----- error no screenShot -----" + passo + " " + e.getMessage());
			}

		}

		public void fechar(String passo) {
			try {
				driver.quit();
			} catch (Exception e) {
				System.out.println("----- error ao fechar navegador -----" + passo + " " + e.getMessage());
			}
			
		}
		
	}

