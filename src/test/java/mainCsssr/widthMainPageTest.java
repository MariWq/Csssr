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
        String realWidth = new String("1000px"); //дефолтное значение

        if(classWidthSize.equals(realWidth)) {
            System.out.println("Ширина контента равна 1000px");
        }
        else {
            System.out.println("Ширина контента больше 1000, width = " + classWidthSize);
        }
    }


}
