/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Pz
 */
public class pz_0
extends ps_0 {
    private byte a = (byte)-1;
    private byte b = (byte)-1;

    @Override
    public boolean a(byte[] byArray) {
        if (!this.a(byArray.length, 2, true)) {
            return false;
        }
        this.b = byArray[0];
        this.a = byArray[1];
        return true;
    }

    @Override
    public int a() {
        return 22;
    }

    public byte b() {
        return this.a;
    }

    public byte c() {
        return this.b;
    }
}

