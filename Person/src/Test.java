
public class Test {
	public static void main(String[] args)
	{
Person taro = new Person();
taro.name ="山田太郎";
taro.age=20;
taro.phoneNumber="000-0000-0000";
taro.address="東京";

System.out.println(taro.name);
System.out.println(taro.age);
System.out.println(taro.phoneNumber);
System.out.println(taro.address);
taro.talk();
taro.walk();
taro.run();

	{
		Person jiro = new Person();
		jiro.name ="木村次郎";
		jiro.age=18;
		jiro.phoneNumber="000-0000-0000";
		jiro.address="東京";

		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
			}

	{
		Person hanako = new Person();
		hanako.name ="鈴木花子";
		hanako.age=16;
		hanako.phoneNumber="000-0000-0000";
		hanako.address="東京";

		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
			}
	{
		Person miki = new Person();
		miki.name ="岡崎美紀";
		miki.age=24;
		miki.phoneNumber="000-0000-0000";
		miki.address="東京";

		System.out.println(miki.name);
		System.out.println(miki.age);
		System.out.println(miki.phoneNumber);
		System.out.println(miki.address);
			}

		Robot aibo = new Robot();
		aibo.name ="aibo";
		aibo.talk();
		aibo.walk();
		aibo.run();

		Robot asimo = new Robot();
		asimo.name ="asimo";
		asimo.talk();
		asimo.walk();
		asimo.run();

		Robot pepper = new Robot();
		pepper.name ="pepper";
		pepper.talk();
		pepper.walk();
		pepper.run();

	}
}


