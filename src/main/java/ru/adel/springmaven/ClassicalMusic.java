package ru.adel.springmaven;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    private ClassicalMusic() { }    //this private method implies us to use factory method

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Doing my initialization...");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction...");
    }

    @Override
    public String getSong() {
        return "King and Charcoal Burner";
    }
}
