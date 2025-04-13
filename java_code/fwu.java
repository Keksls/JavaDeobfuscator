/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class fwu<T extends fxe_0> {
    private static final Logger f = Logger.getLogger(fwu.class);
    public static final float a = 43.0f;
    public static final float b = 21.5f;
    protected final T c;
    protected final TLongObjectHashMap<fwz> d = new TLongObjectHashMap();
    protected final TLongArrayList e = new TLongArrayList();

    public fwu(T t) {
        this.c = t;
    }

    public void a(long l, fwz fwz2) {
        this.d.put(l, (Object)fwz2);
        ahx_2.a(this.e, l);
    }

    public void a(int n) {
        this.e.add((long)n);
    }

    public void a() {
        TLongObjectIterator tLongObjectIterator = this.d.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            this.e.add(tLongObjectIterator.key());
        }
    }

    public void b() {
        this.d.forEachValue(fwz2 -> {
            fwz2.k();
            return true;
        });
    }

    public void c() {
        int n = this.e.size();
        for (int k = 0; k < n; ++k) {
            long l = this.e.getQuick(k);
            ((fxe_0)this.c).a(l);
            fwz fwz2 = (fwz)this.d.remove(l);
            if (fwz2 == null || fwz2.h() == null || fwz2.h().a() == null) continue;
            fwz2.k();
        }
        this.e.clear();
    }

    public void a(float f2, float f3, float f4) {
        int n = 774;
        int n2 = 387;
        TLongObjectIterator tLongObjectIterator = this.d.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            fwz fwz2 = (fwz)tLongObjectIterator.value();
            fwz2.a(f2);
            fwu.a(f3, f4, 774, 387, fwz2);
        }
    }

    protected static void a(float f2, float f3, int n, int n2, fwz fwz2) {
        ArrayList<fww> arrayList = fwz2.b();
        for (int k = arrayList.size() - 1; k >= 0; --k) {
            fww fww2 = arrayList.get(k);
            ArrayList<fwx> arrayList2 = fww2.a();
            for (int i2 = arrayList2.size() - 1; i2 >= 0; --i2) {
                fwx fwx2 = arrayList2.get(i2);
                short s2 = fwx2.a();
                short s3 = fwx2.b();
                int n3 = s2 * 18;
                int n4 = s3 * 18;
                float f4 = (float)(n3 - n4) * 43.0f + f2;
                float f5 = (float)(-(n3 + n4)) * 21.5f + f3;
                fwx2.a(f4 - (float)n);
                fwx2.b(f5 - (float)n2);
                fwx2.c(f4);
                fwx2.d(f5);
                fwx2.e(f4 + (float)n);
                fwx2.f(f5 - (float)n2);
                fwx2.g(f4);
                fwx2.h(f5 - (float)(2 * n2));
            }
            fww2.b();
        }
    }

    public static fwz a(fwA fwA2, float f2, float f3, float f4, String string) {
        fwz fwz2 = new fwz(fwA2);
        fwz2.a(f2);
        List<fwB> list = fwA2.i();
        int n = list.size();
        for (int k = 0; k < n; ++k) {
            String string2;
            fwB fwB2 = list.get(k);
            fww fww2 = new fww();
            fww2.a(fwB2);
            xd_0 xd_02 = fwB2.f();
            if (xd_02 != null) {
                string2 = xd_02.b().iterator();
                int n2 = 774;
                int n3 = 387;
                while (string2.hasNext()) {
                    int n4 = string2.next();
                    short s2 = aep_0.b(n4);
                    short s3 = aep_0.c(n4);
                    int n5 = s2 * 18;
                    int n6 = s3 * 18;
                    float f5 = (float)(n5 - n6) * 43.0f + f3;
                    float f6 = (float)(-(n5 + n6)) * 21.5f + f4;
                    fww2.a(s2, s3, f5 - 774.0f, f6 - 387.0f, f5, f6, f5 + 774.0f, f6 - 387.0f, f5, f6 - 774.0f);
                }
                fww2.b();
            }
            if ((string2 = fwB2.bd_()) != null) {
                ays_2 ays_22 = null;
                try {
                    ays_22 = fwj_0.a(string2);
                }
                catch (Exception exception) {
                    f.error((Object)"Probl\u00e8me lors de la r\u00e9cup\u00e9ration de la texture d'iconUrl", (Throwable)exception);
                }
                if (ays_22 != null) {
                    fww2.a(new ayo_2(ays_22));
                }
            }
            fww2.a(string);
            fww2.b(fwB2.n());
            fww2.c(fwB2.o());
            fww2.a(fwB2.p());
            fww2.a(fwB2.ba_());
            fwz2.a(fww2);
        }
        fwz2.c();
        return fwz2;
    }

    public void b(int n) {
        TLongObjectIterator tLongObjectIterator = this.d.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ((fwz)tLongObjectIterator.value()).a(n);
        }
    }
}

