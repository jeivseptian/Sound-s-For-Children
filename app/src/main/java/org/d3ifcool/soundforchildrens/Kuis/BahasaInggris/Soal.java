package org.d3ifcool.soundforchildrens.Kuis.BahasaInggris;

import org.d3ifcool.soundforchildrens.R;

public class Soal {
    private Integer textQuestions[] = {
            R.drawable.apple,R.drawable.chicken,R.drawable.avocado,R.drawable.cherries,
            R.drawable.banana,R.drawable.cow,R.drawable.dog,R.drawable.frog,R.drawable.blueberries,
            R.drawable.eagle
    };

    // array of multiple choices for each question
    private String multipleChoice[][] = {
            {"Apple", "Blueberries", "Cherries", "Banana"},
            {"Cow","Eagle","Chicken","Dog"},
            {"Apple","Avocado","Cherries","Blueberries"},
            {"Cherries","Avocado","Banana","Strawberry"},
            {"Blueberries","Avocado","Banana","Strawberry"},
            {"Pig","Dog","Cow","Cat"},
            {"Frog","Dog","Cow","Cat"},
            {"Frog","Eagle","Cow","Cat"},
            {"Banana","Strawberry","Blueberries","Avocado"},
            {"Dog","Lion","Tiger","Eagle"},


    };

    private String mCorrectAnswers[] = {
            "Apple",
            "Chicken",
            "Avocado",
            "Cherries",
            "Banana",
            "Cow",
            "Dog",
            "Frog",
            "Blueberries",
            "Eagle"

    };

    public int getLength() {
        return textQuestions.length;
    }

    public Integer getQuestion(int a) {
        Integer question = textQuestions[a];
        return question;
    }

    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num - 1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
