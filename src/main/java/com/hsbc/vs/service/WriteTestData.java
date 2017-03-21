package com.hsbc.vs.service;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteTestData {

	public static void main(String[] args) {
		String content = null;
		try {
			for (int i = 1501; i < 3000; i++) {
				content = "\n" + i + ", CDX, 20-02-2017:16:38:42:02, 20-02-2017:16:38:42:03, 30";
				Files.write(Paths.get("c:/output.txt"), content.getBytes(), StandardOpenOption.APPEND);
			}
		} catch (Exception e) {
			System.out.println("Exception " + e.getMessage());
		}
	}
}
