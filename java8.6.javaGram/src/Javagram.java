public class Javagram {

    public Javagram() {
        Auth auth = new Auth();
        Frame frame = new Frame();
        frame.renderJFrame(auth.getRootPanel());
    }
}
