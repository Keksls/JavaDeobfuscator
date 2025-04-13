/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.protobuf.InvalidProtocolBufferException
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.google.protobuf.InvalidProtocolBufferException;
import gnu.trove.procedure.TObjectProcedure;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from cgk
 */
public class cgk_1
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(cgk_1.class);
    public static final cgk_1 b = new cgk_1();

    private cgk_1() {
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 14197: {
                cxn_2 cxn_22 = (cxn_2)adt_12;
                aUh.b("[PVP] Score : " + cxn_22.b() + ", Classement : " + cxn_22.c() + " (" + cxn_22.d().name() + ")", new Object[0]);
                return false;
            }
            case 15781: {
                cxm_2 cxm_22 = (cxm_2)adt_12;
                fhq fhq2 = cxm_22.c();
                cYL.a().a(fhq2);
                this.a();
                return false;
            }
            case 14501: {
                cBj cBj2 = (cBj)adt_12;
                bnp_0.b.a(cBj2.c(), (int)Math.ceil((double)cBj2.b() / 10.0), cBj2.d());
                return false;
            }
            case 14423: {
                cBi cBi2 = (cBi)adt_12;
                if (cBi2.b() != null) {
                    bno_0.a(cBi2.b(), false);
                }
                return false;
            }
            case 14837: {
                cBh cBh2 = (cBh)adt_12;
                if (cBh2.b() != null) {
                    bno_0.a(cBh2.b(), true);
                }
                return false;
            }
            case 14003: {
                cBg cBg2 = (cBg)adt_12;
                ImmutableList immutableList = cBg2.b() != null ? ImmutableList.of((Object)cBg2.b()) : ImmutableList.of();
                bnp_0.b.a(0, 1, (List<fgZ>)immutableList);
                return false;
            }
            case 15485: {
                cBe cBe2 = (cBe)adt_12;
                bkf_2 bkf_22 = (bkf_2)fis_1.a().e("battlegroundListView");
                if (cBe2.b() != null && !cBe2.b().isEmpty()) {
                    bkf_22.a(cBe2.b());
                }
                return false;
            }
            case 15607: {
                if (!((bvx_0)ans_0.D().h()).a(bWe.aa)) {
                    return false;
                }
                short s2 = euw_2.a.i(azu_0.j().n().u());
                if (s2 <= 51) {
                    return false;
                }
                cBf cBf2 = (cBf)adt_12;
                int n = cBf2.b();
                String string = bae.h().a(66, (long)n, new Object[0]);
                String string2 = aZH.a().a("battlegroundList").a();
                String string3 = bae.h().a("battleground.start.notification", string, string2);
                String string4 = bae.h().a("battleground.start.notification.title", new Object[0]);
                add_2.b().a(new dhc(string4, string3, blr_1.n));
                return false;
            }
            case 12040: {
                cxk_2 cxk_22 = (cxk_2)adt_12;
                this.a(cxk_22);
                return false;
            }
            case 12138: {
                cxs_2 cxs_22 = (cxs_2)adt_12;
                blx_1 blx_13 = bmf_2.a().c(cxs_22.b());
                if (blx_13 == null) {
                    return false;
                }
                bnh_1 bnh_12 = (bnh_1)blx_13;
                bmr_1 bmr_12 = azu_0.j().k();
                fhD fhD2 = bmr_12.ba();
                faV faV2 = bnh_12.fE();
                faV2.a(cxs_22.c());
                faV2.d(cxs_22.d());
                if (bnh_12.a_() != bmr_12.a_() && fhD2 == fhD.a) {
                    return false;
                }
                if (bnh_12.a_() != bmr_12.a_() || fhD2 == faV2.k()) {
                    bnh_12.z();
                    return false;
                }
                bmf_2.a().a((TObjectProcedure<blx_1>)((TObjectProcedure)blx_12 -> {
                    if (blx_12.ba() == fhD.a) {
                        return true;
                    }
                    blx_12.z();
                    return true;
                }));
                return false;
            }
            case 13730: {
                cxr_2 cxr_22 = (cxr_2)adt_12;
                long l = cxr_22.b();
                pj_0 pj_02 = ccm_1.g().a(l);
                if (pj_02 == null) {
                    return false;
                }
                if (!(pj_02 instanceof beh_0)) {
                    return false;
                }
                ((beh_0)pj_02).a(true);
                return false;
            }
            case 15396: {
                cBk cBk2 = (cBk)adt_12;
                boolean bl = ((bvx_0)ans_0.D().h()).a(bWe.aS);
                for (fhB fhB2 : cBk2.b()) {
                    String string = bae.h().a(77, fhB2.a(), new Object[0]);
                    if (fhB2.b() == fha_0.c && bl) {
                        blt_0.b(bae.h().a("pvp.extraction.notification", string)).b();
                    }
                    ddp.a().d().a(fhB2, string);
                }
                return false;
            }
            case 15619: {
                cBl cBl2 = (cBl)adt_12;
                fhD fhD3 = cBl2.b();
                Optional optional = bhh_1.a(end_0.h);
                if (optional.isEmpty()) {
                    return false;
                }
                fhz fhz2 = (fhz)optional.get();
                if (fhD3 != fhD.a) {
                    fhz2.b(fhD3);
                }
                ddp.a().d().a(fhD3);
                return false;
            }
            case 13009: {
                cxq_2 cxq_22 = (cxq_2)adt_12;
                cYL.a().a(cxq_22.b());
                return false;
            }
            case 13244: {
                Object object;
                Object object2;
                cxh_2 cxh_22 = (cxh_2)adt_12;
                long l = cxh_22.b();
                byte[] byArray = cxh_22.c();
                byte[] byArray2 = cxh_22.d();
                fhe_0 fhe_02 = fhm.a(ByteBuffer.wrap(byArray));
                bkn_2 bkn_22 = new bkn_2(fhe_02);
                bkn_22.a(l);
                try {
                    exi_2 exi_22;
                    Object r2;
                    object2 = AT.a(byArray2);
                    object = ((AT)object2).e();
                    bkn_22.a(((bl_0)object).p());
                    bkn_22.b(((bl_0)object).k());
                    for (AY generatedMessageV3 : ((bl_0)object).l()) {
                        if (generatedMessageV3.e() == bq_0.b) {
                            r2 = eyo_1.g().d(bog_0.b.b());
                            exi_22 = new exi_2((ezr_0)r2);
                            bkn_22.a(exi_22);
                            bkn_22.a((int)generatedMessageV3.g());
                            continue;
                        }
                        if (generatedMessageV3.e() == bq_0.c) {
                            r2 = eyo_1.g().d(bog_0.c.b());
                            exi_22 = new exi_2((ezr_0)r2);
                            exi_22.a((short)generatedMessageV3.g());
                            bkn_22.c(exi_22);
                            continue;
                        }
                        if (generatedMessageV3.e() != bq_0.d) continue;
                        r2 = eyo_1.g().d(bog_0.d.b());
                        exi_22 = new exi_2((ezr_0)r2);
                        exi_22.a((short)generatedMessageV3.g());
                        bkn_22.d(exi_22);
                    }
                    for (bc_0 bc_02 : ((bl_0)object).g()) {
                        r2 = eyo_1.g().d(bc_02.c());
                        exi_22 = new exi_2((ezr_0)r2);
                        exi_22.a((short)bc_02.e().g());
                        bkn_22.b(exi_22);
                    }
                }
                catch (InvalidProtocolBufferException invalidProtocolBufferException) {
                    a.error((Object)"Problem unserializing rewards data");
                }
                cWc.a().a(bkn_22);
                object2 = fis_1.a().e("battlegroundView");
                if (object2 instanceof bkn_2 && ((bkn_2)(object = (bkn_2)object2)).f().a() == fhe_02.a()) {
                    fis_1.a().a("battlegroundView", bkn_22);
                }
                azu_0.j().a(cWc.a());
                return false;
            }
            case 12465: {
                cxo_2 cxo_22 = (cxo_2)adt_12;
                cxj_2.a.b(cxo_22.b());
                return false;
            }
            case 12918: {
                cxi_2 cxi_22 = (cxi_2)adt_12;
                Optional<fhe_0> optional = cxj_2.a.b();
                if (optional.isPresent()) {
                    fhe_0 fhe_03 = optional.get();
                    if (cxi_22.b()) {
                        fhe_03.d(cxi_22.c());
                    } else {
                        fhe_03.b(cxi_22.c());
                    }
                }
                return false;
            }
            case 12975: {
                cxp_2 cxp_22 = (cxp_2)adt_12;
                Optional<fhe_0> optional = cxj_2.a.c();
                if (optional.isEmpty()) {
                    return false;
                }
                fhe_0 fhe_04 = optional.get();
                if (fhe_04.a() != cxp_22.b()) {
                    return false;
                }
                fhe_04.b(cxp_22.c());
                fhe_04.d(cxp_22.d());
                fhe_04.a(cxp_22.e());
                fhe_04.b(cxp_22.f());
                cWe.a().c();
                return false;
            }
        }
        return true;
    }

    private void a(cxk_2 cxk_22) {
        cxj_2.a.a(cxk_22.b());
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
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
    }

    public void a() {
        cAh cAh2 = new cAh(azu_0.j().k().a_());
        azu_0.j().K().c(cAh2);
    }
}

