/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;

/*
 * Renamed from ccw
 */
public class ccw_1 {
    public static final ccw_1 a = new ccw_1();
    private final HashMap<Integer, ArrayList<Integer>> b = new HashMap();
    private final HashMap<Integer, ArrayList<Integer>> c = new HashMap();

    private ccw_1() {
    }

    public void a(int n, int n2) {
        ArrayList<Integer> arrayList;
        if (!this.b.containsKey(n)) {
            this.b.put(n, new ArrayList());
        }
        if ((arrayList = this.b.get(n)).contains(n2)) {
            return;
        }
        arrayList.add(n2);
    }

    public void b(int n, int n2) {
        ArrayList<Integer> arrayList;
        if (!this.c.containsKey(n)) {
            this.c.put(n, new ArrayList());
        }
        if ((arrayList = this.c.get(n)).contains(n2)) {
            return;
        }
        arrayList.add(n2);
    }

    public ArrayList<Integer> a(int n) {
        return this.b.containsKey(n) ? this.b.get(n) : new ArrayList<Integer>();
    }

    public ArrayList<Integer> b(int n) {
        return this.c.containsKey(n) ? this.c.get(n) : new ArrayList<Integer>();
    }
}

