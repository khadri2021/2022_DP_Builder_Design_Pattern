package com.khadri.dp.builder;

public class Student {

	private Long id;

	private String name;

	private String batch;

	private String branch;

	private String college;
	

	public Student() {
		super();
	}

	private Student(StudentBuilder builder) {
		super();
		this.id = builder.id;
		this.name = builder.name;
		this.batch = builder.batch;
		this.branch = builder.branch;
		this.college = builder.college;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getBatch() {
		return batch;
	}

	public String getBranch() {
		return branch;
	}

	public String getCollege() {
		return college;
	}

	public static class StudentBuilder {

		private Long id;

		private String name;

		private String batch;

		private String college;

		//optional property
		private String branch;

		 

		public StudentBuilder setBuildId(Long id) {
			this.id = id;
			return this;
		}
		public StudentBuilder setBuildName(String name) {
			this.name = name;
			return this;
		}
		public StudentBuilder setBuildBatch(String batch) {
			this.batch = batch;
			return this;
		}
		public StudentBuilder setBuildBranch(String branch) {
			this.branch = branch;
			return this;
		}

		public Student build() {
			return new Student(this);
		}

	}

}
