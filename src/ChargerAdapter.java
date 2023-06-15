public class ChargerAdapter extends Charger220 {
    private Charger220 charger;

    public ChargerAdapter(Charger220 charger) {
        this.charger = charger;
    }

    public int getVoltage() {
        System.out.println("Использовалось напряжение 380 в 220 вольт");
        charger.charge();
        return 220;
    }
}
