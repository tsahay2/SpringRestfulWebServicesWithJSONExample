package org.arpit.java2blog.bean;

import java.util.List;

/**
 * Created by TUSHAR on 08-09-2016.
 */
public class Layout_Extremes {
private String layout_id;
private int minimum_x;

    public List<Desk> getDesk() {
        return desk;
    }

    public void setDesk(List<Desk> desk) {
        this.desk = desk;
    }

    private List<Desk> desk;

    public String getLayout_id() {
        return layout_id;
    }

    public void setLayout_id(String layout_id) {
        this.layout_id = layout_id;
    }

    public int getMinimum_x() {
        return minimum_x;
    }

    public void setMinimum_x(int minimum_x) {
        this.minimum_x = minimum_x;
    }

    public int getMinimum_y() {
        return minimum_y;
    }

    public void setMinimum_y(int minimum_y) {
        this.minimum_y = minimum_y;
    }

    public int getMaximum_x() {
        return maximum_x;
    }

    public void setMaximum_x(int maximum_x) {
        this.maximum_x = maximum_x;
    }

    public int getMaximum_y() {
        return maximum_y;
    }

    public void setMaximum_y(int maximum_y) {
        this.maximum_y = maximum_y;
    }

    private int minimum_y;
    private int maximum_x;
    private int maximum_y;

}
