import com.somnath.scrapper.Element;

public class Main {
    public static void main(String[] args) {
        Element element = new Element("body", "<body key=value> hello<html>html</html> </body>");
        System.out.println(element.innerHtml());
    }
}