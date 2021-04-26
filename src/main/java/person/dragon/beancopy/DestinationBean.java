package person.dragon.beancopy;

import java.util.Date;

public class DestinationBean {
    private String id;
    private Integer count;
    private Date date;
    private DestinationInnerClass innerClass;

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

    public DestinationInnerClass getInnerClass() {
        return innerClass;
    }

    public void setInnerClass(DestinationInnerClass innerClass) {
        this.innerClass = innerClass;
    }
}
