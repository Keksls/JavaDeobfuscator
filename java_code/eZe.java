/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashBasedTable
 *  com.google.common.collect.Table
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

public class eZe {
    public static final eZe a = new eZe();
    private final List<eZf> b = new ArrayList<eZf>();
    private final Table<Long, Long, eZb> c = HashBasedTable.create();

    public void a(long l, long l2, eZb eZb2) {
        this.c.put((Object)l, (Object)l2, (Object)eZb2);
        for (eZf eZf2 : this.b) {
            eZf2.a(l, eZb2);
        }
    }

    @Nullable
    public eZb a(long l) {
        Map map = this.c.column((Object)l);
        if (map == null) {
            return null;
        }
        Iterator iterator = map.entrySet().iterator();
        if (!iterator.hasNext()) {
            return null;
        }
        return (eZb)iterator.next().getValue();
    }

    public eZb a(long l, long l2) {
        return (eZb)this.c.get((Object)l, (Object)l2);
    }

    public List<eZb> b(long l) {
        HashSet<Long> hashSet = new HashSet<Long>();
        Map map = this.c.row((Object)l);
        for (Map.Entry object : map.entrySet()) {
            hashSet.add((Long)object.getKey());
        }
        ArrayList arrayList = new ArrayList();
        for (Long l2 : hashSet) {
            eZb eZb2 = (eZb)this.c.remove((Object)l, (Object)l2);
            arrayList.add(eZb2);
        }
        return arrayList;
    }

    public eZb b(long l, long l2) {
        return (eZb)this.c.remove((Object)l, (Object)l2);
    }

    public Collection<eZb> c(long l) {
        return this.c.row((Object)l).values();
    }

    public void a(eZf eZf2) {
        if (!this.b.contains(eZf2)) {
            this.b.add(eZf2);
        }
    }

    public void b(eZf eZf2) {
        this.b.remove(eZf2);
    }
}

