/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class abs<T extends abu>
implements aeh_0,
ahk_0<acb_0> {
    protected final ArrayList<T> a = new ArrayList();
    protected final ArrayList<T> b = new ArrayList();
    protected final ArrayList<T> c = new ArrayList();

    @NotNull
    public ArrayList<T> a(float f2, float f3) {
        this.a.clear();
        ArrayList<T> arrayList = this.c;
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            abu abu2 = (abu)arrayList.get(k);
            if (!abu2.a(f2, f3)) continue;
            this.a.add(abu2);
        }
        return this.a;
    }

    @Nullable
    public T b(float f2, float f3) {
        return abs.b(this.a(f2, f3));
    }

    @NotNull
    public ArrayList<T> a(int n, int n2) {
        this.b.clear();
        for (abu abu2 : this.c) {
            if (abu2.G() != n || abu2.H() != n2) continue;
            this.b.add(abu2);
        }
        return this.b;
    }

    @Nullable
    public T b(int n, int n2) {
        return abs.b(this.a(n, n2));
    }

    @Nullable
    private static <T extends abu> T b(@NotNull ArrayList<T> arrayList) {
        abu abu2 = null;
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            abu abu3 = (abu)arrayList.get(k);
            if (abu2 != null && abu3.aa() <= abu2.aa()) continue;
            abu2 = abu3;
        }
        return (T)abu2;
    }

    public final void a(ArrayList<? super T> arrayList) {
        int n = this.c.size();
        for (int k = 0; k < n; ++k) {
            arrayList.add(this.c.get(k));
        }
    }

    @Override
    public final void a(ahm_0 ahm_02, ArrayList<aek_0> arrayList) {
        int n = this.c.size();
        for (int k = 0; k < n; ++k) {
            arrayList.add((aek_0)this.c.get(k));
        }
    }

    protected void a(T t, int n, int n2, int n3) {
        aiI.a(t);
    }

    public void a() {
        int n = this.c.size();
        for (int k = 0; k < n; ++k) {
            abu abu2 = (abu)this.c.get(k);
            abu2.g(abu2.ao());
            abu2.ad();
            abu2.E();
        }
    }

    public void a(abz_0 abz_02) {
        ArrayList<T> arrayList = this.c;
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            abu abu2 = (abu)arrayList.get(k);
            if (abu2 == abz_02) continue;
            abu2.e(false);
        }
    }

    public final ArrayList<T> b() {
        return this.c;
    }

    public abstract void c();
}

