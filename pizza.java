import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javafx.util.Pair;

public class pizza {

	public static void main(String[] args) {
		BufferedReader br = null;
		int R = 0;
		int C = 0;
		int L = 0;
		int H = 0;
		int j =0;
		char[][] pizza = {{'T','T','T','T','T'}, 
				{'T','M','M','M','T'}, 
				{'T','T','T','T','T'}};
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\newWorkSpace\\HashcodeTest\\pizzaIn.txt"));
            String line;
            String s = new String();
            int i = 0;
            while ((line = br.readLine())!= null) {
            	line.replaceAll("\\s+","");
            	s = line;
            	//System.out.println(line.charAt(i));
            	R = Character.getNumericValue(s.charAt(i));
            	//int a = Character.getNumericValue('3');
            	System.out.println(R);
            	//System.out.println(line.charAt(i));
            	//System.out.println(N);
            //	System.out.println();
            	//System.out.println(line.indexOf(i));
            	//System.out.println(c.charAt(i+4));
            	C = Character.getNumericValue(s.charAt(i+4));
            	//int a = Character.getNumericValue('3');
            	System.out.println(C);
            	L = Character.getNumericValue(s.charAt(i+8));
            	System.out.println(L);
            	H = Character.getNumericValue(s.charAt(i+12));
            	System.out.println(H);
            	break;
//            	if (s.charAt(14)== 'T'){
//            		break;
//            	}
            	//line = br.readLine();
            	//System.out.println(line);
//                int k = 0;
//                int e = 0;
//            	while(k < R){
//            		while(e < C){
//            			//line = br.readLine();
//            			//System.out.println(line);
//            			pizza[k][e] = 'T';
//            			System.out.println(pizza[k][e]);
//            			e++;
//            		}
//            		k++;
//            	}
            	

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        
    int S = 0;
    int U = 0;
    //SLICE = 2 rows 2 cols
    //at least L T
   // at least L M
    //at most H AREA
    
    int k = 0;
    int e = 0;
    int v = 0;
    int a = 0;
    int r1 = 0;
    int r2 = 0;
    int c1 = 0;
    int c2 = 0;
    int b = 0;
    int []coord = new int [30];
		while(k < R){
			while(e < C){
				if((pizza[k][e] == 'T')|| (pizza[k][e] == 'M')){
					v++;
					r1 = k;
					coord[b] = k;
					c1 = e;
					b++;
					coord[b] = e;
			        System.out.print(r1 + " ");
			 		System.out.print(c1 + " ");
					
					a += (k+1) * (e+1);
					//System.out.println(a);
				}
				if (v == 0){
					System.out.println("No igredient on Slice!");
				}
				if (a >= H ){
					S++;
					r2 = k;	
				    c2 = e;
					coord[b] = k+1;
					b++;
					c1 = e; 
					coord[b] = e+1;
							
					//System.out.println(S);
				    System.out.print(r2 + " ");
				    System.out.print(c2 + " ");
				   
				}
				b++;
				 //System.out.println();
				//System.out.println(a);
				e++;
			}
			//coord[e+4] = e;
			//coord[e+5] = k;
			k++;
			System.out.println();
		}
		int g = 0;
		System.out.println();
		System.out.println(S);
		System.out.println();
		int h = 0;
		while ( h < S){
			while ( g < 3){
				System.out.println(coord[g]);
				g++;
			}
			h++;
		}
		
		

    
	}

}
