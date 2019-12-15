package mainCsssr;


import com.codeborne.selenide.SelenideElement;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class widthMainPageTest {


    @Test
    public void comparingClassValue() {

        open("http://blog.csssr.ru/qa-engineer/");
        SelenideElement searchInput = $(".wrap");

        String classWidthSize = searchInput.getCssValue("width"); /*ширина блока класса wrap*/

        if("1000" != classWidthSize) {
            System.out.println("Ширина контента больше 1000, она равна " + classWidthSize);
        }else {
            System.out.println("Ширина контента равна");
        }
    }


}
