// Concrete Decorator for NotificationWidget
public class NotificationWidget extends PageDecorator {
    public NotificationWidget(Page page) {
        super(page);
    }

    @Override
    public int getRank() {
        return super.getRank() + 3; // Adding rank for Notification Widget
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Notification Widget";
    }
}
