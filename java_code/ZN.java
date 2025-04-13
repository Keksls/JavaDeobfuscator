/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import org.apache.log4j.Logger;

class ZN {
    protected static final Logger a = Logger.getLogger(ZN.class);
    private static final TObjectProcedure<ZS> c = new ZO();
    private static final TObjectProcedure<ZS> d = new ZP();
    private final TObjectProcedure<ZS> e = new ZQ(this);
    private final TIntObjectHashMap<ZS> f = new TIntObjectHashMap();
    final ArrayList<aas_0> g = new ArrayList();
    private final TIntObjectHashMap<ArrayList<aaf>> h = new TIntObjectHashMap();

    ZN() {
    }

    void a(ZV zV, acb_0 acb_02) {
        aaq_0[] aaq_0Array;
        assert (this.f.size() == 0);
        for (aaq_0 aaq_02 : aaq_0Array = zV.a()) {
            if (aaq_02.d_() != ZU.c) continue;
            aap_0 aap_02 = (aap_0)aaq_02;
            aas_0 aas_02 = aap_02.c();
            int n = aaq_02.e();
            this.f.put(n, (Object)new ZS(aas_02));
            aas_02.a(acb_02);
            this.h.put(n, new ArrayList());
        }
    }

    ArrayList<aas_0> a(ArrayList<ZM> arrayList) {
        this.g.clear();
        if (arrayList.isEmpty()) {
            return this.g;
        }
        int n = -1;
        int n2 = arrayList.size();
        for (int k = 0; k < n2; ++k) {
            ZM zM = arrayList.get(k);
            if (!zM.c()) continue;
            float f2 = zM.b();
            if (n != zM.a()) {
                n = zM.a();
                this.c();
            }
            ArrayList<aaf> arrayList2 = zM.a.b();
            int n3 = arrayList2.size();
            for (int i2 = 0; i2 < n3; ++i2) {
                aaf aaf2 = arrayList2.get(i2);
                if (!aaf2.f()) continue;
                this.a(aaf2, f2);
            }
        }
        this.c();
        this.f.forEachValue(this.e);
        return this.g;
    }

    private void a(aaf aaf2, float f2) {
        int n = aaf2.a();
        aaf2.b(f2);
        ((ZS)this.f.get(n)).a(aaf2);
        ((ArrayList)this.h.get(n)).add(aaf2);
    }

    private void c() {
        this.h.forEachValue((TObjectProcedure)new ZR(this));
    }

    public final void a() {
        this.f.forEachValue(c);
    }

    public final void b() {
        this.f.forEachValue(d);
    }
}

