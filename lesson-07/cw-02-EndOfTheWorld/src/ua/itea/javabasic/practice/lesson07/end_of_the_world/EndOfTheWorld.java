package ua.itea.javabasic.practice.lesson07.end_of_the_world;
class EndOfTheWorld {
    private int year = 0;

    EndOfTheWorld() {
        this(2020);
    }

    EndOfTheWorld(int year) {
        this.year = year;
    }

    /*void setYear(int year) {
        if(year > 0) {
            this.year = year;
        }
    }
     */

    int getYear(){
        return year;
    }
}
