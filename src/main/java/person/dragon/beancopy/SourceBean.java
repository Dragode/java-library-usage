package person.dragon.beancopy;

import java.util.Date;

public class SourceBean {
    private String id;
    private Integer count;
    private Date date;
    private SourceInnerClass innerClass;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public SourceInnerClass getInnerClass() {
        return innerClass;
    }

    public void setInnerClass(SourceInnerClass innerClass) {
        this.innerClass = innerClass;
    }
}
