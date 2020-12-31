package by.htp.task01.file.main;

import java.util.List;

/*
 * 1.Создать объект класса Текстовый файл, используя классы Файл, Директория. 
 * Методы: создать, переименовать,вывести на консоль содержимое, дополнить, удалить.
 */

public class TextFileLogic {

	public void renaimFail(TextFile tf, String rf) {

		tf.setFile(rf);

	}

	public void completeFail(TextFile tf, String cf) {

		cf = tf.getText() + cf;

		tf.setText(cf);

	}

	public void deleteFile(TextFile tf) {
		
		tf.setText("");

	}

}
