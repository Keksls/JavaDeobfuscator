/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import org.apache.log4j.Logger;

public class cYe
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(cYe.class);
    private static final cYe b = new cYe();
    cyj_0 c;
    private cyk_0 d;
    fbx_1 e;
    fso f;
    ArrayList<fqt> g;
    final LinkedList<String> h = new LinkedList();
    private static final int i = 2500;
    private final ans_1 j = string -> {
        if (string.equals("dungeonLadderDialog")) {
            azu_0.j().b(cYe.a());
        }
    };

    public static cYe a() {
        return b;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        return true;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        fpm_0.b().a(this.j);
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        fpm_0.b().b(this.j);
        this.h();
        fis_1.a().a("dungeonLadderBackgroundImage");
        fpm_0.b().o("dungeonLadderDialog");
        fpm_0.b().e("wakfu.dungeonLadder");
        cdw_0.n().c(600121L);
    }

    public void c() {
        this.e();
        this.c = new cyj_0(eEy.a);
        fis_1.a().a("dungeonStatut", this.c);
        this.d = new cyk_0(this);
        ado_1.a().a(this.d, 1000L);
        fpm_0.b().a("dungeonStatutDialog", cfi_0.a("dungeonStatutDialog"), 139264L, (short)10000);
    }

    public static String a(int n) {
        int n2 = 0;
        int n3 = n;
        if (n3 / 3600 > 0) {
            return "> 1 h ";
        }
        if (n / 60 > 0) {
            n2 = n / 60;
            n3 = n % 60;
        }
        return (Serializable)(n2 < 10 ? "0" + n2 : Integer.valueOf(n2)) + ":" + (Serializable)(n3 < 10 ? "0" + n3 : Integer.valueOf(n3));
    }

    public void d() {
        fpm_0.b().o("dungeonStatutDialog");
        this.c = null;
        fis_1.a().a("dungeonStatut");
    }

    public void e() {
        if (this.d == null) {
            return;
        }
        ado_1.a().b(this.d);
        this.d = null;
    }

    public void f() {
        this.c = new cyj_0(eEy.b);
        this.c.a("0");
        fis_1.a().a("dungeonStatut", this.c);
        fpm_0.b().a("dungeonStatutDialog", cfi_0.a("dungeonStatutDialog"), 139264L, (short)10000);
    }

    public void g() {
        int n = Integer.parseInt(this.c.a());
        this.c.a(String.valueOf(n + 1));
    }

    public void a(short s2) {
        if (this.c == null) {
            a.error((Object)"on tente d'afficher le r\u00e9sultat d'un donjon alors qu'il n'existe pas d'interface de statut");
            return;
        }
        this.c.a(s2);
    }

    public void a(String string) {
        if (fis_1.a().e("splashText") != null) {
            this.h.addLast(string);
        } else {
            fis_1.a().a("splashText", (Object)string);
            if (!fpm_0.b().q("splashMessageDialog") || this.f == null) {
                this.f = (fso)fpm_0.b().a("splashMessageDialog", cfi_0.a("splashMessageDialog"), 8210L, (short)10000);
            }
            if (this.f != null) {
                if (this.e != null) {
                    this.f.getAppearance().c(this.e);
                }
                this.e = new fbx_1();
                this.e.onCheckOut();
                this.e.setFile("6001037.xps");
                this.e.setAlignment(frs_0.e);
                this.f.getAppearance().add(this.e);
            }
            this.a(true);
        }
    }

    private void i() {
        this.g = new ArrayList();
        fyy_0 fyy_02 = this.f.getElementMap();
        this.g.add(((fso)fyy_02.a("mainContainer")).getAppearance());
        this.g.add(((fuk_0)fyy_02.a("text")).getAppearance());
    }

    private void b(boolean bl) {
        fyy_0 fyy_02 = this.f.getElementMap();
        ((fso)fyy_02.a("mainContainer")).setNonBlocking(bl);
    }

    public void a(boolean bl) {
        int n;
        int n2;
        if (this.f == null) {
            a.warn((Object)"on tente de fade un splashScreen alors qu'il n'est pas charg\u00e9");
            return;
        }
        if (this.g == null) {
            this.i();
        }
        this.b(!bl);
        fyy_0 fyy_02 = this.f.getElementMap();
        fso fso2 = (fso)fyy_02.a("mainContainer");
        fqt fqt2 = this.g.get(0);
        if (bl) {
            n2 = azf_2.b.i();
            n = azf_2.e.i();
        } else {
            n2 = azf_2.e.i();
            n = azf_2.b.i();
        }
        if (n2 != n) {
            if (bl) {
                cdw_0.n().z();
            } else {
                cdw_0.n().A();
            }
            azf_2 azf_22 = new azf_2(n2);
            azf_2 azf_23 = new azf_2(n);
            fso2.removeTweensOfType(fjo_2.class);
            fjo_2 fjo_22 = new fjo_2(azf_22, azf_23, this.g, 0, 500, 1, fjw_2.b);
            fjo_22.a(new cyf_0(this, bl));
            fso2.addTween(fjo_22);
        }
    }

    public void h() {
        this.e();
    }
}

