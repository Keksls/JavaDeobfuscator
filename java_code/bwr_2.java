/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bWr
 */
public class bwr_2
implements ajh_1 {
    private static final String a = "style";
    private static final String b = "effect";
    private static final String d = "enabled";
    private final fgk_0 e;
    private final bMn f;
    private final boolean g;

    public bwr_2(fgk_0 fgk_02, bMn bMn2) {
        this(fgk_02, bMn2, true);
    }

    private bwr_2(fgk_0 fgk_02, bMn bMn2, boolean bl) {
        this.e = fgk_02;
        this.f = bMn2;
        this.g = bl;
    }

    @Override
    public String[] d() {
        return new String[]{a, b, d};
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(b)) {
            return this.b();
        }
        if (string.equals(d)) {
            return this.a();
        }
        if (string.equals(a)) {
            if (!this.g) {
                return "";
            }
            if (this.e == fgk_0.b) {
                return "PassportMDCBadBuff";
            }
            if (this.e == fgk_0.c) {
                return "PassportMDCMediumBuff";
            }
            if (this.e == fgk_0.a || this.e == fgk_0.d) {
                return "PassportMDCGoodBuff";
            }
            return "PassportMDCBadBuff";
        }
        return null;
    }

    private boolean a() {
        return bwr_2.a(this.f, this.e);
    }

    private static boolean a(bMn bMn2, fgk_0 fgk_02) {
        if (bMn2 == null) {
            return true;
        }
        return fgk_02 == bMn2.w();
    }

    private String b() {
        return bwr_2.a(this.e);
    }

    static String a(fgk_0 fgk_02) {
        ani_2 ani_22 = new ani_2();
        if (fgk_02 == fgk_0.b) {
            ani_22.a((CharSequence)bae.h().a("protector.buffs.unsatisfied", new Object[0]));
        } else if (fgk_02 == fgk_0.c) {
            ani_22.a((CharSequence)bae.h().a("protector.buffs.half.satisfied", new Object[0]));
        } else if (fgk_02 == fgk_0.d) {
            ani_22.a((CharSequence)bae.h().a("protector.buffs.satisfied", new Object[0]));
        }
        return ani_22.r();
    }
}

