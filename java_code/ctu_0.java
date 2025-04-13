/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from cTU
 */
public final class ctu_0
extends cto_0 {
    private final ArrayList<String> a = new ArrayList();
    private String m;
    private boolean n;

    public ctu_0 b() {
        return new ctu_0();
    }

    @Override
    public boolean d() {
        if (!this.n) {
            return false;
        }
        return super.d();
    }

    @Override
    public String q() {
        String string = super.q();
        ani_2 ani_22 = new ani_2().a((CharSequence)string);
        if (this.a.size() > 0) {
            for (String string2 : this.a) {
                ani_22.m().i().a(h);
                ani_22.a((CharSequence)string2).j();
            }
        }
        if (this.m != null && this.m.length() > 0) {
            ani_22.m().a((CharSequence)this.m);
        }
        return ani_22.r();
    }

    public void a(String string) {
        this.a.add(string);
    }

    public void b(String string) {
        this.m = string;
    }

    public void a(boolean bl) {
        this.n = bl;
    }

    @Override
    public /* synthetic */ cSS v() {
        return this.b();
    }
}

