/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bCD
 */
public class bcd_1
extends bFZ {
    protected static final Logger q = Logger.getLogger(bcd_1.class);
    private final fo_1 r = new bce_1(this, 3);

    protected bcd_1() {
    }

    @Override
    protected fo_1 ad() {
        return this.r;
    }

    @Override
    public void c(ph_0 ph_02) {
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.g = 1;
        this.f(true);
        this.b(false);
        this.g(true);
        this.A = false;
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        this.a(tv);
        return false;
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
        return 4;
    }

    static /* synthetic */ void a(bcd_1 bcd_12, abm_1 abm_12) {
        bcd_12.a(abm_12);
    }

    static /* synthetic */ short a(bcd_1 bcd_12, short s2) {
        bcd_12.g = s2;
        return bcd_12.g;
    }
}

