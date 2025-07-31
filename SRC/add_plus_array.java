public class add_plus_array{
    public static void main(String[] arg) {
        int vector[] = new int[100];
        int sum = 0;
        int n=80;
        vector[1]=20;
        vector[2]=20;
        vector[3]=1000;
        for( int i=1; i<=n; i++){
            sum = sum + vector[i];
        }
        System.out.println("El resultado de la suma es" + sum);
    }
}