/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from ddg
 */
public class ddg_0
extends cuv_0 {
    private static final ddg_0 c = new ddg_0();

    public static ddg_0 d() {
        return c;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 17654: {
                dgo_0 dgo_02 = (dgo_0)adt_12;
                int n = dgo_02.c();
                this.a(dgo_02.k(), dgo_02.h(), n == 0 ? -1 : n);
                return false;
            }
        }
        return super.a(adt_12);
    }

    @Override
    protected String c() {
        return "stateDetailDialog";
    }

    @Override
    public void a(int n, int n2, short s2) {
        TIntObjectHashMap tIntObjectHashMap = (TIntObjectHashMap)this.b.get(n);
        if (tIntObjectHashMap == null) {
            return;
        }
        bpe_0 bpe_02 = (bpe_0)tIntObjectHashMap.get(n2);
        if (bpe_02 == null) {
            return;
        }
        bpe_02.a(s2);
        fis_1.a().a("describedState", (Object)bpe_02, this.a(bpe_02.p()));
        fis_1.a().a("describedStateLevel", (Object)bpe_02.c(), this.a(bpe_02.p()));
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            super.a(aav_22, bl);
            cgu_2.a().a(this);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            super.b(aav_22, bl);
            cgu_2.a().b(this);
        }
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

