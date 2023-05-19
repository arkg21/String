package ExtraStrings;

public class FrequencyCount {

	public static void main(String[] args) {
		
		 String s="aabbcccdac";
	      char[] a = s.toCharArray();
	      int freqCount=0;
	      for(int i=0;i<a.length;i++)
	      {
	    	  int count=1;
	    	  for(int j=i+1;j<a.length;j++)
	    	  {
	    		  if(a[i]==a[j])
	    		  {
	    			  count++;
	    			  i++;
	    		  }
	    		  else {
	    			  break;
	    		  }
	    		  
	    	  }
	    	  System.out.print(a[i]+""+count);
	    	  
	    	if(count>1)
	    	{
	    		freqCount++;
	    		
	    	}
	    	
	    	  
	      }
	      System.out.println();
			System.out.println("Frequency count is->"+freqCount);
		}

	}


