package templateMethodPattern.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DefaultHelper extends AbstractHelper{
    @Override
    protected void visit() {
        System.out.println("어서오세요.");
    }

    @Override
    protected void menu() {
        System.out.println("소금빵을 주문하시려면 1을, 크로플을 주문하시려면 2를 눌러주세요.");
    }

    @Override
    protected String order() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        return bufferedReader.readLine();
    }

    @Override
    protected void end() {
        System.out.println("감사합니다.");
    }
}
