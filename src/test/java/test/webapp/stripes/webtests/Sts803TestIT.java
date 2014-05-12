package test.webapp.stripes.webtests;

import com.google.common.base.Predicate;
import com.pojosontheweb.selenium.ManagedDriverJunit4TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sts803TestIT extends ManagedDriverJunit4TestBase {

    private static final String BASE_URL = System.getProperty("webtests.base.url", "http://localhost:8080/sts803");

    @Test
    public void testSts803() {
        getWebDriver().get(BASE_URL + "/index");
        // make sure our FORM has the appropriate binding !
        findr()
                .elem(By.id("testForm"))
                .where(new Predicate<WebElement>() {
                    @Override
                    public boolean apply(WebElement input) {
                        String action = input.getAttribute("action");
                        if (action==null) {
                            return false;
                        }
                        // need to strip the ;jsession stuff if any...
                        int jsessIndex = action.indexOf(";jsessionid");
                        if (jsessIndex!=-1) {
                            action = action.substring(0, jsessIndex);
                        }
                        // and base url
                        if (action.startsWith(BASE_URL)) {
                            action = action.substring(BASE_URL.length(), action.length());
                        }
                        return "/test".equals(action);
                    }
                })
                .eval();
    }
}
