package PTA;

public class Judge {
    private Integer topicId;
    private Integer userAnswer;
    private Integer topicFraction;

    public Judge() {
    }

    public Judge(Integer topicId, Integer userAnswer, Integer topicFraction) {
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

    public Integer getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(Integer userAnswer) {
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
        return "Judge{" +
                "topicId=" + topicId +
                ", userAnswer=" + userAnswer +
                ", topicFraction=" + topicFraction +
                '}';
    }
}
