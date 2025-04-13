/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bpG
 */
public class bpg_2
extends bpc_2
implements bqb_2 {
    protected static final Logger a = Logger.getLogger(bpg_2.class);
    private final bsx_2 b;
    private final long c;
    private final bel_0 e;

    @Override
    public bel_0 h() {
        return this.e;
    }

    public bpg_2(bsx_2 bsx_22, bel_0 bel_02) {
        this.b = bsx_22;
        this.c = bel_02.ap();
        this.e = bel_02;
    }

    public bsx_2 i() {
        return this.b;
    }

    public long j() {
        return this.c;
    }

    @Override
    public short ac_() {
        return 5;
    }

    @Override
    public boolean g() {
        return true;
    }

    @Override
    public void a() {
        a.info((Object)"Lancement de l'occupation BROWSE_FLEA");
        this.d.a(false, true);
        cuu_0.a(this.b);
        if (azu_0.j().c(cWw.e())) {
            cWw.e().d();
            cWw.e().c();
        } else {
            azu_0.j().a(cWw.e());
        }
        cpr_0 cpr_02 = new cpr_0();
        bsx_2 bsx_22 = cuu_0.a();
        cpr_02.a(bsx_22.q());
        cpr_02.b(this.c);
        cpr_02.a(true);
        azu_0.j().K().c(cpr_02);
        this.d.a(this);
    }

    @Override
    public boolean a(boolean bl, boolean bl2) {
        a.info((Object)("On arr\u00eate l'occupation BROWSE_FLEA (fromServer=" + bl + ", sendMessage=" + bl2 + ")"));
        azu_0.j().b(cWw.e());
        if (bl2) {
            cpr_0 cpr_02 = new cpr_0();
            cpr_02.a(cuu_0.a().q());
            cpr_02.b(this.c);
            cpr_02.a(false);
            azu_0.j().K().c(cpr_02);
        }
        cuu_0.a(null);
        return this.b();
    }

    @Override
    public boolean b() {
        return true;
    }
}

