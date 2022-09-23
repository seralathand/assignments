class IncresingDecresingFromCentre {
    public static void main(String[] args) {
        String name="saran";
        int mid=(name.length()+1)/2;
        int increment=0;
        String totalName="";
        try {
            for (int index = mid; index >= -(mid+1); index--) {

                if (index == -1 || index == 0)
                    continue;

                int temp = Math.abs(index);
                for (int j = 1; j <= temp; j++) {
                    totalName += name.charAt(increment);
                }
                increment++;
            }
        }
        catch(Exception e){}
        System.out.println(totalName);
        //output-- sssaaraannn
    }
}