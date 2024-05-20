public class binomialCoefficient {

    public static int Factorial(int n){
    
        int f = 1;
        for(int i = 1;i<=n; i++){
            f = f * i;

        }
        return f;
    }

    public static int BinCoeff(int n, int r){
        int nFact = Factorial(n);
        int rFact = Factorial(r);
        int n_rFact = Factorial(n - r);

        int BinomialCoefficient = (nFact)/((rFact) * n_rFact);
        return BinomialCoefficient;
    }
    public static void main(String[] args) {
        System.out.println("output: "+ BinCoeff(5,2));
    }
}
