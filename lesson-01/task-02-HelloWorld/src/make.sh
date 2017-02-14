#!/bin/sh

cd /media/derevianko/3C4EAFE44EAF94E4/ITEA/Java_base/iurii-derevianko/lesson-01/task-02-HelloWorld/src/

javac ua/itea/javabasic/practice/lesson01/hello_world/Main.java

java ua.itea.javabasic.practice.lesson01.hello_world.Main

#jar -cf hello-world.jar ua/itea/javabasic/practice/lesson01/hello_world/Main.class

#java -cp hello-world.jar ua.itea.javabasic.practice.lesson01.hello_world.Main

jar -cvfm hello-world.jar MANIFEST.MF ua/itea/javabasic/practice/lesson01/hello_world/Main.class

#jar -cvfm hello-world.jar MANIFEST.MF ua.itea.javabasic.practice.lesson01.hello_world.Main

java -jar hello-world.jar

