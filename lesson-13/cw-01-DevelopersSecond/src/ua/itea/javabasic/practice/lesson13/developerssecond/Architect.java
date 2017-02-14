package ua.itea.javabasic.practice.lesson13.developerssecond;
public class Architect extends Developer {
    public Architect(String name, double basicSalary, int experience) {
        super(name, basicSalary, experience);
    }

    @Override
    public double getSalary() {
        return(basicSalary * 6) +
                (experience > 0 ? basicSalary * experience * 0.1 : 0);
    }
}