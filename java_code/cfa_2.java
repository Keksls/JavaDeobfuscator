/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cFa
 */
public class cfa_2 {
    private final ArrayList<cez_2> a = new ArrayList();
    private final ArrayList<cey_2> b = new ArrayList();

    public ArrayList<cez_2> a() {
        return this.a;
    }

    public void a(cez_2 cez_22) {
        this.a.add(cez_22);
    }

    public void b(cez_2 cez_22) {
        this.a.remove(cez_22);
    }

    public ArrayList<cey_2> b() {
        return this.b;
    }

    public void a(cey_2 cey_22) {
        this.b.add(cey_22);
    }

    public void b(cey_2 cey_22) {
        this.b.remove(cey_22);
    }

    public void a(@NotNull arf_1 arf_12) {
        Object object;
        int n;
        int n2 = arf_12.c();
        this.a.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new cez_2();
            ((cez_2)object).a(arf_12);
            this.a.add((cez_2)object);
        }
        n2 = arf_12.c();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new cey_2();
            ((cey_2)object).a(arf_12);
            this.b.add((cey_2)object);
        }
    }

    public void a(@NotNull gk_0 gk_02) {
        int n;
        gk_02.a(this.a.size());
        int n2 = this.a.size();
        for (n = 0; n < n2; ++n) {
            this.a.get(n).a(gk_02);
        }
        gk_02.a(this.b.size());
        n2 = this.b.size();
        for (n = 0; n < n2; ++n) {
            this.b.get(n).a(gk_02);
        }
    }

    public void b(@NotNull arf_1 arf_12) {
        Object object;
        int n;
        int n2 = arf_12.c();
        this.a.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new cez_2();
            ((cez_2)object).b(arf_12);
            this.a.add((cez_2)object);
        }
        n2 = arf_12.c();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new cey_2();
            ((cey_2)object).b(arf_12);
            this.b.add((cey_2)object);
        }
    }

    public void b(@NotNull gk_0 gk_02) {
        int n;
        gk_02.a(this.a.size());
        int n2 = this.a.size();
        for (n = 0; n < n2; ++n) {
            this.a.get(n).b(gk_02);
        }
        gk_02.a(this.b.size());
        n2 = this.b.size();
        for (n = 0; n < n2; ++n) {
            this.b.get(n).b(gk_02);
        }
    }

    public cey_2 a(int n) {
        for (int k = this.b.size() - 1; k >= 0; --k) {
            cey_2 cey_22 = this.b.get(k);
            if (cey_22.a != n) continue;
            return cey_22;
        }
        return null;
    }

    public cez_2 b(int n) {
        for (int k = this.a.size() - 1; k >= 0; --k) {
            cez_2 cez_22 = this.a.get(k);
            if (cez_22.a != n) continue;
            return cez_22;
        }
        return null;
    }
}

