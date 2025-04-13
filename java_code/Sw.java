/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class Sw {
    protected static final Logger a = Logger.getLogger(Sw.class);
    private static final Sw b = new Sw();
    private final TIntObjectHashMap<List<Sl>> c = new TIntObjectHashMap();

    private Sw() {
    }

    public static Sw a() {
        return b;
    }

    public void a(int n, Sl sl) {
        ArrayList<Sl> arrayList = (ArrayList<Sl>)this.c.get(n);
        if (arrayList == null) {
            arrayList = new ArrayList<Sl>();
            this.c.put(n, arrayList);
        }
        arrayList.add(sl);
    }

    public List<Sl> a(int n) {
        return (List)this.c.get(n);
    }
}

