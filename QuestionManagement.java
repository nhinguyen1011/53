package Baitap;

public class QuestionManagement {
    private Question[] questions;

    public QuestionManagement() {
    }

    public QuestionManagement(Question[] questions) {
        this.questions = questions;
    }

    public String score(int n, int m) {
        System.out.println("you answered: " + n + "/" + m);
        return null;
    }

    public int check(int qual) {
        int i = 0;
        System.out.println("you chose question's level: " + qual);
        for (i = 0; i < questions.length; i++) {
            if (qual == questions[i].getLevel()) {
                System.out.println("question" + i + 1 + questions[i].getSubstance());
                System.out.println("answer A:" + questions[i].getAnswerA());
                System.out.println("answer B:" + questions[i].getAnswerB());
                System.out.println("answer C:" + questions[i].getAnswerC());
                System.out.println("answer D:" + questions[i].getAnswerD());
            }
        }
        if (i >= questions.length) {
            System.out.println("you chose level which don't have in system,please ");
        }
        return qual;
        private boolean answercorrect(String answer){
            if ( answercorrect == true){
                System.out.println("correct");
            else 
                 System.out.println("incorrect");
    }
}


