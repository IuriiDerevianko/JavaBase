//D
package ua.itea.javabasic.practice.lesson06.timestablestaticclass;
public class Main {
    public static void main(String[] args) {
        CreaterTable table = new CreaterTable();
        table.createTable();
        CreaterRandomTable randomTable = new CreaterRandomTable();
        randomTable.createRandomTable(table.firstNumber, table.secondNumber);
        CreaterResultRandomTable resultRandomTable = new CreaterResultRandomTable();
        resultRandomTable.createResultRandomTable(randomTable.firstNumberRandom, randomTable.secondNumberRandom);
        OutputResultRandomTable outputResultRandomTable = new OutputResultRandomTable();
        outputResultRandomTable.showResultRandomTable(resultRandomTable.result);
    }
}
