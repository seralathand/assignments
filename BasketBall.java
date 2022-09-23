import java.util.*;
public class BasketBall{
public static void main(String[] arg){
	List<Integer> scores=new ArrayList<>(List.of(10,5,2,20,4,5,2,25,1));
	List<Integer> score=new ArrayList<>();
	 int high=scores.get(0);
    int low=scores.get(0);
    int highestScore=0;
    int  lowestScore=0;
    for(int index=1;index<scores.size();index++){
        if(scores.get(index)>high){
        highestScore++;
        high=scores.get(index);
        }
        if(scores.get(index)<low){
            lowestScore++;
            low=scores.get(index);
        }
    }
    score.add(highestScore);
    score.add(lowestScore);
	System.out.println(score);
}
}