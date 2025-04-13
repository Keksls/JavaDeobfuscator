/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import org.apache.log4j.Logger;

/*
 * Renamed from apR
 */
public class apr_2 {
    public static final apr_2 a = new apr_2();
    protected static final Logger b = Logger.getLogger(apr_2.class);

    public static apr_2 a() {
        return a;
    }

    private apr_2() {
    }

    public <T extends apq_2> Iterable<T> a(apq_2 apq_22, apk_1<T> apk_12, aqd_1 aqd_12, int n, int n2, short s2) {
        if (aqd_12 == null || apk_12 == null) {
            return new abz_1();
        }
        int n3 = 0;
        int n4 = 0;
        short s3 = 0;
        if (apq_22 != null) {
            n3 = apq_22.G();
            n4 = apq_22.H();
            s3 = apq_22.I();
        }
        aej_2 aej_22 = apq_22 == null ? aej_2.k : apq_22.F();
        return aqd_12.a(n3, n4, s3, n, n2, s2, aej_22, apk_12.k());
    }

    public <T extends apq_2, TV extends apt_2<T>> Iterable<T> a(apq_2 apq_22, apk_1<T> apk_12, aqd_1 aqd_12, int n, int n2, short s2, TV TV) {
        if (TV == null) {
            return this.a(apq_22, apk_12, aqd_12, n, n2, s2);
        }
        if (aqd_12 == null || apk_12 == null) {
            return new abz_1();
        }
        LinkedList<apq_2> linkedList = new LinkedList<apq_2>();
        Iterator<T> iterator = apk_12.k();
        block5: while (iterator.hasNext()) {
            apq_2 apq_23 = (apq_2)iterator.next();
            abo_2<apu_2, ArrayList<T>> abo_22 = TV.a(apq_23, apq_22);
            switch (abo_22.a()) {
                case a: {
                    linkedList.add(apq_23);
                    break;
                }
                case e: {
                    int n3 = 0;
                    int n4 = 0;
                    short s3 = 0;
                    aej_2 aej_22 = aej_2.h;
                    if (apq_22 != null) {
                        n3 = apq_22.G();
                        n4 = apq_22.H();
                        s3 = apq_22.I();
                        aej_22 = apq_22.F();
                    }
                    if (!aqd_12.a(n, n2, s2, n3, n4, s3, aej_22, apq_23.G(), apq_23.H(), apq_23.I(), apq_23.X())) break;
                    linkedList.add(apq_23);
                    break;
                }
                case b: {
                    for (apq_2 apq_24 : abo_22.b()) {
                        linkedList.add(apq_24);
                    }
                    continue block5;
                }
            }
        }
        return linkedList;
    }
}

