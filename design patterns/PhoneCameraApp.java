public abstract class PhoneCameraApp {
    private ShareStrategy shareStrategy; // Strategy for sharing

    // Set the share strategy dynamically
    public void setShareStrategy(ShareStrategy shareStrategy) {
        this.shareStrategy = shareStrategy;
    }

    // Common functionality to take a photo
    public void takePhoto() {
        System.out.println("Taking photo...");
    }

    // Common functionality to save a photo
    public void savePhoto() {
        System.out.println("Saving photo...");
    }

    // Delegate the share functionality to the current strategy
    public void sharePhoto() {
        if (shareStrategy != null) {
            shareStrategy.share();
        } else {
            System.out.println("No sharing method selected.");
        }
    }

    // Abstract method for editing (each variant will provide its own editor)
    public abstract void editPhoto();
}
