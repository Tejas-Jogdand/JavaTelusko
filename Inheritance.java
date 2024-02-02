public class Inheritance {
    public static void main(String[] args) {
        VAdvCalc obj = new VAdvCalc();
        //VAdvCalc extends AdvCalc extedns Calc 

        System.out.println("Addition: "+obj.add(7,4)+"\nSubstraction: "+ obj.sub(7,4));
        System.out.println("Multiplication: "+obj.mul(3,4)+"\nDivision: "+ obj.div(4.3,5));
        System.out.println("Power: "+obj.pow(3,4));

    }
}