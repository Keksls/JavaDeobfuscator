/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;
import java.util.stream.Collectors;

/*
 * Renamed from aWa
 */
public final class awa_0
extends aXj {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    private final int h;
    private final String[] i;

    public awa_0(int n, String ... stringArray) {
        this.h = n;
        this.i = stringArray;
    }

    @Override
    public boolean a() {
        switch (this.h) {
            case 1: {
                return this.i.length == 1;
            }
            case 2: {
                return this.i.length == 1 || this.i.length == 0;
            }
            case 3: {
                return this.i.length == 2;
            }
            case 0: 
            case 4: 
            case 5: 
            case 6: {
                return true;
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
            switch (this.h) {
                case 1: {
                    this.a(aaw_22);
                    break;
                }
                case 2: {
                    this.b(aaw_22);
                    break;
                }
                case 4: {
                    awa_0.c(aaw_22);
                    break;
                }
                case 3: {
                    this.d(aaw_22);
                    break;
                }
                case 5: {
                    awa_0.c();
                    break;
                }
                case 6: {
                    awa_0.e(aaw_22);
                    break;
                }
                case 0: {
                    awa_0.d();
                }
            }
        }
        catch (Exception exception) {
            aVo.a().d("Error while executing a craft command: " + exception);
        }
    }

    private static void c() {
        String string = ecn_0.a.a().stream().map(ect_02 -> String.format("- %s : %s", brt_1.a(ect_02.a()), ect_02.a())).sorted(Comparator.comparing(Cz::e)).collect(Collectors.joining(System.lineSeparator()));
        awa_0.a("===== Crafts names and ids =====" + System.lineSeparator());
        awa_0.a(string + "\n");
    }

    private static void d() {
        String string = System.lineSeparator();
        awa_0.a("(--list | -l) : list all jobs names and ids" + string + "(--learn | -l) <craft_id> : learn the job" + string + "(--unlearn | -ul) <craft_id> : unlearn the job" + string + "(--unlearn-all | -ula) : unlearn all jobs" + string + "(--addXp | -ax) <craft_id> + <xp> : add or remove xp from a job" + string + "(--max) : learn all crafts and xp them to lvl 200" + string);
    }

    private void a(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)290);
        pt.a(Integer.parseInt(this.i[0]));
        aaw_22.c(pt);
    }

    private void b(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)56);
        pt.a(this.i.length == 0 ? -1 : Integer.parseInt(this.i[0]));
        aaw_22.c(pt);
    }

    private static void c(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)418);
        aaw_22.c(pt);
    }

    private void d(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)211);
        pt.a(Integer.parseInt(this.i[0]));
        pt.a(Long.parseLong(this.i[1]));
        aaw_22.c(pt);
    }

    private static void e(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)401);
        aaw_22.c(pt);
    }
}

