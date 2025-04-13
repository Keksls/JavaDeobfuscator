/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from eTt
 */
public final class ett_2
implements etg_1 {
    private static final Logger a = Logger.getLogger(ett_2.class);
    private final int b;

    public ett_2(etu_2 etu_22) {
        this.b = etu_22.a();
    }

    @Override
    public void a(long l, long l2) {
        etk_1 etk_12;
        try {
            etk_12 = etl_1.a.a(l);
        }
        catch (etf_1 etf_12) {
            a.error((Object)"Exception raised", (Throwable)etf_12);
            return;
        }
        etk_12.e(this.b);
    }

    @Override
    public void b(long l, long l2) {
        etk_1 etk_12;
        try {
            etk_12 = etl_1.a.a(l);
        }
        catch (etf_1 etf_12) {
            a.error((Object)"Exception raised", (Throwable)etf_12);
            return;
        }
        etk_12.e(0);
    }

    @Override
    public boolean a() {
        return false;
    }

    public String toString() {
        return "PerceptionBonus{m_perceptionRate=" + this.b + "}";
    }
}

