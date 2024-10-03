// Concrete Decorator for ChatWidget
public class ChatWidget extends PageDecorator {
    public ChatWidget(Page page) {
        super(page);
    }

    @Override
    public int getRank() {
        return super.getRank() + 7; // Adding rank for Chat Widget
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Chat Widget";
    }
}