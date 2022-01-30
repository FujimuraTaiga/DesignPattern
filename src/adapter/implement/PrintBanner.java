package adapter.implement;

import adapter.Banner;

public class PrintBanner extends Banner implements Print {

	public PrintBanner(String str) {
		super(str);
	}

	@Override
	public void printWeak() {
		System.out.println("");
		System.out.println("----------implement-----------");
		showWithParen();
		System.out.println("----------implement-----------");
		System.out.println("");
	}

	@Override
	public void printStrong() {
		System.out.println("");
		System.out.println("***********implement**********");
		showWithAster();
		System.out.println("***********implement**********");
		System.out.println("");
	}
	
}
