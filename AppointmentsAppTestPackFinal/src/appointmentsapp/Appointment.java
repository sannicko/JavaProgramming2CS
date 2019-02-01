/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appointmentsapp;

/**
 *
 */
public abstract class Appointment {
    private String description;
    private String lastName;
    private int hour;       //(00-23)
    private int minutes;    //(00-59)

    //abstract method occursOn
    public abstract boolean occursOn(int year, int day, int month);

    public abstract int getDay();

    //Setter method for appointment person's last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Setter method for appointment description
    public void setDescription(String description) {
        this.description = description;
    }

    //Setter method for appointment minute
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    //Setter method for appointment minute
    public void setHour(int hour) {
        this.hour = hour;
    }

    //Getter method for retrieving appointment description
    public String getDescription() {
        return this.description;
    }

    //Getter method for retrieving person's last name
    public String getLastName() {
        return this.lastName;
    }

    //Getter method for hour
    public int getHour() {
        return this.hour;

    }

    //Getter method for minutes
    public int getMinutes() {
        return this.minutes;
    }

    @Override
    public String toString() {
        return description
                + lastName
                + Integer.toString(hour)
                + Integer.toString(minutes);
    }


}
