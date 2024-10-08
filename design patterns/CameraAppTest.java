public class CameraAppTest {
    public static void main(String[] args) {
        // Create an instance of BasicCameraApp
        PhoneCameraApp basicApp = new BasicCameraApp();

        // Take and save a photo
        basicApp.takePhoto();
        basicApp.savePhoto();

        // Set share strategy to Text and share photo
        basicApp.setShareStrategy(new TextShare());
        basicApp.sharePhoto();

        // Change share strategy to Email and share photo
        basicApp.setShareStrategy(new EmailShare());
        basicApp.sharePhoto();

        // Set new share strategy to Social Media and share photo
        basicApp.setShareStrategy(new SocialMediaShare());
        basicApp.sharePhoto();

        // Use CameraPlusApp with a different editor
        PhoneCameraApp plusApp = new CameraPlusApp();
        plusApp.editPhoto();
    }
}
