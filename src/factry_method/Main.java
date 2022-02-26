package factry_method;

public class Main {
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("taiga");
		Product card2 = factory.create("fujimura");
		Product card3 = factory.create("someone");
		card1.use();
		card2.use();
		card3.use();
	}
}
