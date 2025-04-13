/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bKu
 */
public final class bku_0 {
    private final bLi[] a = new bLi[4];
    private final List<bLj> b = new ArrayList<bLj>();
    private final List<bLj> c = new ArrayList<bLj>();
    private final List<bLj> d = new ArrayList<bLj>();
    private final List<bLj> e = new ArrayList<bLj>();
    private final List<bLh> f;
    private final bLh g = new bLh(faL.g);
    private final bLh h = new bLh(faL.a);
    private String i = null;
    private String j = null;
    private bLj k = null;
    private bLj l = null;

    public bku_0() {
        this.f = new ArrayList<bLh>();
        this.f.add(this.g);
        this.f.add(this.h);
        for (faL faL2 : faL.values()) {
            if (faL2 == this.g.a() || faL2 == this.h.a()) continue;
            bLh bLh3 = new bLh(faL2);
            this.f.add(bLh3);
        }
        this.f.sort(Comparator.comparingInt(bLh2 -> bLh2.a().c()));
        this.a();
    }

    public void a() {
        for (int k = 0; k < this.a.length; ++k) {
            this.a[k] = new bLi(this.g);
        }
    }

    public void b() {
        boolean bl = false;
        for (bLi bLi2 : this.a) {
            if (bl) {
                bLi2.a(this.h);
            }
            bLi2.a(!bl);
            if (bLi2.a() != faL.a) continue;
            bl = true;
        }
    }

    public void a(boolean bl) {
        this.b.clear();
        faL[] faLArray = new faL[this.a.length];
        for (int k = 0; k < faLArray.length; ++k) {
            faLArray[k] = this.a[k].a();
        }
        bie_0.a().a(faLArray, bl, entry -> this.b.add(new bLj((int)((Integer)entry.getKey()), (ezf_0)entry.getValue())));
        if (this.c.isEmpty()) {
            this.d.addAll(bie_0.a().b().stream().map(n -> new bLj((int)n, exw_1.f)).collect(Collectors.toList()));
            this.e.addAll(bie_0.a().c().stream().map(n -> new bLj((int)n, exw_1.h)).collect(Collectors.toList()));
            this.c.addAll(this.d);
            this.c.addAll(this.e);
        }
    }

    public void a(bLj bLj2) {
        this.k = bLj2;
    }

    public void b(bLj bLj2) {
        this.l = bLj2;
    }

    public List<faL> c() {
        return Arrays.stream(this.a).map(bLi::a).collect(Collectors.toList());
    }

    @Nullable
    public bLj a(String string, boolean bl) {
        String string2 = Cz.e(string);
        List<bLj> list = bl ? this.c : this.b;
        for (bLj bLj2 : list) {
            if (!Cz.e(bLj2.a()).equals(string2)) continue;
            return bLj2;
        }
        return null;
    }

    public Object d() {
        return this.k == null ? this.i : this.k;
    }

    public Object e() {
        return this.l == null ? this.j : this.l;
    }

    public bLi[] f() {
        return this.a;
    }

    public List<bLj> g() {
        return this.b;
    }

    public List<bLj> h() {
        return this.c;
    }

    public List<bLj> i() {
        return this.d;
    }

    public List<bLj> j() {
        return this.e;
    }

    public List<bLh> k() {
        return this.f;
    }

    public bLh l() {
        return this.g;
    }

    public bLh m() {
        return this.h;
    }

    public String n() {
        return this.i;
    }

    public String o() {
        return this.j;
    }

    public bLj p() {
        return this.k;
    }

    public bLj q() {
        return this.l;
    }

    public void a(String string) {
        this.i = string;
    }

    public void b(String string) {
        this.j = string;
    }
}

