package TemplateMethodPattern.main;

import TemplateMethodPattern.template.AbstractHelper;
import TemplateMethodPattern.template.DefaultHelper;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        AbstractHelper abstractHelper = new DefaultHelper();
        abstractHelper.templateMethod();
    }
}
