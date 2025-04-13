/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bnG
 */
final class bng_2
extends eqk_2 {
    private final se_2 b;
    final /* synthetic */ bnh_1 a;

    bng_2(bnh_1 bnh_12, se_2 se_22) {
        this.a = bnh_12;
        this.b = se_22;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        throw new UnsupportedOperationException("[SOCIAL] La Part SocialStates ne devrait pas \u00e9tre s\u00e9rialis\u00e9e par le client.");
    }

    @Override
    public void b() {
        this.a.cx = this.b.c;
        this.a.cy = this.b.d;
    }
}

