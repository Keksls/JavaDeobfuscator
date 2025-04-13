/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bqc
 */
public class bqc_2
extends bpc_2 {
    protected static final Logger a = Logger.getLogger(bqc_2.class);
    private fii b;
    private long c;
    private int e;
    private final aff_1 f;

    public bqc_2(int n, int n2) {
        this.f = new aff_1(n, n2);
    }

    public long h() {
        return this.c;
    }

    public void a(long l) {
        this.c = l;
    }

    public void a(int n) {
        this.e = n;
    }

    @Override
    public short ac_() {
        return 2;
    }

    @Override
    public boolean g() {
        return true;
    }

    @Override
    public void a() {
        a.info((Object)"Lancement occupation PLANT");
        dcw.n().j();
        this.d.a(false, true);
        fii fii2 = fij.a().a(this.b.a());
        if (fii2 != null) {
            biI biI2 = this.d.bv();
            aej_2 aej_22 = biI2.ap().c(this.f);
            biI2.a(aej_22);
            bOE.a(biI2, fii2);
        }
        this.d.do().a(this.c, this.e);
        this.d.a(this);
    }

    @Override
    public boolean a(boolean bl, boolean bl2) {
        this.a((byte)3, bl2);
        return true;
    }

    @Override
    public boolean b() {
        this.a((byte)2, true);
        return true;
    }

    private void a(byte by, boolean bl) {
        Object object;
        dcw.n().j();
        if (bl) {
            object = new cpz_0();
            ((cpz_0)object).a(by);
            ((cpz_0)object).a((short)2);
            azu_0.j().K().c(object);
        }
        if (((afe_0)(object = this.d.bv())).bb() == null) {
            bOE.b((afe_0)object, this.b);
        }
        a.info((Object)"On termine l'occupation PLANT");
        this.d.do().a();
    }

    public void b(fii fii2) {
        this.b = fii2;
    }
}

