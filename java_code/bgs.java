/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bgs
implements ajh_1 {
    private static final Logger e = Logger.getLogger(bgs.class);
    public static final String a = "description";
    public static final String b = "iconUrl";
    public static final String[] d = new String[]{"description", "iconUrl"};
    private final eel_0 f;

    public bgs(eel_0 eel_02) {
        this.f = eel_02;
    }

    @Override
    public String[] d() {
        return d;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.a();
        }
        if (string.equals(b)) {
            if (this.f.a() == eem_0.a) {
                bjw_1 bjw_12 = (bjw_1)eyo_1.g().d(this.f.b());
                return bjw_12.b(string);
            }
            if (this.f.a() == eem_0.b) {
                try {
                    return String.format(azs_0.a().a("rewardTypeIconsPath"), bhn_1.f.b());
                }
                catch (gm_0 gm_02) {
                    e.warn((Object)gm_02.getMessage(), (Throwable)gm_02);
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public String a() {
        if (this.f.a() == eem_0.a) {
            bjw_1 bjw_12 = (bjw_1)eyo_1.g().d(this.f.b());
            return bjw_12.e();
        }
        return bae.h().a("xpGain", this.f.b());
    }

    public eel_0 b() {
        return this.f;
    }
}

