/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aVQ
 */
public class avq_0
extends aXj {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 8;
    private final int i;
    private final String[] j;

    public avq_0(int n, String ... stringArray) {
        this.i = n;
        this.j = (String[])stringArray.clone();
    }

    @Override
    public boolean a() {
        switch (this.i) {
            case 0: 
            case 5: {
                return this.j.length == 0;
            }
            case 1: 
            case 2: {
                return this.j.length == 2 || this.j.length == 1;
            }
            case 3: 
            case 4: 
            case 6: 
            case 8: {
                return this.j.length == 3 || this.j.length == 2;
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
            switch (this.i) {
                case 0: {
                    avq_0.d();
                    break;
                }
                case 5: {
                    avq_0.c();
                    break;
                }
                case 1: {
                    this.f(aaw_22);
                    break;
                }
                case 2: {
                    this.e(aaw_22);
                    break;
                }
                case 3: {
                    this.d(aaw_22);
                    break;
                }
                case 6: {
                    this.b(aaw_22);
                    break;
                }
                case 4: {
                    this.c(aaw_22);
                    break;
                }
                case 8: {
                    this.a(aaw_22);
                }
            }
        }
        catch (Exception exception) {
            aVo.a().d("Probl\u00e8me d'une commande" + exception);
        }
    }

    private void a(aaw_2 aaw_22) {
        int n = 0;
        long l = this.j.length == 2 ? bzf_1.a().a_() : Long.parseLong(this.j[n++]);
        int n2 = Integer.parseInt(this.j[n++]);
        int n3 = Integer.parseInt(this.j[n++]);
        boolean bl = new ezn_1().c(l, n2, n3);
        Object t = euw_2.a.d(l);
        if (bl) {
            avq_0.a("Active sheet updated " + ((epq_2)t).dx());
        } else {
            avq_0.a("Error during active sheet update");
        }
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)29);
        pt.a(l);
        pt.a(n2);
        pt.a(n3);
        aaw_22.c(pt);
    }

    private void b(aaw_2 aaw_22) {
        int n = 0;
        long l = this.j.length == 2 ? bzf_1.a().a_() : Long.parseLong(this.j[n++]);
        int n2 = Integer.parseInt(this.j[n++]);
        int n3 = Integer.parseInt(this.j[n++]);
        boolean bl = new ezn_1().b(l, n2, n3);
        Object t = euw_2.a.d(l);
        if (bl) {
            avq_0.a("Active sheet updated " + ((epq_2)t).dx());
        } else {
            avq_0.a("Error during active sheet update");
        }
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)207);
        pt.a(l);
        pt.a(n2);
        pt.a(n3);
        aaw_22.c(pt);
    }

    private static void c() {
        avq_0.a("Leader build sheets : \n" + bzf_1.a().dx());
    }

    private void c(aaw_2 aaw_22) {
        int n = 0;
        long l = this.j.length == 2 ? bzf_1.a().a_() : Long.parseLong(this.j[n++]);
        int n2 = Integer.parseInt(this.j[n++]);
        int n3 = Integer.parseInt(this.j[n++]);
        ezn_1 ezn_12 = new ezn_1();
        int n4 = bzf_1.a().dx().e();
        boolean bl = ezn_12.e(l, n4, n3);
        if (bl) {
            avq_0.a("Active sheet updated " + ((epq_2)euw_2.a.d(l)).dx());
            Pt pt = new Pt();
            pt.a((byte)3);
            pt.a((short)51);
            pt.a(l);
            pt.a(n2);
            pt.a(n3);
            aaw_22.c(pt);
        } else {
            avq_0.a("Error during active sheet update");
        }
    }

    private void d(aaw_2 aaw_22) {
        Object object;
        int n;
        boolean bl;
        int n2 = 0;
        long l = this.j.length == 2 ? bzf_1.a().a_() : Long.parseLong(this.j[n2++]);
        int n3 = Integer.parseInt(this.j[n2++]);
        if (bl = new ezn_1().a(l, n3, n = Integer.parseInt(this.j[n2++]))) {
            object = (bmr_1)euw_2.a.d(l);
            avq_0.a("Active sheet updated " + ((bmr_1)object).dx());
            bPJ.a(((bmr_1)object).dz(), ((bnh_1)object).aZ(), ((bmr_1)object).cg());
        } else {
            avq_0.a("Error during active sheet update");
        }
        object = new Pt();
        ((Pt)object).a((byte)3);
        ((Pt)object).a((short)270);
        ((Pt)object).a(l);
        ((Pt)object).a(n3);
        ((Pt)object).a(n);
        aaw_22.c(object);
    }

    private void e(aaw_2 aaw_22) {
        int n;
        long l;
        if (this.j.length == 1) {
            l = bzf_1.a().a_();
            n = Integer.parseInt(this.j[0]);
        } else {
            l = Long.parseLong(this.j[0]);
            n = Integer.parseInt(this.j[1]);
        }
        boolean bl = new ezn_1().a(l, n);
        if (bl) {
            avq_0.a("Active sheet updated " + ((epq_2)euw_2.a.d(l)).dx());
        } else {
            avq_0.a("Error during active sheet update");
        }
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)464);
        pt.a(l);
        pt.a(n);
        aaw_22.c(pt);
    }

    private void f(aaw_2 aaw_22) {
        String string;
        long l;
        if (this.j.length == 1) {
            l = bzf_1.a().a_();
            string = this.j[0];
        } else {
            l = Long.parseLong(this.j[0]);
            string = this.j[1];
        }
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)451);
        pt.a(l);
        pt.a(string);
        aaw_22.c(pt);
        int n = new ezn_1().a(l, string, -1, false);
        if (n >= 0) {
            avq_0.a("New BuildSheet " + ((epq_2)euw_2.a.d(l)).dx() + " id=" + n);
        } else {
            avq_0.a("Error during build sheet creation");
        }
    }

    private static void d() {
        avq_0.a("buildSheet|build|bs ('help'|'h') : display command help");
        avq_0.a("buildSheet|build|bs ('show'|'s') : display leader's build sheets");
        avq_0.a("buildSheet|build|bs (create | 'c') name : add a build sheet to leader");
        avq_0.a("buildSheet|build|bs (create | 'c') characterId name : add a build sheet to given character");
        avq_0.a("buildSheet|build|bs ('setActiveBuild' | 'setActive' | 'sa') index : change active build to leader");
        avq_0.a("buildSheet|build|bs ('setActiveBuild' | 'setActive' | 'sa') characterId index : change active build to given character");
        avq_0.a("buildSheet|build|bs ('setSpellDeck' | 'setSpell' | 'ssd') sheetIndex spellDeckIndex : change spell deck of the specified sheet of leader");
        avq_0.a("buildSheet|build|bs ('setSpellDeck' | 'setSpell' | 'ssd') characterId sheetIndex spellDeckIndex : change spell deck of the specified sheet of given character");
        avq_0.a("buildSheet|build|bs ('setAptitudeSheet' | 'setApt' | 'sas') sheetIndex aptitudeSheetIndex : change aptitude sheet of the specified sheet of leader");
        avq_0.a("buildSheet|build|bs ('setAptitudeSheet' | 'setApt' | 'sas') characterId sheetIndex aptitudeSheetIndex : change aptitude sheet of the specified sheet of given character");
        avq_0.a("buildSheet|build|bs ('setEquipmentSheet' | 'setEq' | 'ses') sheetIndex equipmentSheetIndex : change equipement sheet of the specified sheet of leader");
        avq_0.a("buildSheet|build|bs ('setEquipmentSheet' | 'setEq' | 'ses') characterId sheetIndex equipmentSheetIndex : change equipement sheet of the specified sheet of given character");
        avq_0.a("buildSheet|build|bs ('setLevel' | 'level' | 'l') sheetIndex level : change level of the specified sheet of leader");
        avq_0.a("buildSheet|build|bs ('setLevel' | 'level' | 'l') characterId sheetIndex level : change level of the specified sheet of given character");
        avq_0.a("buildSheet|build|bs ('setAuto' | 'auto') level : activate an automatic build on the leader with given level");
        avq_0.a("buildSheet|build|bs ('setAuto' | 'auto') characterId level : activate an automatic build on the given character with given level");
    }
}

