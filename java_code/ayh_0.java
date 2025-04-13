/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Ints
 *  org.apache.log4j.Logger
 */
import com.google.common.primitives.Ints;
import org.apache.log4j.Logger;

/*
 * Renamed from aYH
 */
public final class ayh_0
extends aXj {
    private static final Logger n = Logger.getLogger(ayh_0.class);
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 5;
    public static final int e = 6;
    public static final int f = 7;
    public static final int g = 8;
    public static final int h = 9;
    public static final int i = 10;
    public static final int j = 11;
    public static final int k = 12;
    public static final int l = 13;
    public static final int m = 14;
    private final int o;
    private final String[] p;
    private String q;
    private String r;

    public ayh_0(int n, String ... stringArray) {
        this.o = n;
        this.p = (String[])stringArray.clone();
    }

    private static void c() {
        ayh_0.a("(systemConfiguration | sysConf) (help | h) : show full documentation");
        ayh_0.a("(systemConfiguration | sysConf) (playerLevelCap) \"value\" : set level cap to specified value");
        ayh_0.a("(systemConfiguration | sysConf) (clientPathScheduling' | cps) \"true|false\" : enable/disable path request optimisation");
        ayh_0.a("(systemConfiguration | sysConf) (show) \"target\" \"confKey\" : show confKey state in target server (target = world, game, connection or global)");
        ayh_0.a("(systemConfiguration | sysConf) (havenWorldLimit' | hwl) \"limit\" : set limit for simultaneous opened haven worlds");
        ayh_0.a("(systemConfiguration | sysConf) (havenWorldTtl' | hwttl) \"limit\" : set ttl for haven worlds");
        ayh_0.a("(systemConfiguration | sysConf) (havenWorldGameServer' | hwgs) \"gameId\" : set game server for haven worlds");
        ayh_0.a("(systemConfiguration | sysConf) (globalChat) \"true|false\" : set global chat enabled/disabled");
        ayh_0.a("(systemConfiguration | sysConf) (globalChatTradeDelay | gctd) \"valueInMs\" : set global chat delay for trade");
        ayh_0.a("(systemConfiguration | sysConf) (globalChatCommunityDelay | gccd) \"valueInMs\" : set global chat delay for trade");
        ayh_0.a("(systemConfiguration | sysConf) (globalChatRecruitmentDelay | gcrd) \"valueInMs\" : set global chat delay for trade");
        ayh_0.a("(systemConfiguration | sysConf) (modifyConf) \"propertyKey\" \"propertyValue\" : set system property by name. This command should only be used by a developer or with the approval of one.");
        ayh_0.a("(systemConfiguration | sysConf) (singleAccount | sa) \"true|false\" : set/unset the server as single account and single character");
        ayh_0.a("");
        ayh_0.a("Date syntax : dd/mm/yyyy hh:mm. Date can be added at the end of the command to time it later (or for a duration)");
    }

    @Override
    public boolean a() {
        switch (this.o) {
            case 0: {
                return this.p.length == 0;
            }
            case 1: {
                return this.p.length == 2;
            }
            case 5: 
            case 10: 
            case 11: 
            case 12: {
                return this.p.length >= 1 && Ints.tryParse((String)this.p[0]) != null;
            }
            case 2: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 14: {
                return this.p.length >= 1;
            }
            case 13: {
                return this.p.length >= 2;
            }
        }
        return false;
    }

    private void d() {
        switch (this.o) {
            case 2: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 14: {
                if (this.p.length >= 3) {
                    this.q = this.p[1];
                    this.r = this.p[2];
                }
                return;
            }
            case 13: {
                if (this.p.length >= 4) {
                    this.q = this.p[2];
                    this.r = this.p[3];
                }
                return;
            }
        }
    }

    private void a(short s2) {
        this.d();
        aaw_2 aaw_22 = azu_0.j().K();
        Pt pt = new Pt();
        pt.a((byte)2);
        pt.a(s2);
        pt.a(this.p[0]);
        if (s2 == 405) {
            pt.a(this.p[1]);
        }
        if (this.q != null && this.r != null) {
            wt_0 wt_02 = aXk.a(this.q);
            wt_0 wt_03 = aXk.a(this.r);
            if (wt_02 == null || wt_03 == null) {
                aVo.a().d("Syntax error in dates - try 'setBonusFactor help' and review your syntax");
                return;
            }
            pt.a(wt_02.h());
            pt.a(wt_03.h());
        }
        aaw_22.c(pt);
    }

    private void e() {
        aaw_2 aaw_22 = azu_0.j().K();
        Pt pt = new Pt();
        String string = this.p[0];
        if (string.equals("world")) {
            pt.a((byte)2);
        } else if (string.equals("global")) {
            pt.a((byte)6);
        } else if (string.equals("game")) {
            pt.a((byte)3);
        } else if (string.equals("connection")) {
            pt.a((byte)1);
        } else {
            ayh_0.a("Cible inconnue : (target = world, game, connection ou global)");
            return;
        }
        pt.a((short)20);
        pt.a(this.p[1]);
        aaw_22.c(pt);
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
                    ayh_0.c();
                    return;
                }
                case 1: {
                    this.e();
                    return;
                }
                case 5: {
                    this.a((short)188);
                    return;
                }
                case 2: {
                    this.a((short)170);
                    return;
                }
                case 6: {
                    this.a((short)355);
                    return;
                }
                case 7: {
                    this.a((short)426);
                    return;
                }
                case 8: {
                    this.a((short)221);
                    return;
                }
                case 9: {
                    this.a((short)410);
                    return;
                }
                case 10: {
                    this.a((short)385);
                    return;
                }
                case 11: {
                    this.a((short)199);
                    return;
                }
                case 12: {
                    this.a((short)297);
                    return;
                }
                case 13: {
                    this.a((short)405);
                    return;
                }
                case 14: {
                    this.a((short)400);
                    return;
                }
            }
        }
        catch (Exception exception) {
            n.error((Object)"Exception levee", (Throwable)exception);
        }
    }
}

