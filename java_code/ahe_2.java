/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Iterator;

/*
 * Renamed from aHe
 */
public class ahe_2
implements Iterator<HashMap<String, Object>> {
    HashMap<String, Object> a = new HashMap();
    final Iterator<HashMap<String, Object>> b;
    int c = -1;

    ahe_2(ahp_1 ahp_12) {
        this.b = ahp_12.a.iterator();
    }

    @Override
    public boolean hasNext() {
        return this.b.hasNext();
    }

    public HashMap<String, Object> a() {
        if (this.b.hasNext()) {
            this.a = this.b.next();
            ++this.c;
        }
        return this.a;
    }

    @Override
    public void remove() {
        this.b.remove();
    }

    public int b() {
        return this.c;
    }

    @Override
    public /* synthetic */ Object next() {
        return this.a();
    }
}

