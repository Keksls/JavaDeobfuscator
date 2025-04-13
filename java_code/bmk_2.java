/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bmK
 */
final class bmk_2
extends eqk_2 {
    private final sd_2 b;
    final /* synthetic */ bmr_1 a;

    bmk_2(bmr_1 bmr_12, sd_2 sd_22) {
        this.a = bmr_12;
        this.b = sd_22;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        this.b.c();
        this.b.c = eww_1.a(this.a.a(ewl_1.b));
    }

    @Override
    public void b() {
        if (this.b.c != null) {
            eww_1.a(this.a.a(ewl_1.b), this.b.c);
        }
    }

    public String toString() {
        return "LocalPlayerCharacterPartInventories{m_part=" + this.b + "} ";
    }
}

