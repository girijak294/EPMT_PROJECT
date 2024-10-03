// Decorator class
public abstract class PageDecorator implements Page {
    protected Page decoratedPage;

    public PageDecorator(Page page) {
        this.decoratedPage = page;
    }

    @Override
    public int getRank() {
        return decoratedPage.getRank();
    }

    @Override
    public String getDescription() {
        return decoratedPage.getDescription();
    }
}
