package observerPattern;

public interface INotificationObserver {
	
	public String name="";
	public void onServerDown() ;
	public String getName();

}
