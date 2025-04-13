/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.EnumSet;
import org.apache.log4j.Logger;

/*
 * Renamed from aYE
 */
public class aye_0
extends aXj {
    private static final Logger n = Logger.getLogger(aye_0.class);
    public static final byte a = 0;
    public static final byte b = 1;
    public static final byte c = 2;
    public static final byte d = 3;
    public static final byte e = 4;
    public static final byte f = 5;
    public static final byte g = 6;
    public static final byte h = 7;
    public static final byte i = 8;
    public static final byte j = 9;
    public static final byte k = 10;
    public static final byte l = 11;
    public static final byte m = 12;
    private final int o;
    private final String[] p;

    public aye_0(int n, String ... stringArray) {
        this.o = n;
        this.p = (String[])stringArray.clone();
    }

    @Override
    public boolean a() {
        switch (this.o) {
            case 0: 
            case 1: 
            case 4: 
            case 7: 
            case 8: 
            case 12: {
                return this.p.length == 0;
            }
            case 2: 
            case 3: {
                return this.p.length == 0 || this.p.length == 1;
            }
            case 5: 
            case 6: 
            case 9: 
            case 10: 
            case 11: {
                return this.p.length == 1;
            }
        }
        return false;
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9!");
            return;
        }
        try {
            switch (this.o) {
                case 0: {
                    aye_0.o();
                    return;
                }
                case 1: {
                    aye_0.n();
                    return;
                }
                case 2: {
                    this.m();
                    return;
                }
                case 3: {
                    this.l();
                    return;
                }
                case 4: {
                    aye_0.k();
                    return;
                }
                case 5: {
                    this.j();
                    return;
                }
                case 6: {
                    this.i();
                    return;
                }
                case 7: {
                    aye_0.h();
                    return;
                }
                case 8: {
                    aye_0.g();
                    return;
                }
                case 9: {
                    this.f();
                    return;
                }
                case 10: {
                    this.e();
                    return;
                }
                case 11: {
                    this.d();
                    return;
                }
                case 12: {
                    aye_0.c();
                    return;
                }
            }
        }
        catch (Exception exception) {
            n.error((Object)"Exception levee", (Throwable)exception);
        }
    }

    private static void c() {
        aye_0.a("Demande de mise a jour des donn\u00e9es d'abonnement");
        aaw_2 aaw_22 = azu_0.j().K();
        ckn_1 ckn_12 = new ckn_1(env_0.a.a());
        aaw_22.c(ckn_12);
    }

    private void d() {
        int n = Integer.parseInt(this.p[0]);
        enu_0 enu_02 = enu_0.a(n);
        if (enu_02 == null) {
            aye_0.a("Niveau de souscription inconnu");
            return;
        }
        aye_0.a("Droits pour le niveau d'abonnement " + enu_02.name());
        EnumSet<enw_0> enumSet = enu_02.b();
        for (enw_0 enw_02 : enumSet) {
            aye_0.a(enw_02.toString());
        }
    }

    private void e() {
        int n = Integer.parseInt(this.p[0]);
        bmr_1 bmr_12 = azu_0.j().k();
        enw_0 enw_02 = enw_0.a(n);
        if (enw_02 == null) {
            aye_0.a("Droit inconnu");
            return;
        }
        bmr_12.N_().b(enw_02);
        aye_0.a("Ajout du droit " + enw_02 + " pour le client seulement");
    }

    private void f() {
        aaw_2 aaw_22 = azu_0.j().K();
        Pt pt = new Pt();
        pt.a((byte)2);
        pt.a((short)313);
        pt.a(Integer.parseInt(this.p[0]));
        aaw_22.c(pt);
    }

    private static void g() {
        enw_0[] enw_0Array = enw_0.values();
        for (int k = 0; k < enw_0Array.length; ++k) {
            enw_0 enw_02 = enw_0Array[k];
            aye_0.a(enw_02.toString());
        }
    }

    private static void h() {
        bmr_1 bmr_12 = azu_0.j().k();
        aye_0.a(bmr_12.N_().toString());
    }

    private void i() {
        aaw_2 aaw_22 = azu_0.j().K();
        Pt pt = new Pt();
        pt.a((byte)2);
        pt.a((short)141);
        pt.a(Integer.parseInt(this.p[0]));
        aaw_22.c(pt);
    }

    private void j() {
        aaw_2 aaw_22 = azu_0.j().K();
        Pt pt = new Pt();
        pt.a((byte)2);
        pt.a((short)328);
        pt.a(Integer.parseInt(this.p[0]));
        aaw_22.c(pt);
    }

    private static void k() {
        enu_0[] enu_0Array = enu_0.values();
        for (int k = 0; k < enu_0Array.length; ++k) {
            enu_0 enu_02 = enu_0Array[k];
            aye_0.a(enu_02.toString());
        }
    }

    private void l() {
        aaw_2 aaw_22 = azu_0.j().K();
        Pt pt = new Pt();
        pt.a((byte)2);
        pt.a((short)499);
        if (this.p.length == 0) {
            pt.a(azu_0.j().k().U_());
        } else {
            pt.a(Long.parseLong(this.p[0]));
        }
        aaw_22.c(pt);
    }

    private void m() {
        aaw_2 aaw_22 = azu_0.j().K();
        Pt pt = new Pt();
        pt.a((byte)2);
        pt.a((short)232);
        if (this.p.length == 0) {
            pt.a(azu_0.j().k().U_());
        } else {
            pt.a(Long.parseLong(this.p[0]));
        }
        aaw_22.c(pt);
    }

    private static void n() {
        aaw_2 aaw_22 = azu_0.j().K();
        Pt pt = new Pt();
        pt.a((byte)2);
        pt.a((short)191);
        pt.a(azu_0.j().k().U_());
        aaw_22.c(pt);
    }

    private static void o() {
        aye_0.a("(subscriber | sub) (help | h) :  show full documentation");
        aye_0.a("(subscriber | sub) (serverStatus | ss) :  show account subscription type");
        aye_0.a("(subscriber | sub) on :  enable default subscription for this account");
        aye_0.a("(subscriber | sub) id on :  same for another account");
        aye_0.a("(subscriber | sub) off :  disable subscription for current account and set EU_FREE");
        aye_0.a("(subscriber | sub) id off :  same for another account");
        aye_0.a("(subscriber | sub) (showLevels | sl) :  show subscription levels");
        aye_0.a("(subscriber | sub) (showRights | sr) :  show subscription rights");
        aye_0.a("(subscriber | sub) (showSubscriptionRightsSet | ssrs) levelID :  show rights for a specified subscription level");
        aye_0.a("(subscriber | sub) (addRight | ar) rightId :  add subscription right for this session");
        aye_0.a("(subscriber | sub) (addRightInClient | arc) rightId :  same but only for the client");
        aye_0.a("(subscriber | sub) (removeRight | rr) rightId :  remove a right given for session");
        aye_0.a("(subscriber | sub) (setSubscriptionLevel | ssl) typeId :  change current subscription type");
        aye_0.a("(subscriber | sub) (showClientInfo | sci) :  show client info about subscription");
        aye_0.a("(subscriber | sub) (refreshSubscription | rs) :  update subscription");
    }
}

