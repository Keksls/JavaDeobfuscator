/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fkp
 */
public class fkp_0 {
    private static final Logger a = Logger.getLogger(fkp_0.class);
    private static final esy_2[] b = new esy_2[0];
    private final TLongObjectHashMap<esy_2> c;
    private esy_2[] d = b;
    private short e = (short)Short.MAX_VALUE;
    private short f = (short)Short.MAX_VALUE;

    public fkp_0(TLongObjectHashMap<esy_2> tLongObjectHashMap) {
        this.c = tLongObjectHashMap;
    }

    public esy_2[] a(short s2, short s3) {
        if (this.e == s2 && this.f == s3) {
            return this.d;
        }
        int n = s2 * 18;
        int n2 = s3 * 18;
        afk_2 afk_22 = new afk_2(n, n + 18 - 1, n2, n2 + 18 - 1);
        ArrayList arrayList = new ArrayList();
        this.c.forEachValue((TObjectProcedure)new fkq_0(this, afk_22, arrayList));
        esy_2[] esy_2Array = arrayList.isEmpty() ? b : (esy_2[])arrayList.toArray(new esd_1[arrayList.size()]);
        this.e = s2;
        this.f = s3;
        this.d = esy_2Array;
        return esy_2Array;
    }

    public void a() {
        this.d = b;
        this.e = (short)Short.MAX_VALUE;
        this.f = (short)Short.MAX_VALUE;
    }
}

