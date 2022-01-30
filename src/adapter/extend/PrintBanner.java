package adapter.extend;

import adapter.Banner;

public class PrintBanner extends Print {
	
	Banner banner;
	
	public PrintBanner(String str){
		this.banner = new Banner(str);
	}

	@Override
	public void printWeak() {
		System.out.println("-----------extend-----------");
		banner.showWithParen();
		System.out.println("-----------extend-----------");
	}

	@Override
	public void printStrong() {
		System.out.println("***********extend***********");
		banner.showWithAster();
		System.out.println("***********extend***********");
	}
	
}
