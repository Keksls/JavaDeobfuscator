/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongShortHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TLongShortHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from bpQ
 */
public final class bpq_2
extends bpc_2 {
    private static final Logger c = Logger.getLogger(bpq_2.class);
    private static final Runnable e = new bpr_2();
    private final TLongShortHashMap f;
    private final long g;
    private final bFZ h;
    public static final short a = 1;
    public static final short b = 2;

    public bpq_2(TLongShortHashMap tLongShortHashMap, long l, bFZ bFZ2) {
        this.f = tLongShortHashMap;
        this.g = l;
        this.h = bFZ2;
    }

    @Override
    public boolean g() {
        if (this.d.ab_() || this.d.ak()) {
            c.warn((Object)("Le joueur " + this.d + " est mort ou en combat et ne peut utiliser de machine de craft"));
            return false;
        }
        return true;
    }

    @Override
    public boolean a(boolean bl, boolean bl2) {
        ado_1.a().b(e);
        return this.b();
    }

    @Override
    public void a() {
        this.a(true);
        clu_0 clu_02 = new clu_0(this.h.a_());
        azu_0.j().K().c(clu_02);
        ado_1.a().a(e, this.g, 1);
    }

    @Override
    public boolean b() {
        this.a(false);
        cpz_0 cpz_02 = new cpz_0();
        cpz_02.a((byte)2);
        cpz_02.a((short)27);
        azu_0.j().K().c(cpz_02);
        return true;
    }

    public void a(boolean bl) {
        if (this.h != null) {
            this.h.a(bl ? (short)2 : 1);
            this.h.aI_();
        }
    }

    @Override
    public short ac_() {
        return 27;
    }
}

