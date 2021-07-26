package PTA;

import java.sql.Timestamp;
import java.util.List;

public class HasStatic {
    private Integer accountId;
    private Integer qtopicsetId;
    private Integer topicsetId;
    private List<?> list;
    private Timestamp timestamp;

    public HasStatic() {
    }

    public HasStatic(Integer accountId, Integer qtopicsetId, Integer topicsetId, List<?> list, Timestamp timestamp) {
        this.accountId = accountId;
        this.qtopicsetId = qtopicsetId;
        this.topicsetId = topicsetId;
        this.list = list;
        this.timestamp = timestamp;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getQtopicsetId() {
        return qtopicsetId;
    }

    public void setQtopicsetId(Integer qtopicsetId) {
        this.qtopicsetId = qtopicsetId;
    }

    public Integer getTopicsetId() {
        return topicsetId;
    }

    public void setTopicsetId(Integer topicsetId) {
        this.topicsetId = topicsetId;
    }

    public List<?> getList() {
        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

}