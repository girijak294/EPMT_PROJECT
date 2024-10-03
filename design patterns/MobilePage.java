// Concrete Component for MobilePage
public class MobilePage implements Page {
    @Override
    public int getRank() {
        return 10; // Base rank for mobile page
    }

    @Override
    public String getDescription() {
        return "Mobile Page";
    }
}