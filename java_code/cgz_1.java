/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cgZ
 */
public final class cgz_1
implements ahr_1 {
    private static final Logger b = Logger.getLogger(cgz_1.class);
    private static final cgz_1 c = new cgz_1();
    final cgy_1<bvx_2> a = new cgy_1();
    private bvx_2 d;

    public static cgz_1 a() {
        return c;
    }

    private cgz_1() {
        this.d();
        this.e();
    }

    private void d() {
        che_2.a(12230, this.a);
        che_2.a(13225, this.a);
        che_2.a(12274, this.a);
        che_2.a(13607, this.a);
        che_2.a(12015, this.a);
        che_2.a(12696, this.a);
        che_2.a(13979, this.a);
        che_2.a(13680, this.a);
        che_2.a(12738, this.a);
        che_2.a(13079, this.a);
        che_2.a(13248, this.a);
        che_2.a(13274, this.a);
        che_2.a(13337, this.a);
        che_2.a(12965, this.a);
        che_2.a(13066, this.a);
        che_2.a(13966, this.a);
        che_2.a(13453, this.a);
        che_2.a(13163, this.a);
        che_2.a(12787, this.a);
        che_2.a(13211, this.a);
        che_2.a(13407, this.a);
        che_2.a(12837, this.a);
        che_2.a(13323, this.a);
        che_2.a(12910, this.a);
        che_2.a(12482, this.a);
        che_2.a(13941, this.a);
    }

    private void e() {
        cie_2.a(13269, this.a);
        cie_2.a(12708, this.a);
        cie_2.a(13972, this.a);
        cie_2.a(12554, this.a);
        cie_2.a(12222, this.a);
        cie_2.a(13190, this.a);
        cie_2.a(12922, this.a);
        cie_2.a(12003, this.a);
        cie_2.a(13222, this.a);
        cie_2.a(12399, this.a);
        cie_2.a(13946, this.a);
        cie_2.a(13930, this.a);
        cie_2.a(12553, this.a);
        cie_2.a(12029, this.a);
        cie_2.a(13759, this.a);
        cie_2.a(13609, this.a);
        cie_2.a(13735, this.a);
        cie_2.a(13413, this.a);
        cie_2.a(12356, this.a);
        cie_2.a(12843, this.a);
        cie_2.a(12564, this.a);
        cie_2.a(13573, this.a);
        cie_2.a(13116, this.a);
        cie_2.a(12798, this.a);
        cie_2.a(12573, this.a);
        cie_2.a(12939, this.a);
        cie_2.a(12170, this.a);
        cie_2.a(12739, this.a);
        cie_2.a(12710, this.a);
        cie_2.a(13405, this.a);
        cie_2.a(12643, this.a);
        cie_2.a(13538, this.a);
    }

    public void a(bvx_2 bvx_22) {
        this.d = bvx_22;
        this.a.a(bvx_22);
    }

    public bvx_2 c() {
        return this.d;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        b.info((Object)"NetInFight Added");
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        b.info((Object)"NetInFight Removed");
    }

    @Override
    public boolean a(adt_1 adt_12) {
        if (this.d == null) {
            b.error((Object)("[FIGHT] La NetInFightManagementFrame re\u00e7oit un message a traiter alors qu'aucun combat ne lui est associ\u00e9 : " + adt_12.getClass().getSimpleName()));
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

