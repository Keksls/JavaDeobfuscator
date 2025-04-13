/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from daW
 */
public class daw_0
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "sourcesDescription";
    public static final String d = "logFiltered";
    public static final String e = "visible";
    public final String[] f = new String[]{"name", "sourcesDescription"};
    private final cdl_0 g;
    private boolean h;
    boolean i;

    public daw_0(cdl_0 cdl_02) {
        this.g = cdl_02;
        this.h = this.b() > 0;
        this.i = false;
    }

    @Override
    public String[] d() {
        return this.f;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.g.name() + "(" + this.b() + ")";
        }
        if (string.equals(d)) {
            return this.i;
        }
        if (string.equals(e)) {
            return this.h;
        }
        if (string.equals(b)) {
            ald_1 ald_12;
            Object object;
            ani_2 ani_22 = new ani_2();
            alp_1 alp_12 = this.g.c();
            if (alp_12 != null) {
                ani_22.a().a((CharSequence)"-Default- size=").d(alp_12.r().size()).b().a((CharSequence)"\n");
                object = alp_12.r().iterator();
                while (object.hasNext()) {
                    ald_12 = (amj_1)object.next();
                    ani_22.a((CharSequence)((amj_1)ald_12).J()).a((CharSequence)"\n");
                }
            }
            if ((object = this.g.d()) != null) {
                ani_22.a().a((CharSequence)"-Field- size=").d(((alu_1)object).x()).b().a((CharSequence)"\n");
                ani_22.a((CharSequence)((alu_1)object).y()).a((CharSequence)"\n");
            }
            if ((ald_12 = this.g.b()) != null) {
                amj_1 amj_12 = ((amc_1)ald_12).y();
                ani_22.a().a((CharSequence)"-Music-").b().a((CharSequence)"\n");
                if (amj_12 != null) {
                    ani_22.a((CharSequence)amj_12.J()).a((CharSequence)"\n");
                }
            }
            return ani_22.r();
        }
        return null;
    }

    public void a(boolean bl) {
        this.i = bl;
        fis_1.a().a((ajf_1)this, d);
    }

    public byte a() {
        return this.g.a();
    }

    public void b(boolean bl) {
        this.h = bl;
        fis_1.a().a((ajf_1)this, e);
    }

    public int b() {
        int n = 0;
        if (this.g.c() != null) {
            n += this.g.c().r().size();
        }
        if (this.g.d() != null) {
            n += this.g.d().x();
        }
        return n;
    }
}

