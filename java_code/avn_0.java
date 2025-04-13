/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aVN
 */
public class avn_0
extends aXj {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    private final int f;
    private final String[] g;

    public avn_0(int n, String ... stringArray) {
        this.f = n;
        this.g = (String[])stringArray.clone();
    }

    @Override
    public boolean a() {
        switch (this.f) {
            case 0: 
            case 1: {
                return this.g.length == 0;
            }
            case 2: 
            case 3: 
            case 4: {
                return this.g.length == 1;
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
            switch (this.f) {
                case 0: {
                    avn_0.d();
                    break;
                }
                case 1: {
                    avn_0.c();
                    break;
                }
                case 2: {
                    avn_0.c(Integer.parseInt(this.g[0]));
                    break;
                }
                case 3: {
                    avn_0.b(Integer.parseInt(this.g[0]));
                    break;
                }
                case 4: {
                    avn_0.a(Integer.parseInt(this.g[0]));
                }
            }
        }
        catch (Exception exception) {
            aVo.a().d("Probl\u00e8me d'une commande" + exception);
        }
    }

    private static void a(int n) {
        bkp_1.y = n * 1000;
        avn_0.a("New specific popup delay = " + bkp_1.y + " ms");
    }

    private static void b(int n) {
        bkp_1.x = n * 1000;
        avn_0.a("New global popup delay = " + bkp_1.x + " ms");
    }

    private static void c(int n) {
        bkp_1.w = n * 1000;
        avn_0.a("New first popup delay = " + bkp_1.w + " ms");
    }

    private static void c() {
        ((bvx_0)ans_0.D().h()).a((agp_0)bWe.ay, 0L);
        avn_0.a("Last notification timer reset");
    }

    private static void d() {
        avn_0.a("boosterPackNotice|bpn ('help'|'h') : display command help");
        avn_0.a("boosterPackNotice|bpn ('resetGlobalLastNotification'|'reset') : cancel last notification timer");
        avn_0.a("boosterPackNotice|bpn ('changeDelayBeforeFirstPopup'|'cdf') newDelay : change the delay (newDelay in seconds) for the first popup after a new session");
        avn_0.a("boosterPackNotice|bpn ('changePopupSpecificDelay'|'csd') newDelay : change the delay (newDelay in seconds) between two popup of the same type");
        avn_0.a("boosterPackNotice|bpn ('changePopupGlobalDelay'|'cgd') newDelay : change the delay (newDelay in seconds) between two popups");
    }
}

