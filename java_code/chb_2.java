/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from chb
 */
public final class chb_2
implements ahr_1 {
    private static final Logger b = Logger.getLogger(chb_2.class);
    private static final chb_2 c = new chb_2();
    final cgy_1<bvx_2> a = new cgy_1();
    private bvx_2 d;

    private chb_2() {
        this.c();
        this.d();
    }

    public static chb_2 a() {
        return c;
    }

    private void c() {
        cjd_2.a(12399, this.a);
        cjd_2.a(13946, this.a);
        cjd_2.a(13930, this.a);
        cjd_2.a(12029, this.a);
        cjd_2.a(12739, this.a);
        cjd_2.a(12710, this.a);
        cjd_2.a(13573, this.a);
        cjd_2.a(13735, this.a);
        cjd_2.a(12522, this.a);
    }

    private void d() {
        che_2.a(12274, this.a);
        che_2.a(13225, this.a);
        che_2.a(13680, this.a);
        che_2.a(13079, this.a);
        che_2.a(13163, this.a);
        che_2.a(12015, this.a);
        che_2.a(12482, this.a);
        che_2.a(13607, this.a);
        che_2.a(13979, this.a);
        che_2.a(12696, this.a);
        che_2.a(13966, this.a);
        che_2.a(13453, this.a);
        che_2.a(12230, this.a);
        che_2.a(13941, this.a);
        che_2.a(12356, this.a);
    }

    public void a(bvx_2 bvx_22) {
        this.d = bvx_22;
        this.a.a(bvx_22);
    }

    @Override
    public boolean a(adt_1 adt_12) {
        if (this.d == null) {
            b.error((Object)("[FIGHT] La NetSpectatorFightFrame re\u00e7oit un message a traiter alors qu'aucun combat ne lui est associ\u00e9 : " + adt_12.getClass().getSimpleName()));
            return true;
        }
        if (adt_12 instanceof csy_2 && ((csy_2)adt_12).d() != this.d.c()) {
            return true;
        }
        return this.a.a(adt_12);
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

