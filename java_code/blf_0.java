/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from blf
 */
public class blf_0
implements ajh_1 {
    private static final Logger b = Logger.getLogger(blf_0.class);
    private static final String d = "level";
    private static final String e = "levelString";
    public static final String a = "selectedLevel";
    private static final String[] f = new String[]{"level", "levelString", "selectedLevel"};
    private final short g;
    private final epq_2 h;

    public blf_0(short s2, epq_2 epq_22) {
        this.g = s2;
        this.h = epq_22;
    }

    @Override
    public String[] d() {
        return f;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(d)) {
            return this.g;
        }
        if (string.equals(e)) {
            return this.b();
        }
        if (string.equals(a)) {
            return this.e();
        }
        return null;
    }

    public short a() {
        return this.g;
    }

    private String e() {
        ani_2 ani_22 = new ani_2();
        ani_22.i().a().a((CharSequence)" ").a((CharSequence)bae.h().a("levelShort.custom", this.a())).b();
        try {
            if (this.h.dr() < this.h.dt()) {
                ani_22.a((CharSequence)" ").a(bac.a(116), 14, 13, null, null);
            }
        }
        catch (gm_0 gm_02) {
            b.error((Object)"Exception trying to getNameAndLevel", (Throwable)gm_02);
        }
        return ani_22.r();
    }

    String b() {
        ani_2 ani_22 = new ani_2();
        ani_22.i().a((CharSequence)bae.h().a("levelShort.custom", this.g));
        return ani_22.r();
    }

    public boolean c() {
        return false;
    }
}

