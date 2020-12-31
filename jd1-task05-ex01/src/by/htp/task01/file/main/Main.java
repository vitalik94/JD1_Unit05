package by.htp.task01.file.main;

/*
 * 1.Создать объект класса Текстовый файл, используя классы Файл, Директория. 
 * Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */

public class Main {

	public static void main(String[] args) {

		Directory dire = new Directory();

		TextFile tf = new TextFile("name", "text");

		TextFileLogic te = new TextFileLogic();

		print(tf);

		te.renaimFail(tf, "list");

		print(tf);

		te.completeFail(tf, "file");

		print(tf);

		te.deleteFile(tf);

		print(tf);

	}

	public static void print(TextFile tf) {

		System.out.println(tf.getFile() + ", " + tf.getText());

	}

}
