/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.LinkedList;

/*
 * Renamed from ezd
 */
class ezd_1 {
    private final LinkedList<eze_1> b = new LinkedList();
    private final eza_1 c;
    private final eza_1 d;
    private ezd_1 e;
    final /* synthetic */ ezc_1 a;

    ezd_1(ezc_1 ezc_12, eza_1 eza_12, eza_1 eza_13) {
        this.a = ezc_12;
        this.c = eza_12;
        this.d = eza_13;
    }

    public eza_1 a() {
        return this.c;
    }

    public void a(ezd_1 ezd_12) {
        this.e = ezd_12;
    }

    public void a(eze_1 eze_12) {
        this.a.d.put(eze_12.a(), this.c.b());
        if (this.d != null) {
            eze_12.a(this.d);
        }
        this.b.add(eze_12);
        Collections.sort(this.b);
        this.a.a(eze_12.a(), this.c);
    }

    public void b(eze_1 eze_12) {
        this.b.remove(eze_12);
    }

    public eze_1 a(long l) {
        int n = this.b.size();
        for (int k = 0; k < n; ++k) {
            eze_1 eze_12 = this.b.get(k);
            if (eze_12.a() != l) continue;
            return this.b.remove(k);
        }
        return null;
    }

    public void b() {
        if (this.e == null) {
            return;
        }
        wu_0 wu_02 = wc_0.p().a();
        while (!this.b.isEmpty() && this.b.peek().a(wu_02)) {
            eze_1 eze_12 = this.b.poll();
            this.e.a(eze_12);
        }
    }

    public String toString() {
        return "LevelList{m_elements=" + this.b + ", m_level=" + this.c + ", m_nextLevel=" + this.d + ", m_nextList=" + this.e + "}";
    }
}

