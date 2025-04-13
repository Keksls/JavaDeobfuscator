/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.awt.Insets;
import java.util.HashMap;
import org.apache.log4j.Logger;

public class fze {
    private static final Logger a = Logger.getLogger(fze.class);
    private final HashMap<Class<?>, fzd> b = new HashMap();
    private static final fze c = new fze();

    private fze() {
        this.b();
    }

    public static fze a() {
        return c;
    }

    private void b() {
        this.a(azj_2.class, fyg.d);
        this.a(azf_2.class, new fya());
        this.a(fjf_2.class, new fyb());
        this.a(Insets.class, new fyh());
        this.a(String.class, new fym());
        this.a(fjv_1.class, new fyk());
        this.a(ays_2.class, new fyn());
        this.a(ayf_2.class, new fye());
        fyd fyd2 = new fyd();
        this.a(frm_0.class, fyd2);
        this.a(fro_0.class, fyd2);
        this.a(frq_0.class, fyd2);
        this.a(frs_0.class, fyd2);
        this.a(fri_0.class, fyd2);
        this.a(frk_0.class, fyd2);
        this.a(aiO.class, fyd2);
        this.a(frg_0.class, fyd2);
        this.a(frb_0.class, fyd2);
        this.a(frd_0.class, fyd2);
        this.a(frf_0.class, fyd2);
        this.a(fqu_0.class, fyd2);
        this.a(fqv_0.class, fyd2);
        this.a(fsX.class, fyd2);
        this.a(frh_0.class, fyd2);
        this.a(ftw_0.class, fyd2);
        this.a(fqy_0.class, fyd2);
        this.a(fqz_0.class, fyd2);
        this.a(fra_0.class, fyd2);
        this.a(avg_1.class, fyd2);
        this.a(fqq_0.class, fyd2);
        this.a(fqs_0.class, fyd2);
        this.a(fre_0.class, fyd2);
        this.a(fqp_0.class, fyd2);
        this.a(fqt_0.class, fyd2);
        this.a(Object.class, new fyj());
        fyl fyl2 = new fyl();
        this.a(Boolean.TYPE, fyl2);
        this.a(Integer.TYPE, fyl2);
        this.a(Long.TYPE, fyl2);
        this.a(Float.TYPE, fyl2);
        this.a(Double.TYPE, fyl2);
        this.a(Byte.TYPE, fyl2);
        this.a(Short.TYPE, fyl2);
        this.a(Boolean.class, fyl2);
        this.a(Integer.class, fyl2);
        this.a(Long.class, fyl2);
        this.a(Float.class, fyl2);
        this.a(Double.class, fyl2);
        this.a(Byte.class, fyl2);
        this.a(Short.class, fyl2);
        fyi fyi2 = new fyi();
        this.a(fzq.class, fyi2);
        this.a(fcx_2.class, fyi2);
        this.a(fcz_2.class, fyi2);
        this.a(fdh_2.class, fyi2);
        this.a(fdb_2.class, fyi2);
        this.a(fdc_1.class, fyi2);
        this.a(fdd_2.class, fyi2);
        this.a(fde_1.class, fyi2);
        this.a(fdf_1.class, fyi2);
        this.a(fdk_2.class, fyi2);
        this.a(fdl_2.class, fyi2);
        this.a(fdi_1.class, fyi2);
        this.a(fdj_1.class, fyi2);
        this.a(fdm_2.class, fyi2);
        this.a(fdn_1.class, fyi2);
        this.a(fdo_1.class, fyi2);
        this.a(fdp_1.class, fyi2);
        this.a(fdq_1.class, fyi2);
        this.a(fdr_1.class, fyi2);
        this.a(fds_1.class, fyi2);
        this.a(fdt_1.class, fyi2);
        this.a(fdu_1.class, fyi2);
        this.a(fdw_1.class, fyi2);
        this.a(fdv_1.class, fyi2);
        this.a(fdx_1.class, fyi2);
        this.a(fdy_1.class, fyi2);
        this.a(fdz_1.class, fyi2);
        this.a(fda_1.class, fyi2);
        this.a(fdb_1.class, fyi2);
        this.a(fdc_2.class, fyi2);
        this.a(fdd_1.class, fyi2);
        this.a(fdk_1.class, fyi2);
        this.a(fdi_2.class, fyi2);
        this.a(fdj_2.class, fyi2);
        this.a(fdl_1.class, fyi2);
        this.a(fdm_1.class, fyi2);
        this.a(fde_2.class, fyi2);
        this.a(fdf_2.class, fyi2);
        this.a(fdh_1.class, fyi2);
        this.a(fcy_2.class, fyi2);
        this.a(fda_2.class, fyi2);
        this.a(fzA.class, new fyf());
        this.a(fdg_1.class, new fyc());
    }

    public void a(Class<?> clazz, fzd fzd2) {
        if (this.b.containsKey(clazz)) {
            a.error((Object)("le convertisseur (template=" + clazz.toString() + ") est d\u00e9j\u00e0 utilis\u00e9 !"));
        } else {
            this.b.put(clazz, fzd2);
        }
    }

    public boolean a(Class<?> clazz) {
        boolean bl;
        if (clazz.equals(Object.class)) {
            return false;
        }
        boolean bl2 = bl = !this.b.containsKey(clazz);
        if (bl) {
            for (Class<?> clazz2 : this.b.keySet()) {
                if (!clazz.isAssignableFrom(clazz2)) continue;
                return true;
            }
        }
        return true;
    }

    public <J> J a(Class<J> clazz, String string, fyy_0 fyy_02) {
        return this.b(clazz).b(clazz, string, fyy_02);
    }

    public <J> J a(Class<J> clazz, String string) {
        return this.b(clazz).b(clazz, string);
    }

    public <J> fzd<J> b(Class<J> clazz) {
        fzd fzd2 = this.b.get(clazz);
        if (fzd2 == null) {
            throw new UnsupportedOperationException("On essaye de trouver un convertisseur pour le type " + clazz.getSimpleName());
        }
        return fzd2;
    }

    public azj_2 a(String string) {
        return this.a(azj_2.class, string);
    }

    public fjf_2 b(String string) {
        return this.a(fjf_2.class, string);
    }

    public String a(String string, fyy_0 fyy_02) {
        return this.a(String.class, string, fyy_02);
    }

    public Insets c(String string) {
        return this.a(Insets.class, string);
    }

    public ays_2 d(String string) {
        return this.a(ays_2.class, string);
    }

    public ayf_2 e(String string) {
        return this.a(ayf_2.class, string);
    }

    public fjv_1 f(String string) {
        return this.a(fjv_1.class, string);
    }
}

