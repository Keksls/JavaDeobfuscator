/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from boW
 */
public class bow_2 {
    public static final bow_2 a = new bow_2();
    private boolean b = false;

    private bow_2() {
    }

    public void a() {
        this.a(true);
    }

    public boolean b() {
        return !this.b && !byp_2.a().g();
    }

    public void a(boolean bl) {
        this.b = bl;
        fis_1.a().a("guild.isLoading", bl);
    }

    public void c() {
        this.b = false;
        fis_1.a().a("guild.isLoading", false);
    }
}

