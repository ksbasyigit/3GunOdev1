
public class BaseKrediManager {
	public void hesapla() {
		System.out.println("Kredi Hesaplandı. ");
	}
	//final override ezilmeyi engeller.
	public final double hesaplama(double tutar) {
		return tutar * 1.18;
	}
}
