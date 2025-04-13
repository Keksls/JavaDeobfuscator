/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from cXe
 */
public class cxe_0
implements ahr_1 {
    private static final cxe_0 a = new cxe_0();
    private cXg b;
    private ArrayList<bwk_2> c;
    private ans_1 d;

    public static cxe_0 a() {
        return a;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        adt_12.a();
        return true;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.d = new cxf_0(this);
            fpm_0.b().a(this.d);
            this.b = new cXg();
            if (this.c != null) {
                for (bwk_2 bwk_22 : this.c) {
                    this.b.a(bwk_22);
                }
                this.c.clear();
            }
            cXg[] cXgArray = new cXg[]{this.b};
            fis_1.a().a("chestLoot", cXgArray);
            fpm_0.b().a("chestLootDialog", cfi_0.a("chestLootDialog"), 257L, (short)10000);
            cdw_0.n().c(600068L);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.b = null;
            this.c = null;
            fpm_0.b().o("chestLootDialog");
            fpm_0.b().b(this.d);
            fis_1.a().a("chestLoot");
        }
    }

    public void a(int n, short s2) {
        if (this.b == null) {
            if (this.c == null) {
                this.c = new ArrayList();
            }
            this.c.add(new bwk_2(n, s2));
            return;
        }
        this.b.a(n, s2);
        fis_1.a().a((ajf_1)this.b, "loots");
    }
}

