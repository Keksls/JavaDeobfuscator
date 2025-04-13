/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  org.apache.log4j.Logger
 */
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from eYT
 */
public class eyt_0 {
    protected static final Logger a = Logger.getLogger(eyt_0.class);
    protected long b;
    protected Map<Long, exk_2> c = new HashMap<Long, exk_2>();
    private final List<eyw_0> d = new ArrayList<eyw_0>();
    private final List<Uo> e = new ArrayList<Uo>();

    public eyt_0() {
    }

    public eyt_0(epq_2 epq_22) {
        this.b = epq_22.a_();
    }

    public eyt_0(long l) {
        this.b = l;
    }

    public boolean a(exk_2 exk_22) {
        if (exk_22 == null) {
            a.warn((Object)("Try to add a null item to equipment inventory, characterId=" + this.b));
            return false;
        }
        this.c.put(exk_22.a(), exk_22);
        for (eyw_0 eyw_02 : this.d) {
            eyw_02.a(exk_22);
        }
        this.a(um_0.a(Ui.d, exk_22));
        return true;
    }

    public boolean a(long l, ezn_0 ezn_02) {
        exh_1 exh_12;
        exk_2 exk_22;
        Object t = euw_2.a.d(this.b);
        if (t == null) {
            return false;
        }
        Object t2 = euu_2.c(((epq_2)t).U_(), l);
        if (t2 != null && (exk_22 = (exh_12 = ((epq_2)t2).dS()).i(l)) != null && exh_12.a(exk_22, ezn_02) != null) {
            return this.a(exk_22);
        }
        return false;
    }

    public boolean c(Long l) {
        return this.c.containsKey(l);
    }

    public Optional<exk_2> b(Long l) {
        return Optional.ofNullable(this.c.get(l));
    }

    public Optional<exk_2> a(Long l) {
        Optional<exk_2> optional = Optional.ofNullable(this.c.remove(l));
        if (optional.isPresent()) {
            exk_2 exk_22 = optional.get();
            for (eyw_0 eyw_02 : this.d) {
                eyw_02.b(exk_22);
            }
            this.a(um_0.b(Ui.d, exk_22));
        }
        return optional;
    }

    public Optional<exk_2> b(exk_2 exk_22) {
        return this.a((Long)exk_22.a());
    }

    public boolean a(int n) {
        for (Map.Entry<Long, exk_2> entry : this.c.entrySet()) {
            if (entry.getValue().aT_() != n) continue;
            return true;
        }
        return false;
    }

    public exk_2 b(int n) {
        for (Map.Entry<Long, exk_2> entry : this.c.entrySet()) {
            exk_2 exk_22 = entry.getValue();
            if (exk_22.aT_() != n) continue;
            return exk_22;
        }
        return null;
    }

    public ArrayList<exk_2> c(int n) {
        ArrayList<exk_2> arrayList = new ArrayList<exk_2>();
        for (Map.Entry<Long, exk_2> entry : this.c.entrySet()) {
            exk_2 exk_22 = entry.getValue();
            if (exk_22.aT_() != n) continue;
            arrayList.add(exk_22);
        }
        return arrayList;
    }

    public ImmutableMap<Long, exk_2> a() {
        return ImmutableMap.copyOf(this.c);
    }

    public void b(eyt_0 eyt_02) {
        this.c = new HashMap<Long, exk_2>(eyt_02.c);
    }

    public int b() {
        return this.c.size();
    }

    public void a(eyw_0 eyw_02) {
        if (!this.d.contains(eyw_02)) {
            this.d.add(eyw_02);
        }
    }

    public void b(eyw_0 eyw_02) {
        this.d.remove(eyw_02);
    }

    public long c() {
        return this.b;
    }

    public void a(long l) {
        this.b = l;
    }

    public void a(Uo uo) {
        if (!this.e.contains(uo)) {
            this.e.add(uo);
        }
    }

    public void b(Uo uo) {
        this.e.remove(uo);
    }

    public void a(Uk uk) {
        for (Uo uo : this.e) {
            try {
                uo.a(uk);
            }
            catch (Exception exception) {
                a.error((Object)("Error during process of inventory event " + uk + " with observer " + uo), (Throwable)exception);
            }
        }
    }

    public int d() {
        return this.c.size();
    }

    public boolean d(Long l) {
        return this.c(l);
    }
}

