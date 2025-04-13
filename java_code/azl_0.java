/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aZL
 */
public class azl_0
implements ajh_1 {
    private static final String a = "languageCode";
    private static final String b = "isFrenchVisible";
    private static final String d = "isEnglishVisible";
    private static final String e = "isSpanishVisible";
    private static final String f = "isPortugueseVisible";
    private static final String g = "visibleLanguageCount";
    private static final String h = "isLanguageRestricted";
    private final xz_0 i;

    public azl_0(xz_0 xz_02) {
        this.i = xz_02;
    }

    @Override
    public String[] d() {
        return new String[]{a, b, d, e, f, g};
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return this.i.c().h().toLowerCase();
        }
        if (string.equals(b)) {
            return azl_0.a(Ow.a);
        }
        if (string.equals(d)) {
            return azl_0.a(Ow.b);
        }
        if (string.equals(e)) {
            return azl_0.a(Ow.c);
        }
        if (string.equals(f)) {
            return azl_0.a(Ow.d);
        }
        if (string.equals(g)) {
            return (azl_0.a(Ow.a) ? 1 : 0) + (azl_0.a(Ow.b) ? 1 : 0) + (azl_0.a(Ow.c) ? 1 : 0) + (azl_0.a(Ow.d) ? 1 : 0);
        }
        if (string.equals(h)) {
            return fis_1.a().c("isClientLanguageRestricted");
        }
        return null;
    }

    private static boolean a(Ow ow) {
        if (fis_1.a().c("isClientLanguageRestricted") && ow != bah_0.d()) {
            return false;
        }
        return enp_2.a(ow);
    }
}

