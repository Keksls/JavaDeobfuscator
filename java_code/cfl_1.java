/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from cfl
 */
public class cfl_1
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(cfl_1.class);
    private static final cfl_1 b = new cfl_1();

    public static cfl_1 a() {
        return b;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        bmf_0 bmf_02 = azu_0.j().k().dI();
        switch (adt_12.a()) {
            case 13887: {
                bMq bMq2;
                bMn bMn2;
                csm_0 csm_02 = (csm_0)adt_12;
                int n = csm_02.d();
                byte[] byArray = csm_02.b();
                byte[] byArray2 = csm_02.c();
                bRA bRA2 = bRA.e();
                bRD bRD2 = bRD.c();
                bRC bRC2 = bRC.c();
                bRA2.a(n);
                bRD2.a(byArray2);
                bRC2.a(byArray);
                bRA2.g();
                if (bmf_02 != null && (bMn2 = (bMn)bmf_02.h()) != null && !(bMq2 = bMn2.y()).b().isEmpty()) {
                    bwe_2 bwe_22 = bMq2.a();
                    ArrayList<bRz> arrayList = bRC2.a();
                    int n2 = arrayList.size();
                    for (int k = 0; k < n2; ++k) {
                        int n3 = arrayList.get(k).h();
                        if (!bMq2.i(n3)) continue;
                        bwd_2 bwd_22 = bwe_22.a(n3, true);
                        if (bwd_22 == null) {
                            a.error((Object)("On tente d'update le famille d'id=" + n3 + " alors qu'elle n'existe pas dans l'\u00e9cosyst\u00e8me !!!"));
                            continue;
                        }
                        bwd_22.n();
                    }
                }
                cdw_0.n().D();
                boolean bl = bRD2.a().size() > 0 && bRC2.a().size() > 0;
                fis_1.a().a("wakfuEcosystemEnabled", bl);
                fis_1.a().a("wakfuGlobalZoneManager", bRA.e());
                fis_1.a().a((ajf_1)bRA.e(), "protectorSatisfaction", "protectorSatisfactionColor");
                return false;
            }
            case 12795: {
                crs crs2 = (crs)adt_12;
                brf_0 brf_02 = new brf_0();
                brf_02.a(crs2.e(), crs2.f(), crs2.g(), crs2.h(), crs2.i(), crs2.j());
                brf_02.a((float)crs2.c() + crs2.g(), 0.0f, 0.0f, 0.0f, null, crs2.j(), crs2.d(), 0.0f);
                if (bmf_02 != null) {
                    bMn bMn3 = (bMn)bmf_02.h();
                    brf_02.a(bMn3);
                } else {
                    a.error((Object)"R\u00e9ception d'informations de meteo wakfu hors d'un territoire : \u00e9trange");
                }
                return false;
            }
            case 12140: {
                cyo_2 cyo_22 = (cyo_2)adt_12;
                byte[] byArray = cyo_22.b();
                if (byArray != null && byArray.length > 0) {
                    bre_0 bre_02 = new bre_0();
                    bre_02.a(ByteBuffer.wrap(byArray));
                    brh_0.a().b(bre_02);
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

