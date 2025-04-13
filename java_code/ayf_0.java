/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aYF
 */
public class ayf_0
extends aXj {
    public static final byte a = 0;
    public static final byte b = 1;
    public static final byte c = 2;
    public static final byte d = 3;
    public static final byte e = 4;
    public static final byte f = 5;
    private final byte g;
    private final String[] h;

    public ayf_0(byte by, String ... stringArray) {
        this.g = by;
        this.h = stringArray;
    }

    @Override
    public boolean a() {
        switch (this.g) {
            case 0: {
                return this.h.length == 1 || this.h.length == 2;
            }
            case 1: {
                return this.h.length == 1;
            }
            case 2: {
                return this.h.length == 2;
            }
            case 3: {
                return this.h.length == 1;
            }
            case 4: {
                return true;
            }
            case 5: {
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
            switch (this.g) {
                case 0: {
                    this.a(aaw_22);
                    break;
                }
                case 1: {
                    this.e();
                    break;
                }
                case 2: {
                    this.b(aaw_22);
                    break;
                }
                case 3: {
                    this.c(aaw_22);
                    break;
                }
                case 4: {
                    ayf_0.d();
                    break;
                }
                case 5: {
                    ayf_0.c();
                }
            }
        }
        catch (Exception exception) {
            aVo.a().d("Probl\u00e8me lors de l'execution d'une commande de calendrier " + exception);
        }
    }

    private static void c() {
        aVo.a().a("Commands to modify the symbiot, work always on your main symbiot not on downscaled ones");
        aVo.a().a("-add breedId : add mosnter in symbiot");
        aVo.a().a("-add breedId qty : same with qty");
        aVo.a().a("-rm index : remove monster at index");
        aVo.a().a("-rename index name : rename monster at index");
        aVo.a().a("-index index : change selected index");
        aVo.a().a("-i : show complete info about symbiot");
        aVo.a().a("h | help : show full command documentation");
    }

    private static void d() {
        azu_0 azu_02 = azu_0.j();
        bmr_1 bmr_12 = azu_02.k();
        bol_0 bol_02 = bmr_12.cH();
        if (bol_02 != null) {
            byte by;
            aVo.a().a("Index courant : " + bol_02.c() + "\n", 0xAA00FF);
            for (by = 0; by < bol_02.b(); by = (byte)(by + 1)) {
                eqy_1 eqy_12 = bol_02.a((int)by);
                aVo.a().a(eqy_12 + "\n", 0xAA00FF);
            }
            aVo.a().a("Creatures disponibles : ", 0xAA00FF);
            for (by = 0; by < bol_02.b(); by = (byte)(by + 1)) {
                boolean bl = bol_02.b((int)by);
                if (!bl) continue;
                aVo.a().a(Byte.toString(by), 0xAA00FF);
            }
        } else {
            aVo.a().a("pas de symbiote");
        }
    }

    private void a(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)372);
        pt.b(this.g);
        pt.a(Integer.parseInt(this.h[0]));
        if (this.h.length == 2) {
            pt.a(Integer.parseInt(this.h[1]));
        } else {
            pt.a(1);
        }
        aaw_22.c(pt);
    }

    private void e() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 != null && bmr_12.cH() != null) {
            bmr_12.cH().b(Byte.parseByte(this.h[0]));
        }
    }

    private void b(aaw_2 aaw_22) {
        bmr_1 bmr_12 = azu_0.j().k();
        String string = this.h[1];
        byte by = Byte.parseByte(this.h[0]);
        if (bmr_12.cH() == null) {
            aVo.a().d("Pas de symbiote");
            return;
        }
        eqy_1 eqy_12 = bmr_12.cH().a((int)by);
        if (eqy_12 == null) {
            aVo.a().d("Pas de creature dispo a l'index fourni");
            return;
        }
        if (!xu_0.a().a(string)) {
            aVo.a().d(" Nom invalide");
            return;
        }
        eqy_12.a(string);
        clq_0 clq_02 = new clq_0();
        clq_02.a(bmr_12.a_());
        clq_02.a(by);
        clq_02.a(string);
        clq_02.a(true);
        aaw_22.c(clq_02);
    }

    private void c(aaw_2 aaw_22) {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12.cH() == null) {
            aVo.a().d("Pas de symbiote");
            return;
        }
        byte by = Byte.parseByte(this.h[0]);
        bmr_12.cH().a(by);
        aVo.a().a("Nouvel index courant : " + by);
        bmr_12.ch();
        clr clr2 = new clr();
        clr2.a(by);
        aaw_22.c(clr2);
    }
}

