/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from eOc
 */
public class eoc_2 {
    public static final eoc_2 a = new eoc_2();
    private int b;
    private int c;
    private List<? extends epq_2> d;

    public void a(int n) {
        this.b = n;
    }

    public void b(int n) {
        this.c = n;
    }

    public void a(List<? extends epq_2> list) {
        this.d = list == null ? Collections.emptyList() : new ArrayList<epq_2>(list);
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public List<? extends epq_2> c() {
        if (this.d == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(this.d);
    }

    public String toString() {
        return "TackleResult{m_apLoss=" + this.b + ", m_mpLoss=" + this.c + ", m_tacklers=" + this.d + "}";
    }

    public boolean d() {
        if (this == a) {
            return false;
        }
        return this.b == 0 && this.c == 0;
    }

    public boolean e() {
        if (this == a) {
            return false;
        }
        return this.b != 0 || this.c != 0;
    }
}

