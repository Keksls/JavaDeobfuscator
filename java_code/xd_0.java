/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntIterator
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 *  org.jdom.Content
 *  org.jdom.Element
 */
import gnu.trove.iterator.TIntIterator;
import gnu.trove.set.hash.TIntHashSet;
import java.nio.ByteBuffer;
import java.util.List;
import org.apache.log4j.Logger;
import org.jdom.Content;
import org.jdom.Element;

/*
 * Renamed from XD
 */
public class xd_0 {
    private static final Logger c = Logger.getLogger(xd_0.class);
    protected final TIntHashSet a;

    public xd_0() {
        this.a = new TIntHashSet();
    }

    public xd_0(TIntHashSet tIntHashSet) {
        this.a = tIntHashSet;
    }

    public final boolean a() {
        return this.a.isEmpty();
    }

    public void a(xd_0 xd_02) {
        TIntIterator tIntIterator = xd_02.a.iterator();
        while (tIntIterator.hasNext()) {
            this.a.add(tIntIterator.next());
        }
    }

    public final void a(int n, int n2) {
        this.a.add(xd_0.d(n, n2));
    }

    public final boolean b(int n, int n2) {
        return this.a.contains(xd_0.d(n, n2));
    }

    public final boolean b(xd_0 xd_02) {
        return this.a.removeAll(xd_02.a.toArray());
    }

    public final boolean c(int n, int n2) {
        return this.a.remove(xd_0.d(n, n2));
    }

    public TIntHashSet b() {
        return this.a;
    }

    public Element c() {
        Element element = new Element("partitions");
        for (int n : this.a) {
            short s2 = Hw.b(n);
            short s3 = Hw.c(n);
            Element element2 = new Element("partition");
            element2.setAttribute("x", String.valueOf(s2));
            element2.setAttribute("y", String.valueOf(s3));
            element.addContent((Content)element2);
        }
        return element;
    }

    public void a(Element element) {
        assert (element.getName().equals("partitions"));
        List list = element.getChildren("partition");
        for (int k = 0; k < list.size(); ++k) {
            Element element2 = (Element)list.get(k);
            int n = Integer.parseInt(element2.getAttributeValue("x"));
            int n2 = Integer.parseInt(element2.getAttributeValue("y"));
            this.a(n, n2);
        }
        this.a.compact();
    }

    public void a(gk_0 gk_02) {
        int n = this.a.size();
        gk_02.a(n);
        TIntIterator tIntIterator = this.a.iterator();
        for (int k = 0; k < n; ++k) {
            gk_02.a(tIntIterator.next());
        }
    }

    public void a(ByteBuffer byteBuffer) {
        int n = byteBuffer.getInt();
        for (int k = 0; k < n; ++k) {
            this.a.add(byteBuffer.getInt());
        }
        this.a.compact();
    }

    protected static int d(int n, int n2) {
        return Hw.d(n, n2);
    }
}

