/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bJA
 */
public class bja_1
implements ajh_1,
eAM,
exs_1 {
    public static final String a = "item";
    public static final String b = "name";
    public static final String d = "isSelected";
    public static final String e = "additionalBorder";
    public static final String f = "containerStyle";
    public static final String[] g = new String[]{"item", "name", "isSelected", "containerStyle", "additionalBorder"};
    @NotNull
    private final exh_2 h;
    @Nullable
    private exk_2 i;
    private boolean j;
    private boolean k;

    @Override
    public String[] d() {
        return g;
    }

    bja_1(@NotNull exh_2 exh_22) {
        this(exh_22, null);
    }

    bja_1(@NotNull exh_2 exh_22, @Nullable exk_2 exk_22) {
        this.h = exh_22;
        this.i = exk_22;
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "item": {
                return this.i;
            }
            case "name": {
                return bae.h().a(this.h.B, new Object[0]);
            }
            case "isSelected": {
                return this.j;
            }
            case "containerStyle": {
                if (this.i != null) {
                    return bhv_1.i(this.i);
                }
                return this.h.C;
            }
            case "additionalBorder": {
                if (this.k) {
                    return "positiveBorder";
                }
                return this.i != null && !bhv_1.j(this.i) ? "negativeBorder" : null;
            }
        }
        return null;
    }

    @Override
    @Nullable
    public exk_2 h() {
        return this.i;
    }

    @NotNull
    public exh_2 a() {
        return this.h;
    }

    public void a(@Nullable exk_2 exk_22) {
        this.i = exk_22;
    }

    public void a(boolean bl) {
        this.j = bl;
    }

    public void b(boolean bl) {
        this.k = bl;
    }

    @Override
    public eAN p() {
        return eAN.a;
    }

    @Override
    public Object q() {
        return this.i != null ? this.i.q() : null;
    }

    @Override
    public String r() {
        return this.i != null ? this.i.r() : null;
    }
}

