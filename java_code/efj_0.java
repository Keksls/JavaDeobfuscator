/*
 * Decompiled with CFR 0.152.
 */
import java.util.BitSet;

/*
 * Renamed from eFj
 */
public final class efj_0 {
    private long a;
    private efh_0 b;
    private int c;
    private short d = 0;
    private short e = 0;
    private short f = 0;
    private short g = 0;
    private boolean h = false;
    private BitSet i = null;

    public efj_0 a(long l) {
        this.a = l;
        return this;
    }

    public efj_0 a(int n) {
        this.c = n;
        return this;
    }

    public efj_0 a(efh_0 efh_02) {
        this.b = efh_02;
        return this;
    }

    public efj_0 a(short s2) {
        this.e = s2;
        return this;
    }

    public efj_0 b(short s2) {
        this.f = s2;
        return this;
    }

    public efj_0 c(short s2) {
        this.g = s2;
        return this;
    }

    public efj_0 d(short s2) {
        this.d = s2;
        return this;
    }

    public efi_0 a() {
        efk_0 efk_02 = new efk_0(this.a, this.c, this.b);
        efk_02.d = this.d;
        efk_02.e = this.e;
        efk_02.f = this.f;
        efk_02.g = this.g;
        return efk_02;
    }
}

