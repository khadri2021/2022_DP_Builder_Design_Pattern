package com.khadri.dp.builder;

import com.khadri.dp.builder.Student.StudentBuilder;

public class MainTest {

	public static void main(String[] args) {

		StudentBuilder studentBuilder = new Student.StudentBuilder();
		studentBuilder.setBuildBranch("BSC");
		studentBuilder.setBuildName("JHON");
		studentBuilder.setBuildBatch("2022");
		studentBuilder.setBuildId(3L);
		Student std = studentBuilder.build();

	}
}
