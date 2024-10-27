package templateMethodPattern.main;

import templateMethodPattern.template.AbstractHelper;
import templateMethodPattern.template.DefaultHelper;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        AbstractHelper abstractHelper = new DefaultHelper();
        abstractHelper.templateMethod();
    }
}
