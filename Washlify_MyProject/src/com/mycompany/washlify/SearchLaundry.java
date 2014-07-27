package com.mycompany.washlify;

public class SearchLaundry {

	private static SearchLaundry instance;
	private static String[] titles;
	
	private SearchLaundry() {
		// TODO Auto-generated constructor stub
		initList();
	}

	public static SearchLaundry getInstance()
	{
		if (instance==null)
		{
			instance= new SearchLaundry();
		}
		return instance;
	}
	
	void initList()
	{
		titles= new String[13];
		for (int i=0; i<13; i++)
		{
			titles[i]= new String("Laundry Shop # "+ i);
		}
	}
	
	public String[] getList()
	{
		return titles;
	}
	

	
	 
}
