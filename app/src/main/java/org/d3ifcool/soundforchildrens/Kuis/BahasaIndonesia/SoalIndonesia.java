package org.d3ifcool.soundforchildrens.Kuis.BahasaIndonesia;

import org.d3ifcool.soundforchildrens.R;

public class SoalIndonesia {

    private Integer textQuestions[] = {
            R.drawable.apple,R.drawable.chicken,R.drawable.avocado,R.drawable.cherries,
            R.drawable.banana,R.drawable.cow,R.drawable.dog,R.drawable.frog,R.drawable.blueberries,
            R.drawable.eagle
    };

    // array of multiple choices for each question
    private String multipleChoice[][] = {
            {"Apel", "Bluberi", "Ceri", "Pisang"},
            {"Sapi","Elang","Ayam","Anjing"},
            {"Apel","Alpukat","Ceri","Bluberi"},
            {"Ceri","Alpukat","Pisang","Stroberi"},
            {"Bluberi","Alpukat","Pisang","Stroberi"},
            {"Babi","Anjing","Sapi","Kucing"},
            {"Katak","Anjing","Sapi","Kucing"},
            {"Katak","Elang","Sapi","Kucing"},
            {"Pisang","Stroberi","Bluberi","Alpukat"},
            {"Anjing","Singa","Macan","Elang"},


    };

    private String mCorrectAnswers[] = {
            "Apel",
            "Ayam",
            "Alpukat",
            "Ceri",
            "Pisang",
            "Sapi",
            "Anjing",
            "Katak",
            "Bluberi",
            "Elang"

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


