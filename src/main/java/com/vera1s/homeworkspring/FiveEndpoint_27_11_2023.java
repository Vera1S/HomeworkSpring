package com.vera1s.homeworkspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class FiveEndpoint_27_11_2023 {

   List<Integer> counterList = new ArrayList<>();
      private int counter = 0;

    @GetMapping("/save-and-reset")
    public String saveAndReset() {
        counterList.add(counter);
        int previousCounter = counter;
        counter = 0;
        return "Счетчик сохранен: " + previousCounter + ". Сброс счетчика.";
    }

    @GetMapping("/list")
    public List<Integer> getList() {
        return counterList;
    }

   @GetMapping("/count")
   public int getCount(){
       return counter++;
   }
    @GetMapping("/info")
    public String getInfo(){
        return "актуальное значение счетчика" + counter;
    }

    @GetMapping("/message")
    public String message() {
       Random random = new Random();
       boolean sentence = random.nextBoolean();

       if (sentence) {
           return "добро пожаловать";
       } else {
           return "мы вам не рады";
       }

    }
}
