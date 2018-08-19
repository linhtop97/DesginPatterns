package designpatterns.builder;

public class Student {
	private String mName;
	private String mAge;
	
	
	public Student(Builder builder) {
		this.mName = builder.mName;
		this.mAge = builder.mAge;
	}
	public static class Builder{
		private String mName;
		private String mAge;
		public Builder setmName(String mName) {
			this.mName = mName;
			return this;
		}
		public Builder setmAge(String mAge) {
			this.mAge = mAge;
			return this;
		}
		
		public Student build() {
			return new Student(this);
		}
		
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getmAge() {
		return mAge;
	}
	public void setmAge(String mAge) {
		this.mAge = mAge;
	}
	
	public static void main(String[] arg) {
		Student student = new Student.Builder().setmAge("21")
				.setmName("Linh").build();
		System.out.println(student.mName + " " + student.mAge);
	}
	
}
