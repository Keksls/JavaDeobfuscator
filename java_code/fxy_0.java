/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Renamed from fxY
 */
public class fxy_0
implements Iterator<fxx_0> {
    private fxx_0 a;
    private fxx_0 b;
    private final TIntArrayList c = new TIntArrayList();
    private int d = -1;

    public fxy_0(fxx_0 fxx_02) {
        this.a = fxx_02;
        this.b = null;
    }

    @Override
    public boolean hasNext() {
        return this.a != null;
    }

    public fxx_0 a() {
        fxx_0 fxx_02 = this.a;
        this.a = null;
        if (fxx_02.a() && fxx_02.e()) {
            ++this.d;
            this.b = fxx_02;
            this.c.add(0);
            this.a = fxx_02.b().get(0);
        } else if (this.b != null) {
            while (this.b != null) {
                ArrayList<fxx_0> arrayList = this.b.b();
                int n = this.c.get(this.d) + 1;
                if (n == arrayList.size()) {
                    this.b = this.b.c();
                    this.c.remove(this.d);
                    --this.d;
                    continue;
                }
                this.a = arrayList.get(n);
                this.c.set(this.d, n);
                break;
            }
        }
        return fxx_02;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public static void a(String[] stringArray) {
        fxV fxV2 = new fxV("n1");
        fxV fxV3 = new fxV("n1A");
        fxV3.a(new fxV("n1Aa"));
        fxV3.a(new fxV("n1Ab"));
        fxV3.a(true);
        fxV2.a(fxV3);
        fxV fxV4 = new fxV("n1B");
        fxV fxV5 = new fxV("n1Ba");
        fxV fxV6 = new fxV("n1Bb");
        fxV4.a(fxV5);
        fxV4.a(fxV6);
        fxV4.a(true);
        fxV2.a(fxV4);
        fxV fxV7 = new fxV("n1C");
        fxV2.a(fxV7);
        fxV2.a(true);
        fxy_0 fxy_02 = new fxy_0(fxV2);
        while (fxy_02.hasNext()) {
            fxx_0 fxx_02 = fxy_02.a();
            for (int k = 0; k < fxx_02.g(); ++k) {
                System.out.print("\t");
            }
            System.out.println((String)fxx_02.d());
        }
    }

    @Override
    public /* synthetic */ Object next() {
        return this.a();
    }
}

