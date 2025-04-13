/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import org.apache.log4j.Logger;

public class aUr
extends auc_0 {
    private static final Logger x = Logger.getLogger(aUr.class);
    public static final String k = "%s \"%s\"";
    public static final int l = 13;
    private String y;
    private boolean z;
    public static final String m = "name";
    public static final String n = "windowId";
    public static final String o = "allFiltersList";
    public static final String p = "isDefaultView";
    public static final String q = "isPrivateView";
    private aUW A;
    private boolean B;
    private boolean C;
    public static final String r = "characterName";
    public static final String s = ";";
    public static final String t = "accountName";
    public static final String u = "Error";
    public static final String[] v;
    public static final String[] w;
    private aUt D;

    public aUr(int n, String string, aUe aUe2, List<aup_0> list, boolean bl) {
        this(n, string, aUe2, list, bl, false);
    }

    public aUr(int n, String string, aUe aUe2, List<aup_0> list, boolean bl, boolean bl2) {
        super(n, list);
        this.y = string;
        this.A = aUe2;
        this.z = bl;
        this.B = bl2;
        if (bl2) {
            this.a(aUr.a(string, aUe2));
        }
    }

    @Override
    public String[] d() {
        return v;
    }

    @Override
    public Object b(String string) {
        if (string.equals(m)) {
            return this.p() ? bae.h().a(this.y, new Object[0]) : this.y;
        }
        if (string.equals(n)) {
            return this.u();
        }
        if (string.equals(o)) {
            return this.b();
        }
        if (string.equals(p)) {
            return this.z;
        }
        if (string.equals(q)) {
            return this.l();
        }
        return super.b(string);
    }

    private int u() {
        return aUxx.a().b(this);
    }

    @Override
    public boolean a_(String string) {
        if (string.equals(m)) {
            return true;
        }
        return super.a_(string);
    }

    @Override
    public void a(String string, Object object) {
        if (string.equals(m)) {
            this.c(object.toString());
        } else {
            super.a(string, object);
        }
    }

    @Override
    public void b(String string, Object object) {
        super.b(string, object);
        this.n();
    }

    @Override
    public void c(String string, Object object) {
        super.c(string, object);
        this.n();
    }

    public void n() {
        int n = this.u();
        fvk_0 fvk_02 = cww_0.c().b(n);
        if (fvk_02 == null) {
            return;
        }
        fyy_0 fyy_02 = fvk_02.getElementMap();
        if (fyy_02 == null) {
            return;
        }
        fue_0 fue_02 = (fue_0)fyy_02.a("chatScrollContainer");
        if (this.D != null) {
            ado_1.a().b(this.D);
            this.D.a(fue_02);
        } else {
            this.D = new aUt(this, fue_02);
        }
        ado_1.a().a(this.D, 250L, 1);
    }

    @Override
    public void a() {
        super.a();
        this.n();
    }

    private void a(ani_2 ani_22, String string, String string2, String string3, azj_2 azj_22, String string4) {
        if (azj_22 != null) {
            ani_22.i();
            ani_22.a(azj_22);
        }
        if (string3 != null && !string3.trim().isEmpty()) {
            ani_22.a((CharSequence)"[").a((CharSequence)string3).a((CharSequence)"] ");
        }
        if (string2 != null) {
            aUr.a(ani_22, string, string2);
        }
        ani_22.a((CharSequence)bae.h().a("colon", new Object[0])).a((CharSequence)string4).a((CharSequence)"\n");
        if (azj_22 != null) {
            ani_22.j();
        }
    }

    public static void a(ani_2 ani_22, String string, String string2) {
        ani_22.a().g();
        ani_22.c(string);
        ani_22.a((CharSequence)string2);
        ani_22.h().b();
    }

    @Override
    protected String a(aUm aUm2) {
        ani_2 ani_22 = new ani_2();
        String string = aUm2.f();
        azj_2 azj_22 = aUr.c(aUm2);
        if (((bvx_0)ans_0.D().h()).a(bWe.ad)) {
            aUr.a(ani_22, aUm2);
        }
        bvs_0 bvs_02 = ((bvx_0)ans_0.D().h()).m();
        String string2 = "characterName_" + aUm2.c() + s + aUm2.d();
        String string3 = aUm2.a(bvs_02);
        switch (aUm2.a()) {
            case e: {
                if (string3 != null) {
                    ani_22.a().g().a((CharSequence)string3).h().b().a((CharSequence)bae.h().a("colon", new Object[0]));
                }
                if (azj_22 != null) {
                    ani_22.i().a(azj_22).a((CharSequence)string).j();
                } else {
                    ani_22.a((CharSequence)string);
                }
                ani_22.a((CharSequence)"\n");
                break;
            }
            case d: {
                String string4;
                String string5 = string4 = string.isEmpty() ? u : string;
                if (azj_22 != null) {
                    ani_22.i().a(azj_22).a((CharSequence)string4).j();
                } else {
                    ani_22.a((CharSequence)string4);
                }
                ani_22.a((CharSequence)"\n");
                break;
            }
            case k: {
                ani_22.i();
                ani_22.a(azj_22);
                ani_22.a((CharSequence)"(").a((CharSequence)bae.h().a("chat.pipeName.all", new Object[0])).a((CharSequence)") ");
                ani_22.a((CharSequence)string);
                ani_22.a((CharSequence)">\n");
                ani_22.j();
                break;
            }
            case c: {
                if (!aUm2.a(azu_0.j().k())) {
                    this.a(ani_22, string2, aUm2.d(), null, azj_22, string);
                    break;
                }
                ani_22.i();
                ani_22.a(azj_22);
                ani_22.a((CharSequence)bae.h().a("chat.to", new Object[0])).a((CharSequence)" ");
                ani_22.j();
                this.a(ani_22, "characterName_" + ((aUq)aUm2).m(), aUm2.d(), null, azj_22, string);
                break;
            }
            case m: {
                if (aUm2.c() == azu_0.j().n().u()) {
                    ani_22.i();
                    ani_22.a(aup_0.m.d());
                    ani_22.a((CharSequence)bae.h().a("chat.to", new Object[0])).a((CharSequence)" ");
                    ani_22.j();
                } else {
                    aUr.b(ani_22, aUm2);
                }
                this.a(ani_22, "accountName_" + aUm2.c(), string3, null, aup_0.m.d(), string);
                break;
            }
            case i: {
                if (string3 == null) {
                    ani_22.i().a(azj_22).a((CharSequence)string).j();
                    ani_22.a((CharSequence)"\n");
                    break;
                }
            }
            default: {
                this.a(ani_22, string2, string3, aUm2.l(), azj_22, string);
            }
        }
        return ani_22.r();
    }

    private static azj_2 c(aUm aUm2) {
        if (ani_2.g(aUm2.e())) {
            return null;
        }
        return aul_0.a().d(aUm2.a()).d();
    }

    private static void a(ani_2 ani_22, aUm aUm2) {
        wu_0 wu_02 = aUm2.g();
        int n = wu_02.k();
        int n2 = wu_02.l();
        int n3 = wu_02.n();
        ani_22.i();
        ani_22.a("808080");
        ani_22.a((CharSequence)String.format("[%02d:%02d:%02d] ", n, n2, n3));
        ani_22.j();
    }

    @Override
    public void b(aUm aUm2) {
        if (!this.a(aUm2.a())) {
            return;
        }
        if (!this.d(aUm2)) {
            return;
        }
        super.b(aUm2);
        if (!aUxx.a().a(aUm2.a())) {
            dey.a(this);
        }
    }

    private boolean d(aUm aUm2) {
        return aUm2.b() == -1 || aUm2.b() == this.u();
    }

    public String o() {
        return this.y;
    }

    public void c(String string) {
        this.y = string;
    }

    public void b(boolean bl) {
        this.C = bl;
    }

    public boolean p() {
        return this.z;
    }

    public boolean q() {
        return this.C;
    }

    public void c(boolean bl) {
        this.z = bl;
    }

    public void a(aUW aUW2) {
        this.A = aUW2;
    }

    public aUW r() {
        return this.A;
    }

    @Override
    public aUY a(aUW aUW2, boolean bl) {
        aUY aUY2 = super.a(aUW2, bl);
        if (aUY2 == null) {
            return null;
        }
        boolean bl2 = aUW2 == this.A;
        this.A = aUW2;
        if (aUY2.b().c().startsWith("subPipe") || this.B) {
            this.a(aUr.a(this.y, aUW2));
        } else {
            this.a(aUY2.f());
        }
        if (!bl || bl2) {
            return aUY2;
        }
        fis_1.a().a((ajf_1)this, "currentChannel");
        try {
            aUf.e();
        }
        catch (Exception exception) {
            x.error((Object)"Erreur \u00e0 la sauvegarde du chat");
            x.error((Object)"Exception during setCurrentChannel", (Throwable)exception);
        }
        return aUY2;
    }

    private static void b(ani_2 ani_22, aUm aUm2) {
        try {
            int n = aUS.a.b(aUm2.c());
            ani_22.a(bac.a(n), 13, 13, null).a(' ');
        }
        catch (gm_0 gm_02) {
            x.error((Object)"Error when getting game icon", (Throwable)gm_02);
        }
    }

    public static String e(String string) {
        return aUr.a(string, aUe.b);
    }

    public static String a(String string, aUW aUW2) {
        auv_0 auv_02 = aUf.a(aUW2.b());
        return String.format(k, auv_02.b(), string);
    }

    @Override
    public boolean l() {
        return this.B;
    }

    public String toString() {
        return String.format("ChatView{m_name='%s', viewIndex=%d}", this.y, this.f());
    }

    public void s() {
        fis_1.a().a((ajf_1)this.e(), aUY.h);
    }

    public void t() {
        if (this.D != null) {
            ado_1.a().b(this.D);
            this.D = null;
        }
    }

    static {
        w = new String[]{m, n, o, q, p};
        v = new String[w.length + auc_0.j.length];
        System.arraycopy(w, 0, v, 0, w.length);
        System.arraycopy(auc_0.j, 0, v, w.length, auc_0.j.length);
    }
}

