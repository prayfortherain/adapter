public class Main {
    public static void main(String[] args) {
        Charger220 charger220 = new Charger220();
        ChargerAdapter chargerAdapter = new ChargerAdapter(charger220);
        int voltage = chargerAdapter.getVoltage();
    }
}