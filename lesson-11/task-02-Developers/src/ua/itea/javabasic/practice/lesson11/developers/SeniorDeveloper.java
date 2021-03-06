package ua.itea.javabasic.practice.lesson11.developers;
public class SeniorDeveloper extends Developer {
    public SeniorDeveloper(String name, double basicSalary, int experience) {
        super(name, basicSalary, experience);
    }

    @Override
    public double getSalary() {
        return(basicSalary * 2) +
                (experience > 0 ? basicSalary * experience * 0.1 : 0);
    }
}
