package jp.co.internous.sample2;

public class Practice {
	/**
	 * @param firstName
	 * @param familyName
	 * @return フルネーム
	 *　名前を苗字を引数にとり、フルネームを返します。
	 */

	public String createFullName(String firstName,String familyName) {
		return firstName + "" + familyName;
	}


	/**
	 * @param n1
	 * @param n2
	 * @return 加算結果
	 *　2つの整数を引数にとり、加算した結果を返します。
	 */

	public int sum(int n1,int n2) {
		return n1 + n2;
	}

}
