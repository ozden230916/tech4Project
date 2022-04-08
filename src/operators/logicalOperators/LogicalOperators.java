package operators.logicalOperators;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean isInterviewQuestionsSent = true;
        boolean isJavaHomeworkSent = true;

        // Send me interviewQuestions or javaHomework

        System.out.println("The students is okay : " + (isInterviewQuestionsSent || isJavaHomeworkSent));// true || true = true


    }
}
