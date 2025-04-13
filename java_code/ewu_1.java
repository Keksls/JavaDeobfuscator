/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.function.Consumer;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eWu
 */
public class ewu_1
implements exb_2 {
    private static final byte a = 100;
    private final LinkedList<exk_2> b = new LinkedList();
    private final ArrayList<exc_2> c = new ArrayList();

    @Override
    public exk_2 a(short s2) {
        return this.b.get(s2);
    }

    @Override
    @Nullable
    public exk_2 a(long l) {
        short s2 = this.d(l);
        return s2 == -1 ? null : this.b.get(s2);
    }

    @Override
    public boolean b(long l) {
        return this.d(l) != -1;
    }

    @Deprecated
    public void a(exk_2 exk_22) {
        this.b.add(exk_22);
        this.d(exk_22);
    }

    @Nullable
    private exk_2 b(short s2) {
        if (s2 != -1) {
            exk_2 exk_22 = this.b.remove(s2);
            this.e(exk_22);
            return exk_22;
        }
        return null;
    }

    exk_2 c(long l) {
        return this.b(this.d(l));
    }

    boolean b(exk_2 exk_22) {
        return this.c(exk_22.a()) != null;
    }

    exk_2 a() {
        if (!this.b.isEmpty()) {
            return this.b((short)0);
        }
        return null;
    }

    void a(long l, short s2) {
        exk_2 exk_22 = this.a(l);
        if (exk_22 != null) {
            exk_22.a(s2);
            this.f(exk_22);
        }
    }

    short d(long l) {
        int n = this.b.size();
        for (int k = 0; k < n; ++k) {
            if (this.b.get(k).a() != l) continue;
            return (short)k;
        }
        return -1;
    }

    short b() {
        return (short)this.b.size();
    }

    private void d(exk_2 exk_22) {
        for (int k = this.c.size() - 1; k >= 0; --k) {
            this.c.get(k).a(exk_22);
        }
    }

    private void e(exk_2 exk_22) {
        for (int k = this.c.size() - 1; k >= 0; --k) {
            this.c.get(k).b(exk_22);
        }
    }

    private void f(exk_2 exk_22) {
        for (int k = this.c.size() - 1; k >= 0; --k) {
            this.c.get(k).c(exk_22);
        }
    }

    private void g() {
        for (int k = this.c.size() - 1; k >= 0; --k) {
            this.c.get(k).a();
        }
    }

    @Override
    public void a(exc_2 exc_22) {
        this.c.add(exc_22);
    }

    @Override
    public void b(exc_2 exc_22) {
        this.c.remove(exc_22);
    }

    public void c() {
        this.c.clear();
    }

    @Override
    public boolean d() {
        return this.b.size() == 100;
    }

    @Override
    public boolean e() {
        return this.b.isEmpty();
    }

    @Override
    public void f() {
        this.a(ewv_1.a);
        this.b.clear();
        this.g();
    }

    public boolean e(long l) {
        return this.d(l) != -1;
    }

    @Override
    public boolean c(exk_2 exk_22) {
        return this.e(exk_22.a());
    }

    @Override
    public boolean a(TObjectProcedure<exk_2> tObjectProcedure) {
        int n = this.b.size();
        for (int k = 0; k < n; ++k) {
            exk_2 exk_22 = this.b.get(k);
            if (tObjectProcedure.execute((Object)exk_22)) continue;
            return false;
        }
        return true;
    }

    @Override
    public void a(Consumer<exk_2> consumer) {
        this.b.forEach(consumer);
    }

    public String toString() {
        return "TemporaryInventoryModel{m_items=" + (this.b == null ? "null" : Collections.singletonList(this.b).toString()) + "}";
    }
}

