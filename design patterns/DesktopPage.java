// Concrete Component for DesktopPage
public class DesktopPage implements Page {
    @Override
    public int getRank() {
        return 20; // Base rank for desktop page
    }

    @Override
    public String getDescription() {
        return "Desktop Page";
    }
}
