/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * Renamed from eTI
 */
public class eti_2 {
    public static final eti_2 a = new eti_2();
    private final Map<Short, etw_2> b = new HashMap<Short, etw_2>();
    private final Map<Short, etg_2> c = new HashMap<Short, etg_2>();
    private final Map<Short, etk_2> d = new HashMap<Short, etk_2>();
    private final Map<Short, etn_2> e = new HashMap<Short, etn_2>();

    private eti_2() {
    }

    public void a(etw_2 etw_22) {
        eta_2.a();
        this.b.put(etw_22.a(), etw_22);
    }

    public etw_2 a(short s2) {
        return this.b.get(s2);
    }

    public void a(etg_2 etg_22) {
        eta_2.a();
        this.c.put(etg_22.b(), etg_22);
    }

    public etg_2 b(short s2) {
        return this.c.get(s2);
    }

    public void a(etk_2 etk_22) {
        eta_2.a();
        this.d.put(etk_22.i(), etk_22);
    }

    public etk_2 c(short s2) {
        return this.d.get(s2);
    }

    public void a(etn_2 etn_22) {
        eta_2.a();
        this.e.put(etn_22.b(), etn_22);
    }

    public etn_2 d(short s2) {
        return this.e.get(s2);
    }

    public List<etk_2> a() {
        return this.d.values().stream().sorted(Comparator.comparingInt(etk_2::g)).collect(Collectors.toList());
    }

    public void a(TObjectProcedure<etn_2> tObjectProcedure) {
        List list = this.e.values().stream().sorted(new etj_2()).collect(Collectors.toList());
        for (etn_2 etn_22 : list) {
            if (tObjectProcedure.execute((Object)etn_22)) continue;
            return;
        }
    }

    public void b(TObjectProcedure<etw_2> tObjectProcedure) {
        this.b.forEach((s2, etw_22) -> tObjectProcedure.execute(etw_22));
    }

    void c(TObjectProcedure<etk_2> tObjectProcedure) {
        this.d.forEach((s2, etk_22) -> tObjectProcedure.execute(etk_22));
    }

    public List<etg_2> b(etk_2 etk_22) {
        return this.c.values().stream().filter(etg_22 -> etg_22.a() == etk_22.i()).sorted().collect(Collectors.toList());
    }
}

