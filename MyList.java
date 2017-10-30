import java.util.Scanner;

public class MyList {
	
	public static int binSearch(float[] aList, float key)
	{
		int start = 0;
		int end = aList.length-1;
		/*System.out.println("aList[start]:");
		System.out.println(aList[start]);*/
		int Midarr = aList.length/2;
		
		if (key > aList[end])
		{
			//System.out.println("YOUR SEARCH IS OUT OF BOUNDS!!!");
			return -1;
		}
		if (key < aList[start])
		{
			//System.out.println("YOUR SEARCH IS OUT OF BOUNDS!!!");
			return -1;
		}
		
		if (start == end)
		{
			return 0;
		}
		
		int retval = 1337;
		
		/*while(start<=end)
		{
			if(aList[Midarr] == key)
			{
				//return aList[Midarr]+10000;
				return Midarr;
			}
			if (aList[Midarr] > key)
			{
				end = Midarr-1;
				Midarr = ((end+start)/2);
				//return 999;
			}
			if (aList[Midarr] < key)
			{
				start = Midarr+1;
				Midarr = ((end+start)/2);
				//return start;
			}
		}*/
		
		while(start<=end)
		{
			if(Float.compare(aList[Midarr], key) == 0)
			{
				//return aList[Midarr]+10000;
				
				
				return Midarr;
			}
			if (Float.compare(aList[Midarr], key) > 0)
			{
				end = Midarr-1;
				Midarr = ((end+start)/2);
				//return 999;
			}
			if (Float.compare(aList[Midarr], key) < 0)
			{
				start = Midarr+1;
				Midarr = ((end+start)/2);
				//return start;
			}
		}
		
		
		
		
		
		return -1;
	}

	public static int indexFind(float[] aList, float key)
	{
		for (int i = 0; i < aList.length; i++)
		{
			if (aList[i] == key)
			{
				return i;
			}
		}
		return -1337;//error that is not even possible
	}
	
	public static void main(String[] args) {
		
		//System.out.println(args.length);
		if (args.length == 0)
		{
			//System.out.println("NO ARRAY!!!");
			System.exit(-1);
		}
		
		
		float cont[] = new float[args.length] ;
		for(int i = 0; i<args.length; i++)
		{
			cont[i] = Float.parseFloat(args[i]);;
		}
		
		float cont2[] = new float[args.length] ;
		for(int i = 0; i<args.length; i++)
		{
			cont2[i] = Float.parseFloat(args[i]);;
		}
		
	    for (int i = 0; i < args.length-1; i++)//sort cont2
	    {
	        int min = i;
	        for (int j = i+1; j < args.length; j++)
	            if (cont2[j] < cont2[min])
	                    min = j;
	 
	        
	        float temp = cont2[min];
	        cont2[min] = cont2[i];
	        cont2[i] = temp;

	    }
	    
		Scanner sc = new Scanner(System.in);// ask for a key
		float a = sc.nextFloat();

		int mylist = binSearch(cont2, a); //binary search of the key
		int yourlist = indexFind(cont, a);
		
		if(mylist != -1)//if key found
		{
			System.out.println(yourlist);
		}
		else//if key not found
		{
			System.out.println("The key was not found!");
		}
		
		
		//System.out.println("megamilk");
		
		//System.out.println("args address:\t");
		//System.out.println(args);
		//System.out.println("args contents:\t");
		
		/*int cont[] = new int[args.length] ;
		for(int i = 0; i<args.length; i++)
		{
			cont[i] = Integer.parseInt(args[i]);;
		}*/
		/*for(int i = 0; i<args.length; i++)
		{
			System.out.println(cont[i]) ;
		}
		for(int i = 0; i<args.length; i++)
		{
			System.out.println(cont2[i]) ;
		}*/
		
		
	}
	
}
