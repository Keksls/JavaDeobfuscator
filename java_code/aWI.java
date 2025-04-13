/*
 * Decompiled with CFR 0.152.
 */
public final class aWI
extends aXj {
    public static final int a = 0;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    public static final int e = 5;
    public static final int f = 6;
    public static final int g = 7;
    public static final int h = 8;
    public static final int i = 9;
    public static final int j = 10;
    public static final int k = 11;
    public static final int l = 12;
    public static final int m = 13;
    public static final int n = 14;
    public static final int o = 16;
    public static final int p = 17;
    public static final int q = 18;
    public static final int r = 19;
    public static final int s = 20;
    private final int t;
    private final String[] u;

    public aWI(int n, String ... stringArray) {
        this.t = n;
        this.u = (String[])stringArray.clone();
    }

    @Override
    public boolean a() {
        switch (this.t) {
            case 7: {
                return this.u.length == 0 || this.u.length == 1;
            }
            case 3: 
            case 9: 
            case 12: 
            case 17: {
                return this.u.length == 0;
            }
            case 0: 
            case 2: 
            case 4: 
            case 5: 
            case 6: 
            case 8: 
            case 10: 
            case 11: 
            case 13: 
            case 14: 
            case 18: 
            case 19: {
                return this.u.length == 1;
            }
            case 16: {
                return this.u.length == 2;
            }
            case 20: {
                return this.u.length == 3;
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
        bmr_1 bmr_12 = azu_0.j().k();
        try {
            block1 : switch (this.t) {
                case 12: {
                    aWI.c();
                    break;
                }
                case 16: {
                    this.a(aaw_22);
                    break;
                }
                case 17: {
                    this.d();
                    break;
                }
                case 18: {
                    this.l(aaw_22);
                    break;
                }
                case 7: {
                    this.g(aaw_22);
                    break;
                }
                case 19: {
                    this.m(aaw_22);
                    break;
                }
                case 20: {
                    this.n(aaw_22);
                    break;
                }
                default: {
                    if (bmr_12.eV().d() <= 0L) {
                        aVo.a().d("Il faut avoir une guilde!");
                        return;
                    }
                    switch (this.t) {
                        case 0: {
                            this.k(aaw_22);
                            break block1;
                        }
                        case 2: {
                            this.o(aaw_22);
                            break block1;
                        }
                        case 3: {
                            aWI.p(aaw_22);
                            break block1;
                        }
                        case 4: {
                            this.j(aaw_22);
                            break block1;
                        }
                        case 5: {
                            this.i(aaw_22);
                            break block1;
                        }
                        case 6: {
                            this.h(aaw_22);
                            break block1;
                        }
                        case 8: {
                            this.f(aaw_22);
                            break block1;
                        }
                        case 9: {
                            aWI.e();
                            break block1;
                        }
                        case 10: {
                            this.e(aaw_22);
                            break block1;
                        }
                        case 11: {
                            this.d(aaw_22);
                            break block1;
                        }
                        case 13: {
                            this.c(aaw_22);
                            break block1;
                        }
                        case 14: {
                            this.b(aaw_22);
                        }
                    }
                    break;
                }
            }
        }
        catch (Exception exception) {
            aVo.a().d("Probl\u00e8me d'une commande" + exception);
        }
    }

    private static void c() {
        aWI.a("guild ('help'|'h') : display command help");
        aWI.a("guild ('point'|'p'|'pt') delta : give delta guild points");
        aWI.a("guild 'money' delta : give delta money");
        aWI.a("guild 'stats' : show guild stats");
        aWI.a("guild ('addBonus'|'ab') bonusId : unlock bonus");
        aWI.a("guild ('setLearningFactor'|'slf') factor : modify learning bonus speed");
        aWI.a("guild ('setMaxSimultaneous' | 'sms') max : modify maximum simultaneous bonus learning");
        aWI.a("guild 'id' : show guild id");
        aWI.a("guild 'id' \"guild name\": show guild id for the guild with this name");
        aWI.a("guild ('maxPerWeek' | 'mpw') maxPerWeek : modify guild points limit per week");
        aWI.a("guild ('pointEarnedFactor' | 'pef') factor : modify point gain ratio");
        aWI.a("guild 'info' :  show guild info");
        aWI.a("guild ('setLevel' | 'sl') level : modify guild level");
        aWI.a("guild ('changeMessage' | 'cm') \"message\" : modify guild message");
        aWI.a("guild ('changeDescription' | 'cd') \"desc\" : modify guild description");
        aWI.a("guild ('changeName' | 'cn') guildId \"newName\" : modify a guild name");
        aWI.a("guild ('create' | 'cr') : open guild creator ui");
        aWI.a("guild ('inviteTo' | 'it') guildId : sends an invite to join \"guildId\"");
        aWI.a("guild ('getRanks' | 'ranks') guildId : show ranks from the given \"guildId\"");
        aWI.a("guild ('setRank' | 'sr') characterId guildId rankId : change the rank of the given player of the given guild");
    }

    private void d() {
        if (!azu_0.j().c(cZl.a())) {
            bDp bDp2 = new bDp();
            bDn bDn2 = (bDn)bDp2.a();
            cZl.a().a(bDn2, byi_1.a);
        }
    }

    private void a(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)6);
        pt.a((short)112);
        pt.a(Integer.parseInt(this.u[0]));
        pt.a(this.u[1]);
        aaw_22.c(pt);
    }

    private void b(aaw_2 aaw_22) {
        String string = this.u[0];
        cza_1 cza_12 = new cza_1(string);
        aaw_22.c(cza_12);
    }

    private void c(aaw_2 aaw_22) {
        String string = this.u[0];
        czc_1 czc_12 = new czc_1(string);
        aaw_22.c(czc_12);
    }

    private void d(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)6);
        pt.a((short)9);
        pt.a(Integer.parseInt(this.u[0]));
        aaw_22.c(pt);
    }

    private void e(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)6);
        pt.a((short)378);
        float f2 = Float.parseFloat(this.u[0]);
        pt.a(f2);
        aaw_22.c(pt);
        erg_1 erg_12 = byp_2.a().h();
        if (erg_12 == null) {
            aVo.a().d("Il faut avoir les infos de la guilde pour mettre le facteur a jour dans le client");
            return;
        }
        erg_12.q().b(f2);
    }

    private static void e() {
        erg_1 erg_12 = byp_2.a().h();
        if (erg_12 == null) {
            aVo.a().d("Il faut avoir les infos de la guilde pour mettre le facteur a jour dans le client");
            return;
        }
        aWI.a("Total de point : " + erg_12.k());
        aWI.a("Points actuels : " + erg_12.j());
        aWI.a("Limite de points par semaine : " + erg_12.r());
        aWI.a("Points gagn\u00e9s cette semaine : " + erg_12.s());
    }

    private void f(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)6);
        pt.a((short)315);
        int n = Integer.parseInt(this.u[0]);
        pt.a(n);
        aaw_22.c(pt);
        erg_1 erg_12 = byp_2.a().h();
        if (erg_12 == null) {
            aVo.a().d("Il faut avoir les infos de la guilde pour mettre le facteur a jour dans le client");
            return;
        }
        new eQk(erg_12).f(n);
    }

    private void g(aaw_2 aaw_22) {
        if (this.u.length > 0) {
            String string = this.u[0];
            Pt pt = new Pt();
            pt.a((byte)6);
            pt.a((short)185);
            pt.a(string);
            aaw_22.c(pt);
        } else {
            bmr_1 bmr_12 = azu_0.j().k();
            if (bmr_12.eV().d() <= 0L) {
                aVo.a().d("Il faut avoir une guilde!");
                return;
            }
            aWI.a("Id de la guilde : " + bmr_12.eV().d());
        }
    }

    private void h(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)6);
        pt.a((short)329);
        int n = Integer.parseInt(this.u[0]);
        pt.a(n);
        aaw_22.c(pt);
        erg_1 erg_12 = byp_2.a().h();
        if (erg_12 == null) {
            aVo.a().d("Il faut avoir les infos de la guilde pour mettre le facteur a jour dans le client");
            return;
        }
        erg_12.q().a(n);
    }

    private void i(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)6);
        pt.a((short)261);
        float f2 = Float.parseFloat(this.u[0]);
        pt.a(f2);
        aaw_22.c(pt);
        erg_1 erg_12 = byp_2.a().h();
        if (erg_12 == null) {
            aVo.a().d("Il faut avoir les infos de la guilde pour mettre le facteur a jour dans le client");
            return;
        }
        erg_12.q().a(f2);
    }

    private void j(aaw_2 aaw_22) {
        czy_2 czy_22 = new czy_2(Integer.parseInt(this.u[0]));
        aaw_22.c(czy_22);
    }

    private void k(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)6);
        pt.a((short)82);
        pt.a(Integer.parseInt(this.u[0]));
        aaw_22.c(pt);
    }

    private void l(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)6);
        pt.a((short)416);
        pt.a(Integer.parseInt(this.u[0]));
        aaw_22.c(pt);
    }

    private void m(aaw_2 aaw_22) {
        int n = Integer.parseInt(this.u[0]);
        Pt pt = new Pt();
        pt.a((byte)6);
        pt.a((short)467);
        pt.a(n);
        aaw_22.c(pt);
    }

    private void n(aaw_2 aaw_22) {
        long l = Long.parseLong(this.u[0]);
        int n = Integer.parseInt(this.u[1]);
        long l2 = Long.parseLong(this.u[2]);
        Pt pt = new Pt();
        pt.a((byte)6);
        pt.a((short)142);
        pt.a(l);
        pt.a(n);
        pt.a(l2);
        aaw_22.c(pt);
    }

    private void o(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)6);
        pt.a((short)388);
        pt.a(Long.parseLong(this.u[0]));
        aaw_22.c(pt);
    }

    private static void p(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)6);
        pt.a((short)225);
        aaw_22.c(pt);
    }
}

