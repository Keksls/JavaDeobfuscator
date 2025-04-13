/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashBiMap
 */
import com.google.common.collect.HashBiMap;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public abstract class aUn {
    public static final String a = "subPipe";
    public static final int b = -1;
    private static final int d = 100;
    private final aup_0 e;
    private LinkedList<aUm> f;
    protected final List<aUo> c = new ArrayList<aUo>();
    private final HashBiMap<String, aUn> g = HashBiMap.create();

    public aUn(aup_0 aup_02) {
        this.e = aup_02;
    }

    public aup_0 a() {
        return this.e;
    }

    public int b() {
        return this.e.a();
    }

    public String c() {
        return this.e.c();
    }

    public azj_2 d() {
        return this.e.d();
    }

    public String e() {
        return this.e.f();
    }

    public boolean f() {
        return this.e.g();
    }

    public boolean g() {
        return this.e.g();
    }

    public Ow h() {
        return this.e.k();
    }

    public LinkedList<aUm> i() {
        return this.f;
    }

    public void a(String string, aUn aUn2) {
        if (!this.g.containsKey((Object)string)) {
            this.g.put((Object)string, (Object)aUn2);
        }
        for (aUo aUo2 : this.c) {
            aUo2.b(aUn2, aud_0.a);
        }
    }

    public void a(aUn aUn2) {
        if (aUn2 == null) {
            return;
        }
        this.g.inverse().remove((Object)aUn2);
        aUn2.m();
    }

    public void a(aUm aUm2) {
        if (this.f == null) {
            this.f = new LinkedList();
        }
        if (this.f.size() > 100) {
            this.f.removeLast();
        }
        this.f.addFirst(aUm2);
        if (this.c.isEmpty()) {
            aUf.a(aUm2);
        }
        for (aUo aUo2 : this.c) {
            aUo2.b(aUm2);
        }
    }

    public void a(aUm aUm2, String string) {
        aUn aUn2 = (aUn)this.g.get((Object)string);
        if (aUn2 != null) {
            aUn2.a(aUm2);
        } else {
            this.a(aUm2);
        }
    }

    public abstract void a(String var1);

    public void a(aUo aUo2) {
        if (!this.c.contains(aUo2)) {
            this.c.add(aUo2);
        }
    }

    public void b(aUo aUo2) {
        this.c.remove(aUo2);
    }

    public List<aUo> j() {
        return this.c;
    }

    public boolean k() {
        return this.c.isEmpty();
    }

    public aUn b(String string) {
        return (aUn)this.g.get((Object)string);
    }

    public Map<String, aUn> l() {
        return this.g;
    }

    public void m() {
        if (this.f != null) {
            this.f.clear();
        }
        for (aUn aUn2 : this.g.values()) {
            aUn2.m();
        }
        this.g.clear();
        this.c.clear();
    }

    public boolean n() {
        return aup_0.x.contains((Object)this.e);
    }
}

