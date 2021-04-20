package rainlox;

import java.util.Scanner;
import java.lang.Thread;

public class App {

	private static Thread thread0;
	private static String temp;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		thread0 = new Thread(() -> {
			while (true) {
				System.out.print("> ");
				temp = in.next();

				switch (temp) {
				case "exit":
					exit();
					in.close();
					break;
				case "help":
					help();
					break;
				case "\n":
					System.out.println("Wrong command");
					break;
				default:
					System.out.println("Wrong command");
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

	private static void help() {
		System.out.println(
				"Приветствую вас!\nЭто консольная игра Cosmodrom сделаная 2 людьми на чистом энтузиазме.\nНа данный момент есть несколько команд:\nhelp - вызовет этот текст\nexit - Выход из игры (возможно появится ошибка но это так и задуманно)\nИгра на ранней стадии разработки, так как один из ее разработчико немножко ленивый.");
	}

	private static void exit() {
		thread0.interrupt();
	}
}
