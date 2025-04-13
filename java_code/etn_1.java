/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from eTn
 */
public final class etn_1
implements etg_1 {
    private static final Logger a = Logger.getLogger(etn_1.class);
    private final int b;

    public etn_1(etm_1 etm_12) {
        this.b = etm_12.a();
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
        etk_12.a(this.b);
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
        etk_12.a(-this.b);
    }

    @Override
    public boolean a() {
        return false;
    }
}

