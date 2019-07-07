package assessment;

public class MinNumber {

	static void minNum(int array[]){
		int minimum = array[0];
		for (int i=1;i< array.length;i++){
			if(minimum > array[i]){
				minimum = array[i];
			}
		}
		System.out.println("The minimum number from the array is: "+minimum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {22,33,1,6,0,-2};
		minNum(array);
	}

}
