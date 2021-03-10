package sandbox.frelli.somelibrary;

import java.util.Random;

public class SomeUtility {

    private static final Random r = new Random();
    private static final String[] responses = {
            "It is certain.",
            "It is decidedly so.",
            "Without a doubt.",
            "Yes – definitely.",
            "You may rely on it.",
            "As I see it, yes.",
            "Most likely.",
            "Outlook good.",
            "Yes.",
            "Signs point to yes.",
            "Reply hazy, try again.",
            "Ask again later.",
            "Better not tell you now.",
            "Cannot predict now.",
            "Concentrate and ask again.",
            "Don't count on it.",
            "My reply is no.",
            "My sources say no.",
            "Outlook not so good.",
            "Very doubtful.",
    };

    public String magicEightBall() {
        return responses[r.nextInt(responses.length)];
    }

    public boolean someNewMethod() {
        return false;
    }
}
