/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from ddb
 */
public class ddb_0
implements ahr_1 {
    private static final ddb_0 a = new ddb_0();
    String b;
    private ans_1 c;

    public static ddb_0 a() {
        return a;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 18677: {
                dhb_0 dhb_02 = (dhb_0)adt_12;
                if (dhb_02.o() == 3) {
                    this.a(dhb_02.k(), dhb_02.h());
                } else {
                    bpl_0 bpl_02 = (bpl_0)fis_1.a().d("editableDescribedSpell", dhb_02.h());
                    fis_1.a().a("editableDescribedSpell", (Object)dhb_02.k(), dhb_02.h());
                    if (bpl_02 != null) {
                        blx_1 blx_12 = azu_0.j().l();
                        ArrayList arrayList = blx_12.aZ().d(((bph_0)bpl_02.r()).i());
                        if (arrayList.size() != 1) {
                            fis_1.a().a((ajf_1)bpl_02.r(), "id");
                            return false;
                        }
                        fis_1.a().a((ajf_1)((bpl_0)arrayList.get(0)).r(), "id");
                    }
                }
                return false;
            }
        }
        return true;
    }

    private void a(bpl_0 bpl_02, String string) {
        String string2 = "spellDescriptionDialog" + bpl_02.aT_();
        if (!fpm_0.b().q(string2)) {
            fpm_0.b().a(string2, cfi_0.a("spellDescriptionDialog"), this.b == null ? string : this.b, string, "spellDescriptionDialog", 129L, (short)10000);
            this.b = string2;
            fis_1.a().a("describedSpell", (Object)bpl_02, string2);
            fis_1.a().a("describedSpellRealLevel", (Object)bpl_02.c(), string2);
            fis_1.a().a("editableDescribedSpell", (Object)bpl_02.a(false), string2);
        } else {
            fpm_0.b().o(string2);
        }
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.c = new ddc_0(this);
            fpm_0.b().a(this.c);
            fpm_0.b().a("wakfu.spellDetails", cJF.class);
            cgu_2.a().a(this);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().b(this.c);
            fpm_0.b().e("wakfu.spellDetails");
            cgu_2.a().b(this);
        }
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

