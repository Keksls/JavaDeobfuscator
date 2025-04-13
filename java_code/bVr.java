/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.Collection;

public class bVr
implements ajh_1 {
    public static final String a = "nations";
    public static final bVr b = new bVr();
    private final Collection<bVn> d = new ArrayList<bVn>();
    private final TIntObjectHashMap<bVn> e = new TIntObjectHashMap();

    private bVr() {
        this.a(new bVn(30));
        this.a(new bVn(31));
        this.a(new bVn(32));
        this.a(new bVn(33));
    }

    private void a(bVn bVn2) {
        this.d.add(bVn2);
        this.e.put(bVn2.g(), (Object)bVn2);
    }

    public bVn a(int n) {
        return (bVn)this.e.get(n);
    }

    @Override
    public String[] d() {
        return b_;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.d;
        }
        return null;
    }

    public String toString() {
        return "NationsView{m_nations=" + this.d + ", m_nationsById=" + this.e + "}";
    }
}

