package com.example.quiz;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class QuizApplicationTests {

	@Test
	void contextLoads() {
		System.out.println(LocalDate.now());
		System.out.println(LocalDateTime.now());
		System.out.println(LocalTime.now());
		System.out.println("================================");

		String str = "A;B;C;D";
	}

	@Test
	public void test() {
		List<String> list = List.of("A", "B", "C", "D", "E");
		String str = "AABBCCCDBBEEABD";
		// 計算 A, B, C, D, E 各自出現了幾次
		Map<String, Integer> map = new HashMap<>();
		for (String item : list) {
			String newStr = str.replace(item, "");
			int count = str.length() - newStr.length();
			map.put(item, count);
		}
		System.out.println(map);
	}
	
	

}
