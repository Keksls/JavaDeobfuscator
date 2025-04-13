/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aVR
 */
public class avr_0
extends aXj {
    public static final int a = 1;
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
    public static final int o = 15;
    private final int p;
    private final String[] q;

    public avr_0(int n, String ... stringArray) {
        this.p = n;
        this.q = stringArray;
    }

    @Override
    public boolean a() {
        switch (this.p) {
            case 1: {
                return this.q.length == 1;
            }
            case 2: {
                return this.q.length == 0;
            }
            case 3: {
                return this.q.length == 1;
            }
            case 4: {
                return this.q.length == 7 || this.q.length == 9;
            }
            case 5: {
                return this.q.length == 1;
            }
            case 6: {
                return this.q.length == 2;
            }
            case 7: {
                return this.q.length == 2;
            }
            case 8: {
                return this.q.length == 3;
            }
            case 9: {
                return this.q.length == 2;
            }
            case 10: {
                return this.q.length == 1;
            }
            case 11: {
                return this.q.length == 4 || this.q.length == 6 || this.q.length == 2;
            }
            case 12: {
                return this.q.length == 2;
            }
            case 13: {
                return this.q.length == 2;
            }
            case 14: {
                return this.q.length == 4 || this.q.length == 6;
            }
            case 15: {
                return this.q.length == 1;
            }
        }
        return false;
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        try {
            switch (this.p) {
                case 1: {
                    this.n(aaw_22);
                    break;
                }
                case 5: {
                    this.k(aaw_22);
                    break;
                }
                case 2: {
                    this.c();
                    break;
                }
                case 3: {
                    this.m(aaw_22);
                    break;
                }
                case 4: {
                    this.l(aaw_22);
                    break;
                }
                case 6: {
                    this.j(aaw_22);
                    break;
                }
                case 7: {
                    this.i(aaw_22);
                    break;
                }
                case 8: {
                    this.h(aaw_22);
                    break;
                }
                case 9: {
                    this.g(aaw_22);
                    break;
                }
                case 10: {
                    this.f(aaw_22);
                    break;
                }
                case 11: {
                    this.e(aaw_22);
                    break;
                }
                case 12: {
                    this.c(aaw_22);
                    break;
                }
                case 13: {
                    this.d(aaw_22);
                    break;
                }
                case 14: {
                    this.b(aaw_22);
                    break;
                }
                case 15: {
                    this.a(aaw_22);
                }
            }
        }
        catch (Exception exception) {
            aVo.a().d("Probl\u00e8me lors de l'execution d'une commande de calendrier " + exception);
        }
    }

    private void a(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)6);
        pt.a((short)332);
        pt.a(Integer.parseInt(this.q[0]));
        aaw_22.c(pt);
    }

    private void b(aaw_2 aaw_22) {
        long l = Long.parseLong(this.q[0]);
        wt_0 wt_02 = null;
        if (this.q.length == 6) {
            wt_02 = new wt_0(0, Integer.parseInt(this.q[5]), Integer.parseInt(this.q[4]), Integer.parseInt(this.q[1]), Integer.parseInt(this.q[2]), Integer.parseInt(this.q[3]));
        } else if (this.q.length == 4) {
            wt_02 = new wt_0(0, 0, 0, Integer.parseInt(this.q[1]), Integer.parseInt(this.q[2]), Integer.parseInt(this.q[3]));
        }
        eLo eLo2 = bvs_2.a().a(l);
        if (eLo2 != null) {
            bvs_2.a().a(l, wt_02);
            czs_2 czs_22 = new czs_2();
            czs_22.a(wt_02);
            czs_22.a(l);
            aaw_22.c(czs_22);
        } else {
            aVo.a().d("Evenement " + l + " inconnu");
        }
    }

    private void c(aaw_2 aaw_22) {
        long l = Long.parseLong(this.q[0]);
        String string = this.q[1];
        eLo eLo2 = bvs_2.a().a(l);
        if (eLo2 != null) {
            eLo2.b(string);
            czp_1 czp_12 = new czp_1();
            czp_12.a(string);
            czp_12.a(l);
            aaw_22.c(czp_12);
        } else {
            aVo.a().d("Evenement " + l + " inconnu");
        }
    }

    private void d(aaw_2 aaw_22) {
        long l = Long.parseLong(this.q[0]);
        String string = this.q[1];
        eLo eLo2 = bvs_2.a().a(l);
        if (eLo2 != null) {
            eLo2.a(string);
            czt_2 czt_22 = new czt_2();
            czt_22.a(string);
            czt_22.a(l);
            aaw_22.c(czt_22);
        } else {
            aVo.a().d("Evenement " + l + " inconnu");
        }
    }

    private void e(aaw_2 aaw_22) {
        long l = Long.parseLong(this.q[0]);
        wt_0 wt_02 = null;
        if (this.q.length == 6) {
            wt_02 = new wt_0(0, Integer.parseInt(this.q[5]), Integer.parseInt(this.q[4]), Integer.parseInt(this.q[1]), Integer.parseInt(this.q[2]), Integer.parseInt(this.q[3]));
        } else if (this.q.length == 4) {
            wt_02 = new wt_0(0, 0, 0, Integer.parseInt(this.q[1]), Integer.parseInt(this.q[2]), Integer.parseInt(this.q[3]));
        } else if (this.q.length == 2 && this.q[1].equals("-1")) {
            wt_02 = null;
        }
        eLo eLo2 = bvs_2.a().a(l);
        if (eLo2 != null) {
            eLo2.b(wt_02);
            czq_2 czq_22 = new czq_2();
            czq_22.a(wt_02);
            czq_22.a(l);
            aaw_22.c(czq_22);
        } else {
            aVo.a().d("Evenement " + l + " inconnu");
        }
    }

    private void f(aaw_2 aaw_22) {
        byte by = Byte.parseByte(this.q[0]);
        switch (by) {
            case 0: {
                bvs_2.a().d();
                break;
            }
            default: {
                bvs_2.a().b(by);
            }
        }
        czl_1 czl_12 = new czl_1();
        czl_12.a(by);
        aaw_22.c(czl_12);
    }

    private void g(aaw_2 aaw_22) {
        czk_1 czk_12 = new czk_1();
        czk_12.a(Long.parseLong(this.q[0]));
        czk_12.a(this.q[1]);
        aaw_22.c(czk_12);
    }

    private void h(aaw_2 aaw_22) {
        czr_2 czr_22 = new czr_2();
        czr_22.a(Long.parseLong(this.q[0]));
        czr_22.a(Byte.parseByte(this.q[1]));
        czr_22.b(Byte.parseByte(this.q[2]));
        aaw_22.c(czr_22);
    }

    private void i(aaw_2 aaw_22) {
        czv_2 czv_22 = new czv_2();
        czv_22.b(Long.parseLong(this.q[0]));
        czv_22.a(Long.parseLong(this.q[1]));
        aaw_22.c(czv_22);
    }

    private void j(aaw_2 aaw_22) {
        czw_2 czw_22 = new czw_2();
        czw_22.b(Long.parseLong(this.q[0]));
        czw_22.a(Long.parseLong(this.q[1]));
        aaw_22.c(czw_22);
    }

    private void k(aaw_2 aaw_22) {
        czu_2 czu_22 = new czu_2();
        czu_22.a(Long.parseLong(this.q[0]));
        aaw_22.c(czu_22);
    }

    private void l(aaw_2 aaw_22) {
        czi_1 czi_12 = new czi_1();
        bmr_1 bmr_12 = azu_0.j().k();
        eLo eLo2 = this.q.length == 7 ? new eLo(this.q[0], this.q[1], bmr_12.a_(), Byte.parseByte(this.q[2]), Byte.parseByte(this.q[3]), Byte.parseByte(this.q[4]), Byte.parseByte(this.q[5]), Short.parseShort(this.q[6])) : new eLo(this.q[0], this.q[1], bmr_12.a_(), Byte.parseByte(this.q[2]), Byte.parseByte(this.q[3]), Byte.parseByte(this.q[4]), Byte.parseByte(this.q[5]), Short.parseShort(this.q[6]), Byte.parseByte(this.q[7]), Byte.parseByte(this.q[8]));
        czi_12.a(eLo2);
        eLo2.a(bmr_12.a_(), bmr_12.dp());
        bvs_2.a().a(eLo2);
        aaw_22.c(czi_12);
    }

    private void m(aaw_2 aaw_22) {
        czo_1 czo_12 = new czo_1();
        czo_12.a(Long.parseLong(this.q[0]));
        aaw_22.c(czo_12);
    }

    private void c() {
        bvs_2.a().g();
    }

    private void n(aaw_2 aaw_22) {
        czn_1 czn_12 = new czn_1();
        czn_12.a(Long.parseLong(this.q[0]));
        aaw_22.c(czn_12);
    }
}

