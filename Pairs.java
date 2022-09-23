import java.util.*;
public class Pairs{
public static void main(String[] args){
	List<Integer> values=new ArrayList<>(List.of(1,3,2,5,6,1));
	int pairsKey=3;
	int pairs=0;
	for(int index=0;index<values.size();index++){
		for(int index1=index+1;index1<values.size();index1++){
			int temp=values.get(index)+values.get(index1);
			if(temp%pairsKey==0){	
				pairs++;
			}
		}
	}
		System.out.println(pairs);
  }
}