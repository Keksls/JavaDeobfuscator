/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntIntHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from bpF
 */
public class bpf_2
extends bpc_2 {
    private static final Logger a = Logger.getLogger(bpf_2.class);
    private final bqI b;
    private final bqH c;

    public bpf_2(bqI bqI2, bqH bqH2) {
        this.b = bqI2;
        this.c = bqH2;
    }

    @Override
    public short ac_() {
        return 17;
    }

    @Override
    public boolean g() {
        return this.d.eE() == null;
    }

    @Override
    public void a() {
        a.info((Object)"Lancement de l'occupation BROWSE_COLLECTOR");
        this.d.a(this);
        azu_0.j().a(bqJ.a);
    }

    @Override
    public boolean a(boolean bl, boolean bl2) {
        a.info((Object)"On cancel l'occupation BROWSE_COLLECTOR");
        if (bl2) {
            this.b.b().a(Tv.n, azu_0.j().k());
        }
        return this.b();
    }

    @Override
    public boolean b() {
        a.info((Object)"On fini l'occupation BROWSE_COLLECTOR");
        if (azu_0.j().c(cXm.d())) {
            azu_0.j().b(cXm.d());
        }
        azu_0.j().b(bqJ.a);
        return true;
    }

    public void a(byte[] byArray) {
        this.b.a(byArray);
        if (this.c != null) {
            this.c.a();
        }
    }

    public void a(TIntIntHashMap tIntIntHashMap, long l) {
        cpb_0 cpb_02 = new cpb_0();
        cpb_02.a(tIntIntHashMap);
        cpb_02.a(l);
        azu_0.j().K().c(cpb_02);
    }
}

