/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fCA
 */
public abstract class fca_2
extends fzs {
    protected int l;
    private static final int i = 512;
    private static final int j = 8192;
    private static final int k = 64;
    private static final int m = 128;
    private static final int n = 256;

    public int p() {
        return this.l;
    }

    public void b(int n) {
        this.l = n;
    }

    public boolean q() {
        boolean bl = (this.l & 0x80) == 128;
        boolean bl2 = (this.l & 0x100) == 256;
        return bl || ahu_2.b() && bl2;
    }

    public boolean r() {
        return (this.l & 0x200) == 512;
    }

    public boolean s() {
        return (this.l & 0x2000) == 8192;
    }

    public boolean t() {
        return (this.l & 0x40) == 64;
    }

    public boolean u() {
        return (this.l & 0x100) == 256;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.l = 0;
    }
}

