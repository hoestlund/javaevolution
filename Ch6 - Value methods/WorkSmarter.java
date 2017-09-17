
public class WorkSmarter {
	//I was clicking through links to check the popularity if pages on similarweb
	//I cut down time by patching together the components of the URL 

	public static void main(String[] args) {
		
			String first = "https://pro.similarweb.com/?newSocialUser=true#/website/audience-overview/"; //The first part after I authenticated myself through linkedin
			String end = "/*/999/3m/?webSource=Total"; //view by 3 months, total views
			String[] companyWebsites = { "hidden", "taken away to hide research"};
			
			 //System.out.println(companyWebsites.length); length is 211. Had i<211 for the Boolean expression previously
			
			for(int i=0;i<companyWebsites.length;i++) {
				System.out.println(first + companyWebsites[i] + end);
			}
			
		}
		
	}


