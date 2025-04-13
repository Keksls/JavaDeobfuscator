/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class bLj
implements ajh_1,
fwo {
    public static final String a = "name";
    public static final String b = "patternStyles";
    public static final String d = "itemIcon";
    private final int e;
    @Nullable
    private final ezf_0 f;
    @Nullable
    private final exw_1 g;
    private final String[] h;
    @NotNull
    private final String i;

    public bLj(int n, @NotNull ezf_0 ezf_02) {
        this.e = n;
        this.f = ezf_02;
        this.g = null;
        tc_0[] tc_0Array = this.f.a();
        this.h = new String[tc_0Array.length];
        StringBuilder stringBuilder = new StringBuilder();
        for (int k = 0; k < tc_0Array.length; ++k) {
            this.h[k] = bib_0.a(tc_0Array[k], false);
            stringBuilder.append(bLj.a(tc_0Array[k]));
        }
        this.i = stringBuilder.toString();
    }

    public bLj(int n, @NotNull exw_1 exw_12) {
        this.e = n;
        this.f = null;
        this.g = exw_12;
        this.h = null;
        this.i = "";
    }

    private static char a(tc_0 tc_02) {
        if (tc_02 == tc_0.b) {
            return 'R';
        }
        if (tc_02 == tc_0.d) {
            return 'B';
        }
        Ow ow = bae.h().f();
        return ow == Ow.a ? (char)'V' : 'G';
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "name": {
                return this.a();
            }
            case "patternStyles": {
                return this.h;
            }
            case "itemIcon": {
                Object r2 = eyo_1.g().d(this.e);
                if (r2 == null) {
                    return null;
                }
                return azs_0.a().d(((ezr_0)r2).C());
            }
        }
        return null;
    }

    public String a() {
        return bae.h().a(15, (long)this.e, new Object[0]);
    }

    @Override
    public String[] d() {
        return new String[]{a, b, d};
    }

    @Override
    public String getFilterableStringValue() {
        return this.i + " " + this.a();
    }

    public String toString() {
        return this.a();
    }

    public int b() {
        return this.e;
    }

    @Nullable
    public ezf_0 c() {
        return this.f;
    }

    @Nullable
    public exw_1 e() {
        return this.g;
    }

    public String[] f() {
        return this.h;
    }

    @NotNull
    public String g() {
        return this.i;
    }
}

