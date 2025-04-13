/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from aQN
 */
public class aqn_0
implements asu_2 {
    protected short a;
    protected HashMap<Integer, aQO[]> b;

    public short c() {
        return this.a;
    }

    public HashMap<Integer, aQO[]> d() {
        return this.b;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        this.a = asc_22.d();
        int n = asc_22.f();
        this.b = new HashMap(n);
        for (int k = 0; k < n; ++k) {
            int n2 = asc_22.f();
            int n3 = asc_22.f();
            aQO[] aQOArray = new aQO[n3];
            for (int i2 = 0; i2 < n3; ++i2) {
                aQOArray[i2] = new aQO();
                aQOArray[i2].a(asc_22);
            }
            this.b.put(n2, aQOArray);
        }
    }

    @Override
    public final int a() {
        return enK.k.a();
    }
}

