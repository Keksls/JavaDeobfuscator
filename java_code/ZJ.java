/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;
import org.apache.log4j.Logger;

class ZJ {
    protected static final Logger a = Logger.getLogger(ZJ.class);
    private final ZN b = new ZN();
    private final ArrayList<ZK> c = new ArrayList();
    private final TIntArrayList d = new TIntArrayList();
    private final ArrayList<ZM> e = new ArrayList();

    ZJ() {
    }

    void a(int n) {
        int n2;
        this.e.clear();
        this.d.resetQuick();
        int n3 = this.c.size();
        for (n2 = 0; n2 < n3; ++n2) {
            ZK zK = this.c.get(n2);
            zK.a(n);
            zK.a(this.e);
            if (zK.a() != 0.0f) continue;
            this.d.add(n2);
        }
        for (n2 = this.d.size() - 1; n2 >= 0; --n2) {
            this.c.remove(this.d.getQuick(n2));
        }
        ArrayList<aas_0> arrayList = this.b.a(this.e);
        int n4 = arrayList.size();
        for (n3 = 0; n3 < n4; ++n3) {
            arrayList.get(n3).a();
        }
    }

    void a(ZG zG) {
        ZK zK = this.b(zG.a());
        if (zK == null) {
            zK = new ZK(zG);
            this.c.add(zK);
        }
        zK.a(1.0f);
    }

    void b(ZG zG) {
        ZK zK = this.b(zG.a());
        if (zK != null) {
            zK.a(0.0f);
        }
    }

    private ZK b(int n) {
        for (int k = this.c.size() - 1; k >= 0; --k) {
            ZK zK = this.c.get(k);
            if (zK.b.a() != n) continue;
            return zK;
        }
        return null;
    }

    void a(ZV zV, acb_0 acb_02) {
        this.b.a(zV, acb_02);
    }

    void a() {
        this.e.clear();
        this.c.clear();
        this.b.a();
    }

    public void b() {
        this.b.b();
    }
}

