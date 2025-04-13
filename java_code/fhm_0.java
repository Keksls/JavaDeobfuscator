/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  gnu.trove.procedure.TShortObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TShortObjectHashMap;
import gnu.trove.procedure.TShortObjectProcedure;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fhM
 */
public final class fhm_0 {
    protected static final Logger a = Logger.getLogger(fhm_0.class);
    final short b;
    final short c;
    private final TShortObjectHashMap<ArrayList<fho_0>> d = new TShortObjectHashMap();
    private int e = 0;

    public fhm_0(short s2, short s3) {
        this.b = s2;
        this.c = s3;
    }

    public void a(short s2, int n, int n2, short s3, byte by, boolean bl, boolean bl2) {
        ArrayList<fho_0> arrayList = (ArrayList<fho_0>)this.d.get(s2);
        if (arrayList == null) {
            arrayList = new ArrayList<fho_0>();
            this.d.put(s2, arrayList);
        }
        fho_0 fho_02 = new fho_0(s2, n, n2, s3, by, bl, bl2);
        arrayList.add(fho_02);
        ++this.e;
    }

    public byte[] a() {
        abx_2 abx_22 = new abx_2(6 + 4 * this.d.size() + 4 * this.e);
        abx_22.a(this.b);
        abx_22.a(this.c);
        abx_22.a((short)this.d.size());
        this.d.forEachEntry((TShortObjectProcedure)new fhn_0(this, abx_22));
        return abx_22.c();
    }
}

