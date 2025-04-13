/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;

/*
 * Renamed from brU
 */
public class bru_0
extends brv_0 {
    private final int c;

    public bru_0(brg_1 brg_12, int n) {
        super(brg_12);
        this.c = n;
    }

    @Override
    public String a() {
        int n = this.b * this.c;
        int n2 = n + this.c - 1;
        String string = n + "-" + n2;
        return bae.h().a("levelShort.custom", string);
    }

    @Override
    public int b() {
        short s2;
        int s22 = Integer.MIN_VALUE;
        ArrayList<brw_0> arrayList = this.a.p();
        if (arrayList.isEmpty()) {
            return 0;
        }
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            brw_0 brw_02 = (brw_0)arrayList.get(k);
            if (brw_02.c() <= s2) continue;
            s2 = brw_02.c();
        }
        return (int)Math.ceil((float)s2 / (float)this.c) + 1;
    }

    @Override
    public int c() {
        return this.d().size();
    }

    @Override
    public Collection<brw_0> d() {
        return this.f();
    }

    private Collection<brw_0> f() {
        ArrayList<brw_0> arrayList = this.a.p();
        int n = this.b * this.c;
        int n2 = n + this.c - 1;
        ArrayList<brw_0> arrayList2 = new ArrayList<brw_0>();
        int n3 = arrayList.size();
        for (int k = 0; k < n3; ++k) {
            brw_0 brw_02 = (brw_0)arrayList.get(k);
            short s2 = brw_02.c();
            if (s2 < n || s2 > n2) continue;
            arrayList2.add(brw_02);
        }
        return arrayList2;
    }
}

