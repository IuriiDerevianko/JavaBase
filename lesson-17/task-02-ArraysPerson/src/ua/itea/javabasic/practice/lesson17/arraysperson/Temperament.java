package ua.itea.javabasic.practice.lesson17.arraysperson;
enum Temperament {
    SANGUINE, PHLEGMATIC, SUPINE, CHOLERIC, MELANCHOLIC;
    public boolean isEqualsTo(Temperament another) {
        boolean result = (this == another);
        return result;
    }
}
