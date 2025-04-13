/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class aVM
extends aXj {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    private final int i;
    private final String[] j;

    public aVM(int n, String ... stringArray) {
        this.i = n;
        this.j = (String[])stringArray.clone();
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        Pt pt = new Pt();
        switch (this.i) {
            case 0: {
                aVM.d();
                break;
            }
            case 1: {
                pt.a((short)125);
                if (this.j.length == 1) {
                    pt.a(true);
                    pt.a(Integer.parseInt(this.j[0]));
                } else {
                    pt.a(false);
                    pt.a(azu_0.j().k().bO());
                }
                pt.a((byte)6);
                aaw_22.c(pt);
                break;
            }
            case 2: {
                pt.a((short)204);
                pt.a(Integer.parseInt(this.j[0]));
                pt.a((byte)6);
                aaw_22.c(pt);
                break;
            }
            case 3: {
                pt.a((short)226);
                pt.a((byte)6);
                aaw_22.c(pt);
                break;
            }
            case 4: {
                pt.a((short)423);
                pt.a((byte)3);
                aaw_22.c(pt);
                break;
            }
            case 5: {
                pt.a((short)398);
                pt.a((byte)3);
                aaw_22.c(pt);
                break;
            }
            case 6: {
                this.c();
                break;
            }
            case 7: {
                pt.a((short)492);
                pt.a((byte)6);
                aaw_22.c(pt);
            }
        }
    }

    private void c() {
        if (this.j.length > 0) {
            int n = Integer.parseInt(this.j[0]);
            Optional<fhc_0> optional = fhd_0.a.a(n);
            if (optional.isPresent()) {
                aVM.a(optional.get());
            } else {
                aVM.a("No battleground data for id " + n);
            }
        } else {
            for (fhc_0 fhc_02 : fhd_0.a.a()) {
                aVM.a(fhc_02);
            }
        }
    }

    private static void a(fhc_0 fhc_02) {
        StringBuilder stringBuilder = new StringBuilder(String.format("%2d", fhc_02.a()));
        stringBuilder.append(' ').append(bae.h().a(66, (long)fhc_02.b(), new Object[0]));
        stringBuilder.append(" Level=");
        for (fhi object : fhc_02.d()) {
            stringBuilder.append(object.a()).append(", ");
        }
        stringBuilder.append(" Gameplay=");
        for (fhh fhh2 : fhc_02.c()) {
            stringBuilder.append(fhh2.a()).append(", ");
        }
        aVM.a(stringBuilder.toString());
    }

    private static void d() {
        aVM.a("start : if it exists, starts the battleground of the current territory");
        aVM.a("start <bgId> : starts battleground with the given id");
        aVM.a("stop <bgId> : closes battleground with the given id");
        aVM.a("dailylist | dlist : generates or gives battleground list for today");
        aVM.a("close : ends and closes the battleground you're visiting");
        aVM.a("serverlist | slist : gives the list of battleground existing on this game server");
        aVM.a("data | data <id> : gives the gameplay data for one or all territory");
        aVM.a("simulate | sim : generates a (false) list of battleground without incidence on the current list");
    }
}

