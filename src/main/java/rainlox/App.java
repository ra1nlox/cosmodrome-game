package rainlox;

import java.util.Scanner;

import rainlox.missions.Generator;

import java.io.FileReader;
import java.io.IOException;
import java.lang.Thread;

public class App {

	private static Thread thread0;
	private static String answ;
	private static String wrongCommand = ">> Wrong command";
	private static Generator generator;

	public static void main(String[] args) {
		generator = new Generator();
		helloMsg();
		Scanner in = new Scanner(System.in);
		thread0 = new Thread(() -> {
			while (true) {
				System.out.print("> ");
				answ = in.next();

				switch (answ) {
				case "exit":
					exit();
					in.close();
					break;
				case "help":
					help();
					break;
				case "missions":
					missions();
					break;
				case "\n":
					System.out.println(wrongCommand);
					break;
				default:
					System.out.println(wrongCommand);
					break;
				}
			}

		});
		Thread thread1 = new Thread(() -> {

		});
		Thread thread2 = new Thread(() -> {

		});

		thread0.start();

	}

	private static void missions() {
		generator.getMissions();
	}

	private static void help() {
		System.out.println(">> На данный момент есть несколько команд:\n"
				+ "help - Вызовет этот текст                            \n"
				+ "exit - Выход из игры (возможно появится ошибка но это так и задуманно)\n"
				+ "missions - Покажет список мисиий а также их цель, порядковый номер и награду (Моры - валюта, SP - очки исследований)\n"
				+ "Игра на ранней стадии разработки, так как один из ее разработчико немножко ленивый.");
	}

	private static void exit() {
		thread0.interrupt();
	}

	private static void helloMsg() {
		System.out.println(">> Приветствую вас! Это консольная игра Cosmodrom сделаная 2 людьми на чистом энтузиазме.\n"
				+ ">> Что бы получить список команд напишите 'help'");
	}

}
