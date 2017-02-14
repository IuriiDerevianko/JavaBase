//D
package ua.itea.javabasic.practice.lesson18.cw01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Загружаем класс драйвера
        try {
            Class.forName("org.hsqldb.jdbcDriver");
            //Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Не удалось загрузить драйвер БД.");
            e.printStackTrace();
            System.exit(1);
        }

        // Cоздаем соединение, здесь db это путь к папке где будут хранится
        // файлы БД. mydb имя базы данных. SA это имя пользователя который
        // создается автоматически при создании БД пароль для него пустой. Если
        // такой базы данных нет она будет автоматически создана.
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(
                    "jdbc:hsqldb:file:db/mydb", "SA", "");
        } catch (SQLException e) {
            System.err.println("Не удалось cоздать соединение.");
            e.printStackTrace();
            System.exit(1);
        }


        Date nowDate = new Date();
        System.out.println("----------------------------------------------------------------------------------------" +
                "-----------------------------------------------------------------");
        System.out.println("Добро пожаловать в БД \"Риелтор\" v1.0                                                  " +
                "                                       " + nowDate);
        System.out.println("----------------------------------------------------------------------------------------" +
                "-----------------------------------------------------------------\n");

        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Statement statement;
        ResultSet resultSet;
        int choice;
        String query;
        int id;
        String city;
        String district;
        String address;
        int area;
        int rooms;
        int floor;
        int price;
        int brokerId;
        int ownerId;
        String status;
        do {
            System.out.println("========================================================================================" +
                    "=================================================================");
            System.out.println("Выберите номер действия:");
            System.out.println("\t1. Вывести на экран таблицы квартир, риелторов и владельцев;");
            System.out.println("\t2. Добавить квартиру;");
            System.out.println("\t3. Изменить инф. о квартире;");
            System.out.println("\t4. Удалить инф. о квартире;");
            System.out.println("\t5. Откатить БД;");
            System.out.println("\t6. Выход;");
            System.out.println("----------------------------------------------------------------------------------------" +
                    "-----------------------------------------------------------------\n");
            choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("1. Вывести на экран таблицы квартир, риелторов и владельцев;\n");

                    try {
                        statement = connection.createStatement();
                        // Достаю записи из таблицы.
                        query = "SELECT * FROM apartments";
                        resultSet = statement.executeQuery(query);

                        // Вывожу на экран.
                        System.out.println("\tТаблица квартир.\n");
                        System.out.printf("%-5s%-15s%-15s%-40s%-15s%-8s%-8s%-14s%-12s%-12s%-12s%n", "id", "City", "District", "Address", "Area, (m^2)", "Rooms",
                                "Floor", "Price, (" + (char) (0x20B4) + ")", "Status", "Broker id", "Owner id");
                        System.out.println("----------------------------------------------------------------------------------------" +
                                "-----------------------------------------------------------------");
                        while (resultSet.next()) {
                            System.out.printf("%-5d%-15s%-15s%-40s%-15d%-8d%-8d%-14d%-12s%-12d%-12d%n", resultSet.getInt(1), resultSet.getString(2),
                                    resultSet.getString(3), resultSet.getString(4), resultSet.getInt(5), resultSet.getInt(6),
                                    resultSet.getInt(7), resultSet.getInt(8), resultSet.getString(9), resultSet.getInt(10), resultSet.getInt(11));
                        }
                        System.out.println();
                        System.out.println();
                        resultSet.close();
                        statement.close();

                        statement = connection.createStatement();
                        // Достаю записи из таблицы.
                        query = "SELECT * FROM brokers";
                        resultSet = statement.executeQuery(query);

                        // Вывожу на экран.
                        System.out.println("\tТаблица риелторов.\n");
                        System.out.printf("%-5s%-20s%-20s%-30s%-30s%n", "id", "First Name", "Last Name", "Phone", "e-mail");
                        System.out.println("----------------------------------------------------------------------------------------" +
                                "-----------------------------------------------------------------");
                        while (resultSet.next()) {
                            System.out.printf("%-5d%-20s%-20s%-30s%-30s%n", resultSet.getInt(1), resultSet.getString(2),
                                    resultSet.getString(3), resultSet.getString(4), resultSet.getString(5));
                        }
                        System.out.println();
                        System.out.println();
                        resultSet.close();
                        statement.close();


                        statement = connection.createStatement();
                        // Достаю записи из таблицы.
                        query = "SELECT * FROM owners";
                        resultSet = statement.executeQuery(query);

                        // Вывожу на экран.
                        System.out.println("\tТаблица владельцев.\n");
                        System.out.printf("%-5s%-20s%-20s%-20s%-30s%-30s%n", "id", "Company", "First Name", "Last Name", "Phone", "e-mail");
                        System.out.println("----------------------------------------------------------------------------------------" +
                                "-----------------------------------------------------------------");
                        while (resultSet.next()) {
                            System.out.printf("%-5d%-20s%-20s%-20s%-30s%-30s%n", resultSet.getInt(1), resultSet.getString(2),
                                    resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6));
                        }
                        System.out.println();
                        System.out.println();
                        resultSet.close();
                        statement.close();


                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;


                case 2:
                    System.out.println("2. Добавить квартиру;");
                    try {
                        statement = connection.createStatement();
                        // Добавляем записи в таблицу.
                        System.out.println("\tВведите город (в форм.: Ххххх):");
                        city = reader.readLine();
                        System.out.println("\tВведите район (в форм.: Хххххх):");
                        district = reader.readLine();
                        System.out.println("\tВведите адрес (в форм.: ул. Хххх, д. ХХ, кв. ХХ):");
                        address = reader.readLine();
                        System.out.println("\tВведите площадь квартиры в м^2 (в форм.: 00):");
                        area = scanner.nextInt();
                        System.out.println("\tВведите количество комнат (в форм.: 0):");
                        rooms = scanner.nextInt();
                        System.out.println("\tВведите номер этажа (в форм.: 0):");
                        floor = scanner.nextInt();
                        System.out.println("\tВведите стоимость продажи в " + (char) (0x20B4) + " (в форм.: 00000000):");
                        price = scanner.nextInt();
                        System.out.println("\tВведите состояние продажи (в форм.: sold/not sold):");
                        status = reader.readLine();
                        System.out.println("\tВведите номер (id) обслуживающего риелтора (в форм.: 0):");
                        brokerId = scanner.nextInt();
                        System.out.println("\tВведите номер (id) владельца квартиры (в форм.: 0):");
                        ownerId = scanner.nextInt();
                        query = "INSERT INTO apartments VALUES(null, '" + city + "', '" + district + "', '" + address
                                + "', " + area + ", " + rooms + ", " + floor + ", " + price + ", '" + status + "', " + brokerId + ", " + ownerId + ")";
                        statement.executeUpdate(query);
                        statement.close();
                        System.out.println("\tИнф. о квартире добавлена;\n");
                    } catch (SQLException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;


                case 3:
                    System.out.println("3. Изменить инф. о квартире;");
                    try {
                        statement = connection.createStatement();
                        System.out.println("\tВведите номер (id) квартиры которую Вы хотите изменить: ");
                        id = scanner.nextInt();
                        // Достаю записи из таблицы.
                        query = "SELECT * FROM apartments WHERE id = " + id;
                        resultSet = statement.executeQuery(query);

                        // Вывожу на экран.
                        System.out.printf("%-5s%-15s%-15s%-40s%-15s%-8s%-8s%-14s%-12s%-12s%-12s%n", "id", "City", "District", "Address", "Area, (m^2)", "Rooms",
                                "Floor", "Price, (" + (char) (0x20B4) + ")", "Status", "Broker id", "Owner id");
                        System.out.println("----------------------------------------------------------------------------------------" +
                                "-----------------------------------------------------------------");
                        while (resultSet.next()) {
                            System.out.printf("%-5d%-15s%-15s%-40s%-15d%-8d%-8d%-14d%-12s%-12d%-12d%n", resultSet.getInt(1), resultSet.getString(2),
                                    resultSet.getString(3), resultSet.getString(4), resultSet.getInt(5), resultSet.getInt(6),
                                    resultSet.getInt(7), resultSet.getInt(8), resultSet.getString(9), resultSet.getInt(10), resultSet.getInt(11));
                        }
                        System.out.println();

                        System.out.println("Вы точно хотите изменить инф. по этой квартире? (Y/N):");
                        String st = reader.readLine();
                        if(st.equalsIgnoreCase("Y")) {
                            System.out.println("Выберите какую инф. Вы хотите изменить по этой квартире:");
                            System.out.println("\t1. City;");
                            System.out.println("\t2. District;");
                            System.out.println("\t3. Address;");
                            System.out.println("\t4. Area, (m^2);");
                            System.out.println("\t5. Rooms;");
                            System.out.println("\t6. Floor;");
                            System.out.println("\t7. Price, (" + (char) (0x20B4) + ");");
                            System.out.println("\t8. Status, (sold/not sold);");
                            System.out.println("\t9. Broker Id;");
                            System.out.println("\t10. Owner Id;");
                            System.out.println();
                            System.out.println("\t0. Exit;");
                            int i = scanner.nextInt();
                            do {
                                switch (i) {
                                    case 1:
                                        System.out.println("1. City;");
                                        System.out.println("\tВведите город (в форм.: Ххххх):");
                                        city = reader.readLine();
                                        query = "UPDATE apartments SET city = '" + city + "' WHERE id = " + id;
                                        statement.executeUpdate(query);
                                        System.out.println("Запись по полю City изменена.\n");
                                        break;

                                    case 2:
                                        System.out.println("2. District;");
                                        System.out.println("\tВведите район (в форм.: Хххххх):");
                                        district = reader.readLine();
                                        query = "UPDATE apartments SET district = '" + district + "' WHERE id = " + id;
                                        statement.executeUpdate(query);
                                        System.out.println("Запись по полю District изменена.\n");
                                        break;

                                    case 3:
                                        System.out.println("3. Address;");
                                        System.out.println("\tВведите адрес (в форм.: ул. Хххх, д. ХХ, кв. ХХ):");
                                        address = reader.readLine();
                                        query = "UPDATE apartments SET address = '" + address + "' WHERE id = " + id;
                                        statement.executeUpdate(query);
                                        System.out.println("Запись по полю Address изменена.\n");
                                        break;

                                    case 4:
                                        System.out.println("4. Area, (m^2);");
                                        System.out.println("\tВведите площадь квартиры в м^2 (в форм.: 00):");
                                        area = scanner.nextInt();
                                        query = "UPDATE apartments SET area = '" + area + "' WHERE id = " + id;
                                        statement.executeUpdate(query);
                                        System.out.println("Запись по полю Area изменена.\n");
                                        break;

                                    case 5:
                                        System.out.println("5. Rooms;");
                                        System.out.println("\tВведите количество комнат (в форм.: 0):");
                                        rooms = scanner.nextInt();
                                        query = "UPDATE apartments SET rooms = '" + rooms + "' WHERE id = " + id;
                                        statement.executeUpdate(query);
                                        System.out.println("Запись по полю Rooms изменена.\n");
                                        break;

                                    case 6:
                                        System.out.println("6. Floor;");
                                        System.out.println("\tВведите номер этажа (в форм.: 0):");
                                        floor = scanner.nextInt();
                                        query = "UPDATE apartments SET floor = '" + floor + "' WHERE id = " + id;
                                        statement.executeUpdate(query);
                                        System.out.println("Запись по полю Floor изменена.\n");
                                        break;

                                    case 7:
                                        System.out.println("7. Price, (" + (char) (0x20B4) + ");");
                                        System.out.println("\tВведите стоимость продажи в " + (char) (0x20B4) + " (в форм.: 00000000):");
                                        price = scanner.nextInt();
                                        query = "UPDATE apartments SET price = '" + price + "' WHERE id = " + id;
                                        statement.executeUpdate(query);
                                        System.out.println("Запись по полю Price изменена.\n");
                                        break;

                                    case 8:
                                        System.out.println("8. Status, (sold/not sold);");
                                        System.out.println("\tВведите состояние продажи (в форм.: sold/not sold):");
                                        status = reader.readLine();
                                        query = "UPDATE apartments SET status = '" + status + "' WHERE id = " + id;
                                        statement.executeUpdate(query);
                                        System.out.println("Запись по полю Status изменена.\n");
                                        break;

                                    case 9:
                                        System.out.println("9. Broker Id;");
                                        System.out.println("\tВведите номер (id) обслуживающего риелтора (в форм.: 0):");
                                        brokerId = scanner.nextInt();
                                        query = "UPDATE apartments SET brokerId = '" + brokerId + "' WHERE id = " + id;
                                        statement.executeUpdate(query);
                                        System.out.println("Запись по полю Broker Id изменена.\n");
                                        break;

                                    case 10:
                                        System.out.println("10. Owner Id;");
                                        System.out.println("\tВведите номер (id) владельца квартиры (в форм.: 0):");
                                        ownerId = scanner.nextInt();
                                        query = "UPDATE apartments SET ownerId = '" + ownerId + "' WHERE id = " + id;
                                        statement.executeUpdate(query);
                                        System.out.println("Запись по полю Owner Id изменена.\n");
                                        break;


                                    case 0:
                                        System.out.println("0. Exit;");
                                        System.out.println("Отмена. Не одна запись не по одному полю не изменена.\n");
                                        break;

                                    default:
                                        System.out.println("Вы ввели несуществующую комманду. Пожалуйста, попробуйте еще раз.\n");
                                        break;
                                }
                            }
                            while ((i != 0) && (i != 1) && (i != 2) && (i != 3) && (i != 4) && (i != 5) && (i != 6) && (i != 7)
                                    && (i != 8) && (i != 9) && (i != 10));
                        } else {
                            if(st.equalsIgnoreCase("N")) {
                                System.out.println("Отмена.");
                            } else {
                                System.out.println("Вы ввели несуществующую комманду. Пожалуйста, попробуйте еще раз.\n");
                            }
                        }
                        resultSet.close();
                        statement.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;


                case 4:
                    System.out.println("4. Удалить инф. о квартире;");
                    try {
                        statement = connection.createStatement();
                        System.out.println("\tВведите номер (id) квартиры которую Вы хотите удалить: ");
                        id = scanner.nextInt();

                        System.out.println("Информация по этой квартире будет удалена.\n");
                        // Достаю записи из таблицы.
                        query = "SELECT * FROM apartments WHERE id = " + id;
                        resultSet = statement.executeQuery(query);

                        // Вывожу на экран.
                        System.out.printf("%-5s%-15s%-15s%-40s%-15s%-8s%-8s%-14s%-12s%-12s%-12s%n", "id", "City", "District", "Address", "Area, (m^2)", "Rooms",
                                "Floor", "Price, (" + (char) (0x20B4) + ")", "Status", "Broker id", "Owner id");
                        System.out.println("----------------------------------------------------------------------------------------" +
                                "-----------------------------------------------------------------");
                        while (resultSet.next()) {
                            System.out.printf("%-5d%-15s%-15s%-40s%-15d%-8d%-8d%-14d%-12s%-12d%-12d%n", resultSet.getInt(1), resultSet.getString(2),
                                    resultSet.getString(3), resultSet.getString(4), resultSet.getInt(5), resultSet.getInt(6),
                                    resultSet.getInt(7), resultSet.getInt(8), resultSet.getString(9), resultSet.getInt(10), resultSet.getInt(11));
                        }
                        System.out.println();
                        System.out.println("Вы точно хотите удалить инф. по этой квартире? (Y/N):");
                        String st = reader.readLine();
                        if(st.equalsIgnoreCase("Y")) {
                            query = "DELETE FROM apartments WHERE id = " + id;
                            statement.executeQuery(query);
                            System.out.println("Информация по выбранной квартире удалена.\n");
                        } else {
                            if(st.equalsIgnoreCase("N")) {
                                System.out.println("Отмена.");
                            } else {
                                System.out.println("Вы ввели несуществующую комманду. Пожалуйста, попробуйте еще раз.\n");
                            }
                        }
                        resultSet.close();
                        statement.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;


                case 5:
                    System.out.println("5. Откатить БД;");

                    try {

                        //Удаляем таблицу apartments.
                        try {
                            statement = connection.createStatement();
                            query = "DROP TABLE apartments";
                            statement.executeUpdate(query);
                            statement.close();
                        } catch (SQLException e) {
                            // Если таблица не создана, будет исключение, игнорируем его.
                            // В реальных проектах так не делают.
                        }

                        // Создаем таблицу со столбцами id, city, district, address, area, rooms, floor, price, status, brokerId, ownerId.
                        statement = connection.createStatement();
                        query = "CREATE TABLE apartments (" +
                                "id INTEGER GENERATED BY DEFAULT AS IDENTITY(START WITH 1, INCREMENT BY 1) PRIMARY KEY, " +
                                "city VARCHAR(20) NOT NULL, " +
                                "district VARCHAR(20) NOT NULL, " +
                                "address VARCHAR(40) NOT NULL, " +
                                "area INTEGER, " +
                                "rooms INTEGER, " +
                                "floor INTEGER, " +
                                "price INTEGER, " +
                                "status VARCHAR(15), " +
                                "brokerId INTEGER, " +
                                "ownerId INTEGER " +
                                //"brokerId INTEGER NOT NULL FOREIGN KEY REFERENCES brokers(id), " +
                                //"ownerId INTEGER NOT NULL FOREIGN KEY REFERENCES owners(id)" +
                                ");";
                        statement.executeUpdate(query);
                        statement.close();

                        // Добавляем записи в таблицу.
                        statement = connection.createStatement();
                        query = "INSERT INTO apartments VALUES(null, 'Киев', 'Деснянский', 'ул. Милютенко, д. 11, кв. 71', 32, 1, 2, 515000, 'not sold', 1, 1)";
                        statement.executeUpdate(query);
                        query = "INSERT INTO apartments VALUES(null, 'Киев', 'Деснянский', 'ул. Шолом-Алейхема, д. 6, кв. 34', 43, 1, 5, 540000, 'not sold', 1, 1)";
                        statement.executeUpdate(query);
                        query = "INSERT INTO apartments VALUES(null, 'Киев', 'Деснянский', 'ул. Николая Матеюка, д. 2, кв. 14', 33, 1, 1, 505000, 'sold', 1, 1)";
                        statement.executeUpdate(query);
                        query = "INSERT INTO apartments VALUES(null, 'Киев', 'Дарницкий', 'ул. Урловская, д. 24, кв. 124', 38, 1, 24, 830000, 'not sold', 3, 2)";
                        statement.executeUpdate(query);
                        query = "INSERT INTO apartments VALUES(null, 'Киев', 'Дарницкий', 'ул. Анны Ахматовой, д. 26, кв. 23', 56, 2, 7, 935000, 'not sold', 3, 2)";
                        statement.executeUpdate(query);
                        query = "INSERT INTO apartments VALUES(null, 'Киев', 'Днепровский', 'ул. Пожарского, д. 1, кв. 11', 52, 2, 3, 675500, 'not sold',2 ,3)";
                        statement.executeUpdate(query);
                        query = "INSERT INTO apartments VALUES(null, 'Киев', 'Днепровский', 'ул. Минина, д. 3, кв. 43', 71, 3, 2, 783000, 'sold', 2, 3)";
                        statement.executeUpdate(query);
                        statement.close();


                       //Удаляем таблицу brokers.
                        try {
                            statement = connection.createStatement();
                            query = "DROP TABLE brokers";
                            statement.executeUpdate(query);
                            statement.close();
                        } catch (SQLException e) {
                            // Если таблица не создана, будет исключение, игнорируем его.
                            // В реальных проектах так не делают.
                        }

                        // Создаем таблицу со столбцами id, first name, last name, phone, email.
                        statement = connection.createStatement();
                        query = "CREATE TABLE brokers (" +
                                "id INTEGER GENERATED BY DEFAULT AS IDENTITY(START WITH 1, INCREMENT BY 1) PRIMARY KEY, " +
                                "firstName VARCHAR(30) NOT NULL, " +
                                "lastName VARCHAR(30) NOT NULL, " +
                                "phone VARCHAR(30) NOT NULL, " +
                                "email VARCHAR(30) NOT NULL" +
                                ");";
                        statement.executeUpdate(query);
                        statement.close();


                        // Добавляем записи в таблицу.
                        statement = connection.createStatement();
                        query = "INSERT INTO brokers VALUES(null, 'Юрий', 'Деревянко', '+380 95 895 77 60', 'iurii.derevianko@gmail.com')";
                        statement.executeUpdate(query);
                        query = "INSERT INTO brokers VALUES(null, 'Алина', 'Древко', '+380 68 320 65 66', 'alina.drevko@gmail.com')";
                        statement.executeUpdate(query);
                        query = "INSERT INTO brokers VALUES(null, 'Ирина', 'Дубкова', '+380 95 398 93 81', 'irina.dubkova@gmail.com')";
                        statement.executeUpdate(query);
                        statement.close();


                        //Удаляем таблицу owners.
                        try {
                            statement = connection.createStatement();
                            query = "DROP TABLE owners";
                            statement.executeUpdate(query);
                            statement.close();
                        } catch (SQLException e) {
                            // Если таблица не создана, будет исключение, игнорируем его.
                            // В реальных проектах так не делают.
                        }

                        // Создаем таблицу со столбцами id, company, firstName, lastName, phone, email.
                        statement = connection.createStatement();
                        query = "CREATE TABLE owners (" +
                                "id INTEGER GENERATED BY DEFAULT AS IDENTITY(START WITH 1, INCREMENT BY 1) PRIMARY KEY, " +
                                "company VARCHAR(30), " +
                                "firstName VARCHAR(30), " +
                                "lastName VARCHAR(30), " +
                                "phone VARCHAR(30) NOT NULL, " +
                                "email VARCHAR(30) NOT NULL" +
                                ")";
                        statement.executeUpdate(query);
                        statement.close();


                        // Добавляем записи в таблицу.
                        statement = connection.createStatement();
                        query = "INSERT INTO owners VALUES(null, 'ООО \"СК Лес\"', '', '', '+380 44 123 44 55', 'sk.les@gmail.com')";
                        statement.executeUpdate(query);
                        query = "INSERT INTO owners VALUES(null, '', 'Любовь', 'Береза', '+380 63 518 56 55', 'liubov.bereza@gmail.com')";
                        statement.executeUpdate(query);
                        query = "INSERT INTO owners VALUES(null, 'ОАО \"СК Бура\"', '', '', '+380 44 987 91 19', 'sk.bura@gmail.com')";
                        statement.executeUpdate(query);
                        statement.close();

                        System.out.println("\tБД обновлена.\n");
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;

                case 6:
                    System.out.println("6. Выход;");

                    try {
                        statement = connection.createStatement();
                        //отключаемся от БД;
                        query = "SHUTDOWN";
                        statement.execute(query);
                        statement.close();
                        connection.close();

                        System.out.println("\tВсе соединения прерваны. БД закрыта. До скорых встреч.\n");
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;

                default:
                    System.out.println("Вы ввели несуществующую комманду. Пожалуйста, попробуйте еще раз.\n");
                    break;
            }
        }
        while(choice !=6);
    }
}
