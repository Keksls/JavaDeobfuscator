/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aOL
 */
public class aol_0
implements wr_0 {
    protected static final Logger a = Logger.getLogger(aol_0.class);
    private static final aol_0 b = new aol_0();
    private static final float c = 25.0f;
    private static final float d = 1.0f;
    private static final float e = 0.0f;
    private static final double f = -0.5235987755982988;
    private boolean g = false;
    private final float h;
    private final float i;

    private aol_0() {
        this.h = 0.0f;
        this.i = 0.0f;
    }

    @Override
    public void onCalendarEvent(ws_0 ws_02, wq_0 wq_02) {
        switch (ws_02) {
            case a: {
                if (!wq_02.l()) break;
                this.a((wc_0)wq_02);
            }
        }
    }

    public void a(wc_0 wc_02) {
    }

    public float a() {
        return this.h;
    }

    public float b() {
        return this.i;
    }

    public boolean c() {
        return this.g;
    }

    public void a(boolean bl) {
        this.g = bl;
    }

    public static aol_0 d() {
        return b;
    }
}

