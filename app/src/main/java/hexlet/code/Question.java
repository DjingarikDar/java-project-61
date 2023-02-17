package hexlet.code;

public class Question {
    public static String getQuestionString(String...parts) {
        StringBuilder resultQuestion = new StringBuilder("Question:");
        for (String part : parts) {
            resultQuestion.append(" ");
            resultQuestion.append(part);
        }
        return resultQuestion.toString();
    }
}
