/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bxJ
 */
public class bxj_1
implements ajh_1 {
    public static final String a = "smiley";
    public static final String b = "animName";
    private final bxk_1 d;
    private aby_0 e;
    private static final Map<bxk_1, bxj_1> f = new HashMap<bxk_1, bxj_1>();

    public static bxj_1 a(short s2, byte by, int n) {
        bxk_1 bxk_12 = new bxk_1(s2, by, n);
        bxj_1 bxj_12 = f.get(bxk_12);
        if (bxj_12 == null) {
            bxj_12 = new bxj_1(bxk_12);
            f.put(bxk_12, bxj_12);
        }
        return bxj_12;
    }

    private bxj_1(bxk_1 bxk_12) {
        this.d = bxk_12;
        this.b();
    }

    private void b() {
        xg_0 xg_02 = xg_0.a(this.d.c());
        this.e = bxj_1.a(xg_02 != null ? xg_02 : xg_0.a, this.d.a(), this.d.b());
    }

    protected static String a(short s2, byte by) {
        return "Smiley_" + s2 + by;
    }

    @Nullable
    private static aby_0 a(@NotNull xg_0 xg_02, short s2, byte by) {
        aby_0 aby_02 = new aby_0(abd_1.c());
        String string = bxj_1.a(s2, by);
        try {
            aby_02.a(String.format(azs_0.a().a("playerGfxPath"), string), true);
        }
        catch (gm_0 | IOException exception) {
            return null;
        }
        aby_02.a(string);
        aby_02.e(xg_02.d());
        aby_02.b(0.0f);
        bkw_1 bkw_12 = bkw_1.a();
        atd_2 atd_22 = aby_02.an();
        bog_2 bog_22 = new bog_2(bkw_12.b((int)s2, by));
        atd_22.a(atm_1.c, bog_22.e());
        bog_2 bog_23 = new bog_2(bkw_12.a((int)s2, by));
        atd_22.a(atm_1.b, bog_23.e());
        if (bkw_12.d(s2, by)) {
            bog_2 bog_24 = new bog_2(bkw_12.c(s2, by));
            atd_22.a(atm_1.i, bog_24.e());
        }
        atd_22.y();
        return aby_02;
    }

    @Override
    public String[] d() {
        return b_;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return this.e;
        }
        if (string.equals(b)) {
            return this.e == null ? null : this.e.F();
        }
        return null;
    }

    public int a() {
        return this.d.c();
    }
}

