package PTA;

public class singleOption {
    private Integer topicId;
    private String userAnswer;
    private Integer topicFraction;

    public singleOption() {
    }

    public singleOption(Integer topicId, String userAnswer, Integer topicFraction) {
        this.topicId = topicId;
        this.userAnswer = userAnswer;
        this.topicFraction = topicFraction;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    public Integer getTopicFraction() {
        return topicFraction;
    }

    public void setTopicFraction(Integer topicFraction) {
        this.topicFraction = topicFraction;
    }

    @Override
    public String toString() {
        return "singleOption{" +
                "topicId=" + topicId +
                ", userAnswer='" + userAnswer + '\'' +
                ", topicFraction=" + topicFraction +
                '}';
    }
}
