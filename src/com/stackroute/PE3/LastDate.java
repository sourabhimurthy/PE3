package com.stackroute.PE3;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class LastDate {


            public static String calendarClass () {

                String result;
                // Get calendar set to current date and time
                Calendar c = Calendar.getInstance();        // Set the calendar to monday of the current week
                c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
                System.out.println();

                // To print last and first dates of current week starting on Monday
                DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
                String monday = df.format(c.getTime());
                //System.out.println(df.format(c.getTime()));
                System.out.println(monday);
                for (int i = 0; i <6; i++) {
                    c.add(Calendar.DATE, 1);
                }
                String sunday = df.format(c.getTime());
                System.out.println(df.format(c.getTime()));
                System.out.println();
                System.out.println(monday+" "+sunday);
                return (monday + " " + sunday);
            }

            public static void main (String args[]) {
                //LastDate calClass = new LastDate(); //Object of calendar class
                calendarClass();
            }
        }

