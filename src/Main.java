public class Main {
    public static void main(String[] args) {
        Voltage380 voltage380 = new Voltage380();
        ChargerAdapter chargerAdapter = new ChargerAdapter(voltage380);
        chargerAdapter.charge();
    }
}