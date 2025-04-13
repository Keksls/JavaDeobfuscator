/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bpY
 */
public class bpy_2
extends bpc_2
implements bqb_2 {
    protected static final Logger a = Logger.getLogger(bpy_2.class);
    private final bel_0 b;

    public bpy_2(bel_0 bel_02) {
        this.b = bel_02;
    }

    @Override
    public bel_0 h() {
        return this.b;
    }

    @Override
    public short ac_() {
        return 7;
    }

    @Override
    public boolean g() {
        bmr_1 bmr_12 = azu_0.j().k();
        biI biI2 = bmr_12.bv();
        return !this.b.aB_() && this.b.c(biI2.ap()) || this.b.aB_() && biI2.ap().b(this.b.G(), this.b.H(), (int)this.b.I());
    }

    @Override
    public void a() {
        a.info((Object)("Lancement de l'occupation MANAGE_FLEA sur la vitrine uid=" + this.b.ap()));
        this.d.a(false, true);
        bsx_2 bsx_22 = this.d.dj();
        cuu_0.a(bsx_22);
        bmr_1 bmr_12 = azu_0.j().k();
        int n = this.b.G() - bmr_12.G();
        int n2 = this.b.H() - bmr_12.H();
        bmr_12.bv().a(aej_2.a(n, n2));
        this.b.a(Tv.o, azu_0.j().k());
        if (azu_0.j().c(dao.d())) {
            azu_0.j().b(dao.d());
        }
        dao.d().a(this.b);
        azu_0.j().a(dao.d());
        this.d.a(this);
        btn_0.a().a(btr_0.e, "dimensionalBagFleaDialog");
    }

    @Override
    public boolean a(boolean bl, boolean bl2) {
        a.info((Object)("On arrete l'occupation MANAGE_FLEA sur la vitrine uid=" + this.b.ap() + " (fromServer=" + bl + ", sendMessage=" + bl2 + ")"));
        azu_0.j().b(dao.d());
        cuu_0.a(null);
        if (bl2) {
            this.b.a(Tv.p, azu_0.j().k());
        }
        btn_0.a().a(btr_0.d, null);
        return true;
    }

    @Override
    public boolean b() {
        return true;
    }
}

