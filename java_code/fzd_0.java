/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TByteObjectHashMap;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.log4j.Logger;

/*
 * Renamed from fzD
 */
public class fzd_0 {
    protected static final Logger b = Logger.getLogger(fzd_0.class);
    private static fzd_0 a;
    private fvE d;
    private boolean e = false;
    private frs_0 f = frs_0.g;
    private int g = 0;
    private int h = 0;
    private int i = 0;
    private int j = 0;
    private byte k = (byte)-1;
    protected final TByteObjectHashMap<fzc_0> c = new TByteObjectHashMap();

    protected fzd_0() {
        a = this;
        this.c.put((byte)1, (Object)new fze_0(this));
        this.c.put((byte)2, (Object)new fzf_0(this));
        this.c.put((byte)3, (Object)new fzg_0(this));
    }

    public void a(fvE fvE2) {
        this.d = fvE2;
    }

    public static fzd_0 a() {
        if (a == null) {
            a = new fzd_0();
        }
        return a;
    }

    public void a(int n, int n2) {
        this.i = n;
        this.j = n2;
        this.b();
    }

    public void b() {
        if (this.d != null) {
            int n = this.i - this.f.a(this.d.getWidth()) + this.g;
            int n2 = this.j - this.f.b(this.d.getHeight()) + this.h - this.d.getHeight() / 2;
            this.d.setPosition(n, n2);
        }
    }

    public void a(String string, String string2, int n, int n2, frs_0 frs_02) {
        fzb_0 fzb_02 = this.a(string, string2);
        if (fzb_02 == null) {
            b.warn((Object)("Impossible de cr\u00e9er les data pour iconUrl=" + string + " et text=" + string2));
            return;
        }
        this.a(fzb_02, n, n2, frs_02);
    }

    public void a(fzb_0 fzb_02, int n, int n2, frs_0 frs_02) {
        fvE fvE2;
        this.d();
        this.k = fzb_02.d();
        fzc_0 fzc_02 = (fzc_0)this.c.get(fzb_02.d());
        if (fzc_02 == null) {
            return;
        }
        try {
            fvE2 = fzc_02.a(fzb_02);
        }
        catch (Exception exception) {
            b.error((Object)"Exception levee", (Throwable)exception);
            return;
        }
        if (fvE2 == null) {
            return;
        }
        this.a(fvE2);
        this.a(n);
        this.b(n2);
        this.a(frs_02);
        this.c();
        fvE2.validate();
        this.a(fyf_0.a().c(), fyf_0.a().d());
    }

    private fzb_0 a(String string, String string2) {
        if (string != null && string2 != null) {
            return new fzi_0(string, string2);
        }
        if (string != null) {
            return new fzh_0(string);
        }
        if (string2 != null) {
            return new fzj_0(string2);
        }
        return null;
    }

    public void c() {
        if (this.e) {
            return;
        }
        fsn_0 fsn_02 = fpm_0.b().j().a().getLayeredContainer();
        fsn_02.a(this.d, 40000);
        this.e = true;
    }

    public void d() {
        if (this.d == null || !this.e) {
            return;
        }
        fzc_0 fzc_02 = (fzc_0)this.c.get(this.k);
        if (fzc_02 == null) {
            return;
        }
        fzc_02.a(this.d);
        this.d = null;
        this.e = false;
    }

    public frs_0 e() {
        return this.f;
    }

    public void a(frs_0 frs_02) {
        this.f = frs_02;
        this.b();
    }

    public int f() {
        return this.g;
    }

    public void a(int n) {
        this.g = n;
        this.b();
    }

    public int g() {
        return this.h;
    }

    public void b(int n) {
        this.h = n;
        this.b();
    }

    fvE c(String string) {
        return this.a(string, null, null);
    }

    fvE d(String string) {
        return this.a(null, string, null);
    }

    fvE b(String string, String string2) {
        return this.a(string, string2, null);
    }

