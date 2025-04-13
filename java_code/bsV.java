/*
 * Decompiled with CFR 0.152.
 */
public enum bsV {
    a(0),
    b(1);

    private final byte c;

    private bsV(byte by) {
        this.c = by;
    }

    public byte a() {
        return this.c;
    }

    public String b() {
        return bae.h().a("dungeon.filter." + this.c, new Object[0]);
    }

    public boolean a(btb btb2) {
        switch (this) {
            case b: {
                return btb2.s() && !btb2.t();
            }
        }
        return true;
    }
}

