package org.zaika.composite.exeptions;

public class IncorrectSalaryException extends Exception {
    public IncorrectSalaryException() {}
    public IncorrectSalaryException(String msg) {
        super(msg);
    }
}
