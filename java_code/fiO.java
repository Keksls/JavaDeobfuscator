/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;

public class fiO {
    private static final Logger a = Logger.getLogger(fiO.class);
    private int b = -1;
    private final List<Integer> c = new ArrayList<Integer>(Collections.nCopies(fiK.c, 0));
    private final List<Integer> d = new ArrayList<Integer>(Collections.nCopies(fiK.d, 0));
    private final List<Integer> e = new ArrayList<Integer>();
    private final List<fiP> f = new ArrayList<fiP>();

    public fiO() {
    }

    public fiO(int[] nArray, int[] nArray2) {
        int n;
        for (n = 0; n < Math.min(fiK.c, nArray.length); ++n) {
            this.c.set(n, nArray[n]);
        }
        for (n = 0; n < Math.min(fiK.d, nArray2.length); ++n) {
            this.d.set(n, nArray2[n]);
        }
    }

    public fiO(List<Integer> list, List<Integer> list2) {
        int n;
        for (n = 0; n < Math.min(fiK.c, list.size()); ++n) {
            this.c.set(n, list.get(n));
        }
        for (n = 0; n < Math.min(fiK.d, list2.size()); ++n) {
            this.d.set(n, list2.get(n));
        }
    }

    public fiO a() {
        fiO fiO2 = new fiO();
        fiO2.b = this.b;
        Collections.copy(fiO2.c, this.c);
        Collections.copy(fiO2.d, this.d);
        return fiO2;
    }

    public void a(fiO fiO2) {
        this.b = fiO2.b;
        Collections.copy(this.c, fiO2.c);
        Collections.copy(this.d, fiO2.d);
    }

    public void b(fiO fiO2) {
        Collections.copy(this.c, fiO2.c);
        Collections.copy(this.d, fiO2.d);
    }

    public int b() {
        return this.b;
    }

    public boolean c() {
        return this.b < 0;
    }

    public void a(int n) {
        this.b = n;
    }

    public void a(int n, int n2) {
        if (this.a(n, n2, this.c)) {
            return;
        }
        this.e(n);
    }

    public void b(int n, int n2) {
        if (this.a(n, n2, this.d)) {
            return;
        }
        this.f(n);
    }

    private boolean a(int n, int n2, List<Integer> list) {
        if (n2 >= fiK.c) {
            return false;
        }
        int n3 = this.b(n);
        if (n3 == n2 && n != 0) {
            return true;
        }
        int n4 = list.get(n2);
        list.set(n2, n);
        if (n != 0 && n3 >= 0 && n4 >= 0) {
            list.set(n3, n4);
        }
        return false;
    }

    public void a(ArrayList<Integer> arrayList, List<Integer> list) {
        this.c.clear();
        this.c.addAll(arrayList);
        this.d.clear();
        this.d.addAll(list);
        this.g();
    }

    public int b(int n) {
        int n2 = this.c.lastIndexOf(n);
        if (n2 >= 0) {
            return n2;
        }
        return this.d.lastIndexOf(n);
    }

    public boolean a(epq_2 epq_22) {
        if (epq_22 == null) {
            return false;
        }
        return this.b <= epq_22.dt() - 1;
    }

    public ArrayList<Integer> d() {
        return new ArrayList<Integer>(Collections.unmodifiableList(this.c));
    }

    public ArrayList<Integer> e() {
        int n;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (n = 0; n < fiK.c; ++n) {
            arrayList.add(this.c.get(n));
        }
        for (n = 0; n < fiK.d; ++n) {
            arrayList.add(this.d.get(n));
        }
        return arrayList;
    }

    public ArrayList<Integer> f() {
        return new ArrayList<Integer>(Collections.unmodifiableList(this.d));
    }

    public boolean c(int n) {
        return this.c.contains(n) || this.d.contains(n);
    }

    private void e(int n) {
        for (fiP fiP2 : this.f) {
            try {
                fiP2.a(this, n);
            }
            catch (Exception exception) {
                a.error((Object)"Exception lev\u00e9e : ", (Throwable)exception);
            }
        }
    }

    private void f(int n) {
        for (fiP fiP2 : this.f) {
            try {
                fiP2.b(this, n);
            }
            catch (Exception exception) {
                a.error((Object)"Exception lev\u00e9e : ", (Throwable)exception);
            }
        }
    }

    private void g() {
        for (fiP fiP2 : this.f) {
            try {
                fiP2.a(this);
            }
            catch (Exception exception) {
                a.error((Object)"Exception lev\u00e9e : ", (Throwable)exception);
            }
        }
    }

    public void a(Integer n) {
        this.e.add(n);
    }

    public void b(Integer n) {
        this.e.remove(n);
    }

    public boolean d(int n) {
        return this.e.contains(n);
    }

    public boolean a(fiP fiP2) {
        return !this.f.contains(fiP2) && this.f.add(fiP2);
    }

    public boolean b(fiP fiP2) {
        return this.f.remove(fiP2);
    }

    public boolean c(fiO fiO2) {
        return this.b != fiO2.b || !this.c.equals(fiO2.c) || !this.d.equals(fiO2.d);
    }

    public String toString() {
        return "SpellDeckModel{m_level=" + this.b + ", m_activeSpells=" + this.c + ", m_passiveSpells=" + this.d + "}";
    }
}

