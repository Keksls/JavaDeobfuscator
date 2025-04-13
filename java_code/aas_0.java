/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from aaS
 */
public abstract class aas_0 {
    private final aaq_0 c;
    protected final ZZ[] a;
    protected ahq_0 b;

    public aas_0(aaq_0 aaq_02) {
        this.c = aaq_02;
        this.a = aaq_02.h();
    }

    protected final String a(int n) {
        return this.c.c[n].a();
    }

    public abstract void a();

    public abstract void b();

    public abstract void c();

    public void a(acb_0 acb_02) {
        this.b = acb_02.b();
    }

    public void a(ArrayList<aaf> arrayList) {
        this.c.a(this.a);
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            aaf aaf2 = arrayList.get(k);
        }
    }
}

