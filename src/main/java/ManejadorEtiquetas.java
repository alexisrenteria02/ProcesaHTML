import javax.swing.text.MutableAttributeSet;
import javax.swing.text.html.HTML;
import javax.swing.text.html.HTMLEditorKit;
import java.util.Enumeration;
import java.util.Locale;

public class ManejadorEtiquetas  extends HTMLEditorKit.ParserCallback {

    @Override
    public void handleText(char[] data, int pos) {
        String texto = new String(data);
        System.out.println("\t" + texto);
    }

    @Override
    public void handleStartTag(HTML.Tag tag, MutableAttributeSet atributos, int pos) {
        String tagName= tag.toString().toUpperCase();
        int n = atributos.getAttributeCount();

        System.out.printf("%s: %d%n", tagName, n);

        Enumeration a =  atributos.getAttributeNames();

        while (a.hasMoreElements() ) {
            Object atribName = a.nextElement();

            System.out.printf("%s = %s%n",atribName.toString(),
                    atributos.getAttribute(atribName));
        }
    }

    @Override
    public void handleSimpleTag(HTML.Tag tag, MutableAttributeSet atributos, int pos) {

        String tagName= tag.toString().toUpperCase();
        int n = atributos.getAttributeCount();

        System.out.printf("%s: %d%n", tagName, n);

        Enumeration a =  atributos.getAttributeNames();

        while (a.hasMoreElements() ) {
            Object atribName = a.nextElement();

            System.out.printf("%s = %s%n",atribName.toString(),
                    atributos.getAttribute(atribName));
        }
    }
}
