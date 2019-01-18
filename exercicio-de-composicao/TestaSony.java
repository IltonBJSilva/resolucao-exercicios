
public class TestaSony {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PlayStation consolePlay1 = new PlayStation(1, 270.40, "1","Ligado");
		PlayStation consolePlay2 = new PlayStation(1, 370.40, "2","Desligado");
		PlayStation consolePlay3 = new PlayStation(1, 640.40, "3","Ligado");
		PlayStation consolePlay4 = new PlayStation(1, 4000.40, "4","asuuasuash");
		
		Sony sony1 = new Sony(4," Akio Morita, Masaru Ibuka" ,"Kenichiro Yoshida",consolePlay1);

		//sony1.toString();
		System.out.println(sony1.toString());
		
	}

}
