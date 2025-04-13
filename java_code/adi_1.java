/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from aDi
 */
public class adi_1<L> {
    private final ArrayList<L> a = new ArrayList();
    private final ArrayList<L> b = new ArrayList();
    private final adj_1<L> c;

    public adi_1(adj_1<L> adj_12) {
        this.c = adj_12;
    }

    public void a() {
        this.a.removeAll(this.b);
        this.b.clear();
        int n = this.a.size();
        for (int k = 0; k < n; ++k) {
            this.c.notify(this.a.get(k));
        }
    }

    public boolean a(L l) {
        this.b.remove(l);
        return !this.a.contains(l) && this.a.add(l);
    }

    public boolean b(L l) {
        return !this.b.contains(l) && this.b.add(l);
    }

    public boolean c(L l) {
        return this.a.contains(l) && !this.b.contains(l);
    }

    public void b() {
        this.a.clear();
        this.b.clear();
    }

    public String toString() {
        return "ListenerHandler{m_listeners=" + this.a.size() + ", m_listenerToRemove=" + this.b.size() + ", m_notifier=" + this.c + "}";
    }
}

