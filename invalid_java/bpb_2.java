/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bpB
 */
public abstract class bpb_2
extends bpc_2 {
    protected static final Logger a = Logger.getLogger(bpb_2.class);
    final brw_1 b;
    long c;

    bpb_2(brw_1 brw_12) {
        this.b = brw_12;
    }

    @Override
    public void a() {
        bqg_2.a().g();
    }

    @Override
    public boolean a(boolean bl, boolean bl2) {
        this.d.do().a();
        if (bl2) {
            cpz_0 cpz_02 = new cpz_0();
            cpz_02.a((byte)3);
            cpz_02.a(this.ac_());
            azu_0.j().K().c(cpz_02);
        }
        return true;
    }

    @Override
    public boolean b() {
        bqg_2.a().i();
        cpz_0 cpz_02 = new cpz_0();
        cpz_02.a((byte)2);
        cpz_02.a(this.ac_());
        azu_0.j().K().c(cpz_02);
        return true;
    }

    void c() {
        if (this.b.c() > 0) {
            this.d.eX().a(this.b.l(), this.h());
        }
    }

    private boolean h() {
        Object r2 = eyo_1.g().d(this.b.c());
        if (r2 == null) {
            a.error((Object)("There is no ReferenceItem with the id=" + this.b.c() + " for the CollectAction with the id=" + this.b.g()));
            return false;
        }
        return ((ezr_0)r2).p() instanceof bjc_2;
    }

    public void a(long l) {
        this.c = l;
    }
}

