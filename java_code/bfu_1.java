/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bfu
 */
public class bfu_1
implements agw_0 {
    public static final bfu_1 a = new bfu_1();
    private static final Logger b = Logger.getLogger(bfu_1.class);

    private bfu_1() {
    }

    public void a(YK yK) {
        try {
            asw_2.a().a(new aTf(), bfu_1::a);
        }
        catch (Exception exception) {
            b.error((Object)"Exception raised", (Throwable)exception);
        }
        yK.b(this);
    }

    private static void a(aTf aTf2) {
        fgl.a.a(aTf2.c(), fgk.a(aTf2.c(), aTf2.d(), aTf2.e(), aTf2.f()));
    }

    @Override
    public String m_() {
        return bae.h().a("contentLoader.petSkin", new Object[0]);
    }
}

