package com.example.android.javajokes;

import java.util.ArrayList;
import java.util.Random;

public class javaJokes {

    private ArrayList<String> jokes;
    private static final String LOG_TAG = javaJokes.class.getSimpleName();

    public javaJokes() {
        jokes = new ArrayList<>();
        jokes.add("What kind of music are balloons afraid of? Pop Music");
        jokes.add("I had my credit card stolen the other day but I didn't bother to report it because the thief spends less than my wife.");
        jokes.add("To this day, the boy that used to bully me at school still takes my lunch money. On the plus side, he makes great Subway sandwiches.");
        jokes.add("You take away the looks, money, intelligence, charm and success and, really, there's no real difference between me and George Clooney.");
        jokes.add("I won $3 million on the lottery this weekend so I decided to donate a quarter of it to charity. Now I have $2,999,999.75.");
        jokes.add("Don't interrupt someone working intently on a puzzle. Chances are, you'll hear some crosswords.");
        jokes.add("I'm a big fan of whiteboards. I find them quite re-markable.");
        jokes.add("Yesterday, a clown held the door open for me. It was such a nice jester!");
        jokes.add("I'm only friends with 25 letters of the alphabet. I don't know Y.");
        jokes.add("Q. What sound does a sleeping T-Rex make? A. A dino-snore.");
        jokes.add("A man sued an airline company after it lost his luggage. Sadly, he lost his case.");
    }

    public String randomJokeGenerator(){
        Random r = new Random();
        int position = r.nextInt(jokes.size());
        return jokes.get(position);
    }

    public ArrayList<String> getJokes() {
        return jokes;
    }
}
