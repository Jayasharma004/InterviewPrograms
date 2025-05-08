import java.util.ArrayList;
import java.util.List;

//IDFC interview
public class T7_IDFC_GetIPRegions {
	public void getRegions(String[] ip_addresses)
	{
		List<Integer> octets = new ArrayList<>();
		for(int i=0; i<ip_addresses.length-1; i++ )
		{
			String[] ipparts = ip_addresses[i].split("\\.");
			for(String ip : ipparts)
			{
				octets.add(Integer.parseInt(ip));
				System.out.println("ip : "+ipparts[0]);
			}
		}
	}
	
	public static void main(String[] args) {
		String[] ip_addresses = {"128.12.34.0", "31.258.90.11"};
		new T7_IDFC_GetIPRegions().getRegions(ip_addresses);
	}
}
