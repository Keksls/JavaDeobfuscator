/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eWB
 */
public enum ewb_1 {
    a(new ewc_1()),
    b(new ewe_2()),
    c(new ewd_2());

    public final byte d = (byte)this.ordinal();
    private final abr_1<? extends ewz_1> e;

    private ewb_1(abr_1<? extends ewz_1> abr_12) {
        this.e = abr_12;
    }

    public ewz_1 a() {
        return this.e.createNew();
    }

    @Nullable
    public static ewb_1 a(byte by) {
        for (ewb_1 ewb_12 : ewb_1.values()) {
            if (ewb_12.d != by) continue;
            return ewb_12;
        }
        return null;
    }

    public String toString() {
        return "PetChangeType{idx=" + this.d + ", factory=" + this.e + "}";
    }
}

