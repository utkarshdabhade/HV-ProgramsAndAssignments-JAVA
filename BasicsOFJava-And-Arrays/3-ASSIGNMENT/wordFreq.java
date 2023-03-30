public class wordFreq 
{

   public static void main(String[] args)
   {
      String input="Welcome to Java Session Session Session";  //Input String 
      String[] words=input.split(" ");  //Split the word from String
      System.out.println("The numbers of words in this array are " + words.length);
      int wrc=1;    //Variable for getting Repeated word count
      
      for(int i=0;i<words.length;i++)      
      {
         for(int j=i+1;j<words.length;j++) 
         {
            
         if(words[i].equals(words[j])) 
            {
               wrc=wrc+1;    
               words[j]="0"; 
            }
         }
         if(words[i]!="0")
         System.out.println(words[i]+"--"+wrc); //Printing the word along with count
         wrc=1;
         
        }  
         
   }

}