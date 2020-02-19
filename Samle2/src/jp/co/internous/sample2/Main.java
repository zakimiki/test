package jp.co.internous.sample2;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		judge(20);
		judge(18);
	}

	private static void judge (int age) {
		if(age <20) {
			System.out.println("未成年");
		}else {
			System.out.println("成人");
		}


		//練習用クラスをインスタンス化する
		Practice p = new Practice();

		//Practiceクラスに定義されているsumメソッドを呼び出し
		//2と3を加算した結果を取得する
		int ans = p.sum(2, 3);

		//結果をコンソールに表示する
		System.out.println(ans);

		String fullName = p.createFullName("Taro", "Yamada");
		System.out.println(fullName);

	}

}
