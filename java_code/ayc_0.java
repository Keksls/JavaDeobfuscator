/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from aYC
 */
public class ayc_0
extends aXj {
    private static final Logger i = Logger.getLogger(ayc_0.class);
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    private final int j;
    private final String[] k;

    public ayc_0(int n, String ... stringArray) {
        this.j = n;
        this.k = stringArray;
    }

    @Override
    public boolean a() {
        switch (this.j) {
            case 1: {
                return this.k.length == 0;
            }
            case 0: {
                return true;
            }
            case 2: 
            case 6: {
                return this.k.length == 1 || this.k.length == 2;
            }
            case 3: 
            case 7: {
                return this.k.length == 1;
            }
            case 4: {
                return this.k.length == 0;
            }
            case 5: {
                return this.k.length == 1;
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
            switch (this.j) {
                case 1: {
                    this.c();
                    break;
                }
                case 0: {
                    this.d();
                    break;
                }
                case 2: {
                    this.a(aaw_22, false);
                    break;
                }
                case 3: {
                    this.b(aaw_22, false);
                    break;
                }
                case 6: {
                    this.a(aaw_22, true);
                    break;
                }
                case 7: {
                    this.b(aaw_22, true);
                    break;
                }
                case 4: {
                    this.a(aaw_22);
                    break;
                }
                case 5: {
                    this.b(aaw_22);
                }
            }
        }
        catch (Exception exception) {
            aVo.a().d("Probl\u00e8me lors de l'execution d'une commande de calendrier " + exception);
        }
    }

    private void a(aaw_2 aaw_22) {
        bmr_1 bmr_12 = azu_0.j().k();
        boz_0 boz_02 = bmr_12.cy();
        aVo.a().a("effets : ");
        for (sd_0 sd_02 : boz_02) {
            try {
                Object EC = sd_02.k();
                int n = EC == null ? 0 : EC.G_();
                aVo.a().a("UID : " + sd_02.d() + ", " + sd_02.getClass().getSimpleName() + " (" + sd_02.bt_() + "), id effet : " + sd_02.f().i() + ", container type : " + eFl.a(n) + " (" + n + "), id container : " + this.a(sd_02));
            }
            catch (Exception exception) {
                i.error((Object)"Erreur lors de la recuperation d'un effet");
            }
        }
    }

    private void b(aaw_2 aaw_22) {
        bmr_1 bmr_12 = azu_0.j().k();
        boz_0 boz_02 = bmr_12.cy();
        int n = Integer.parseInt(this.k[0]);
        for (sd_0 sd_02 : boz_02) {
            try {
                if (sd_02.k() == null || sd_02.k().G_() != n) continue;
                aVo.a().a("UID : " + sd_02.d() + ", " + sd_02.getClass().getSimpleName() + " (" + sd_02.f().j() + "), id effet : " + sd_02.f().i() + ", container type : " + eFl.a(n) + " (" + n + "), id container : " + this.a(sd_02));
            }
            catch (Exception exception) {
                i.error((Object)"Erreur lors de la recuperation d'un effet");
            }
        }
    }

    private long a(sd_0 sd_02) {
        Object EC = sd_02.k();
        if (EC instanceof fio_0) {
            return ((fin_0)((fio_0)EC).r()).i();
        }
        if (EC instanceof exk_2) {
            return ((exk_2)EC).aT_();
        }
        if (EC instanceof fie_0) {
            return ((fie_0)EC).p();
        }
        if (EC instanceof ezf_1) {
            return ((ezf_1)EC).a().b();
        }
        return EC.aS_();
    }

    private void a(aaw_2 aaw_22, boolean bl) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)281);
        pt.a(bl);
        pt.b(Short.parseShort(this.k[0]));
        if (this.k.length == 2) {
            pt.b(Short.parseShort(this.k[1]));
        }
        aaw_22.c(pt);
    }

    private void b(aaw_2 aaw_22, boolean bl) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)257);
        pt.a(bl);
        pt.b(Short.parseShort(this.k[0]));
        aaw_22.c(pt);
    }

    private void c() {
        bmr_1 bmr_12 = azu_0.j().k();
        List<eja_0> list = bmr_12.cy().n();
        int n = list.size();
        for (int k = 0; k < n; ++k) {
            eja_0 eja_02 = list.get(k);
            aVo.a().a("UID : " + eja_02.d() + ", id Etat : " + eja_02.aF().p() + ", level : " + eja_02.aF().c() + ", remaining time in ms : " + eja_02.bo_() + " ms");
        }
    }

    private void d() {
        ayc_0.a("-show | -s : show current states");
        ayc_0.a("-showall | -sa : show current effects");
        ayc_0.a("(-showallof | -sao) containerID : show effects with a container type (state = 1, spell = 11, item = 12, aptitude = 17)");
        ayc_0.a("(-add | -a) Id level? : apply state. Level is at 1 by default");
        ayc_0.a("(-remove | -r) Id : remove state");
        ayc_0.a("(-addall | -aa) Id level? : apply state to all hero in party. Level is at 1 by default");
        ayc_0.a("(-removeall | -ra) Id : remove state to all hero in party");
    }
}

