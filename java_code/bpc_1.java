/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bpc
 */
public class bpc_1
extends eph_2<bpb_1> {
    private final bpd_1 d = new bpd_1();
    private static final bpc_1 e = new bpc_1();
    private final asy_2<ase_0> f = new asz_2<ase_0>(new ase_0());

    public static bpc_1 a() {
        return e;
    }

    private bpc_1() {
        epv_1.a(this);
    }

    public bpb_1[] b() {
        return (bpb_1[])this.b.values((Object[])new bpb_1[this.b.size()]);
    }

    @Nullable
    public bpb_1 a(short s2) {
        if (s2 <= 0) {
            return null;
        }
        bpb_1 bpb_12 = (bpb_1)this.b.get(s2);
        if (bpb_12 != null) {
            return bpb_12;
        }
        ase_0 ase_02 = this.f.a(s2);
        if (ase_02 == null) {
            return null;
        }
        bpb_12 = this.d.a(ase_02);
        if (bpb_12 != null) {
            this.a(bpb_12);
        }
        return bpb_12;
    }

    public TIntObjectHashMap<bpb_1> c() {
        TIntObjectHashMap tIntObjectHashMap = new TIntObjectHashMap();
        try {
            asw_2.a().a(new ase_0(), (T ase_02) -> {
                bpb_1 bpb_12;
                try {
                    bpb_12 = this.d.a((ase_0)ase_02);
                }
                catch (Exception exception) {
                    return;
                }
                tIntObjectHashMap.put((int)bpb_12.s(), (Object)bpb_12);
            });
        }
        catch (Exception exception) {
            a.error((Object)"", (Throwable)exception);
        }
        return tIntObjectHashMap;
    }

    @Override
    @Nullable
    public /* synthetic */ epq_1 b(short s2) {
        return this.a(s2);
    }
}

