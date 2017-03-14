/**
 * Created by yanda on 14/03/2017.
 */
package id.sch.smktelkom_mlg.project2.xirpl5182535.gomemo;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Memo implements Serializable {
    private static DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy 'at' hh:mm aaa");
    private Date date;
    private String text;
    private boolean fullDisplayed;

    public Memo() {
        this.date = new Date();
    }

    public Memo(long time, String text) {
        this.date = new Date(time);
        this.text = text;
    }

    public String getDate() {
        return dateFormat.format(date);
    }

    public long getTime() {
        return date.getTime();
    }

    public void setTime(long time) {
        this.date = new Date(time);
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getShortText() {
        String temp = text.replaceAll("\n", " ");
        if (temp.length() > 25) {
            return temp.substring(0, 25) + "...";
        } else {
            return temp;
        }
    }

    public boolean isFullDisplayed() {
        return this.fullDisplayed;
    }

    public void setFullDisplayed(boolean fullDisplayed) {
        this.fullDisplayed = fullDisplayed;
    }

    @Override
    public String toString() {
        return this.text;
    }
}
