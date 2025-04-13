/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from boQ
 */
public class boq_1 {
    private static final Logger a = Logger.getLogger(boq_1.class);
    private static final boq_1 b = new boq_1();
    private final TLongObjectHashMap<bon_1> c = new TLongObjectHashMap();

    private boq_1() {
    }

    public bon_1 a(long l) {
        return (bon_1)this.c.get(l);
    }

    public void a(bmv_1 bmv_12, List<ts_2> list) {
        long l = bmv_12.cL();
        if (l == 0L) {
            return;
        }
        bon_1 bon_12 = (bon_1)this.c.get(l);
        if (bon_12 == null) {
            bon_12 = new bon_1(bmv_12.cL());
            this.c.put(l, (Object)bon_12);
        }
        bon_12.a(bmv_12, list);
    }

    public void a(bmv_1 bmv_12, boolean bl) {
        bon_1 bon_12;
        long l = bmv_12.cL();
        if (l != 0L && (bon_12 = (bon_1)this.c.get(l)) != null) {
            if (bl) {
                bon_12.b(bmv_12);
            } else {
                bon_12.c(bmv_12);
            }
        }
    }

    public void a(bon_1 bon_12) {
        this.c.remove(bon_12.e());
    }

    public static boq_1 a() {
        return b;
    }

    public void b() {
        this.c.clear();
    }
}

