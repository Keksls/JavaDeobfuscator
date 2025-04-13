/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.HashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from aLn
 */
public class aln_2 {
    private static final Logger a = Logger.getLogger(aln_2.class);
    private static final boolean b = true;
    private static final aln_2 c = new aln_2();
    private final HashMap<alk_2, all_2> d = new HashMap();

    private aln_2() {
    }

    public static aln_2 a() {
        return c;
    }

    public final void a(alk_2 alk_22, akx_2 akx_22, String string, akr_2[] akr_2Array, boolean bl) {
        all_2 all_22 = this.d.get(alk_22);
        if (all_22 == null) {
            all_22 = new all_2();
            this.d.put(alk_22, all_22);
        }
        all_22.a(akx_22, string, akr_2Array, bl);
    }

    public final all_2 a(alk_2 alk_22) {
        return this.d.get(alk_22);
    }

    public final all_2 b(alk_2 alk_22) {
        return this.d.remove(alk_22);
    }

    public void c(alk_2 alk_22) {
        all_2 all_22 = this.d.get(alk_22);
        if (all_22 != null && all_22.a(alk_22)) {
            this.d.remove(alk_22);
        }
    }

    public void a(alk_2 alk_22, akx_2 akx_22) {
        all_2 all_22 = this.d.get(alk_22);
        if (all_22 != null && all_22.a(akx_22)) {
            this.d.remove(alk_22);
        }
    }

    public void b() {
        this.d.clear();
    }
}

