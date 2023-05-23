//        Створіть інтерфейс Quest і кілька його реалізацій, а також клас Knight.
//        Лицар може приймати будь-яку реалізацію інтерфейсу Quest і виконувати цей Quest успішно.
//        Під час виконання завдання використовувати нові знання про POJO, DI & IoC.

package com.ex_02;

import com.ex_02.Knight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("quest-config.xml");

        Knight knight1 = context.getBean("knight1", Knight.class);
        Knight knight2 = context.getBean("knight2", Knight.class);

        knight1.embarkOnQuest();
        knight2.embarkOnQuest();
    }
}