/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from brc
 */
public class brc_0
implements ajh_1 {
    public static final String a = "hero";
    public static final String b = "remainingTime";
    public static final String d = "aevId";
    public static final String e = "isUpgraded";
    private final byte f;
    private bmk_1 g;

    brc_0(byte by) {
        this.f = by;
    }

    @Override
    public String[] d() {
        return new String[0];
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return this.g;
        }
        if (string.equals(b)) {
            return this.e();
        }
        if (string.equals(d)) {
            return this.a();
        }
        if (string.equals(e)) {
            return this.c();
        }
        return null;
    }

    public String a() {
        return "heroAEV" + this.f;
    }

    public bmk_1 b() {
        return this.g;
    }

    public void a(bmk_1 bmk_12) {
        this.g = bmk_12;
    }

    public boolean c() {
        bmr_1 bmr_12 = azu_0.j().k();
        boolean bl = euu_2.c();
        emg_0 emg_02 = bmr_12.N_();
        boolean bl2 = emg_02.a(enw_0.q);
        return bl || bl2;
    }

    private String e() {
        bai_0 bai_02 = azu_0.j().n();
        bmr_1 bmr_12 = azu_0.j().k();
        boolean bl = euu_2.c();
        long l = bai_02.b();
        emg_0 emg_02 = bmr_12.N_();
        boolean bl2 = emg_02.a(enw_0.q);
        if (bl || !bl2) {
            return "";
        }
        String string = bai_02.b(l);
        return string == null ? "" : string;
    }

    public String toString() {
        return "HeroSlot{m_index=" + this.f + ", m_hero=" + this.g + "}";
    }
}

