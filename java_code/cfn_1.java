/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  org.apache.log4j.Logger
 */
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.log4j.Logger;

/*
 * Renamed from cfN
 */
public class cfn_1
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(cfn_1.class);
    private static final cfn_1 b = new cfn_1();
    private static final ceq_2 c = daX.a.g();

    public static cfn_1 a() {
        return b;
    }

    private cfn_1() {
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 346: {
                pu_0 pu_02 = (pu_0)adt_12;
                if (pu_02.e()) {
                    cfn_1.a(pu_02.c());
                }
                return true;
            }
            case 309: {
                pv_0 pv_02 = (pv_0)adt_12;
                short s2 = pv_02.b();
                switch (s2) {
                    case 96: {
                        nU nU2;
                        short s3 = pv_02.h();
                        if (s3 == 0) {
                            cfn_1.a("No players found");
                            return false;
                        }
                        short s4 = pv_02.h();
                        flz_0 flz_02 = flz_0.a(pv_02.f());
                        try {
                            nU2 = nU.a(pv_02.j());
                        }
                        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
                            a.error((Object)"[Moderation] Error while parsing ProtoPlayerInfos in moderation panel", (Throwable)invalidProtocolBufferException);
                            return false;
                        }
                        cfn_1.a(flz_02, nU2, s3, s4);
                        break;
                    }
                    case 213: {
                        c.g(pv_02.c());
                        return false;
                    }
                    case 218: {
                        int n = pv_02.d();
                        ArrayList<String> arrayList = new ArrayList<String>();
                        for (int k = 0; k < n; ++k) {
                            arrayList.add(pv_02.c());
                        }
                        c.a(arrayList);
                        return false;
                    }
                    case 377: {
                        int n = pv_02.f();
                        ArrayList<fjy_0> arrayList = new ArrayList<fjy_0>();
                        for (int k = 0; k < n; ++k) {
                            arrayList.add(fjy_0.a(pv_02.f()));
                        }
                        c.a((Collection<fjy_0>)arrayList);
                        return false;
                    }
                    case 140: {
                        daX.a.g().c().a(pv_02.c());
                        return false;
                    }
                    case 363: {
                        boolean bl = pv_02.e();
                        if (bl) {
                            try {
                                c.a(cei_2.a(pv_02.j()));
                            }
                            catch (InvalidProtocolBufferException invalidProtocolBufferException) {
                                cfn_1.a("[ERROR] Error while retrieving guild infos, contact a dev with your logs");
                                a.error((Object)"Cannot parse guild infos from message", (Throwable)invalidProtocolBufferException);
                                return false;
                            }
                            c.a(ceo_2.c);
                        } else {
                            cfn_1.a("[ERROR] " + pv_02.c());
                        }
                        return false;
                    }
                    case 178: {
                        boolean bl = pv_02.e();
                        String string = pv_02.c();
                        cfn_1.a((bl ? "" : "[ERROR] ") + string);
                    }
                }
                break;
            }
            case 22588: {
                cbq_0 cbq_02 = (cbq_0)adt_12;
                daX.a.a(cbq_02.b());
                return false;
            }
            case 23427: {
                cbp_0 cbp_02 = (cbp_0)adt_12;
                daX.a.a(cbp_02.b());
                daX.a.g().a(false);
                fis_1.a().a((ajf_1)daX.a.g(), "penalFile", "penalFileUiTitle", "isPenalFileLoading");
                return false;
            }
            case 23590: {
                cbr_0 cbr_02 = (cbr_0)adt_12;
                daX.a.a(cbr_02.b(), cbr_02.c());
            }
        }
        return true;
    }

    private static void a(flz_0 flz_02, nU nU2, short s2, short s3) {
        switch (flz_02) {
            case b: {
                if (s3 == 0) {
                    c.f();
                }
                c.h(nU2.c());
                daX.a.g().e(nU2.c());
                if (s2 != 1 && !nU2.j()) break;
                daX.a.g().f(nU2.c());
                break;
            }
            case a: {
                c.c().a(nU2);
                if (nU2.v() <= 0L) break;
                daX.c((short)140, nU2.v());
                break;
            }
            case c: {
                if (!c.c().b().equals(nU2.c())) break;
                c.c().b(nU2);
            }
        }
    }

    public static void a(String string) {
        wu_0 wu_02 = wn_0.a.a();
        String string2 = "[" + wu_02.k() + ":" + wu_02.l() + "] ";
        daX.a.g().i(string2 + string);
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

