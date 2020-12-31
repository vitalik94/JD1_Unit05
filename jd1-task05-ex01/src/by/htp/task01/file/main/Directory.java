package by.htp.task01.file.main;

import java.util.ArrayList;
import java.util.List;

/*
 * 1.Создать объект класса Текстовый файл, используя классы Файл, Директория. 
 * Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */

public class Directory {

	private String name;
	private List<TextFile> listFile;
	private List<Directory> subDirectories;

	public Directory() {

		this.name = name;
		listFile = new ArrayList<TextFile>();
		subDirectories = new ArrayList<Directory>();

	}

	public Directory(String name, List<TextFile> listFile, List<Directory> subDirectories) {

		this.name = name;
		this.listFile = listFile;
		this.subDirectories = subDirectories;

	}

	public void setName(String name) {

		this.name = name;

	}

	public String getName() {

		return name;

	}

	public void setListFile(List<TextFile> listFile) {

		this.listFile = listFile;

	}

	public List<TextFile> getListFile() {

		return listFile;

	}

	public void setSubDirectories(List<Directory> subDirectories) {

		this.subDirectories = subDirectories;

	}

	public List<Directory> getSubDirectories() {

		return subDirectories;

	}

	public void add(TextFile tf) {

		listFile.add(tf);

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listFile == null) ? 0 : listFile.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((subDirectories == null) ? 0 : subDirectories.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Directory other = (Directory) obj;
		if (listFile == null) {
			if (other.listFile != null)
				return false;
		} else if (!listFile.equals(other.listFile))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (subDirectories == null) {
			if (other.subDirectories != null)
				return false;
		} else if (!subDirectories.equals(other.subDirectories))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Directory [name=" + name + ", listFile=" + listFile + ", subDirectories=" + subDirectories + "]";
	}

}
