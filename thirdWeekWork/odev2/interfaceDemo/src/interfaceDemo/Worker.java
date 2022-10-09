package interfaceDemo;

public class Worker implements IWorkable,IEatable,IPayable {

	@Override
	public void pay() {
		System.out.println("Maaş ödemesi");
	}

	@Override
	public void eat() {
		System.out.println("Yemek hizmeti");
		
	}

	@Override
	public void work() {
		System.out.println("Çalışma işleri");
		
	}

}
