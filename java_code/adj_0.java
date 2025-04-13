/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from adJ
 */
public class adj_0
extends adn_0 {
    private avc_1 f;
    protected final ava_1 a;
    private final String g;
    private final String h;
    private boolean i;

    public adj_0(String string, String string2) {
        this(string, string2, new ava_1(new aut_1("gStrength", auu_1.a)));
    }

    public adj_0(String string, String string2, ava_1 ava_12) {
        this.a = ava_12;
        this.g = string;
        this.h = string2;
    }

    public void b(boolean bl) {
        this.i = bl;
    }

    @Override
    public void a(boolean bl) {
        super.a(bl);
        if (bl) {
            if (this.f == null) {
                this.f = new avc_1(this.g, this.h, this.a);
                this.f.b(this.i);
                aui_1.a().a(this.f);
            }
        } else if (this.f != null) {
            aui_1.a().b(this.f);
            this.f = null;
        }
    }

    @Override
    public void a(int n) {
        super.a(n);
        this.a.a("gStrength", this.g());
    }

    @Override
    public void a() {
    }

    @Override
    public void a(aui_2 aui_22) {
    }
}

