/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bfm
 */
public class bfm_1
implements agw_0 {
    public static final bfm_1 a = new bfm_1();
    private static final Logger b = Logger.getLogger(bfm_1.class);

    private bfm_1() {
    }

    public void a(YK yK) {
        try {
            asw_2.a().a(new aSV(), bfm_1::a);
        }
        catch (Exception exception) {
            b.error((Object)"Exception raised", (Throwable)exception);
        }
        yK.b(this);
    }

    private static void a(aSV aSV2) {
        fgd.a.a(aSV2.c(), fgc.a(aSV2.c(), aSV2.d(), aSV2.e(), aSV2.f(), aSV2.g()));
    }

    @Override
    public String m_() {
        return bae.h().a("contentLoader.mountSkin", new Object[0]);
    }
}

