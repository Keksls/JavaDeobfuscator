/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Unmodifiable
 *  org.jetbrains.annotations.VisibleForTesting
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Unmodifiable;
import org.jetbrains.annotations.VisibleForTesting;

/*
 * Renamed from ezx
 */
public abstract class ezx_2 {
    private static final Logger a = Logger.getLogger(ezx_2.class);
    private final Map<Integer, Short> b = new HashMap<Integer, Short>();
    private final Collection<ezr_1> c = new ArrayList<ezr_1>();
    private short d;

    protected ezx_2(ezx_2 ezx_22) {
        this.d = ezx_22.e();
        this.b.putAll(ezx_22.d());
        this.c.addAll(ezx_22.h());
    }

    public ezx_2() {
    }

    public short a(int n) {
        return this.b.getOrDefault(n, (short)0);
    }

    public void a(int n, short s2) {
        if (s2 > 0) {
            this.b.put(n, s2);
        } else {
            this.b.remove(n);
        }
        this.d(n, s2);
    }

    public void b(int n, short s2) {
        short s3 = (short)(this.a(n) + s2);
        this.b.put(n, s3);
        this.d(n, s3);
    }

    public void a(BiConsumer<Integer, Short> biConsumer) {
        this.b.forEach(biConsumer);
    }

    private void d(int n, short s2) {
        for (ezr_1 ezr_12 : this.c) {
            try {
                ezr_12.a(n, s2);
            }
            catch (Exception exception) {
                a.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    public void a(ezr_1 ezr_12) {
        if (this.c.contains(ezr_12)) {
            return;
        }
        this.c.add(ezr_12);
    }

    public void b(ezr_1 ezr_12) {
        this.c.remove(ezr_12);
    }

    public int b(int n) {
        int n2 = 0;
        for (Integer n3 : ezi_2.a.d(n)) {
            n2 += this.a(n3);
        }
        return n2;
    }

    public int c(int n, short s2) {
        short s3 = this.a(s2);
        short s4 = ezi_2.a.b(s3).a(n);
        return s4 - this.b(n);
    }

    public boolean a(int n, int n2, short s2) {
        int n3 = ezi_2.a.b(n);
        return this.c(n3, s2) >= n2;
    }

    public void a(ezx_2 ezx_22) {
        ezx_22.b(this.e());
        ezx_22.a(this.d());
    }

    public void b(ezx_2 ezx_22) {
        ezx_22.a(this.d());
    }

    public void c() {
        this.b.clear();
    }

    @VisibleForTesting
    public void a(Map<Integer, Short> map) {
        this.c();
        this.b.putAll(map);
    }

    public boolean c(ezx_2 ezx_22) {
        return this.d != ezx_22.d || !this.b.equals(ezx_22.b);
    }

    public @Unmodifiable Map<Integer, Short> d() {
        return Collections.unmodifiableMap(this.b);
    }

    public short e() {
        return this.d;
    }

    public short a(short s2) {
        return this.d == -1 ? s2 : this.d;
    }

    public void b(short s2) {
        this.d = s2;
    }

    public abstract ezx_2 b();

    public ezx_2 f() {
        ezx_2 ezx_22 = this.b();
        ezx_22.d = this.d;
        ezx_22.b.putAll(this.b);
        return ezx_22;
    }

    public void d(ezx_2 ezx_22) {
        this.d = ezx_22.d;
        this.b.clear();
        this.b.putAll(ezx_22.b);
    }

    public void e(ezx_2 ezx_22) {
        this.b.clear();
        this.b.putAll(ezx_22.b);
    }

    public boolean a(epq_2 epq_22) {
        if (epq_22 == null) {
            return false;
        }
        return this.d <= epq_22.dt() - 1;
    }

    public String toString() {
        return "AptitudeInventory{m_levelsByBonusId=" + this.b + "}";
    }

    public void g() {
        this.b.clear();
    }

    @VisibleForTesting
    public Collection<ezr_1> h() {
        return this.c;
    }
}

