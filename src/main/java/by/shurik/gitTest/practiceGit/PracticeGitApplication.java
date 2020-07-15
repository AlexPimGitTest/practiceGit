package by.shurik.gitTest.practiceGit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeGitApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticeGitApplication.class, args);
        System.out.println("Aloha, Amigo");
        int h = (int) (Math.random()*10);
        if (h > 5) {
            System.out.println("aaaaaaa"+h);
        } else System.out.println("bbbbbb"+h);
    }


}
