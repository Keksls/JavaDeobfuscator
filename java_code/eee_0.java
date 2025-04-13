/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eEe
 */
public enum eee_0 implements Sc
{
    a(0),
    b(1),
    c(2),
    d(3);

    private final byte e;

    private eee_0(int n2) {
        this.e = (byte)n2;
    }

    public byte a() {
        return this.e;
    }

    public String a(long l) {
        return this.name().toLowerCase() + l;
    }

    @NotNull
    public static eee_0 a(byte by) {
        eee_0[] eee_0Array = eee_0.values();
        for (int k = 0; k < eee_0Array.length; ++k) {
            eee_0 eee_02 = eee_0Array[k];
            if (eee_02.e != by) continue;
            return eee_02;
        }
        return a;
    }
}

