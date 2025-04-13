/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.apache.log4j.Logger;

/*
 * Renamed from bPa
 */
public class bpa_0
extends bor_0 {
    private static final Logger e = Logger.getLogger(bpa_0.class);
    private final HashMap<Long, bpl_0> f = new HashMap();
    private fiz<bpl_0> g;

    @Override
    public String[] d() {
        return bor_0.d;
    }

    @Override
    public Iterable<bpl_0> c() {
        if (this.g != null) {
            return this.g;
        }
        if (!this.f()) {
            return this.f.values();
        }
        return this.e();
    }

    public Iterable<bpl_0> a(blx_1 blx_12) {
        return StreamSupport.stream(this.c().spliterator(), false).filter(bpl_02 -> new bos_0(blx_12).a((bph_0)bpl_02.r())).collect(Collectors.toList());
    }

    public bpl_0 a(long l) {
        if (this.g != null && this.g.d(l)) {
            return (bpl_0)this.g.e(l);
        }
        if (!this.f()) {
            return this.f.get(l);
        }
        return (bpl_0)this.e().e(l);
    }

    public void a(ArrayList<abi_2<bph_0>> arrayList, short n, epq_2 epq_22) {
        for (abi_2<bph_0> abi_22 : arrayList) {
            bph_0 bph_02 = abi_22.b();
            int n2 = abi_22.a() == -1 ? n : abi_22.a();
            bpl_0 bpl_02 = new bpl_0(bph_02, (short)n2, bph_02.i(), epq_22);
            this.f.put(bpl_02.a(), bpl_02);
        }
    }

    public void a(bpl_0 bpl_02) {
        this.f.put(bpl_02.a(), bpl_02);
    }

    public void h() {
        this.f.clear();
        this.g = null;
    }

    public fiz<bpl_0> i() {
        if (this.g != null) {
            return this.g;
        }
        this.g = new fiz(60, null, null, false, false, false);
        for (Map.Entry<Long, bpl_0> entry : this.f.entrySet()) {
            try {
                ((uf_0)this.g).a(entry.getValue());
            }
            catch (Uy | uz_0 ua_02) {
                e.error((Object)"Failed to add a spell in the fakeSpellInventory of a NPC", (Throwable)ua_02);
            }
        }
        return this.g;
    }
}

