import java.util.ArrayList;
public class ProgramRunner
	{
		static ArrayList<Program>TVshows= new ArrayList<Program>();
		static int killa= 0;
		static int jon = 0;
		public static void main(String[]args) {
			createArray();
			//kill();
	//addOne();
	titChange();
	printList();
	
		}
		public static void addOne()
		{
			for(int i = 0; i<TVshows.size(); i++)
				{
					TVshows.get(i).setNumberOfSeasonsAired(TVshows.get(i).getNumberOfSeasonsAired() +1);
				}
		}
			public static void kill()
			{
				
				for(int i =0; i<TVshows.size(); i++)
					{
						System.out.println(TVshows.get(i).getTitle().length());
						if(TVshows.get(i).getTitle().length() > killa)
							{
								 killa = TVshows.get(i).getTitle().length();
								 jon=i;
							}
					}
				System.out.println(killa);
				TVshows.remove(jon);
			}
		
		public static void createArray() {
			Program futurama = new Program("futurama ", "cartoon ", 7);
			Program GOT = new Program("game of thrones ", "drama ", 12);
			Program simpsons = new Program("Simpsons ", "cartoon ", 31);
			Program mullenSitcom = new Program("MHSIT ", "sitcom ", 1);
			Program familyGuy = new Program("family guy ", "cartoon ", 24);
			TVshows.add(futurama);
			TVshows.add(GOT);
			TVshows.add(simpsons);
			TVshows.add(mullenSitcom);
			TVshows.add(familyGuy);	
			
		}
	public static void printList(){
		for (int i=0; i<TVshows.size();i++)
			{
			System.out.println(TVshows.get(i).getTitle() +TVshows.get(i).getGenre() + TVshows.get(i).getNumberOfSeasonsAired());	
			}
		
	}

	
public static void titChange() {
	TVshows.get(0).setTitle("BOMBC ");
	
	
}
	}
