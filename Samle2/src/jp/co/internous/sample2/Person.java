package jp.co.internous.sample2;

public class Person {
	private String name;
	private String from;

	public Person(String from) {
		this.from =from;
	}
	public String getName() {
		return name;
	}
	public String setName() {
		return name;
	}

	public String getFrom() {
		return from;
	}
	public String setFrom() {
		return from;
	}

	public void introduce() {
		System.out.println("私は"+ name + "です。" + from + "出身です。");
	}

	public void introduce(String otherMessage){
		introduce();
		System.out.println(otherMessage);
		}


}
