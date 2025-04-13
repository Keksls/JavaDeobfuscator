/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aWL
 */
public final class awl_0
extends aXj {
    public static final int a = 4;
    public static final int b = 5;
    public static final int c = 6;
    public static final int d = 7;
    public static final int e = 10;
    public static final int f = 11;
    public static final int g = 12;
    public static final int h = 13;
    public static final int i = 14;
    public static final int j = 0x8080FF;
    private final int k;
    private final String[] l;

    public awl_0(int n, String ... stringArray) {
        this.k = n;
        this.l = (String[])stringArray.clone();
    }

    private static void c() {
        awl_0.a("hw building create x y buildingRefId : create a building from given refId at given position");
        awl_0.a("hw building delete buildingUID : delete the given building");
        awl_0.a("hw topology create x y : create a topology at given position");
        awl_0.a("hw topology update x y refId: change the topology at given position to topology with given ref id");
        awl_0.a("hw (addResources|ar) guildId resourcesAmount : add resource points");
        awl_0.a("hw (setAdminBuildingFactor|sabf) guildId factor : change % of building speed (-100 to 100)");
        awl_0.a("hw (closeOne | co) instanceId : close haven world with instanceId");
        awl_0.a("hw (closeAll | ca) : close all haven worlds");
        awl_0.a("hw (help|h) : show full documentation");
    }

    @Override
    public boolean a() {
        switch (this.k) {
            case 10: 
            case 14: {
                return this.l.length == 0;
            }
            case 7: 
            case 13: {
                return this.l.length == 1;
            }
            case 4: 
            case 11: {
                return this.l.length == 2;
            }
            case 5: 
            case 6: {
                return this.l.length == 3;
            }
            case 12: {
                return this.l.length == 2;
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
            switch (this.k) {
                case 4: {
                    this.c(aaw_22);
                    break;
                }
                case 5: {
                    this.d(aaw_22);
                    break;
                }
                case 6: {
                    this.e(aaw_22);
                    break;
                }
                case 7: {
                    this.f(aaw_22);
                    break;
                }
                case 11: {
                    this.b(aaw_22);
                    break;
                }
                case 12: {
                    this.a(aaw_22);
                    break;
                }
                case 13: {
                    this.g(aaw_22);
                    break;
                }
                case 14: {
                    this.h(aaw_22);
                    break;
                }
                case 10: {
                    awl_0.c();
                }
            }
        }
        catch (Exception exception) {
            aVo.a().d("Probl\u00e8me d'une commande" + exception);
        }
    }

    private void a(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)6);
        pt.a((short)323);
        pt.a(Long.parseLong(this.l[0]));
        pt.a(Integer.parseInt(this.l[1]));
        aaw_22.c(pt);
    }

    private void b(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)6);
        pt.a((short)470);
        pt.a(Long.parseLong(this.l[0]));
        pt.a(Integer.parseInt(this.l[1]));
        aaw_22.c(pt);
    }

    private void c(aaw_2 aaw_22) {
        bmr_1 bmr_12 = azu_0.j().k();
        bpc_2 bpc_22 = bmr_12.eE();
        if (bpc_22 == null || bpc_22.ac_() != 25) {
            aVo.a().d("L'occupation de gestion du Havre-monde doit \u00eatre lanc\u00e9e");
            return;
        }
        try {
            short s2 = Short.valueOf(this.l[0]);
            short s3 = Short.valueOf(this.l[1]);
            etd_1 etd_12 = new etd_1(s2, s3);
            ((bpz_2)bpc_22).h().a(etd_12);
            aVo.a().a("Action enregistr\u00e9e : " + etd_12, 0x8080FF);
        }
        catch (NumberFormatException numberFormatException) {
            aVo.a().d("Arguments invalides : " + numberFormatException.getMessage());
        }
    }

    private void d(aaw_2 aaw_22) {
        bmr_1 bmr_12 = azu_0.j().k();
        bpc_2 bpc_22 = bmr_12.eE();
        if (bpc_22 == null || bpc_22.ac_() != 25) {
            aVo.a().d("L'occupation de gestion du Havre-monde doit \u00eatre lanc\u00e9e");
            return;
        }
        try {
            short s2 = Short.valueOf(this.l[0]);
            short s3 = Short.valueOf(this.l[1]);
            short s4 = Short.valueOf(this.l[2]);
            ete_1 ete_12 = new ete_1(s2, s3, s4, 0);
            ((bpz_2)bpc_22).h().a(ete_12);
            aVo.a().a("Action enregistr\u00e9e : " + ete_12, 0x8080FF);
        }
        catch (NumberFormatException numberFormatException) {
            aVo.a().d("Arguments invalides : " + numberFormatException.getMessage());
        }
    }

    private void e(aaw_2 aaw_22) {
        bmr_1 bmr_12 = azu_0.j().k();
        bpc_2 bpc_22 = bmr_12.eE();
        if (bpc_22 == null || bpc_22.ac_() != 25) {
            aVo.a().d("L'occupation de gestion du Havre-monde doit \u00eatre lanc\u00e9e");
            return;
        }
        try {
            short s2 = Short.valueOf(this.l[0]);
            short s3 = Short.valueOf(this.l[1]);
            short s4 = Short.valueOf(this.l[2]);
            esg_2 esg_22 = new esg_2(s4, s2, s3);
            ((bpz_2)bpc_22).h().a(esg_22);
            aVo.a().a("Action enregistr\u00e9e : " + esg_22, 0x8080FF);
        }
        catch (NumberFormatException numberFormatException) {
            aVo.a().d("Arguments invalides : " + numberFormatException.getMessage());
        }
    }

    private void f(aaw_2 aaw_22) {
        bmr_1 bmr_12 = azu_0.j().k();
        bpc_2 bpc_22 = bmr_12.eE();
        if (bpc_22 == null || bpc_22.ac_() != 25) {
            aVo.a().d("L'occupation de gestion du Havre-monde doit \u00eatre lanc\u00e9e");
            return;
        }
        try {
            long l = Long.valueOf(this.l[0]);
            esh_2 esh_22 = new esh_2(l);
            ((bpz_2)bpc_22).h().a(esh_22);
            aVo.a().a("Action enregistr\u00e9e : " + esh_22, 0x8080FF);
        }
        catch (NumberFormatException numberFormatException) {
            aVo.a().d("Arguments invalides : " + numberFormatException.getMessage());
        }
    }

    private void g(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)6);
        pt.a((short)13);
        pt.a(Long.parseLong(this.l[0]));
        aaw_22.c(pt);
    }

    private void h(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)6);
        pt.a((short)165);
        aaw_22.c(pt);
    }
}

