import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {
        Question[] questions = new Question[] {
            new Question("What is the capital of France?", new String[] {"Paris", "London", "Berlin", "Rome"}, 0),
            new Question("What is the largest planet in our solar system?", new String[] {"Earth", "Saturn", "Jupiter", "Uranus"}, 2),
            new Question("Who painted the Mona Lisa?", new String[] {"Leonardo da Vinci", "Michelangelo", "Raphael", "Caravaggio"}, 0)
        };

        int score = 0;
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            System.out.println(question.getQuestion());
            for (int i = 0; i < question.getAnswers().length; i++) {
                System.out.println((i + 1) + ". " + question.getAnswers()[i]);
            }

            System.out.print("Enter the number of your answer: ");
            int answer = scanner.nextInt() - 1;

            if (answer == question.getCorrectAnswer()) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer was " + question.getAnswers()[question.getCorrectAnswer()]);
            }
        }

        System.out.println("Your final score is " + score + " out of " + questions.length);
    }
}

class Question {
    private String question;
    private String[] answers;
    private int correctAnswer;

    public Question(String question, String[] answers, int correctAnswer) {
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getAnswers() {
        return answers;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }
}
