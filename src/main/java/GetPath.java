import java.io.IOException;

public class GetPath {
    public String showURL() throws IOException {
        return this.getClass().getResource("/").getPath();
    }
}
