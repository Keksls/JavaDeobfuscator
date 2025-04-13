/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from cfp
 */
public class cfp_1
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(cfp_1.class);
    private static final cfp_1 b = new cfp_1();

    public static cfp_1 a() {
        return b;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            azu_0.j().b(cfo_1.a());
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            azu_0.j().a(cfo_1.a());
        }
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 12050: {
                csr_1 csr_12 = (csr_1)adt_12;
                bvc_2 bvc_22 = bvz_2.a.b();
                exk_2 exk_22 = csr_12.b();
                if (bvc_22 != null && bvc_22.a() == csr_12.d()) {
                    bvc_22.a(csr_12.e());
                    bvc_22.a(csr_12.c(), exk_22, csr_12.f());
                    cyc_0.d().e();
                } else {
                    a.error((Object)"Message d'ajout d'un item dans un echange re\u00e7u alors que le player ne poss\u00e8de pas d'\u00e9changeur actif");
                }
                return false;
            }
            case 12304: {
                cyc_0.d().a(false);
                cst_1 cst_12 = (cst_1)adt_12;
                bvc_2 bvc_23 = bvz_2.a.b();
                ArrayList<ts_0> arrayList = new ArrayList<ts_0>(cst_12.b());
                if (bvc_23 != null && bvc_23.a() == cst_12.d()) {
                    bvc_23.a(cst_12.e());
                    bvc_23.a(cst_12.c(), (List<ts_0>)arrayList);
                    cyc_0.d().e();
                } else {
                    a.error((Object)"Message to add an item in an exchange recieved whereas player don't have active exchanger");
                }
                return false;
            }
            case 13535: {
                css_0 css_02 = (css_0)adt_12;
                bvc_2 bvc_24 = bvz_2.a.b();
                exk_2 exk_23 = css_02.b();
                if (bvc_24 != null && bvc_24.a() == css_02.d()) {
                    bvc_24.a(css_02.e());
                    bvc_24.b(css_02.c(), exk_23, css_02.f());
                    cyc_0.d().e();
                } else {
                    a.error((Object)"Message de suppression d'un item dans un echange re\u00e7u alors que le player ne poss\u00e8de pas d'\u00e9changeur actif");
                }
                return false;
            }
            case 12934: {
                cyc_0.d().a(false);
                csu_1 csu_12 = (csu_1)adt_12;
                bvc_2 bvc_25 = bvz_2.a.b();
                if (bvc_25 != null && bvc_25.a() == csu_12.d()) {
                    bvc_25.a(csu_12.e());
                    bvc_25.b(csu_12.c(), csu_12.b());
                    cyc_0.d().e();
                } else {
                    a.error((Object)"Message to add an item in an exchange recieved whereas player don't have active exchanger");
                }
                return false;
            }
            case 13061: {
                csv_1 csv_12 = (csv_1)adt_12;
                bvc_2 bvc_26 = bvz_2.a.b();
                if (bvc_26 != null && bvc_26.a() == csv_12.b()) {
                    bvc_26.a(csv_12.d());
                    bvc_26.a(csv_12.c(), csv_12.e());
                    cyc_0.d().e();
                } else {
                    a.error((Object)"Message de mise a jour de kamas dans un echange re\u00e7u alors que le player ne poss\u00e8de pas d'\u00e9changeur actif");
                }
                return false;
            }
            case 12970: {
                csw_2 csw_22 = (csw_2)adt_12;
                bvc_2 bvc_27 = bvz_2.a.b();
                if (bvc_27 != null && bvc_27.a() == csw_22.b()) {
                    bvc_27.a(csw_22.c(), csw_22.d());
                } else {
                    a.error((Object)"Message de validation d'un echange re\u00e7u alors que le player ne poss\u00e8de pas d'\u00e9changeur actif");
                }
                return false;
            }
            case 12681: {
                cso_1 cso_12 = (cso_1)adt_12;
                bvc_2 bvc_28 = bvz_2.a.b();
                if (bvc_28 == null || bvc_28.a() != cso_12.c()) {
                    a.error((Object)"Message terminant un echange re\u00e7u alors que le player ne poss\u00e8de pas d'\u00e9changeur actif");
                    return false;
                }
                switch (cso_12.b()) {
                    case 0: {
                        bvc_28.h(bvc_28.z());
                        break;
                    }
                    case 1: {
                        bvc_28.g(bvc_28.z());
                        break;
                    }
                    case 2: {
                        bvc_28.g(bvc_28.A());
                        break;
                    }
                    case 3: {
                        bvc_28.k();
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

