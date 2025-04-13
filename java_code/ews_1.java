/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eWs
 */
final class ews_1
implements ewz_2 {
    private final List<exa_2> a = new ArrayList<exa_2>();
    private final ewv_2 b;
    private short c;

    ews_1(ewv_2 ewv_22) {
        this.b = ewv_22;
        this.c = 1;
    }

    @Override
    public int a() {
        return this.b.n();
    }

    @Override
    public short b() {
        return this.c;
    }

    @Override
    public short c() {
        return this.b.o();
    }

    void a(short s2) {
        int n = s2 - this.c;
        this.c = s2;
        this.a(n);
    }

    private void a(int n) {
        int n2 = this.a.size();
        for (int k = 0; k < n2; ++k) {
            this.a.get(k).a(this, n);
        }
    }

    @Override
    public boolean a(exa_2 exa_22) {
        return !this.a.contains(exa_22) && this.a.add(exa_22);
    }

    @Override
    public boolean b(exa_2 exa_22) {
        return this.a.remove(exa_22);
    }

    public String toString() {
        return "QuestItem{m_refId=" + this.b + ", m_quantity=" + this.c + "}";
    }
}

