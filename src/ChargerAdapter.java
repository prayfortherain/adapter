public class ChargerAdapter extends Charger220 {
    private Voltage380 voltage380;

    public ChargerAdapter(Voltage380 voltage380) {
        this.voltage380 = voltage380;
    }

    @Override
    public void charge() {
        int voltage = voltage380.provideVoltage();
        System.out.println("Используется напряжение " + voltage + " вольт");
        super.charge();
    }
}
