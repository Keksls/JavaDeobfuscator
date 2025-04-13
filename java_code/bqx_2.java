/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bqx
 */
public class bqx_2
extends eqk_2 {
    private static final Logger a = Logger.getLogger(bqx_2.class);
    private final bnh_1 b;
    private final pz_2 c;

    public bqx_2(bnh_1 bnh_12, pz_2 pz_22) {
        this.b = bnh_12;
        this.c = pz_22;
        this.c.a().a(this);
    }

    @Override
    public void a() {
        throw new UnsupportedOperationException("Unauthorized on client");
    }

    @Override
    public void b() {
        if (this.c.c != null) {
            this.b.a(eeu_0.b(this.c.c));
        }
        if (this.b.fk() == null) {
            this.b.a(new eep_0());
            a.info((Object)"No DungeonProgression info, we set a new structure");
        }
    }
}

