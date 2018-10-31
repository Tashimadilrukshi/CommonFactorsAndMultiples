import java.util.Scanner;

class CommonFactorsAndMultiples{

  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    
    int m=s.nextInt();
    int n=s.nextInt();
    int[] a = new int[n];
    int[] b = new int[m];
    
    for(int i=0;i<a.length;i++){
      a[i]=s.nextInt();
    }
    
    for(int i=0;i<b.length;i++){
      b[i]=s.nextInt();
    }
    
    getTotalX(a,b);
    
  }
  

  public static void getTotalX(int[] a, int[] b) {
        
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        
        //sorting a
        for(int i=0; i<a.length; i++){
           int k=a[i];
           for(int j=i-1; j>=0; j--){
                if(k<a[j]){
                    int temp=a[j];
                    a[j]=k;
                    a[j+1]=temp;
                }
            
            } 
            
        }
        
        //sorting b
        for(int i=0; i<b.length; i++){
           int k=b[i];
           for(int j=i-1; j>=0; j--){
                if(k<b[j]){
                    int temp=b[j];
                    b[j]=k;
                    b[j+1]=temp;
                }
            
            } 
            
        }
        
        int max,min;
        if(a[0]<b[0]){
            min = a[0];
        }else{
            min = b[0];
        }
        
        if(a[a.length-1]<b[b.length-1]){
            max = b[b.length-1];
        }else{
            max = a[a.length-1];
        }
        
        int x=0;
        for(int j=min; j<=max; j++){
            for(x=0; x<a.length; x++){
                if(j%a[x]!=0){
                    break;   
                }  
            }
            if(x==a.length){
                list.add(j);
            }else{
                continue;
            } 
        }
        
        int y=0;
        for(int j=0; j<list.size(); j++){
            for(y=0; y<b.length; y++){
                if(b[y]%list.get(j)!=0){
                    break;   
                }  
            }
            if(y==b.length){
                list2.add(j);
            }else{
                continue;
            } 
        }
        
        for(int i=0;i<list2.size();i++){
          System.out.print(list2.get(i)+" ");
        }
    }
 }
