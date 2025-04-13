/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from ffF
 */
public enum fff_0 {
    a(new ffl_0()),
    b(new ffi_0()),
    c(new ffo_0()),
    d(new ffj_0()),
    e(new ffk_0()),
    f(new ffg_0()),
    g(new ffh_0()),
    h(new ffm_0()),
    i(new ffn_0());

    public final byte j = (byte)this.ordinal();
    private final abr_1<? extends ffc_0> k;

    private fff_0(abr_1<? extends ffc_0> abr_12) {
        this.k = abr_12;
    }

    public ffc_0 a() {
        return this.k.createNew();
    }

    @Nullable
    public static fff_0 a(byte by) {
        for (fff_0 fff_02 : fff_0.values()) {
            if (fff_02.j != by) continue;
            return fff_02;
        }
        return null;
    }

    public String toString() {
        return "PetChangeType{idx=" + this.j + ", factory=" + this.k + "}";
    }
}

