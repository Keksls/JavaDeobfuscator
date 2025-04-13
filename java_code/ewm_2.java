/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eWM
 */
public enum ewm_2 {
    a(new ewn_2()),
    b(new ewq_1()),
    c(new ewp_2()),
    d(new ewo_2());

    public final byte e = (byte)this.ordinal();
    private final abr_1<? extends ewk_2> f;

    private ewm_2(abr_1<? extends ewk_2> abr_12) {
        this.f = abr_12;
    }

    public ewk_2 a() {
        return this.f.createNew();
    }

    @Nullable
    public static ewm_2 a(byte by) {
        for (ewm_2 ewm_22 : ewm_2.values()) {
            if (ewm_22.e != by) continue;
            return ewm_22;
        }
        return null;
    }

    public String toString() {
        return "TemporaryInventoryChangeType{idx=" + this.e + ", factory=" + this.f + "}";
    }
}

