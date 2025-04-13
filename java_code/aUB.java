/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class aUB
implements ajh_1,
Iterable<aUK> {
    public static final String a = "name";
    public static final String b = "type";
    public static final String d = "contentList";
    public static final String e = "onlineContentList";
    public static final String f = "offlineContentList";
    public static final String[] g = new String[]{"name", "type", "contentList", "onlineContentList", "offlineContentList"};
    private final aue_0 h;
    private final ArrayList<aUK> i = new ArrayList();

    public aUB(aue_0 aue_02) {
        this.h = aue_02;
    }

    public void a(aUK aUK2) {
        if (!this.i.contains(aUK2)) {
            this.i.add(aUK2);
            fis_1.a().a((ajf_1)this, d, e, f);
        }
    }

    public boolean b(aUK aUK2) {
        if (aUK2 != null) {
            if (this.h == aue_0.a) {
                aUK2.c(false);
            }
            this.i.remove(aUK2);
            fis_1.a().a((ajf_1)this, d, e, f);
            return true;
        }
        return false;
    }

    public boolean a(Long l) {
        return this.b(this.b(l));
    }

    public boolean c(aUK aUK2) {
        return this.i.contains(aUK2);
    }

    public aUK a(long l) {
        int n = this.i.size();
        for (int k = 0; k < n; ++k) {
            aUK aUK2 = this.i.get(k);
            if (aUK2.i() != l) continue;
            return aUK2;
        }
        return null;
    }

    public aUK d(aUK aUK2) {
        if (aUK2 == null) {
            return null;
        }
        int n = this.i.size();
        for (int k = 0; k < n; ++k) {
            aUK aUK3 = this.i.get(k);
            if (aUK2.g().equalsIgnoreCase(aUK3.g())) {
                return aUK3;
            }
            if (aUK2.j().equalsIgnoreCase(aUK3.j())) {
                return aUK3;
            }
            if (aUK2.i() == -1L || aUK2.i() != aUK3.i()) continue;
            return aUK3;
        }
        return null;
    }

    public aUK a(String string) {
        int n = this.i.size();
        for (int k = 0; k < n; ++k) {
            aUK aUK2 = this.i.get(k);
            if (!aUK2.g().equalsIgnoreCase(string)) continue;
            return aUK2;
        }
        return null;
    }

    public aUK b(Long l) {
        int n = this.i.size();
        for (int k = 0; k < n; ++k) {
            aUK aUK2 = this.i.get(k);
            if (aUK2.i() != l.longValue()) continue;
            return aUK2;
        }
        return null;
    }

    public aUK c(String string) {
        int n = this.i.size();
        for (int k = 0; k < n; ++k) {
            aUK aUK2 = this.i.get(k);
            if (!aUK2.j().equalsIgnoreCase(string)) continue;
            return aUK2;
        }
        return null;
    }

    @Override
    public String[] d() {
        return g;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.h.a();
        }
        if (string.equals(b)) {
            return this.h.b();
        }
        if (string.equals(d)) {
            ArrayList<Object> arrayList = new ArrayList();
            arrayList = aUL.a().g() ? this.i : this.a(true);
            arrayList.sort(new aUC(this));
            return arrayList;
        }
        if (string.equals(e)) {
            return this.a(true);
        }
        if (string.equals(f)) {
            return this.a(false);
        }
        return null;
    }

    public void a() {
        this.i.clear();
        fis_1.a().a((ajf_1)this, d, e, f);
    }

    @Override
    @NotNull
    public Iterator<aUK> iterator() {
        return this.i.iterator();
    }

    public List<aUK> b() {
        return this.i;
    }

    public int c() {
        return this.i.size();
    }

    public void e() {
        for (aUK aUK2 : this.i) {
            aUK2.b(false);
        }
    }

    public ArrayList<aUK> a(boolean bl) {
        ArrayList<aUK> arrayList = new ArrayList<aUK>();
        for (aUK aUK2 : this.i) {
            if ((!bl || !aUK2.h()) && (bl || aUK2.h())) continue;
            arrayList.add(aUK2);
        }
        arrayList.sort(new aUD(this));
        return arrayList;
    }
}

