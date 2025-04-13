/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;

/*
 * Renamed from brI
 */
public class bri_1
extends brv_0 {
    private final int c;

    public bri_1(brg_1 brg_12, int n) {
        super(brg_12);
        this.c = n;
    }

    @Override
    public String a() {
        return this.b + 1 + "/" + this.b();
    }

    @Override
    public int b() {
        ArrayList<brw_0> arrayList = this.a.p();
        return (int)Math.ceil((float)arrayList.size() / (float)this.c);
    }

    @Override
    public int c() {
        return this.c;
    }

    @Override
    public Collection<brw_0> d() {
        ArrayList<brw_0> arrayList = this.a.p();
        int n = this.b * this.c;
        int n2 = Math.min(arrayList.size(), n + this.c);
        ArrayList<brw_0> arrayList2 = new ArrayList<brw_0>();
        for (int k = n; k < n2; ++k) {
            arrayList2.add((brw_0)arrayList.get(k));
        }
        return arrayList2;
    }
}

