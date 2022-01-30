package adapter;

import adapter.implement.Print;

public class Main {
	public static void main(String[] args) {
		
		Banner banner = new Banner("Banner");
		banner.showWithParen();
		banner.showWithAster();
		
		System.out.println("");
		
		Print implement = new adapter.implement.PrintBanner("PrintBanner");
		implement.printWeak();
		implement.printStrong();
		
		adapter.extend.PrintBanner extend = new adapter.extend.PrintBanner("PrintBanner");
		extend.printWeak();
		extend.printStrong();
	}
}
