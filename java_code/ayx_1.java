/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 */
import java.awt.font.GlyphVector;
import org.apache.commons.pool.ObjectPool;

/*
 * Renamed from ayx
 */
class ayx_1
implements abq_1 {
    private static final ObjectPool a = new abm_1(new ayy_1());
    private boolean b;
    private GlyphVector c;
    private String d;

    ayx_1() {
    }

    public static ayx_1 a(GlyphVector glyphVector, String string) {
        ayx_1 ayx_12;
        try {
            ayx_12 = (ayx_1)a.borrowObject();
        }
        catch (Exception exception) {
            ayv_1.b.error((Object)"Probl\u00e8me au borrowObject.");
            ayx_12 = new ayx_1();
            ayx_12.onCheckOut();
        }
        ayx_12.c = glyphVector;
        ayx_12.d = string;
        return ayx_12;
    }

    public GlyphVector a() {
        return this.c;
    }

    public void a(boolean bl) {
        this.b = bl;
    }

    public boolean b() {
        return this.b;
    }

    String c() {
        return this.d;
    }

    @Override
    public void onCheckOut() {
        this.b = true;
    }

    @Override
    public void onCheckIn() {
        this.c = null;
        this.d = null;
    }

    @Override
    public void release() {
        try {
            a.returnObject((Object)this);
        }
        catch (Exception exception) {
            this.onCheckIn();
        }
    }
}

