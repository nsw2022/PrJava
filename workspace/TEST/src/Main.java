import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		
//		int imgs [] = new int[] {1,2,3,4,5};
//		
//		Random rnd = new Random();
//		
//		 for (int i=0; i<imgs.length;i++){
//             imgs[i] = rnd.nextInt(5);
//             for (int j=0;j<i;j++){
//                 if (imgs[i]==imgs[j]){
//                     i--;
//                     
//                 }
//             }
//         }
//		 
//		 
//		 for(int i=0; i<imgs.length;i++) {
//			 System.out.printf("%d ", imgs[i]);	 
//		 }
//		 
//		
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(0);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		
		Collections.shuffle(arr);
		
		System.out.print(arr+ " ");
		
		
	}

}
