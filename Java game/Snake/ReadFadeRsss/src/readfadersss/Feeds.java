
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Feeds {

    private int id;

    private String url;

    private String title;

    private Date lastUpdate;

    private String name;

    private List<Items> item = new ArrayList<Items>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Items> getItem() {
        return item;
    }

    public void setItem(List<Items> item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Feeds [url=" + url + ", title=" + title + ", lastUpdate=" + lastUpdate + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Feeds other = (Feeds) obj;
        if (id != other.id) {
            return false;
        }
        return true;
    }

    public Feeds() {
        super();
    }

}
