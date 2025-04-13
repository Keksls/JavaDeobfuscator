/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bpP
 */
public class bpp_2
extends bpc_2 {
    protected static final Logger a = Logger.getLogger(bpp_2.class);
    private final bcf_1 b;

    public bpp_2(bcf_1 bcf_12) {
        this.b = bcf_12;
    }

    @Override
    public short ac_() {
        return 18;
    }

    @Override
    public boolean g() {
        return true;
    }

    @Override
    public void a() {
        a.info((Object)"Lancement de l'occupation DIM_BAG_BROWSE_FLEA");
        this.d.a(false, true);
        cuu_0.a(this.b.Z());
        if (azu_0.j().c(cWt.e())) {
            azu_0.j().b(cWt.e());
        }
        azu_0.j().a(cWt.e());
        cpo_0 cpo_02 = new cpo_0();
        cpo_02.a(this.b.a_());
        cpo_02.a(true);
        azu_0.j().K().c(cpo_02);
        this.d.a(this);
    }

    @Override
    public boolean a(boolean bl, boolean bl2) {
        if (azu_0.j().c(cWt.e())) {
            azu_0.j().b(cWt.e());
        }
        return true;
    }

    @Override
    public boolean b() {
        if (azu_0.j().c(cWt.e())) {
            azu_0.j().b(cWt.e());
        }
        a.info((Object)"Stopping DIM_BAG_BROWSE_FLEA occupation");
        cpo_0 cpo_02 = new cpo_0();
        cpo_02.a(this.b.a_());
        cpo_02.a(false);
        azu_0.j().K().c(cpo_02);
        return true;
    }
}

