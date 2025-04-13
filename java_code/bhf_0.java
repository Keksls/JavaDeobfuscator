/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from bHF
 */
class bhf_0
implements asb_2<asq_0> {
    final /* synthetic */ TIntObjectHashMap a;
    final /* synthetic */ bhe_0 b;

    bhf_0(bhe_0 bhe_02, TIntObjectHashMap tIntObjectHashMap) {
        this.b = bhe_02;
        this.a = tIntObjectHashMap;
    }

    public void a(asq_0 asq_02) {
        try {
            bhd_1 bhd_12 = bhe_0.a(asq_02);
            this.a.put((int)bhd_12.h(), (Object)bhd_12);
        }
        catch (Exception exception) {
            bhe_0.c.error((Object)("Exception levee sur " + asq_02.c()), (Throwable)exception);
        }
    }

    @Override
    public /* synthetic */ void load(asu_2 asu_22) {
        this.a((asq_0)asu_22);
    }
}

