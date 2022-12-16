package orgsystem;

public class Desktop extends Computer {
public void desktopSize()
{
	System.out.println("Desktop size is 14 inches");
}
public static void main(String[] args) {
	Desktop obj=new Desktop();
	obj.computerModel();
	obj.desktopSize();
}
}
