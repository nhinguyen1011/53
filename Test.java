package Baitap;


import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Test {
    private Question[] questions;
    public Test() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number question you want: ");
        int n = scanner.nextInt();
        questions = new Question[n];
        for (int i=0;i<n;i++){
            System.out.println("enter the question: ");
            String substane = scanner.nextLine();
            System.out.println("enter the level: ");
            int level = scanner.nextInt();
            System.out.println("enter the answer A: ");
            String answerA = scanner.nextLine();
            System.out.println("enter the answer B: ");
            String answerB = scanner.nextLine();
            System.out.println("enter the answer C: ");
            String answerC = scanner.nextLine();
            System.out.println("enter the answer D: ");
            String answerD = scanner.nextLine();
            System.out.println("enter the answer correct: ");
            String correct = scanner.nextLine();
            questions[i]= new Question();
            questions[i].setLevel(level);
            questions[i].setSubstance(substane);
            questions[i].setAnswerA(answerA);
            questions[i].setAnswerB(answerB);
            questions[i].setAnswerC(answerC);
            questions[i].setAnswerD(answerD);
        }
        System.out.println();
        QuestionManagement questionManagement = new QuestionManagement(questions);
        System.out.println(" enter level you want: ");
        int qual = scanner.nextInt();
        questionManagement.check(qual);
        System.out.println();
        System.out.println("enter answer: ");
        String answer = scanner.nextLine();
        int j=0,k=0;
        for (int i=0;i<questions.length;i++) {
            if (qual == questions[i].getLevel()) {
                j++;
                System.out.println("question " + (i + 1) + ":");
                char a = answer.charAt(i);
                System.out.println("answer: " + a);
                char out = questions[i].getCorrect().charAt(i);
                if (a == out) {
                    questions[i].answercorrect(true);
                    k++;
                } else
                    questions[i].answercorrect(false);
                    System.out.println(" answer" + questions[i].getCorrect());
            }

    }
   System.out.println();
   System.out.println(questionManagement.score(k, i)); 
    }

}
