package ZohoGraduationSchool;

public class uniqueElementInArray {
    public static void main(String[] args) {
        int a[]={2,3,4,2,4,5,3};
        int unique=0;

        for(int i=0;i<a.length;i++){
            unique=unique^a[i];
        }
        System.out.println(unique);
    }
}