    private fvE a(String string, fyy_0 fyy_02) {
        if (fyy_02 == null) {
            fyy_02 = this.j();
        }
        try {
            fsk_0 fsk_02 = new fsk_0();
            URL uRL = gg_0.d(string);
            fqv fqv2 = new fqv();
            fqv2.onCheckOut();
            fqv2.setPixmap(new ayo_2(fdo_2.b().a(uRL)));
            fsk_02.onCheckOut();
            fsk_02.setNonBlocking(true);
            fsk_02.setExpandable(false);
            fsk_02.add(fqv2);
            fsk_02.a();
            fsk_02.setId("image");
            fyy_02.a(fsk_02.getId(), fsk_02);
            fsk_02.setElementMap(fyy_02);
            fsk_02.setSizeToPrefSize();
            return fsk_02;
        }
        catch (MalformedURLException malformedURLException) {
            b.warn((Object)("URL malform\u00e9e : \"" + string + "\""));
            return null;
        }
    }

    private fvE b(String string, fyy_0 fyy_02) {
        if (fyy_02 == null) {
            fyy_02 = this.j();
        }
        fuk_0 fuk_02 = new fuk_0();
        fuk_02.onCheckOut();
        fuk_02.setExpandable(false);
        fuk_02.setNonBlocking(true);
        fuk_02.setStyle("White14Bordered");
        fuk_02.c(string);
        fuk_02.setSizeToPrefSize();
        fuk_02.setId("text");
        fyy_02.a(fuk_02.getId(), fuk_02);
        fuk_02.setElementMap(fyy_02);
        fuk_02.onChildrenAdded();
        return fuk_02;
    }

    private fyy_0 j() {
        return new fyy_0("test", fpm_0.b().h());
    }

    private fvE a(String string, String string2, fyy_0 fyy_02) {
        fip_2 fip_22;
        fvE fvE2;
        if (fyy_02 == null) {
            fyy_02 = this.j();
        }
        fin_2 fin_22 = new fin_2();
        fin_22.onCheckOut();
        fin_22.setAlign(frs_0.b);
        fin_22.setHorizontal(false);
        fso fso2 = new fso();
        fso2.onCheckOut();
        fso2.setLayoutManager(fin_22);
        if (string != null) {
            fvE2 = this.a(string, fyy_02);
            fip_22 = new fip_2();
            fip_22.onCheckOut();
            fip_22.setAlign(frs_0.d);
            fvE2.setExpandable(false);
            fvE2.setLayoutData(fip_22);
            fso2.add(fvE2);
        }
        if (string2 != null) {
            fvE2 = this.b(string2, fyy_02);
            fip_22 = new fip_2();
            fip_22.onCheckOut();
            fip_22.setAlign(frs_0.d);
            fvE2.setExpandable(false);
            fvE2.setLayoutData(fip_22);
            fso2.add(fvE2);
        }
        fso2.setElementMap(fyy_02);
        fso2.setPack(true);
        fso2.onAttributesInitialized();
        fso2.onChildrenAdded();
        return fso2;
    }

    public void a(String string) {
        if (this.d == null) {
            return;
        }
        fyb_0 fyb_02 = this.d.getElementMap().a("text");
        if (fyb_02 == null) {
            return;
        }
        ((fuk_0)fyb_02).c(string);
        this.b();
    }

    public void b(String string) {
        if (this.d == null) {
            return;
        }
        fyb_0 fyb_02 = this.d.getElementMap().a("image");
        if (fyb_02 == null) {
            return;
        }
        try {
            URL uRL = gg_0.d(string);
            fqv fqv2 = new fqv();
            fqv2.onCheckOut();
            fqv2.setPixmap(new ayo_2(fdo_2.b().a(uRL)));
            fyb_02.add(fqv2);
            this.b();
        }
        catch (MalformedURLException malformedURLException) {
            b.warn((Object)("URL malform\u00e9e : \"" + string + "\""));
        }
    }

    public boolean h() {
        return this.d == null;
    }

    public boolean i() {
        return this.d != null && this.d.getVisible();
    }
}

