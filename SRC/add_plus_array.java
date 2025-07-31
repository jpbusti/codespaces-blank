public class add_plus_array{
    public static void main(String[] arg) {
        int v[] = new int[100];
        int sum = 0;
        int n=80;
        v[1]=20;
        v[2]=20;
        v[3]=1000;
        for( int i=1; i<=n; i++){
            sum = sum + v[i];
        }
        System.out.println("El resultado de la suma es" + sum);
    }
}