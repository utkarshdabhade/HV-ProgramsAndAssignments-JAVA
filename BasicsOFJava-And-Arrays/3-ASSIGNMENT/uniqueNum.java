public class uniqueNum{    

 
      
        public static void main(String[] args) {  
              
            //Initialize array   
            int [] arr = new int [] {10, 20, 80, 30, 20, 20, 20, 50, 10};   
            //Array fr will store frequencies of element  
            int [] fr = new int [arr.length];  
            int visited = -1;  
            
            for(int i = 0; i < arr.length; i++){  
                int count = 1;  
                for(int j = i+1; j < arr.length; j++){  
                    if(arr[i] == arr[j]){  
                        count++;  
                        //To avoid counting same element again  
                        fr[j] = visited;  
                    }  
                }  
                if(fr[i] != visited)  
                    fr[i] = count;  
            }  
            
            //Displays the frequency of each element present in array  
            for(int i = 0; i < fr.length; i++){  
                if(fr[i] != visited)  
                    System.out.println("The number " + arr[i] + " is occuring " + fr[i] + " times.");  
            }  
            System.out.println("---------------------");  
        }  
    }  