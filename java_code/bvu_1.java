/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/*
 * Renamed from bvu
 */
public class bvu_1
implements fst {
    private final int a;
    private final ArrayList<bvw_1> b;

    public bvu_1(int n, Set<eLo> set) {
        this.a = n;
        this.b = new ArrayList(set.size());
        Iterator<eLo> iterator = set.iterator();
        while (iterator.hasNext()) {
            bvw_1 bvw_12 = new bvw_1();
            bvw_12.a(iterator.next());
            this.b.add(bvw_12);
        }
        Collections.sort(this.b);
    }

    @Override
    public int a() {
        return this.a;
    }

    @Override
    public Object b() {
        return this.b;
    }
}

