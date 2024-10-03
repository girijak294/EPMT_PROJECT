
public class DecoratorMain {
    public static void main(String[] args) {
        // Create a mobile page
        Page mobilePage = new MobilePage();

        // Add widgets to the mobile page
        Page mobileWithSearch = new SearchWidget(mobilePage);
        Page mobileWithSearchAndChat = new ChatWidget(mobileWithSearch);

        System.out.println(mobileWithSearchAndChat.getDescription() + " has rank: " + mobileWithSearchAndChat.getRank());

        // Create a desktop page
        Page desktopPage = new DesktopPage();

        // Add widgets to the desktop page
        Page desktopWithNotification = new NotificationWidget(desktopPage);
        Page desktopWithAllWidgets = new ChatWidget(new SearchWidget(desktopWithNotification));

        System.out.println(desktopWithAllWidgets.getDescription() + " has rank: " + desktopWithAllWidgets.getRank());
    }
}
