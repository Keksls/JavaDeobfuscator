/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

/*
 * Renamed from bAu
 */
public class bau_2
extends bFZ {
    static final Logger q = Logger.getLogger(bau_2.class);
    private static final Pattern r = Pattern.compile(";");
    private int s;
    private boolean t;

    bau_2() {
        this.ah();
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.f(true);
        this.s = 0;
        this.t = false;
        this.a((short)0);
        this.b(false);
        this.g(false);
        this.k(false);
    }

    @Override
    public void c(ph_0 ph_02) {
        q.debug((Object)("[ON VIEW UPDATED] " + ph_02));
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        return true;
    }

    @Override
    public Tv ap_() {
        return Tv.i;
    }

    @Override
    public Tv[] r() {
        return Tv.O;
    }

    @Override
    public byte W() {
        return 0;
    }

    public int p() {
        return this.s;
    }

    public void s() {
        if (!(this.a && this.t && this.P())) {
            return;
        }
        int n = this.G();
        int n2 = this.H();
        short s2 = this.I();
        int n3 = ans_0.D().c().a(n, n2, s2);
        cdw_0.n().a(this.d, cdh_0.a(this.s), new alz_1(n, n2, s2, false, n3));
    }

    @Override
    public void aD_() {
        super.aD_();
        this.s();
    }

    @Override
    public void aE_() {
        this.ao();
        super.aE_();
    }

    private void ao() {
        if (this.t) {
            cdw_0.n().f(this.d);
        }
    }

    @Override
    public void f(boolean bl) {
        boolean bl2 = this.P();
        super.f(bl);
        if (bl2 == bl) {
            return;
        }
        if (bl) {
            this.s();
        } else {
            this.ao();
        }
    }

    @Override
    public void ar_() {
        int n;
        super.ar_();
        String[] stringArray = r.split(this.l);
        if (stringArray.length != 1) {
            q.error((Object)("[LD] L'audioMarker " + this.d + " doit avoir 1 param\u00e8tre"));
            return;
        }
        try {
            n = Integer.valueOf(stringArray[0]);
        }
        catch (NumberFormatException numberFormatException) {
            q.error((Object)("[LD] L'audioMarker " + this.d + " a un parametre [" + stringArray[0] + "] qui n'est pas du bon type (id attendu)"));
            return;
        }
        eus_1 eus_12 = (eus_1)evl_1.a.a(evg_1.l, n);
        if (eus_12 == null) {
            q.error((Object)("[LD] L'audioMarker " + this.d + " a un parametre [" + Integer.valueOf(stringArray[0]) + "] qui ne correspond a rien dans les Admins"));
            return;
        }
        this.s = eus_12.a();
        this.t = eus_12.d();
    }

    @Override
    public boolean a(Tv tv, TF tF) {
        return false;
    }

    static /* synthetic */ void a(bau_2 bau_22, abm_1 abm_12) {
        bau_22.a(abm_12);
    }
}

