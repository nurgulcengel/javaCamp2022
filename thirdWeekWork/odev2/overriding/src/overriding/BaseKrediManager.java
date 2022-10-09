package overriding;

public class BaseKrediManager {

	public double hesapla(double tutar) {
		return tutar*1.18;
	}
}

//public final double hesapla(double tutar) {
//	return tutar*1.18;
//}

//bu şekilde final keywordunu kullanırsak overriding yapılmaz izin verilmez. Aksi takdirde javada default olarak methodlar overridabledir.