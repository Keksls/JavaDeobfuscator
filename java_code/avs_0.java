/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Collections;

/*
 * Renamed from aVs
 */
public class avs_0 {
    private String a;
    private String b = null;
    private int c;
    private final ArrayList<String> d = new ArrayList();
    private static final ArrayList<String> e = new ArrayList();
    private static final avs_0 f = new avs_0();
    private static final String g = "[";

    public static avs_0 a() {
        return f;
    }

    public void a(String string) {
        this.a = string;
        this.b = null;
        this.d();
        this.e();
        this.c = 0;
    }

    private void d() {
        e.clear();
        bmf_2.a().a((TObjectProcedure<blx_1>)((TObjectProcedure)blx_12 -> {
            String string = blx_12.dp();
            if (string.startsWith(g)) {
                return true;
            }
            e.add(string);
            return true;
        }));
        aUS.a.a().stream().filter(auq_02 -> auq_02.b() != null && !auq_02.b().isEmpty()).map(auq_02 -> aUS.a(auq_02.b(), auq_02.g())).forEach(e::add);
        eQb eQb2 = azu_0.j().k().dE().a();
        if (eQb2 != null) {
            TLongObjectIterator tLongObjectIterator = eQb2.e().iterator();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                Object object = ((epl_0)tLongObjectIterator.value()).a();
                if (e.contains(object) || ((String)object).startsWith(g)) continue;
                e.add((String)object);
            }
        }
        for (Object object : aUL.a().e()) {
            String string;
            if (!((aVg)object).h() || e.contains(string = ((aVg)object).j()) || string.startsWith(g)) continue;
            e.add(string);
        }
    }

    private void e() {
        this.d.clear();
        for (String string : e) {
            if (!string.toLowerCase().startsWith(this.a.toLowerCase()) || this.d.contains(string)) continue;
            this.d.add(string);
        }
        Collections.sort(this.d);
        if (!this.d.contains(this.a)) {
            this.d.add(this.a);
        }
    }

    public String b() {
        if (this.d.isEmpty()) {
            this.b = "";
        } else {
            this.b = this.d.get(this.c);
            this.c = (this.c + 1) % this.d.size();
        }
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public void b(String string) {
        this.a = string;
    }

    public boolean c(String string) {
        return string != null && (string.equalsIgnoreCase(this.a.toLowerCase()) || string.equals(this.b));
    }
}

