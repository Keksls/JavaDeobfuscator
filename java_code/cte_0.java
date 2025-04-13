/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from cTE
 */
public final class cte_0
extends cto_0 {
    private final ArrayList<String> a = new ArrayList();
    private String m;
    private boolean n;
    private short o;
    private ArrayList<bgi_2> p;

    public cte_0 b() {
        return new cte_0();
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
                ani_22.m().a(h);
                ani_22.a((CharSequence)string2);
            }
        }
        if (this.m != null && this.m.length() > 0) {
            ani_22.m().a((CharSequence)this.m);
        }
        return ani_22.r();
    }

    public void a(ArrayList<bgi_2> arrayList) {
        this.p = arrayList;
    }

    public void a(short s2) {
        this.o = s2;
    }

    public void a(String string) {
        this.m = string;
    }

    public void a(boolean bl) {
        this.n = bl;
    }

    @Override
    public void o() {
        if (!this.c()) {
            return;
        }
        if (this.p != null) {
            for (int k = 0; k < this.p.size(); ++k) {
                bgi_2 bgi_22 = this.p.get(k);
                bgi_22.a();
            }
        }
        super.o();
    }

    @Override
    protected Tv a() {
        return Tv.a(this.o);
    }

    @Override
    public /* synthetic */ cSS v() {
        return this.b();
    }
}

