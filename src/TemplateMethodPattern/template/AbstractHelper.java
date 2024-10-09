package TemplateMethodPattern.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class AbstractHelper {
    protected abstract void visit();

    protected abstract void menu();

    protected abstract String order() throws IOException ;

    protected abstract void end();

    public final void templateMethod() throws IOException {
        visit();
        menu();
        String orderStr = order();
        switch (orderStr){
            case "1" :
                System.out.println("소금빵을 주문하셨습니다.");
            case "2" :
                System.out.println("크로플을 주문하셨습니다.");
            default:
                System.out.println("잘못된 주문입니다.");
        }
        end();
    }
}
