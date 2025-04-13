/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bVS
 */
public enum bvs_0 implements ajh_1
{
    a(0, "options.languageDisplay.none"),
    b(1, "options.languageDisplay.onlyDefaultLanguage"),
    d(2, "options.languageDisplay.allSelectedLanguages");

    private static final String e = "name";
    private final byte f;
    private final String g;

    private bvs_0(byte by, String string2) {
        this.f = by;
        this.g = string2;
    }

    @Nullable
    public static bvs_0 a(int n) {
        for (bvs_0 bvs_02 : bvs_0.values()) {
            if (bvs_02.f != n) continue;
            return bvs_02;
        }
        return null;
    }

    public int a() {
        return this.f;
    }

    @Override
    public String[] d() {
        return new String[]{e};
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (e.equals(string)) {
            return bae.h().a(this.g, new Object[0]);
        }
        return null;
    }

    public static String a(bvs_0 bvs_02, String string, xz_0 xz_02, List<Ow> list) {
        if (string == null) {
            return null;
        }
        if (bvs_02 == b) {
            if (xz_02 == null || xz_02 == xz_0.a) {
                return string;
            }
            return String.format("[%s] %s", xz_02.c().h().toUpperCase(), string);
        }
        if (bvs_02 == d) {
            if (list == null || list.isEmpty()) {
                return string;
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (Ow ow : list) {
                stringBuilder.append('[').append(ow.h().toUpperCase()).append(']');
            }
            stringBuilder.append(' ').append(string);
            return stringBuilder.toString();
        }
        return string;
    }
}

