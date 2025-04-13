/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TByteIterator
 *  gnu.trove.set.hash.TByteHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TByteIterator;
import gnu.trove.set.hash.TByteHashSet;
import org.apache.log4j.Logger;

/*
 * Renamed from faw
 */
public class faw_0 {
    protected static Logger a = Logger.getLogger(faw_0.class);
    public static final byte b = 30;
    protected final TByteHashSet c = new TByteHashSet();

    public boolean a(byte by) {
        this.c.add(by);
        return true;
    }

    public void c() {
        this.c.clear();
    }

    public void a(qr_2 qr_22) {
        TByteIterator tByteIterator = this.c.iterator();
        while (tByteIterator.hasNext()) {
            qt_2 qt_22 = new qt_2();
            qt_22.a = tByteIterator.next();
            qr_22.c.add(qt_22);
        }
    }

    public final void b(qr_2 qr_22) {
        for (int k = 0; k < qr_22.c.size(); ++k) {
            this.a(qr_22.c.get((int)k).a);
        }
    }
}

