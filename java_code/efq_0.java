/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from eFq
 */
public class efq_0<F extends epq_2>
implements eFr {
    protected static final Logger a = Logger.getLogger(efq_0.class);
    protected final elm_0<F> b;
    private final Si<efh_0> c;
    private boolean d;

    public efq_0(elm_0<F> elm_02, Si<efh_0> si) {
        this.b = elm_02;
        this.c = si;
    }

    @Override
    public byte h() {
        return 1;
    }

    @Override
    public Sq b() {
        return this.b.R();
    }

    @Override
    public Si<efh_0> a() {
        return this.c;
    }

    @Override
    public apk_1<Su> c() {
        return this.b;
    }

    @Override
    public va_0 d() {
        return this.b != null ? this.b.O() : null;
    }

    @Override
    public tg_0 e() {
        return this.b != null ? this.b.g() : null;
    }

    @Override
    public Sv f() {
        return this.b;
    }

    @Override
    public ss_0 g() {
        return this.b != null ? this.b.i() : null;
    }

    public elm_0<F> l() {
        return this.b;
    }

    @Override
    public int k() {
        return this.b != null ? this.b.c() : 0;
    }

    @Override
    public void a(ekk_0 ekk_02) {
        this.b.a(ekk_02);
    }

    public void a(Su su) {
        this.b.a(su);
    }

    @Override
    public Sy i() {
        return this.b.T();
    }

    @Override
    public Sx j() {
        return this.b.U();
    }

    public boolean m() {
        return this.d;
    }

    public void a(boolean bl) {
        this.d = bl;
    }

    public String toString() {
        return "WakfuFightEffectContext{m_fight=" + this.b + ", m_extendedEffectExecutionCount=" + this.d + "}";
    }
}

