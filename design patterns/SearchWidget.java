// Concrete Decorator for SearchWidget
public class SearchWidget extends PageDecorator {
    public SearchWidget(Page page) {
        super(page);
    }

    @Override
    public int getRank() {
        return super.getRank() + 5; // Adding rank for Search Widget
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Search Widget";
    }
}