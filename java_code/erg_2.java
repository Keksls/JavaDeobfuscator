/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from erg
 */
public class erg_2
extends eqy_1 {
    private static erg_2 a;
    private static final Logger e;
    protected final epc_0 b = new epc_0();
    protected byte c;
    protected int d;

    public static erg_2 b() {
        return a;
    }

    public static void a(erg_2 erg_22) {
        if (a == null) {
            a = erg_22;
        }
    }

    public erg_2 b(short s2, String string, int n, short s3, epq_2 epq_22, fiz<fio_0> fiz2) {
        return new erg_2(s2, string, n, s3, epq_22, fiz2);
    }

    public erg_2 a() {
        return new erg_2();
    }

    public erg_2 a(short s2, tv_0<fio_0, yt_2> tv_02, tt_0<fio_0> tt_02, boolean bl, boolean bl2, boolean bl3) {
        return new erg_2(s2, tv_02, tt_02, bl, bl2, bl3);
    }

    public erg_2() {
    }

    protected erg_2(short s2, tv_0<fio_0, yt_2> tv_02, tt_0<fio_0> tt_02, boolean bl, boolean bl2, boolean bl3) {
    }

    protected erg_2(short s2, String string, int n, short s3, epq_2 epq_22, fiz<fio_0> fiz2) {
        super(s2, string, n, (short)Math.min(s3, epq_22.dr()));
        this.a(epq_22.dp());
        eov_1<epa_1> eov_12 = epq_22.gP();
        for (eps_0 eps_02 : eps_0.values()) {
            if (!eov_12.a(eps_02) || !this.b.a(eps_02)) continue;
            this.b.e(eps_02).a(eov_12.b(eps_02));
        }
    }

    @Override
    public void a(epq_2 epq_22, epq_2 epq_23) {
        super.a(epq_22, epq_23);
        this.a(epq_22);
        this.b(epq_22);
        epq_22.c(eoz_1.bh);
    }

    private void a(epq_2 epq_22) {
        epq_22.gP().a(this.b);
    }

    private void b(epq_2 epq_22) {
    }

    @Override
    public byte n() {
        return this.c;
    }

    @Override
    public boolean a(wf_1 wf_12) {
        wf_12.c();
        super.a(wf_12);
        wf_12.h = new wi_1();
        wf_12.h.a.b = this.c;
        wf_12.h.a.a = this.d;
        this.b.a(wf_12.h.a.c);
        return true;
    }

    @Override
    public boolean b(wf_1 wf_12) {
        boolean bl = super.b(wf_12);
        this.c = wf_12.h.a.b;
        this.d = wf_12.h.a.a;
        this.b.b(wf_12.h.a.c);
        return bl;
    }

    static {
        e = Logger.getLogger(erg_2.class);
    }
}

