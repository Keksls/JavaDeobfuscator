/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;

public class aUL
implements ajh_1 {
    public static final String a = "categories";
    public static final String b = "friendsList";
    public static final String d = "ignoreList";
    public static final String[] e = new String[]{"categories", "friendsList", "ignoreList"};
    private final EnumMap<aue_0, aUB> f = new EnumMap(aue_0.class);
    private static final aUL g = new aUL();
    private final HashMap<Long, aUK> h = new HashMap();
    private boolean i = true;

    private aUL() {
        this.h();
    }

    public static aUL a() {
        return g;
    }

    private void h() {
        this.f.put(aue_0.a, new aUB(aue_0.a));
        this.f.put(aue_0.b, new aUB(aue_0.b));
    }

    public void b() {
        this.h.clear();
        for (aUB aUB2 : this.f.values()) {
            aUB2.a();
        }
        this.i = true;
    }

    public void a(short s2, aUK aUK2) {
        if (!this.h.containsKey(aUK2.i())) {
            aUK2.a(s2);
            this.h.put(aUK2.i(), aUK2);
        } else {
            aUK2 = this.h.get(aUK2.i());
            aUK2.a(s2);
        }
        aUB aUB2 = this.f.get((Object)aue_0.a(s2));
        if (aUB2 != null) {
            aUB2.a(aUK2);
            fis_1.a().a((ajf_1)this, a);
        }
    }

    public void a(short s2, Iterable<aUK> iterable) {
        for (aUK aUK2 : iterable) {
            this.a(s2, aUK2);
        }
        fis_1.a().a((ajf_1)this, a);
    }

    public boolean a(short s2, Long l) {
        aUB aUB2 = this.f.get((Object)aue_0.a(s2));
        if (aUB2 != null) {
            aUB2.a(l);
            fis_1.a().a((ajf_1)this, a);
        }
        if (this.h.containsKey(l)) {
            aUK aUK2 = this.h.get(l);
            aUK2.b(s2);
            if (s2 == 1) {
                aUK2.c(false);
            }
            if (aUK2.a()) {
                this.h.remove(l);
            }
            return true;
        }
        return false;
    }

    public Collection<aUK> c() {
        return this.h.values();
    }

    public aUB e() {
        return this.f.get((Object)aue_0.a);
    }

    public aUB f() {
        return this.f.get((Object)aue_0.b);
    }

    public aUK a(Long l) {
        return this.h.get(l);
    }

    public aUK a(String string) {
        if (string == null) {
            return null;
        }
        for (aUK aUK2 : this.h.values()) {
            if (!string.equals(aUK2.j())) continue;
            return aUK2;
        }
        return null;
    }

    public boolean g() {
        return this.i;
    }

    public void a(boolean bl) {
        this.i = bl;
        fis_1.a().a((ajf_1)this.e(), "contentList");
        fis_1.a().a((ajf_1)this.f(), "contentList");
    }

    @Override
    public String[] d() {
        return e;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            ArrayList<aUB> arrayList = this.i();
            return arrayList.size() > 0 ? arrayList : null;
        }
        if (string.equals(b)) {
            return this.e();
        }
        if (string.equals(d)) {
            return this.f();
        }
        return null;
    }

    private ArrayList<aUB> i() {
        ArrayList<aUB> arrayList = new ArrayList<aUB>();
        for (aUB aUB2 : this.f.values()) {
            if (aUB2 == null || aUB2.c() <= 0) continue;
            arrayList.add(aUB2);
        }
        return arrayList;
    }
}

